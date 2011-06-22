package pl.iogreen.scala.scalatra

import org.scalatra.ScalatraServlet
import net.liftweb.json._
import net.liftweb.json.JsonDSL._


/**
 * @author Błażej Bucko
 */

class ServicesServlet extends ScalatraServlet {

  get("/date/:year/:month/:day") {
    compact(JsonAST.render(("foo" -> 6) ~ ("bar" -> "baz")))
  }

}