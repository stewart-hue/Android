
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.stewarthue.redox.data.UserDatabase
import com.stewarthue.redox.model.ProductViewModel
import com.stewarthue.redox.navigation.ROUT_ABOUT
import com.stewarthue.redox.navigation.ROUT_ADD_PRODUCT
import com.stewarthue.redox.navigation.ROUT_CATEGORY
import com.stewarthue.redox.navigation.ROUT_CONTACT
import com.stewarthue.redox.navigation.ROUT_DASHBOARD
import com.stewarthue.redox.navigation.ROUT_DETAILS
import com.stewarthue.redox.navigation.ROUT_EDIT_PRODUCT
import com.stewarthue.redox.navigation.ROUT_FORM
import com.stewarthue.redox.navigation.ROUT_HOME
import com.stewarthue.redox.navigation.ROUT_INTENTS
import com.stewarthue.redox.navigation.ROUT_ITEM
import com.stewarthue.redox.navigation.ROUT_LOGIN
import com.stewarthue.redox.navigation.ROUT_PRODUCT_LIST
import com.stewarthue.redox.navigation.ROUT_REGISTER
import com.stewarthue.redox.navigation.ROUT_SCAFFOLD
import com.stewarthue.redox.navigation.ROUT_SPLASH
import com.stewarthue.redox.repository.UserRepository
import com.stewarthue.redox.ui.screens.about.AboutScreen
import com.stewarthue.redox.ui.screens.auth.LoginScreen
import com.stewarthue.redox.ui.screens.auth.RegisterScreen
import com.stewarthue.redox.ui.screens.category.CategoryScreen
import com.stewarthue.redox.ui.screens.contact.ContactScreen
import com.stewarthue.redox.ui.screens.dashboard.DashboardScreen
import com.stewarthue.redox.ui.screens.detail.DetailsScreen
import com.stewarthue.redox.ui.screens.form.FormScreen
import com.stewarthue.redox.ui.screens.home.HomeScreen
import com.stewarthue.redox.ui.screens.intents.IntentsScreen
import com.stewarthue.redox.ui.screens.item.ItemScreen
import com.stewarthue.redox.ui.screens.products.AddProductScreen
import com.stewarthue.redox.ui.screens.products.EditProductScreen
import com.stewarthue.redox.ui.screens.products.ProductListScreen
import com.stewarthue.redox.ui.screens.scaffold.ScaffoldScreen
import com.stewarthue.redox.ui.screens.splash.SplashScreen
import com.stewarthue.redox.viewmodel.AuthViewModel
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

//package com.stewarthue.redox.navigation

@RequiresApi(Build.VERSION_CODES.Q)
@Composable

fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_HOME,
    productViewModel: ProductViewModel = viewModel(),

    ) {

    val context = LocalContext.current

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

        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }

        composable(ROUT_FORM) {
            FormScreen(navController)
        }

        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }


        //End of Authentication
        //Products
        composable(ROUT_ADD_PRODUCT) {
            AddProductScreen(navController, productViewModel)
        }

        composable(ROUT_PRODUCT_LIST) {
            ProductListScreen(navController, productViewModel)
        }

        composable(
            route = ROUT_EDIT_PRODUCT,
            arguments = listOf(navArgument("productId") { type = NavType.IntType })
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")
            if (productId != null) {
                EditProductScreen(productId, navController, productViewModel)
            }
        }







    }
}

































