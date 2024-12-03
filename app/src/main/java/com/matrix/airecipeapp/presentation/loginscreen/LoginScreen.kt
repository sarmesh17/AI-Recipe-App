package com.matrix.airecipeapp.presentation.loginscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.matrix.airecipeapp.R

@Composable
@Preview(showBackground = true)
fun LoginScreen() {
    var email by remember {
        androidx.compose.runtime.mutableStateOf("")

    }
    var isChecked by remember {
        mutableStateOf(false)
    }
    Column(modifier = Modifier.fillMaxSize()) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.loginscreen),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(260.dp)
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, end = 10.dp, start = 10.dp, bottom = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {


                Icon(
                    painter = painterResource(id = R.drawable.vector1),
                    contentDescription = null, tint = Color.White,
                    modifier = Modifier.size(20.dp)
                )
                Text(text = "Sign Up", fontSize = 20.sp, color = Color.White)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 15.dp)
        ) {
            Text(
                text = "Welcome Back to Good Food",
                fontSize = 40.sp,
                color = colorResource(id = R.color.amber)
            )

        }
        Column {
            TextField(
                value = email,
                onValueChange = { email = it },
                placeholder = { Text(text = "Your Email", fontSize = 15.sp) },
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = colorResource(
                        id = R.color.amber
                    ), focusedIndicatorColor = colorResource(id = R.color.amber),
                    focusedContainerColor = Color.White, unfocusedContainerColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp, start = 25.dp, end = 25.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                value = email,
                onValueChange = { email = it },
                placeholder = { Text(text = "Password", fontSize = 15.sp) },
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = colorResource(
                        id = R.color.amber
                    ), focusedIndicatorColor = colorResource(id = R.color.amber),
                    focusedContainerColor = Color.White, unfocusedContainerColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp, start = 25.dp, end = 25.dp)
            )

        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp), horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically){
            Switch(checked = isChecked, onCheckedChange = {isChecked=it}, colors = SwitchDefaults.colors(checkedThumbColor = Color.White, checkedTrackColor = colorResource(
                id = R.color.amber
            ), uncheckedThumbColor = Color.White, uncheckedTrackColor = colorResource(id = R.color.amber)))
            Spacer(modifier = Modifier.width(12.dp))
            Text(text = "Remember")
            Spacer(modifier = Modifier.width(170.dp))
            Text(text = "Forget ?")

        }
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier
                .height(250.dp)
                .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(234.dp, 40.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = colorResource(
                        id = R.color.black
                    ), containerColor = colorResource(id = R.color.amber)
                ),
                shape = RoundedCornerShape(10.dp)
            ) {
                Text(text = "Log In")
            }


        }
    }
}


