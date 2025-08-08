package com.stewarthue.redox.ui.screens.dashboard

import android.text.Layout
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.stewarthue.redox.R
import com.stewarthue.redox.ui.theme.Orangelime
import com.stewarthue.redox.ui.theme.Pink80
import com.stewarthue.redox.ui.theme.Purple80
import com.stewarthue.redox.ui.theme.newBlue

class DashboardScreen {
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun DashboardScreen (navController: NavController){


    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }

    Scaffold(
        //TopBar

        //BottomBar
        bottomBar = {
            NavigationBar(
                containerColor = Purple80
            ){
                NavigationBarItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = selectedIndex == 0,
                    onClick = { selectedIndex = 1
                        //navController.navigate(ROUT_HOME)
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
                onClick = { /* Add action */ },
                containerColor = Pink80,
                modifier = Modifier.offset(y = 40.dp)
            ) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
          floatingActionButtonPosition = FabPosition.Center,  //Positioning of the floating action button

        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .background(color = Color.White)
            ) {


                //Main Contents of the page
//                Text(text = "Hi Samantha", fontSize = 30.sp, )
//                Spacer(modifier = Modifier.height(8.dp))
//                Text("Here are your projects.", fontSize = 17.sp)

                //Row



                Row (
                    modifier = Modifier.padding(start = 18.dp)
                        .padding(vertical = 45.dp)

                ){

                    Spacer(modifier = Modifier.width(10.dp))


                    Column (){
                        Text(text = "Hi Samantha", fontSize = 30.sp, fontWeight = FontWeight.Bold )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text("Here are your projects.", fontSize = 17.sp , fontWeight = FontWeight.Bold)

                    }



                    Image(
                        painter = painterResource(R.drawable.img),
                        contentDescription = "l1",
                        modifier = Modifier.size(width = 180.dp, height = 150.dp).clip(shape = RoundedCornerShape(10.dp)),
                        contentScale = ContentScale.Crop

                    )

                }





                ///End of Row



                //Row


                Row (
                    modifier = Modifier.padding(start = 20.dp)
                        .horizontalScroll(rememberScrollState())
                ) {

                    //Card
                    Card(onClick = {},
                        modifier = Modifier.width(200.dp).height(270.dp),
                        elevation = CardDefaults.elevatedCardElevation(6.dp),
                        colors = CardDefaults.cardColors(newBlue)
                    ) {
                        //Details of the card
                        Column {
                            Image(
                                painter = painterResource(R.drawable.crypto),
                                contentDescription = "sneakers",
                                modifier = Modifier.fillMaxWidth().height(150.dp).padding(horizontal = 22.dp, vertical = 30.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Cryptocurrency Landing Page",
                                fontSize = 15.sp,
                                color = Color.White,
                                modifier = Modifier.padding(start = 20.dp)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "12 ticks",
                                fontSize = 15.sp,
                                color = Color.White,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }

                        //  End of details of the card



                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    
                    
                    
                    //End of Card





                    //Card
                    Card(onClick = {},
                        modifier = Modifier.width(200.dp).height(270.dp),
                        elevation = CardDefaults.elevatedCardElevation(6.dp),
                        colors = CardDefaults.cardColors(Orangelime)
                    ) {
                        //Details of the card
                        Column {
                            Image(
                                painter = painterResource(R.drawable.statistics),
                                contentDescription = "Statistics Dashboard",
                                modifier = Modifier.fillMaxWidth().height(150.dp) .padding(horizontal = 22.dp, vertical = 30.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Cryptocurrency Landing Page",
                                fontSize = 15.sp,
                                color = Color.White,
                                modifier = Modifier.padding(start = 20.dp)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "12 ticks",
                                fontSize = 15.sp,
                                color = Color.White,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }

                        //  End of details of the card

                    }
                    Spacer(modifier = Modifier.width(20.dp))



                    //End of Card



                    //Card
                    Card(onClick = {},
                        modifier = Modifier.width(200.dp).height(250.dp),
                        elevation = CardDefaults.elevatedCardElevation(6.dp),
                        colors = CardDefaults.cardColors(newBlue)
                    ) {
                        //Details of the card
                        Column {
                            Image(
                                painter = painterResource(R.drawable.img_7),
                                contentDescription = "sneakers",
                                modifier = Modifier.fillMaxWidth().height(150.dp),
                                contentScale = ContentScale.FillBounds
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Crypto landing page",
                                fontSize = 15.sp,
                                color = Color.White,
                                modifier = Modifier.padding(start = 20.dp)
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "14 ticks",
                                fontSize = 15.sp,
                                color = Color.White,
                                modifier = Modifier.padding(start = 20.dp)
                            )
                        }

                        //  End of details of the card

                    }
                    Spacer(modifier = Modifier.width(20.dp))



                    //End of Card
                }




                //End oF ROW







                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = "Personal Tasks",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(start = 20.dp)
                )

                //Card
                Card(onClick = {},
                    modifier = Modifier.width(400.dp).height(70.dp) .padding(start = 14.dp, end = 14.dp),
                    elevation = CardDefaults.elevatedCardElevation(6.dp),
//                    colors = CardDefaults.cardColors(containerColor =)
                ){

                    Row (
                        modifier = Modifier.padding(start = 20.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.video),
                            contentDescription = "sneakers",
                            modifier = Modifier.width(55.dp).height(50.dp).padding(top = 10.dp),
                            contentScale = ContentScale.FillBounds
                        )



                        Column() {
                            Text(
                                text = "NDA Review for website project",
                                fontSize = 15.sp,
                                color = Color.Black,
                                modifier = Modifier.padding(start = 20.dp).padding(top = 10.dp),fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Today - 10pm",
                                fontSize = 15.sp,
                                color = Color.Black,
                                modifier = Modifier.padding(start = 20.dp),
                                fontWeight = FontWeight.Bold
                            )
                        }

                    }
                }

                //End of Card










                Spacer(modifier = Modifier.height(18.dp))

                //Card
                Card(onClick = {},
                    modifier = Modifier.width(400.dp).height(70.dp) .padding(start = 14.dp, end = 14.dp),
                    elevation = CardDefaults.elevatedCardElevation(6.dp),
//                    colors = CardDefaults.cardColors(containerColor =)
                    
                ){

                    Row (
                        modifier = Modifier.padding(start = 20.dp)
                    ) {
                        Image(
                            painter = painterResource(R.drawable.email),
                            contentDescription = "sneakers",
                            modifier = Modifier.width(50.dp).height(50.dp).padding(top = 10.dp),
                            contentScale = ContentScale.FillBounds
                        )



                        Column() {
                            Text(
                                text = "Email Reply for Green Project",
                                fontSize = 15.sp,
                                color = Color.Black,
                                modifier = Modifier.padding(start = 20.dp).padding(top = 10.dp),fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Today - 10pm",
                                fontSize = 15.sp,
                                color = Color.Black,
                                modifier = Modifier.padding(start = 20.dp),
                                fontWeight = FontWeight.Bold
                            )
                        }

                    }

//                    Button(
//                        onClick = {},
//                        colors = ButtonDefaults.buttonColors(containerColor = newBlue),
//                        modifier = Modifier.size(12.5.dp).align(alignment = Alignment.End).paddingFromBaseline(top = 10.dp)
//                    ) { }
                }

                //End of Card







            }




        }






    )

    //End of scaffold



}

@Preview
@Composable

fun DashboardScreenPreview (){
    DashboardScreen(rememberNavController())
}