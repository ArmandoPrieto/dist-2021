<%@ page import="dristribuidor.Producto" %>



<div class="fieldcontain ${hasErrors(bean: productoInstance, field: 'nombre', 'error')} ">
	<label for="nombre">
		<g:message code="producto.nombre.label" default="Nombre" />
		
	</label>
	<g:textField name="nombre" value="${productoInstance?.nombre}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: productoInstance, field: 'precio', 'error')} ">
	<label for="precio">
		<g:message code="producto.precio.label" default="Precio" />
		
	</label>
	<g:textField name="precio" value="${productoInstance?.precio}"/>

</div>

