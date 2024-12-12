package com.matrix.airecipeapp.presentation.splashscreen2

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
import androidx.compose.material3.Icon
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
fun SplashScreen2(){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.splashscreen1), contentDescription =null, modifier = Modifier.fillMaxSize() )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Icon(painter = painterResource(id = R.drawable.cheficon), contentDescription =null, modifier = Modifier.size(45.dp) )
             Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Good Food ",
                fontSize = 29.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.black)
            )
            Spacer(modifier = Modifier.height(40.dp))
            Text(text = "    Nutritionally balanced,\n" +
                    "easy to cook recipes. Quality \n" +
                    "    fresh local ingredients.", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(30.dp))
                    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray, contentColor = Color.Black), modifier = Modifier
                        .size(180.dp, 50.dp)
                        .border(2.dp, color = Color.Black, shape = RoundedCornerShape(15.dp))) {
                Text(text = "create Account", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)

            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Already have an account ?", fontSize = 15.sp, fontWeight = FontWeight.Medium)
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "LOG IN", fontSize = 15.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(30.dp))



        }
    }
}