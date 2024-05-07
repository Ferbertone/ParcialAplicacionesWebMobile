package com.example.parcialfernandobertone.Pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.parcialfernandobertone.ui.theme.ParcialFernandoBertoneTheme


@Composable
fun MainPage( modifier: Modifier = Modifier) {
    val navHostController = rememberNavController()

    Scaffold (
        modifier = modifier,
        topBar =  { MainTopappBar() }
    ){
        MainNavHost(
            navHostController = navHostController,
            modifier = Modifier.padding(it),
            startDestination = "page1"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    ParcialFernandoBertoneTheme {
        MainPage()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainTopappBar() {
    TopAppBar(
        title = {
            Text(text = "Esto es el scaffold")
        },
        colors =  TopAppBarDefaults.topAppBarColors(
            titleContentColor = MaterialTheme.colorScheme.primary,
            containerColor = MaterialTheme.colorScheme.primaryContainer
        )

    )
}

@Composable
fun MainNavHost(
    navHostController: NavHostController,
    modifier : Modifier = Modifier,
    startDestination: String = "page1"
){
    NavHost(
        navController = navHostController,
        modifier = modifier,
        startDestination = "page1"
    ) {
        composable("page1") { Page1(navController = navHostController) }
        composable("page2") { Page2(navController = navHostController) }
    }
}

