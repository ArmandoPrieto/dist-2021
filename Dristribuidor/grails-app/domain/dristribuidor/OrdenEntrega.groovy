package dristribuidor

import data.Persona

class OrdenEntrega {
    
    Persona persona
    List<Producto> productos
    Destino destino
    String estado
    String tracking

    static constraints = {
    }
}
