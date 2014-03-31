package dristribuidor



import static org.springframework.http.HttpStatus.*
import grails.converters.XML
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DestinoController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        //params.max = Math.min(max ?: 10, 100)
        //respond Destino.list(params), model:[destinoInstanceCount: Destino.count()]
        render Destino.list() as XML
        
    }

    def show(Destino destinoInstance) {
        respond destinoInstance
    }

    def create() {
        respond new Destino(params)
    }

    @Transactional
    def save(Destino destinoInstance) {
        if (destinoInstance == null) {
            notFound()
            return
        }

        if (destinoInstance.hasErrors()) {
            respond destinoInstance.errors, view:'create'
            return
        }

        destinoInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'destinoInstance.label', default: 'Destino'), destinoInstance.id])
                redirect destinoInstance
            }
            '*' { respond destinoInstance, [status: CREATED] }
        }
    }

    def edit(Destino destinoInstance) {
        respond destinoInstance
    }

    @Transactional
    def update(Destino destinoInstance) {
        if (destinoInstance == null) {
            notFound()
            return
        }

        if (destinoInstance.hasErrors()) {
            respond destinoInstance.errors, view:'edit'
            return
        }

        destinoInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Destino.label', default: 'Destino'), destinoInstance.id])
                redirect destinoInstance
            }
            '*'{ respond destinoInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Destino destinoInstance) {

        if (destinoInstance == null) {
            notFound()
            return
        }

        destinoInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Destino.label', default: 'Destino'), destinoInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'destinoInstance.label', default: 'Destino'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
