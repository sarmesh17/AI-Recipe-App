package com.matrix.airecipeapp.presentation.splashscreen

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.matrix.airecipeapp.R
import java.time.format.TextStyle

@Composable
@Preview(showBackground = true)
fun SplashScreen(){
Box {
    Image(painter = painterResource(id = R.drawable.splashscreen), contentDescription =null, modifier = Modifier.fillMaxSize() )
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 60.dp), horizontalAlignment = Alignment.CenterHorizontally) {


        Text(
            text = "Good Food ",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(id = R.color.navy)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Deliciously Simple", fontSize = 15.sp, color = Color.Black)
        Spacer(modifier = Modifier.height(650.dp))
        Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent, contentColor = Color.Black), modifier = Modifier.border(2.dp, color = Color.Black, shape = RoundedCornerShape(25.dp))) {
            Text(text = "Start Cooking", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)

        }
    }
}
}