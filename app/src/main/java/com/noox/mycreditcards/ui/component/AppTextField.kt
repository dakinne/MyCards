package com.noox.mycreditcards.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier

@Composable
fun AppTextField(
    text: String,
    textValue: MutableState<String>
) {

    OutlinedTextField(
        value = textValue.value,
        onValueChange = { textValue.value = it },
        label = {
            Text(
                text = text,
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground
            )
        },
        singleLine = true,
        modifier = Modifier
            .fillMaxWidth()
    )
}
