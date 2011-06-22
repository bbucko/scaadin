package pl.iogreen.scala.scalatra

import org.scalatra.ScalatraServlet
import net.liftweb.json.JsonAST
import net.liftweb.json._
import net.liftweb.json.JsonDSL._


/**
 * @author Błażej Bucko
 */

class ServicesServlet extends ScalatraServlet {

  get("/date/:year/:month/:day") {
    compact(JsonAST.render(("foo" -> 4) ~ ("bar" -> "baz")))
  }

}