package dristribuidor
import grails.rest.*

@Resource(uri='/destino')
class Destino {
    
    String pais
    String estado
    String municipio
   // String codigoPostal
    
    double precio

    static constraints = {
    }
}
