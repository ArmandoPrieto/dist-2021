
<%@ page import="dristribuidor.OrdenEntrega" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'ordenEntrega.label', default: 'OrdenEntrega')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-ordenEntrega" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-ordenEntrega" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="estado" title="${message(code: 'ordenEntrega.estado.label', default: 'Estado')}" />
					
						<g:sortableColumn property="tracking" title="${message(code: 'ordenEntrega.tracking.label', default: 'Tracking')}" />
					
						<th><g:message code="ordenEntrega.destino.label" default="Destino" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${ordenEntregaInstanceList}" status="i" var="ordenEntregaInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${ordenEntregaInstance.id}">${fieldValue(bean: ordenEntregaInstance, field: "estado")}</g:link></td>
					
						<td>${fieldValue(bean: ordenEntregaInstance, field: "tracking")}</td>
					
						<td>${fieldValue(bean: ordenEntregaInstance, field: "destino")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${ordenEntregaInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
