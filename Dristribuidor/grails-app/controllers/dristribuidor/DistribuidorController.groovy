package dristribuidor



import static org.springframework.http.HttpStatus.*
import grails.converters.XML
import grails.transaction.Transactional

@Transactional(readOnly = true)
class DistribuidorController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
       params.max = Math.min(max ?: 10, 100)
       respond Distribuidor.list(params), model:[distribuidorInstanceCount: Distribuidor.count()]
       
    }

    def show(Distribuidor distribuidorInstance) {
        respond distribuidorInstance
    }

    def create() {
        respond new Distribuidor(params)
    }

    @Transactional
    def save(Distribuidor distribuidorInstance) {
        if (distribuidorInstance == null) {
            notFound()
            return
        }

        if (distribuidorInstance.hasErrors()) {
            respond distribuidorInstance.errors, view:'create'
            return
        }

        distribuidorInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'distribuidorInstance.label', default: 'Distribuidor'), distribuidorInstance.id])
                redirect distribuidorInstance
            }
            '*' { respond distribuidorInstance, [status: CREATED] }
        }
    }

    def edit(Distribuidor distribuidorInstance) {
        respond distribuidorInstance
    }

    @Transactional
    def update(Distribuidor distribuidorInstance) {
        if (distribuidorInstance == null) {
            notFound()
            return
        }

        if (distribuidorInstance.hasErrors()) {
            respond distribuidorInstance.errors, view:'edit'
            return
        }

        distribuidorInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Distribuidor.label', default: 'Distribuidor'), distribuidorInstance.id])
                redirect distribuidorInstance
            }
            '*'{ respond distribuidorInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Distribuidor distribuidorInstance) {

        if (distribuidorInstance == null) {
            notFound()
            return
        }

        distribuidorInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Distribuidor.label', default: 'Distribuidor'), distribuidorInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'distribuidorInstance.label', default: 'Distribuidor'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
