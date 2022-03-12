package com.noox.mycreditcards.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.noox.mycreditcards.ui.theme.White

@Composable
fun AppTitle(
    modifier: Modifier
) {
    Box(modifier = modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.primary),
        contentAlignment = Alignment.BottomStart
    ) {
        Text(
            text = "My Cards",
            style = MaterialTheme.typography.h2,
            color = White,
            modifier = Modifier
                .padding(start = 32.dp, top = 0.dp, end = 0.dp, bottom = 32.dp)
        )
    }
}
