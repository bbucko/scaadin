package pl.iogreen.scala.model

import reflect.BeanProperty

/**
 * @author Błażej Bucko
 */

case class Book(@BeanProperty var title: String, @BeanProperty var author: Author)