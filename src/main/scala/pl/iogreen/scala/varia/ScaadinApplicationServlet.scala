package pl.iogreen.scala.varia

import com.vaadin.terminal.gwt.server.AbstractApplicationServlet
import javax.servlet.http.HttpServletRequest
import com.vaadin.Application
import com.google.inject.{Inject, Provider, Singleton}

/**
 * @author Błażej Bucko
 */

@Singleton
class ScaadinApplicationServlet @Inject()(provider: Provider[Application]) extends AbstractApplicationServlet {

  val applicationProvider: Provider[Application] = provider

  def getNewApplication(request: HttpServletRequest) = applicationProvider.get()

  def getApplicationClass = classOf[Application]
}