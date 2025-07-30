package com.stewarthue.redox.ui.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.stewarthue.redox.R
import com.stewarthue.redox.ui.theme.Greenyellow2
import com.stewarthue.redox.ui.theme.PurpleGrey40
import com.stewarthue.redox.ui.theme.newBlue


@Composable

fun AboutScreen (navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize().background(color = Greenyellow2),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ) {
        Image(
            painter = painterResource(id = R.drawable.computer),
            modifier = Modifier.size(250.dp),
            contentDescription = "Logo",

        )

        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Easy Shopping",
            fontSize =  40.sp,
            color = newBlue,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Download Free Icons and Stickers for your projects. Resources made by and for designers.",
            fontSize =  20.sp,
//            color = newBlue,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center
//            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(78.dp))

//        Row(
//            horizontalArrangement = Arrangement.SpaceEvenly,
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 16.dp)
//        ) {
//            Button(...){ }
//            Button(...){ }
//            Button(...){ }
//        }
//    }


          Row(
              horizontalArrangement = Arrangement.spacedBy(0.1.dp),
              verticalAlignment = Alignment.CenterVertically,
              modifier = Modifier.padding(end = 260.dp, bottom = 5.dp)

          ) {


              Button(
                  onClick = {},
                  colors = ButtonDefaults.buttonColors(containerColor = newBlue),
                  modifier = Modifier.size(12.5.dp)
              ) { }

              Spacer(modifier = Modifier.width(20.dp))

              Button(
                  onClick = {},
                  colors = ButtonDefaults.buttonColors(containerColor = PurpleGrey40),
                  modifier = Modifier.size(12.5.dp)
              ) { }
              Spacer(modifier = Modifier.width(20.dp))

              Button(
                  onClick = {},
                  colors = ButtonDefaults.buttonColors(containerColor = PurpleGrey40),
                  modifier = Modifier.size(12.5.dp)

              ) { }


//              Spacer(modifier = Modifier.width(80.dp))


              Button(
                  onClick = {},
                  colors = ButtonDefaults.buttonColors(containerColor = newBlue),
//                  shape = RoundedCornerShape(10.dp),
                  modifier = Modifier.width(30.dp).height(50.dp)
              ) {
                  Text(text = "Next")
              }


          }
    }

    Spacer(modifier = Modifier.width(20.dp))
}

@Preview(showBackground = true)
@Composable

fun AboutScreenPreview (){
    AboutScreen(rememberNavController())
}
