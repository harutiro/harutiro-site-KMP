import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        val title = "Compose Counting Grid on plain JS"
        @OptIn(ExperimentalComposeUiApi::class)
        CanvasBasedWindow(title, canvasElementId = "ComposeTarget") {
            App()
        }
    }
}