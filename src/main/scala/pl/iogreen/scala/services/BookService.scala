package pl.iogreen.scala.services

import com.google.inject.Singleton
import com.google.inject.name.Named

/**
 * @author Błażej Bucko
 */

@Singleton
class BookService {

  println("book service is created")

  def makeSomething() {
    println("something")
  }

}