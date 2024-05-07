package com.example.parcialfernandobertone.Pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.parcialfernandobertone.ui.theme.ParcialFernandoBertoneTheme

@Composable
fun Login(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var loginExitoso by remember{
        mutableStateOf(true)
    }
    val usuario = "pedro@pe.com.ar"
    val contraseña = "abc123"
    val nombre = "Predo Pe"
    var usuarioField by remember { mutableStateOf("") }
    var contraseñaField by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                text = "Login parcial",
                color = MaterialTheme.colorScheme.secondary,
                style = MaterialTheme.typography.titleLarge,
                modifier = modifier.padding(vertical = 10.dp)
            )
            TextField(
                value = usuarioField,
                onValueChange = {usuarioField = it},
                placeholder = { Text(text = "Ingrese su usuario") },
                modifier = modifier
                    .padding(top = 10.dp)
            )
            TextField(
                value = contraseñaField,
                onValueChange = {contraseñaField = it},
                placeholder = { Text(text = "Ingrese su contraseña") },
                modifier = modifier
                    .padding(top = 10.dp)
            )
            if (loginExitoso){
                Button(
                    onClick = {
                        if (usuarioField == usuario && contraseñaField == contraseña) {
                            navController.navigate("Bienvenida")
                        } else {
                            loginExitoso = false
                        }
                    }
                ) {
                    Text(text = "Log In",
                        modifier = modifier
                            .padding(top = 10.dp))
                }
            }else{
                Text(
                    text = "Usuario o contraseña invalidos",
                    color = MaterialTheme.colorScheme.error,
                    modifier = modifier
                        .padding(vertical = 15.dp)
                )
                Button(
                    onClick = {
                        if (usuarioField == usuario && contraseñaField == contraseña) {
                            navController.navigate("Bienvenida")
                        } else {
                            loginExitoso = false
                        }

                    }
                ) {
                    Text(text = "Login")
                }
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun Page1Preview() {

    ParcialFernandoBertoneTheme {
        val navController = rememberNavController()
        Login(navController = navController)
    }
}