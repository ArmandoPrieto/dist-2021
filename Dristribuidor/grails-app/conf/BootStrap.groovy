
import dristribuidor.Destino
import dristribuidor.Distribuidor
import dristribuidor.Producto

import zona.Estado
import zona.Municipio
import zona.Pais

class BootStrap {

    def init = { servletContext ->
    
        new Distribuidor(title:"The Stand").save()
        new Distribuidor(title:"The Shining").save()
    
        //Producto
        new Producto(nombre: "Producto 1", precio: 1000).save()
        new Producto(nombre: "Producto 2", precio: 2000).save()
        new Producto(nombre: "Producto 3", precio: 3000).save()
        new Producto(nombre: "Producto 4", precio: 4000).save()
        new Producto(nombre: "Producto 5", precio: 5000).save()
        
        
        //Pais
        List<Municipio> m = new ArrayList()
        m.add(new Municipio(nombre: "Municipio 1"))
        m.add(new Municipio(nombre:"Municipio 2"))
        m.add(new Municipio(nombre:"Municipio 3"))
        m.add(new Municipio(nombre:"Municipio 4"))
        m.add(new Municipio(nombre:"Municipio 5"))
        
        List<Estado> c = new ArrayList()
        c.add(new Estado(nombre: "Dtto. Capital", municipio: m))
        c.add(new Estado(nombre: "Anzoátegui", municipio: m))
        c.add(new Estado(nombre: "Apure", municipio: m))
        c.add(new Estado(nombre: "Aragua", municipio: m))
        c.add(new Estado(nombre: "Barinas", municipio: m))
        c.add(new Estado(nombre: "Bolívar", municipio: m))
        c.add(new Estado(nombre: "Carabobo", municipio: m))
        c.add(new Estado(nombre: "Cojedes", municipio: m))
        c.add(new Estado(nombre: "Falcón", municipio: m))
        c.add(new Estado(nombre: "Guárico", municipio: m))
        c.add(new Estado(nombre: "Lara", municipio: m))
        c.add(new Estado(nombre: "Mérida", municipio: m))
        c.add(new Estado(nombre: "Miranda", municipio: m))
        c.add(new Estado(nombre: "Monagas", municipio: m))
        c.add(new Estado(nombre: "Miranda", municipio: m))
        c.add(new Estado(nombre: "Nueva Esparta", municipio: m))
        c.add(new Estado(nombre: "Portuguesa", municipio: m))
        c.add(new Estado(nombre: "Táchira", municipio: m))
        c.add(new Estado(nombre: "Trujillo", municipio: m))
        c.add(new Estado(nombre: "Yaracuy", municipio: m))
        c.add(new Estado(nombre: "Zulia", municipio: m))
        c.add(new Estado(nombre: "Vargas", municipio: m))
        c.add(new Estado(nombre: "Delta Amacuro", municipio: m))
        c.add(new Estado(nombre: "Amazonas", municipio: m))

        double min=1000;
        double max=5100;
        double value = 0.00;
        Random random = new Random()
        Pais p = new Pais(nombre: "Venezuela", estado: c);
        p.save()
        p.each(){ pa ->
            pa.estado.each(){ es ->
                es.municipio.each(){ mu ->
                    value = Math.round( (random.nextDouble() * 1000) * 100.0 ) / 100.0;
                    new Destino(pais: pa.nombre, estado: es.nombre, municipio: mu.nombre, precio :value).save()
                }
            }
        }
                                                                                                      
        
                                                                                                    }
                                                                                                    def destroy = {
                                                                                                    }
                                                                                                }
