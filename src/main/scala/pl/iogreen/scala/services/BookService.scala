package pl.iogreen.scala.services

import com.google.inject.Singleton

/**
 * @author Błażej Bucko
 */

@Singleton
class BookService {

  println("BookService created")

  def makeSomething() {
    println("something")
  }

}