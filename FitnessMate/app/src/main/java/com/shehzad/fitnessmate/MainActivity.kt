package com.shehzad.fitnessmate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.shehzad.fitnessmate.presentation.screens.HomeScreen
import com.shehzad.fitnessmate.presentation.screens.MyBottomNavigation
import com.shehzad.fitnessmate.ui.theme.FitnessMateTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessMateTheme {
                // A surface container using the 'background' color from the theme
//                Surface(modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background) {
////                    Greeting("Android")
//                    HomeScreen()
                Scaffold(bottomBar = { MyBottomNavigation() }

                ) { padding ->
                    HomeScreen(Modifier.padding(padding))

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FitnessMateTheme {
        Greeting("Android")
    }
}