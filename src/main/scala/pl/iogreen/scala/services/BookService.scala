package pl.iogreen.scala.services

import com.google.inject.Singleton

/**
 * @author Błażej Bucko
 */

@Singleton
class BookService {

  def makeSomething(someText: String) {
    println("something " + someText)
  }

}