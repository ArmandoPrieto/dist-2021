package dristribuidor



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class OrdenEntregaController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond OrdenEntrega.list(params), model:[ordenEntregaInstanceCount: OrdenEntrega.count()]
    }

    def show(OrdenEntrega ordenEntregaInstance) {
        respond ordenEntregaInstance
    }

    def create() {
        OrdenEntrega o = new OrdenEntrega(params)
        o.save()
        respond o
    }

    @Transactional
    def save(OrdenEntrega ordenEntregaInstance) {
        if (ordenEntregaInstance == null) {
            notFound()
            return
        }

        if (ordenEntregaInstance.hasErrors()) {
            respond ordenEntregaInstance.errors, view:'create'
            return
        }

        ordenEntregaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'ordenEntregaInstance.label', default: 'OrdenEntrega'), ordenEntregaInstance.id])
                redirect ordenEntregaInstance
            }
            '*' { respond ordenEntregaInstance, [status: CREATED] }
        }
    }

    def edit(OrdenEntrega ordenEntregaInstance) {
        respond ordenEntregaInstance
    }

    @Transactional
    def update(OrdenEntrega ordenEntregaInstance) {
        if (ordenEntregaInstance == null) {
            notFound()
            return
        }

        if (ordenEntregaInstance.hasErrors()) {
            respond ordenEntregaInstance.errors, view:'edit'
            return
        }

        ordenEntregaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'OrdenEntrega.label', default: 'OrdenEntrega'), ordenEntregaInstance.id])
                redirect ordenEntregaInstance
            }
            '*'{ respond ordenEntregaInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(OrdenEntrega ordenEntregaInstance) {

        if (ordenEntregaInstance == null) {
            notFound()
            return
        }

        ordenEntregaInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'OrdenEntrega.label', default: 'OrdenEntrega'), ordenEntregaInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'ordenEntregaInstance.label', default: 'OrdenEntrega'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
