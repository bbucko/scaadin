package pl.iogreen.scala.scalatra

import org.scalatra.ScalatraServlet
import net.liftweb.json._
import net.liftweb.json.JsonDSL._
import com.google.inject.Singleton


/**
 * @author Błażej Bucko
 */

@Singleton
class ServicesServlet extends ScalatraServlet {

  get("/date/:year/:month/:day") {
    compact(JsonAST.render(("foo" -> 6) ~ ("bar" -> "baz")))
  }

}