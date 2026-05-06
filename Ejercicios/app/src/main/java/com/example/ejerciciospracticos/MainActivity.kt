package com.example.ejerciciospracticos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejerciciospracticos.modelos.Contador
import com.example.ejerciciospracticos.modelos.TextoInvisible
import com.example.ejerciciospracticos.modelos.miniFormulario
import com.example.ejerciciospracticos.ui.theme.EjerciciosPracticosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EjerciciosPracticosTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    miniFormulario(modifier = Modifier)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EjerciciosPracticosTheme {
        Greeting("Android")
    }
}