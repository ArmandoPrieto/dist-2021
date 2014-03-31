import dristribuidor.OrdenEntrega
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_dristribuidor_ordenEntrega_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ordenEntrega/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: ordenEntregaInstance, field: 'destino', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("ordenEntrega.destino.label"),'default':("Destino")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['id':("destino"),'name':("destino.id"),'from':(dristribuidor.Destino.list()),'optionKey':("id"),'required':(""),'value':(ordenEntregaInstance?.destino?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: ordenEntregaInstance, field: 'estado', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("ordenEntrega.estado.label"),'default':("Estado")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("estado"),'value':(ordenEntregaInstance?.estado)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: ordenEntregaInstance, field: 'tracking', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("ordenEntrega.tracking.label"),'default':("Tracking")],-1)
printHtmlPart(5)
invokeTag('textField','g',28,['name':("tracking"),'value':(ordenEntregaInstance?.tracking)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396241599000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
