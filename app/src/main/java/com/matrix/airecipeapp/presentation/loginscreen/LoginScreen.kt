package com.matrix.airecipeapp.presentation.loginscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.matrix.airecipeapp.R

@Composable
@Preview(showBackground = true)
fun LoginScreen(){
Column(modifier = Modifier.fillMaxSize()) {
    Image(painter = painterResource(id = R.drawable.loginscreen), contentDescription =null, modifier = Modifier.fillMaxWidth().height(259.dp))
}
}