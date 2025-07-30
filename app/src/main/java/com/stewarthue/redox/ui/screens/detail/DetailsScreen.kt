package com.stewarthue.redox.ui.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.stewarthue.redox.navigation.ROUT_INTENTS
import com.stewarthue.redox.ui.theme.Greenyellow1
import com.stewarthue.redox.ui.theme.newBlue

class DetailsScreen {
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DetailsScreen (navController: NavController){



    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar
        topBar = {
            TopAppBar(
                title = { Text("Other Products") },
                navigationIcon = {
                    IconButton(onClick = { /* Handle back/nav */ })
                    {
                        Icon(Icons.Default.Menu, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.LightGray,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),

                actions = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = "Shopping-cart"
                        )

                    }

                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "Notifications"
                        )

                    }
                }
            )
        },

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Color.LightGray
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 1,
                    onClick = { selectedIndex = 1
                        //navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = "Favorites") },
                    label = { Text("Favorites") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 1
                        // navController.navigate(ROUT_HOME)
                    }
                )
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = selectedIndex == 2,
                    onClick = { selectedIndex = 2
                        //  navController.navigate(ROUT_HOME)




                    }
                )

            }
        },

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate(ROUT_INTENTS) },
                containerColor = Color.LightGray
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                //Main Contents of the page

                Spacer(modifier = Modifier.height(10.dp))

              //SearchBar
                var search by remember { mutableStateOf( "") }
                OutlinedTextField(
                    value = search,
                    onValueChange = {search = it},
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                    leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "Search") },
                    placeholder = { Text(text = "Search Products, Categories...") },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Greenyellow1,
                        focusedBorderColor = Color.Green
                    )
                )
                //SearchBar

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Categories",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp)
                )

                Spacer(modifier = Modifier.height(10.dp))

                //Row
                Row (modifier = Modifier.padding(20.dp)){

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Greenyellow1),
                        shape = RoundedCornerShape(10.dp),
                    )
                    {
                        Text(text = "Shoes")
                    }


                    Spacer(modifier = Modifier.width(20.dp))

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Greenyellow1),
                        shape = RoundedCornerShape(10.dp),
                    )
                    {
                        Text(text = "Watches")
                    }


                    Spacer(modifier = Modifier.width(20.dp))

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(containerColor = Greenyellow1),
                        shape = RoundedCornerShape(10.dp),
                    )
                    {
                        Text(text = "Shirts")
                    }
                }

                //End Of Row

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Trending",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp)
                )


                Spacer(modifier = Modifier.height(10.dp))

                //Row
                Row (
                    modifier = Modifier.
                    padding(start = 20.dp)
                        .horizontalScroll(rememberScrollState())  //scroll
                ){
                    //Card

                    Card(onClick = {},
                        modifier = Modifier.width(200.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(6.dp),
                        colors = CardDefaults.cardColors(newBlue)
                        ) {
                        //Details of the card
                        Column {
                            Image(
                                painter = painterResource(R.drawable.logo),
                                contentDescription = "sneakers",
                                modifier = Modifier.fillMaxWidth().height(150.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Sneakers",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Ksh.3,400",
                                fontSize = 15.sp,
                            )
                        }

                      //  End of details of the card

                    }
                    Spacer(modifier = Modifier.width(20.dp))

                    //End Of Card

                    Card(onClick = {},
                        modifier = Modifier.width(200.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(6.dp),
                        colors = CardDefaults.cardColors(newBlue)
                    ) {
                        //Details of the card
                        Column {
                            Image(
                                painter = painterResource(R.drawable.computer),
                                contentDescription = "sneakers",
                                modifier = Modifier.fillMaxWidth().height(150.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Sneakers",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Ksh.3,400",
                                fontSize = 15.sp,
                            )
                        }

                        //  End of details of the card



                    }

                    //End Of Card
                    Spacer(modifier = Modifier.width(20.dp))

                    Card(onClick = {},
                        modifier = Modifier.width(200.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(6.dp),
                        colors = CardDefaults.cardColors(newBlue)
                    ) {
                        //Details of the card
                        Column {
                            Image(
                                painter = painterResource(R.drawable.l1),
                                contentDescription = "sneakers",
                                modifier = Modifier.fillMaxWidth().height(150.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Sneakers",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Bold,
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Ksh.3,400",
                                fontSize = 15.sp,
                            )
                        }

                        //  End of details of the card

                    }

                    //End Of Card
                }

                //End of Row
            }
        }
    )

    //End of scaffold


}

@Preview
@Composable

fun DetailsScreenPreview (){
    DetailsScreen(rememberNavController())
}