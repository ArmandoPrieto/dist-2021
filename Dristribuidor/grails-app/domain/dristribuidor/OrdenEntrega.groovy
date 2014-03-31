package dristribuidor
import grails.rest.*
import data.Persona

@Resource(uri='/ordenEntrega')
class OrdenEntrega {
    
   // Persona persona
    List<Producto> productos
    Destino destino
    //
   // String destino
//String estado
    //String tracking

    static constraints = {
      /*  estado(blank: true, nullable:true)
        tracking(blank: true, nullable:true)
        productos nullable: true*/
    }
}
