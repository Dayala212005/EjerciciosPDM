package com.example.ejerciciospracticos.modelos

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejerciciospracticos.R
import java.text.NumberFormat
import kotlin.text.toDoubleOrNull


@Composable
fun Contador (modifier: Modifier = Modifier) {
    var contadorInput by rememberSaveable { mutableIntStateOf(0) }
    //val contador = contadorInput.toIntOrNull() ?: 0
    var numero by rememberSaveable { mutableIntStateOf(0) }

    Column(
        modifier = modifier
            .padding(24.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier= modifier
                .padding(24.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = modifier) {
                Text(
                    text = stringResource(R.string.Contador),
                    modifier = modifier
                        .padding(24.dp)
                )
            }

            Box(modifier = modifier) {
                if (color(numero))
                Text(
                    text = numero.toString(),
                    color = Color.Green
                )
                else if(numero == 0)
                Text(
                    text = 0.toString(),
                )
                else
                    Text(
                        text = numero.toString(),
                        color = Color.Red
                    )
            }
            }
        Row(
            modifier = modifier
                .padding(24.dp)
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {

                   numero = disminuirContador(contadorInput)
                    contadorInput = disminuirContador(contadorInput)
                },

            ) {
                Text(text = "Disminuir")
            }

            Spacer(modifier = modifier.padding(10.dp))
            Button(
                onClick = {

                   numero = aumentarContador(contadorInput)
                    contadorInput = aumentarContador(contadorInput)
                },

            ) {
                Text(text = "Aumentar")
            }
        }

    }
}

internal fun aumentarContador(contador: Int): Int {
    val suma = contador + 1
    return suma
}

internal fun disminuirContador(contador: Int) : Int {
    val resta = contador - 1
    return resta
}

internal  fun color(numero: Int) : Boolean {
    if(numero > 0)
        return true
    else(numero < 0)
        return false
}

@Preview
@Composable
fun PreviewContador() {
    Contador(modifier = Modifier)
}