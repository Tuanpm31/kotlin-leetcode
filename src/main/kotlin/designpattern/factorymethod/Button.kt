package designpattern.factorymethod

interface Button {
    fun render()

    fun onClick()
}

class WindowsButton : Button {
    override fun render() {
        TODO("Not yet implemented")
    }

    override fun onClick() {
        TODO("Not yet implemented")
    }

}

class HtmlButton : Button {
    override fun render() {
        TODO("Not yet implemented")
    }

    override fun onClick() {
        TODO("Not yet implemented")
    }

}