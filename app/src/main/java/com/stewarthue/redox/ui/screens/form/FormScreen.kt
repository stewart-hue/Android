package com.stewarthue.redox.ui.screens.form

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.stewarthue.redox.R
import com.stewarthue.redox.navigation.ROUT_HOME
import com.stewarthue.redox.navigation.ROUT_ITEM
import com.stewarthue.redox.ui.theme.newBlue
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FormScreen {
}


@Composable

fun FormScreen (navController: NavController){
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }


    Column (
        modifier = Modifier.fillMaxSize().background(newBlue),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {




            //Lottie Animation
            val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.moo))
            val progress by animateLottieCompositionAsState(composition)
            LottieAnimation(composition, progress,
                modifier = Modifier.size(200.dp)
            )
//End of animation


        //Card


        Card (modifier = Modifier.fillMaxWidth().height(800.dp),
            shape = RoundedCornerShape(topStart = 60.dp, topEnd = 60.dp)
        ){
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                
                

                Text(
                    text = "Swaggy",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = newBlue
                )


                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Join us and start your journey today",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(8.dp))


                //username

                OutlinedTextField(
                    value = username,
                    onValueChange = { username = it } ,
                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp , end = 10.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person") },
                    label = {
                        Text(text = "Username")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = newBlue,
                        focusedBorderColor = Color.Black,
                        unfocusedLeadingIconColor = newBlue,
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )



                //End of username



                Spacer(modifier = Modifier.height(8.dp))


                //email

                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it } ,
                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp , end = 10.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "Email") },
                    label = {
                        Text(text = "Email")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = newBlue,
                        focusedBorderColor = Color.Black,
                        unfocusedLeadingIconColor = newBlue,
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                )



                //End of email



                Spacer(modifier = Modifier.height(8.dp))


                //password

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it } ,
                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp , end = 10.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "password") },
                    label = {
                        Text(text = "Password")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = newBlue,
                        focusedBorderColor = Color.Black,
                        unfocusedLeadingIconColor = newBlue,
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    visualTransformation = PasswordVisualTransformation()
                )



                //End of password

                Spacer(modifier = Modifier.height(8.dp))


                //confirmpassword

                OutlinedTextField(
                    value = confirmpassword,
                    onValueChange = { confirmpassword = it } ,
                    modifier = Modifier.fillMaxWidth().padding(start = 10.dp , end = 10.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "person") },
                    label = {
                        Text(text = "Confirmpassword")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = newBlue,
                        focusedBorderColor = Color.Black,
                        unfocusedLeadingIconColor = newBlue,
                    ),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    visualTransformation = PasswordVisualTransformation()



                )



                //End of confrimpassword

                Spacer(modifier = Modifier.height(8.dp))



                Button(
                    onClick = {
                        navController.navigate(ROUT_ITEM)

                    },
                    colors = ButtonDefaults.buttonColors(containerColor = newBlue),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
                ) {
                    Text(text = "Register")
                }

                Spacer(modifier = Modifier.height(8.dp))


                TextButton(onClick = {}) {
                    Text(text = "Already have an account?")



                }


            }
        }


        //End of Card



        Spacer(modifier = Modifier.height(10.dp))


    }



    //End of Main layout

}

@Preview(showBackground = true)
@Composable


fun FormScreenPreview (){



    FormScreen(rememberNavController())
}