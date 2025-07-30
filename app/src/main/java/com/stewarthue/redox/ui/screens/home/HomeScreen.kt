package com.stewarthue.redox.ui.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.stewarthue.redox.navigation.ROUT_ITEM
import com.stewarthue.redox.ui.theme.Greenyellow1
import com.stewarthue.redox.ui.theme.newBlue

@Composable

fun HomeScreen (navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().background(color = Greenyellow1 )   .paint(painter = painterResource(R.drawable.background), contentScale = ContentScale.FillBounds),
        horizontalAlignment =Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center



    ) {


        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "App Logo",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop

        )

        Spacer(modifier = Modifier.height(10.dp))


     Text(
         text = "Redox",
         fontSize =  40.sp,
         color = newBlue,
         fontFamily = FontFamily.Cursive,
         fontWeight = FontWeight.Bold
     )


        Spacer(modifier = Modifier.height(10.dp))



        Text(
            text = "Top Secret",
            fontSize =  20.sp,
//            color = newBlue,
//            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))



        Text(
            text = "Classified Mission to be conducted by the special forces for search and seize in 0900hrs",
            fontSize =  20.sp,
//            fontWeight = FontWeight.Bold
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                navController.navigate(ROUT_ITEM)

            },
            colors = ButtonDefaults.buttonColors(containerColor = newBlue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)
            ) {
            Text(text = "Get started")
        }

    }
}

@Preview(showBackground = true)
@Composable

fun HomeScreenPreview (){
    HomeScreen(rememberNavController())
}









