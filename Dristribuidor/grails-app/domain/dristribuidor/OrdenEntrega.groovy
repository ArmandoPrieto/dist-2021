package dristribuidor
import grails.rest.*
import data.Persona

@Resource(uri='/ordenEntrega')
class OrdenEntrega {
    
   // Persona persona
    List productos
    Destino destino
    String direccion
    String tracking
    String estado
     static hasMany = [productos: Producto]
//
    

    

    static constraints = {
      /*  estado(blank: true, nullable:true)
        tracking(blank: true, nullable:true)
        productos nullable: true*/
    }
}
