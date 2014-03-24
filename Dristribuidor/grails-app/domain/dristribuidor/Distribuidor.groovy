package dristribuidor
import grails.rest.*

@Resource(uri='/dist')
class Distribuidor {

    String title

    static constraints = { 
        title blank:false 
    }
   
}


