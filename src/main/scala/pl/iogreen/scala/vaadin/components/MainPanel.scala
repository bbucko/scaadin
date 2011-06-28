package pl.iogreen.scala.vaadin.components

import pl.iogreen.scala.model.Author
import com.vaadin.data.util.BeanItem
import com.vaadin.ui._
import com.google.inject.Inject
import pl.iogreen.scala.services.BookService

/**
 * @author Błażej Bucko
 */

class MainPanel extends Panel {

  @Inject val bookService: BookService = null

  override def attach() {
    super.attach()

    val author = new Author("", "")
    val beanItem = new BeanItem[Author](author)

    val form = new Form()
    form.setItemDataSource(beanItem)
    form.setWriteThrough(false)
    form.getField("surName").setRequired(true)
    form.getField("name").setRequired(true)

    addComponent(form)

    val layout = new HorizontalLayout();
    layout.addComponent(new SpecialButton("Commit?", _ => {
      if (form.isValid) {
        form.commit()
        getWindow.showNotification("BB: " + beanItem.getBean.name + " :: " + beanItem.getBean.surName, Window.Notification.TYPE_HUMANIZED_MESSAGE)
        getWindow.addComponent(new SecondPanel)
        bookService.makeSomething("special panel")
      }
    }))
    layout.setSpacing(true)
    layout.addComponent(new SpecialButton("Cancel?", _ => {
      form.discard()
    }))

    addComponent(layout)
  }
}