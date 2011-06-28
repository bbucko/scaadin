package pl.iogreen.scala.services

import com.google.inject.name.Named
import com.google.inject.{Guice, Singleton}

/**
 * @author Błażej Bucko
 */

@Singleton
class BookService {

  def makeSomething(someText: String) {
    println("something " + someText)
  }

}