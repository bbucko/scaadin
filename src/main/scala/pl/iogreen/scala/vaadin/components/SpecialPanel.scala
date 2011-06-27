package pl.iogreen.scala.vaadin.components

import pl.iogreen.scala.model.Author
import com.vaadin.data.util.BeanItem
import com.vaadin.ui._

/**
 * @author Błażej Bucko
 */

class SpecialPanel extends Panel {

  override def attach() {
    val author = new Author()
    val beanItem = new BeanItem[Author](author)

    val form = new Form()
    form.setItemDataSource(beanItem)
    form.setWriteThrough(false)
    form.getField("surName").setRequired(true)
    form.getField("name").setRequired(true)

    addComponent(form)

    val layout = new HorizontalLayout();
    layout.addComponent(new SpecialButton("Commit?", _ => {
      if(form.isValid){
        form.commit()
        getWindow.showNotification("BB: " + beanItem.getBean.name + " :: " + beanItem.getBean.surName, Window.Notification.TYPE_HUMANIZED_MESSAGE)
      }
    }))
    layout.setSpacing(true)
    layout.addComponent(new SpecialButton("Cancel?", _ => {
      form.discard()
    }))

    addComponent(layout)
  }

  def SpecialPanel() {

  }
}