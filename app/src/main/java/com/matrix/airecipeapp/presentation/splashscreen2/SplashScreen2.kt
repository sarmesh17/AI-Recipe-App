package com.matrix.airecipeapp.presentation.splashscreen2

import android.window.SplashScreen
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.matrix.airecipeapp.R
import java.time.format.TextStyle

@Composable
fun SplashScreen2(){
    val windowSize= rememberWindowSize()
    when (windowSize.width){
        WindowType.Compact ->{
CompactItemsScreen()
        }
        else->{
MediumToExpandedItemsScreen()
        }
    }

}
@Composable
fun CompactItemsScreen(){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.splashscreen1), contentDescription =null, modifier = Modifier.fillMaxSize() )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp).align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Icon(painter = painterResource(id = R.drawable.cheficon), contentDescription =null, modifier = Modifier.size(48.dp) )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Good Food ",
                style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
                color = colorResource(id = R.color.black)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Nutritionally balanced easy to cook recipes. Quality fresh local ingredients.", fontSize = 15.sp, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.bodySmall, textAlign = TextAlign.Center, color = Color.Black)
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(24.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray, contentColor = Color.Black), border = BorderStroke(1.dp, color = Color.Black)

                ) {
                Text(text = "create Account", fontSize = 15.sp, fontWeight = FontWeight.SemiBold)

            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Already have an account ?", fontSize =15.sp , fontWeight = FontWeight.Medium, color = Color.Black, modifier = Modifier.clickable {  })
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "LOG IN", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.clickable {  })
            Spacer(modifier = Modifier.height(30.dp))





        }
    }
}
@Composable
fun MediumToExpandedItemsScreen(){
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.splashscreen1), contentDescription =null, contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize() )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 32.dp).align(Alignment.Center), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Icon(painter = painterResource(id = R.drawable.cheficon), contentDescription =null, modifier = Modifier.size(64.dp) )
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Good Food ",
                style = MaterialTheme.typography.headlineMedium.copy(fontWeight = FontWeight.Bold),
                color = colorResource(id = R.color.black)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Nutritionally balanced easy to cook recipes. Quality fresh local ingredients.", fontSize = 16.sp, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.bodySmall, textAlign = TextAlign.Center, color = Color.Black)
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth(), shape = RoundedCornerShape(24.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray, contentColor = Color.Black), border = BorderStroke(1.dp, color = Color.Black)

            ) {
                Text(text = "create Account", fontSize = 16.sp, fontWeight = FontWeight.SemiBold)

            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "Already have an account ?", fontSize =15.sp , fontWeight = FontWeight.Medium, color = Color.Black, modifier = Modifier.clickable {  })
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = "LOG IN", fontSize = 15.sp, fontWeight = FontWeight.Bold, color = Color.Black, modifier = Modifier.clickable {  })
            Spacer(modifier = Modifier.height(30.dp))



        }
    }
}