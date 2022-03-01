package br.com.dnassuncao.composeuielements

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.dnassuncao.composeuielements.ui.theme.ComposeUIElementsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextUi("Welcome to Jetpack Compose")
        }
    }
}

@Composable
fun TextUi(text: String) {
    Column {
        val customFont = Font(R.font.chango)
        val customFontFamily = FontFamily(customFont)

        BasicText(
            text = "Welcome",
            modifier = Modifier.padding(8.dp),
            style = MaterialTheme.typography.h2.copy(
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(Modifier.height(16.dp))
        BasicText(
            text = text,
            modifier = Modifier.padding(8.dp),
            style = TextStyle.Default.copy(
                color = Color.Red,
                fontSize = 50.sp,
                fontFamily = customFontFamily
            )
        )
        Text(
            text = text,
            modifier = Modifier.padding(8.dp),
            style = MaterialTheme.typography.h4.copy(
                color = Color.Green,
                fontSize = 60.sp,
                fontStyle = FontStyle.Italic
            )
        )
    }
}

@Preview
@Composable
fun PreviewTextUi() {
    TextUi("Welcome to Jetpack Compose")
}
