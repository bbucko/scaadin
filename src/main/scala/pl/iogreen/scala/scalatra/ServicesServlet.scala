package pl.iogreen.scala.scalatra

import org.scalatra.ScalatraServlet
import net.liftweb.json._
import net.liftweb.json.JsonDSL._
import pl.iogreen.scala.services.BookService
import com.google.inject.{Inject, Singleton}


/**
 * @author Błażej Bucko
 */

@Singleton
class ServicesServlet extends ScalatraServlet {

  @Inject val bookService: BookService = null

  get("/date/:year/:month/:day") {
    bookService.makeSomething("services servlet")
    compact(JsonAST.render(("foo" -> 6) ~ ("bar" -> "baz")))
  }

}