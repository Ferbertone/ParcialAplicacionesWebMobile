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
fun Page1(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    Column {
        Text(text = "Page1 parcial")
        Button(
            onClick = {
                navController.navigate("page2")

            }
        ) {
            Text(text = "ir a page2")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun Page1Preview() {

    ParcialFernandoBertoneTheme {
        val navController = rememberNavController()
        Page1(navController = navController)
    }
}