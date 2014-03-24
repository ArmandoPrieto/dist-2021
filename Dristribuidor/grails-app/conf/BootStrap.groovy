
import dristribuidor.Distribuidor

class BootStrap {

    def init = { servletContext ->
    
        new Distribuidor(title:"The Stand").save()
        new Distribuidor(title:"The Shining").save()
    
    }
    def destroy = {
    }
}
