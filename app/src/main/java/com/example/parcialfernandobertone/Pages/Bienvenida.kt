package com.example.parcialfernandobertone.Pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.parcialfernandobertone.ui.theme.ParcialFernandoBertoneTheme

@Composable
fun Bienvenida(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column (
            modifier = modifier.
            align(Alignment.CenterHorizontally)
        ){
            Text(
                text = "Bienvenida/o",
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleLarge,
                modifier = modifier.padding(vertical = 10.dp)
            )
            Text(
                text = "Pedro Pe",
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
        }

        Button(
            modifier = modifier.padding(vertical = 15.dp),
            onClick = { navController.navigate("Login") }
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