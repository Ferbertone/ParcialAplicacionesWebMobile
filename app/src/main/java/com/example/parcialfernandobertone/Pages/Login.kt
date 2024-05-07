package com.example.parcialfernandobertone.Pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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

    Column {
        Text(text = "Login parcial")
        TextField(
            value = usuarioField,
            onValueChange = {usuarioField = it},
            placeholder = { Text(text = "Ingrese su usuario") },
            modifier = modifier
                .padding(top = 10.dp)
                .fillMaxWidth()
        )
        TextField(
            value = contraseñaField,
            onValueChange = {contraseñaField = it},
            placeholder = { Text(text = "Ingrese su contraseña") },
            modifier = modifier
                .padding(top = 10.dp)
                .fillMaxWidth()
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
                Text(text = "Log In")
            }
        }else{
            Text(text = "Usuario o contraseña invalidos")
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

@Preview(showBackground = true)
@Composable
fun Page1Preview() {

    ParcialFernandoBertoneTheme {
        val navController = rememberNavController()
        Login(navController = navController)
    }
}