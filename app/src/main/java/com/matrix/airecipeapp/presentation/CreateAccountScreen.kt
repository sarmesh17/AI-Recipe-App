package com.matrix.airecipeapp.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.FocusInteraction
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
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.matrix.airecipeapp.R

@Composable
@Preview(showBackground = true)
fun CreateAccountScreen(){
    var email by remember {androidx.compose.runtime.mutableStateOf("")

    }
    var password by remember {androidx.compose.runtime.mutableStateOf("")

    }
    var uesrname by remember {androidx.compose.runtime.mutableStateOf("")

    }
    Column (modifier = Modifier.fillMaxSize()){
        Box {
            Image(painter = painterResource(id = R.drawable.imgofcreateacc), contentDescription =null, modifier = Modifier
                .fillMaxWidth()
                .height(260.dp) )
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, end = 10.dp, start = 10.dp, bottom = 10.dp), horizontalArrangement = Arrangement.SpaceBetween){


                Icon(
                    painter = painterResource(id = R.drawable.vector),
                    contentDescription = null, tint = Color.White,
                    modifier = Modifier.size(20.dp))
                Text(text = "Log In", fontSize = 20.sp, color = Color.White)
            }
        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, start = 15.dp)){
            Text(text = "Let's start making good meals", fontSize =40.sp, color = colorResource(id = R.color.amber))

        }
        Column {

            TextField(value = uesrname, onValueChange = {uesrname = it}, placeholder = { Text(text = "User Name", fontSize = 15.sp)},
                colors = TextFieldDefaults.colors(unfocusedIndicatorColor = colorResource(
                    id = R.color.amber), focusedIndicatorColor = colorResource(id = R.color.amber),
                    focusedContainerColor = Color.White, unfocusedContainerColor = Color.White), modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp, start = 25.dp, end = 25.dp))
            Spacer(modifier = Modifier.height(10.dp))
            TextField(value = email, onValueChange = {email = it}, placeholder = { Text(text = "Your Email", fontSize = 15.sp)},
                colors = TextFieldDefaults.colors(unfocusedIndicatorColor = colorResource(
                id = R.color.amber), focusedIndicatorColor = colorResource(id = R.color.amber),
                focusedContainerColor = Color.White, unfocusedContainerColor = Color.White), modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp, start = 25.dp, end = 25.dp))
            Spacer(modifier = Modifier.height(10.dp))
            TextField(value = password, onValueChange = {password = it}, placeholder = { Text(text = "Password", fontSize = 15.sp)},
                colors = TextFieldDefaults.colors(unfocusedIndicatorColor = colorResource(
                    id = R.color.amber), focusedIndicatorColor = colorResource(id = R.color.amber),
                    focusedContainerColor = Color.White, unfocusedContainerColor = Color.White), modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp, bottom = 10.dp, start = 25.dp, end = 25.dp))

        }
        Spacer(modifier = Modifier.height(15.dp))
        Column (modifier = Modifier
            .height(250.dp)
            .fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally)
        {
            Button(onClick = { /*TODO*/ }, modifier = Modifier.size(234.dp,40.dp), colors = ButtonDefaults.buttonColors(contentColor = colorResource(
                id = R.color.black), containerColor = colorResource(id = R.color.amber)), shape = RoundedCornerShape(10.dp) ) {
                Text(text = "Create Account")
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                HorizontalDivider(thickness = 1.5.dp, color = Color.Black, modifier = Modifier
                    .width(80.dp)
                    .padding(top = 8.dp))
                Spacer(modifier = Modifier.width(8.dp))
                Text(text ="OR")
                Spacer(modifier = Modifier.width(8.dp))

                HorizontalDivider(thickness = 1.5.dp, color = Color.Black, modifier = Modifier
                    .width(80.dp)
                    .padding(top = 8.dp))
                
            }
            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = { /*TODO*/ }, modifier = Modifier.size(234.dp,40.dp), colors = ButtonDefaults.buttonColors(contentColor = colorResource(
                id = R.color.black), containerColor = colorResource(id = R.color.white)), shape = RoundedCornerShape(10.dp), border = BorderStroke(width = 1.dp, color = Color.Black) ) {
                Row {
                    Icon(painter = painterResource(id = R.drawable.facebook), contentDescription = null, modifier = Modifier.size(20.dp),
                        Color.Gray)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Sign Up with Facebook", fontSize = 15.sp)

                }

            }
            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = { /*TODO*/ }, modifier = Modifier.size(234.dp,40.dp), colors = ButtonDefaults.buttonColors(contentColor = colorResource(
                id = R.color.black), containerColor = colorResource(id = R.color.white)), shape = RoundedCornerShape(10.dp), border = BorderStroke(width = 1.dp, color = Color.Black) ) {
                Row {
                    Icon(painter = painterResource(id = R.drawable.google), contentDescription = null, modifier = Modifier.size(20.dp),
                        Color.Gray)
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Sign Up with Google", fontSize = 15.sp)

                }

            }
            Spacer(modifier = Modifier.height(10.dp))
Text(text = "Term of Use and Privacy Policy", fontSize = 13.sp)
            }
            


        }
    }

