package dristribuidor
import grails.rest.*

@Resource(uri='/producto')
class Producto {
    
    String nombre
    String precio

    static constraints = {
    }
}
