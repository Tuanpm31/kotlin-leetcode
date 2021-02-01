package designpattern.factorymethod

class ApplicationFactoryMethod(var config: ApplicationType) {
    var dialog: Dialog? = null

    init {
        dialog = when (config) {
            ApplicationType.WINDOWS -> WindowsDialog()
            ApplicationType.HTML -> HtmlDialog()
        }
    }
}

enum class ApplicationType {
    WINDOWS, HTML
}

fun main() {
    val newDialog = ApplicationFactoryMethod(ApplicationType.WINDOWS).dialog
    newDialog?.render()
}