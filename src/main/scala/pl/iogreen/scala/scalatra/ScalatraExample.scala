package pl.iogreen.scala.scalatra

import org.scalatra.ScalatraServlet

/**
  * @author Błażej Bucko
  */

class ScalatraExample extends ScalatraServlet {

  get("/date/:year/:month/:day") {
    <ul>
      <li>Year: {params("year")}</li>
      <li>Month: {params("month")}</li>
      <li>Day: {params("day")}</li>
    </ul>
  }

}