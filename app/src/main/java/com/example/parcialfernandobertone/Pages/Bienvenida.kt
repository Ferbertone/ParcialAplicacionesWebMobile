package com.example.parcialfernandobertone.Pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.parcialfernandobertone.ui.theme.ParcialFernandoBertoneTheme

@Composable
fun Bienvenida(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column {
        Column (modifier = modifier.align(Alignment.CenterHorizontally)){
            Text(text = "Bienvenida ")
            Text(text = "Pedro Pe")
        }

        Button(
            onClick = {
                navController.navigate("Login")

            }
        ) {
            Text(text = "Cerrar sesion")

        }

    }
}

@Preview(showBackground = true)
@Composable
fun Page2Preview() {
    ParcialFernandoBertoneTheme {
        val navController = rememberNavController()
        Bienvenida(navController = navController)

    }
}