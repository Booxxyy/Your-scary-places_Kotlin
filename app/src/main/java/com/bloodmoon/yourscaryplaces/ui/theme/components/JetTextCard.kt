package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bloodmoon.yourscaryplaces.R
import com.bloodmoon.yourscaryplaces.ui.theme.fonts

@Composable
fun JetTextCard(
    label: String,
    value: String,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .background(
                color = Color.DarkGray,
                shape = MaterialTheme.shapes.medium
            )
            .padding(
                top = 12.dp,
                bottom = 25.dp,
                start = 24.dp,
                end = 16.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Text(
            fontFamily = fonts,
            fontSize = 18.sp,
            fontWeight = FontWeight.W500,
            color = Color.Gray,
            text = label
        )
        Text(
            fontFamily = fonts,
            fontSize = 16.sp,
            fontWeight = FontWeight.W500,
            color = Color.White,
            text = value,
            modifier = modifier.padding(6.dp)
        )
    }
}

@Preview
@Composable
private fun JetTextCardPreview() {
    JetTextCard(
        label = stringResource(R.string.description),
        value = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?",
        modifier = Modifier
    )
}