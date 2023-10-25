package uz.megasoft.composenavigation.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.elevatedShape
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Bottom
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(navHostController: NavHostController) {

    Box (
        modifier = Modifier.fillMaxSize()

    ){

        TopAppBar(
            title = {Text(text = "Home Screen")},
            modifier = Modifier.background(color = Color.White),
            navigationIcon = {},
            actions = {},
            scrollBehavior = null
        )

        ElevatedButton(
            contentPadding = PaddingValues(32.dp, 16.dp),
            modifier = Modifier.run {
                fillMaxWidth()
                    .align(BottomCenter)
                    .then(padding(horizontal = 16.dp, vertical = 16.dp))
            },
            onClick = { navHostController.navigate("setting") },
            enabled = true,
            colors = ButtonDefaults.buttonColors(Color(0xFFFF9800)),
            shape = RoundedCornerShape(size = 16.dp),
        ) {
            Text(
                text = "Setting",
                style = TextStyle(color = Color.Black)
            )
        }
    }
}