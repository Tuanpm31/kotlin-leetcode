package designpattern.factorymethod

abstract class Dialog {
    abstract fun createDialog(): Button

    fun render() {
        createDialog().render()
    }
}

class WindowsDialog : Dialog() {
    override fun createDialog(): Button = WindowsButton()
}

class HtmlDialog : Dialog() {
    override fun createDialog(): Button = HtmlButton()

}