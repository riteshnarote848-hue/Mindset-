package com.ritesh.mindrise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Button

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MindRiseApp()
        }
    }
}

@Composable
fun MindRiseApp() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        // Define your navigation graph here
        composable("home") { HomeScreen(navController) }
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    Surface(color = MaterialTheme.colorScheme.background) {
        Text(text = "Welcome to MindRise")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MindRiseApp()
}