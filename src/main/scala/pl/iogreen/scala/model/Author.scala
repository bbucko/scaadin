package pl.iogreen.scala.model

import reflect.BeanProperty

/**
 * @author Błażej Bucko
 */

class Author {
  @BeanProperty var name: String = ""
  @BeanProperty var surName: String = ""
}