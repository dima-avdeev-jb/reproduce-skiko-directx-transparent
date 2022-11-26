import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    //todo Pay attention to transparent = true, undecorated = true
    Window(::exitApplication, transparent = true, undecorated = true) {

        Box(Modifier.size(400.dp).clip(CutCornerShape(20.dp)).background(Color.Green)) {
            Button(onClick = {
                exitApplication()
            }) {
                Text("Close application")
            }
        }

    }
}
