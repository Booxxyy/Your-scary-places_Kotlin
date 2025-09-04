package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun JetGradientButton (
    text: String,
    modifier: Modifier
) {
    Box(
       modifier = modifier
           .size(256.dp, 54.dp)
           .background(Brush.horizontalGradient(listOf(Color(0xFF1C1F1E), Color(0xFF804E4E))), RoundedCornerShape(24.dp))
    ) {
        Text(
            text = text,
            fontWeight = FontWeight.W400,
            color = Color.White,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Composable
@Preview
private fun JetGradientButtonPreview() {
    JetGradientButton(
        text = "Send an application",
        modifier = Modifier
    )
}