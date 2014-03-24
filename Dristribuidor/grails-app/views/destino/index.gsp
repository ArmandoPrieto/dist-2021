
<%@ page import="dristribuidor.Destino" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'destino.label', default: 'Destino')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-destino" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-destino" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="ciudad" title="${message(code: 'destino.ciudad.label', default: 'Ciudad')}" />
					
						<g:sortableColumn property="codigoPostal" title="${message(code: 'destino.codigoPostal.label', default: 'Codigo Postal')}" />
					
						<g:sortableColumn property="direccion" title="${message(code: 'destino.direccion.label', default: 'Direccion')}" />
					
						<g:sortableColumn property="estado" title="${message(code: 'destino.estado.label', default: 'Estado')}" />
					
						<g:sortableColumn property="local" title="${message(code: 'destino.local.label', default: 'Local')}" />
					
						<g:sortableColumn property="pais" title="${message(code: 'destino.pais.label', default: 'Pais')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${destinoInstanceList}" status="i" var="destinoInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${destinoInstance.id}">${fieldValue(bean: destinoInstance, field: "ciudad")}</g:link></td>
					
						<td>${fieldValue(bean: destinoInstance, field: "codigoPostal")}</td>
					
						<td>${fieldValue(bean: destinoInstance, field: "direccion")}</td>
					
						<td>${fieldValue(bean: destinoInstance, field: "estado")}</td>
					
						<td>${fieldValue(bean: destinoInstance, field: "local")}</td>
					
						<td>${fieldValue(bean: destinoInstance, field: "pais")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${destinoInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
