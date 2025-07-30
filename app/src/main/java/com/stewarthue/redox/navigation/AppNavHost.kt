
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.stewarthue.redox.navigation.ROUT_ABOUT
import com.stewarthue.redox.navigation.ROUT_CATEGORY
import com.stewarthue.redox.navigation.ROUT_CONTACT
import com.stewarthue.redox.navigation.ROUT_DETAILS
import com.stewarthue.redox.navigation.ROUT_HOME
import com.stewarthue.redox.navigation.ROUT_INTENTS
import com.stewarthue.redox.navigation.ROUT_ITEM
import com.stewarthue.redox.navigation.ROUT_SCAFFOLD
import com.stewarthue.redox.navigation.ROUT_SPLASH
import com.stewarthue.redox.ui.screens.about.AboutScreen
import com.stewarthue.redox.ui.screens.category.CategoryScreen
import com.stewarthue.redox.ui.screens.contact.ContactScreen
import com.stewarthue.redox.ui.screens.detail.DetailsScreen
import com.stewarthue.redox.ui.screens.home.HomeScreen
import com.stewarthue.redox.ui.screens.intents.IntentsScreen
import com.stewarthue.redox.ui.screens.item.ItemScreen
import com.stewarthue.redox.ui.screens.scaffold.ScaffoldScreen
import com.stewarthue.redox.ui.screens.splash.SplashScreen

//package com.stewarthue.redox.navigation

@Composable

fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUT_CONTACT) {
            ContactScreen(navController)
        }

        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }

        composable(ROUT_CATEGORY) {
            CategoryScreen(navController)
        }

        composable(ROUT_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUT_SCAFFOLD) {
            ScaffoldScreen(navController)
        }

        composable(ROUT_DETAILS) {
            DetailsScreen(navController)
        }

        composable(ROUT_INTENTS) {
            IntentsScreen(navController)
        }

    }
}