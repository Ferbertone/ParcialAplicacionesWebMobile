package com.example.parcialfernandobertone.Pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.parcialfernandobertone.ui.theme.ParcialFernandoBertoneTheme

@Composable
fun Page2(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column {
        Text(text = "Page2 parcial")
        Button(
            onClick = {
                navController.navigate("page1")

            }
        ) {
            Text(text = "ir a page1")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun Page2Preview() {
    ParcialFernandoBertoneTheme {
        val navController = rememberNavController()
        Page2(navController = navController)

    }
}