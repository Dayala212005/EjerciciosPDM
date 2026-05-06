package com.example.ejerciciospracticos.modelos

import android.text.BoringLayout
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextoInvisible(modifier: Modifier) {
    var mostrar by rememberSaveable { mutableStateOf(false) }

    Column(
        modifier = modifier
            .padding(24.dp)
            .verticalScroll(rememberScrollState()),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        if(mostrar)
        Text(
            text = "Hola soy un mensaje",
            modifier = modifier.padding(24.dp),
        )
        else
            Text(
                text = "",
                modifier = modifier.padding(24.dp),
            )
        Button(
            onClick = {
                mostrar = cambiarTexto(mostrar)
            },

        ) {
            if(mostrar)
                Text(text = "Ocultar texto")
            else
                Text(text = "Mostrar texto")
        }
    }
}

internal fun cambiarTexto(mostrar: Boolean): Boolean {
    return !mostrar
}

@Preview
@Composable
fun PreviewTextoInvisible() {
    TextoInvisible(modifier = Modifier)
}