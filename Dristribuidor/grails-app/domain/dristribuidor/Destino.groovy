package dristribuidor
import grails.rest.*

@Resource(uri='/destino')
class Destino {
    
    int local
    String direccion
    String codigoPostal
    String pais
    String estado
    String ciudad
    

    static constraints = {
    }
}
