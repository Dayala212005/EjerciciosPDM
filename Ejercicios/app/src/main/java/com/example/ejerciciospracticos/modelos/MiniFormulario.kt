package com.example.ejerciciospracticos.modelos

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejerciciospracticos.R

@Composable
fun miniFormulario(modifier: Modifier) {
    var nombreInput by rememberSaveable() { mutableStateOf("") }
    var nombre by rememberSaveable() { mutableStateOf("") }

    Column(
        modifier = modifier
            .padding(24.dp)
            .verticalScroll(rememberScrollState()),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = modifier.padding(24.dp),

        ) {
            TextField(
                value = nombreInput,
                onValueChange = { nombreInput = it },
                label = {Text(text = ("Ingresar nombre"))}
            )
        }
        Box(
            modifier = modifier.padding(10.dp)
        ) {
            if(nombre == "")
                Text(text = "Porfavor ingresar nombre")
            else
                Text(text = "Hola ${nombre}")
        }

        Button(
            onClick = {
                nombre = nombreInput
            }
        ) {
            Text(text = "Ingresar nombre")
        }
    }
}

@Preview
@Composable
fun PreviewMiniFormulario() {
    miniFormulario(modifier = Modifier)
}