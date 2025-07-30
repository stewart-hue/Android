package com.stewarthue.redox.ui.screens.category

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.stewarthue.redox.R
import com.stewarthue.redox.navigation.ROUT_DETAILS
import com.stewarthue.redox.navigation.ROUT_ITEM
import com.stewarthue.redox.ui.theme.newBlue
import com.stewarthue.redox.ui.theme.newBlue


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()


    ) {
        //TopAppBar
        TopAppBar(
            title = { Text(text = "Other Categories") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = newBlue, titleContentColor = Color.White,
                navigationIconContentColor = Color.White,
                actionIconContentColor = Color.White
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu"
                    )
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.ShoppingCart,
                        contentDescription = "shoppingcart"
                    )

                }

                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "info"
                    )

                }

            }
        )
        //End of TopAppBar
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Welcome to Swaggy!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)

        )

        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Discover unique styles across categories. Find something for every vibe!",
            fontSize = 15.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)

        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Shop By Category",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp)

        )

        Spacer(modifier = Modifier.height(10.dp))

        //CARD
        Card(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(height = 200.dp)
                .padding(start = 20.dp, end = 20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "jewellery",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )


                Text(
                    text = "Jewellery",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White

                )

                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "favourite",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .padding(10.dp),

                    tint = Color.White

                )


            }


        }
        //END OF CARD

        Spacer(modifier = Modifier.height(10.dp))


        //CARD
        Card(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(height = 200.dp)
                .padding(start = 20.dp, end = 20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(R.drawable.logo),
                    contentDescription = "sneakers",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )


                Text(
                    text = "Sneakers",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,


                    )

                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "favourite",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .padding(10.dp),

                    tint = Color.White

                )


            }


        }
        //END OF CARD

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "More categories coming soon...",
            fontSize = 15.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()


        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                navController.navigate(ROUT_DETAILS)
            },
            colors = ButtonDefaults.buttonColors(newBlue),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 100.dp, end = 100.dp)



        ) {
            Text(text = "Explore All Products")

        }

        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "Follow us on instagram @swaggy_ke",
            fontSize = 15.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()


        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Need Help? Contact us at support@swaggy.co.ke",
            fontSize = 15.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()


        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "\"Wear the vibe. Live the vibe.\"",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()


        )
















    }

}

@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview(){
    CategoryScreen(rememberNavController())
}