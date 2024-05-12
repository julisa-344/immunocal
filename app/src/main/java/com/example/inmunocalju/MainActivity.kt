package com.example.inmunocalju

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.ep2.views.NotificacionesView
import com.example.ep2.views.Payment1View
import com.example.ep2.views.Payment2View
import com.example.ep2.views.Payment3View
import com.example.inmunocalju.ui.theme.InmunocaljuTheme
import com.example.inmunocalju.views.Categoria
import com.example.inmunocalju.views.HomeView
import com.example.inmunocalju.views.ListaView
import com.example.inmunocalju.views.LoginView
import com.example.inmunocalju.views.MicuentaView
import com.example.inmunocalju.views.Payment4View
import com.example.inmunocalju.views.Producto
import com.example.inmunocalju.views.ProductosView
import com.example.inmunocalju.views.RegisterView
import com.example.inmunocalju.views.UserProfile
import com.example.inmunocalju.views.detail_perfil_view
import com.example.inmunocalju.views.payment_metodo
import com.example.inmunocalju.views.products_view
import com.example.inmunocalju.views.testimonios
import com.example.suscripciones.views.actual_sub_view
import com.example.suscripciones.views.detail_sub_view
import com.example.suscripciones.views.promos_view
import com.example.suscripciones.views.suscripcion_view

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InmunocaljuTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    val navController = rememberNavController()
                    val navigationActions = remember(navController){
                        MyNavigationActions(navController)
                    }
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val selectedDestination = navBackStackEntry?.destination?.route ?: MyRoute.HOME
                    MyAppContent(
                        navController = navController,
                        selectedDestination = selectedDestination,
                        navigateTopLevelDestination = navigationActions::navigateTo
                    )
                }
            }
        }
    }
}

@Composable
fun BottomNavigation(
    selectedDestination: String,
    navigateTopLevelDestination: ( MyTopLevelDestination ) -> Unit,
) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
        .background(
            colorResource(id = R.color.primary_600),
            RoundedCornerShape(topStart = 20.dp, topEnd = 30.dp)
        )){
        NavigationBar(modifier = Modifier
        ) {
            TOP_LEVEL_DESTINATION.forEach() { destinations ->
                NavigationBarItem(
                    selected = selectedDestination == destinations.route,
                    onClick = { navigateTopLevelDestination(destinations) },
                    icon = {
                        Icon(
                            imageVector = destinations.selectedIcon,
                            contentDescription = stringResource(id = destinations.iconTextId),
                            tint = colorResource(id = R.color.neutral_500)
                        )
                    }
                )
            }
        }
    }
}


@Composable
fun MyAppContent(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    selectedDestination: String,
    navigateTopLevelDestination: (MyTopLevelDestination) -> Unit
) {
    Row(modifier = modifier.fillMaxSize()) {
        Column(modifier = Modifier.fillMaxSize()) {
            NavHost(
                modifier = Modifier.weight(1f),
                navController = navController,
                startDestination = "home"
            ) {
                composable(MyRoute.HOME) {
                    ListaView(navController)
                }
                composable(MyRoute.TESTIMONIO) {
                    testimonios(navController)
                }
                composable(MyRoute.CART) {
                    promos_view(navController)
                }
                composable(MyRoute.PROFILE) {

                }

                composable("detail_sub") { detail_sub_view(navController) }
                composable("promos") { promos_view(navController) }
                composable("detail_perfil") {

                    val userProfile = UserProfile(
                        name = "John Doe",
                        email = "john.doe@gmail.com",
                        subscription = "Premium",
                        gender = "Hombre",
                        birthday = "1985-10-15",
                        phoneNumber = "937 601 484"
                    )
                    detail_perfil_view(userProfile, navController)
                }
                composable("actual_sub") { actual_sub_view(navController) }
                composable("products") {
                    val categorias = listOf(
                        Categoria("Salud", R.drawable.salud),
                        Categoria("Nutricion", R.drawable.nutricion),
                        Categoria("Deporte", R.drawable.deporte),
                        Categoria("Mental", R.drawable.mental),
                        Categoria("Suplemento", R.drawable.suplementos),
                    )
                    val productos = listOf(
                        Producto("Immunocal", R.drawable.immunocal_platinum),
                        Producto("Knutric +", R.drawable.omega1),
                        Producto("Immunocal", R.drawable.inmunox2),
                        Producto("Knutric +", R.drawable.knutric1)
                    )
                    val cantidadEnCarrito = remember { mutableStateOf(0) }

                    products_view(
                        categorias = categorias,
                        productos = productos,
                        cantidadEnCarrito = cantidadEnCarrito.value,
                        onRegresarClicked = { /* TODO */ },
                        onCarritoClicked = { /* TODO */ },
                        onAgregarAlCarrito = { producto ->
                            cantidadEnCarrito.value++
                        }
                    )
                }
                composable("start") {ListaView(navController) }
                composable("payment1") { Payment1View(navController) }
                composable("payment2") { Payment2View(navController) }
                composable("payment3") { Payment3View(navController) }
                composable("payment4") { Payment4View(navController) }
                composable("home"){ HomeView(navController) }
                composable("login"){ LoginView(navController) }
                composable("register"){ RegisterView(navController) }
                composable("miCuenta"){ MicuentaView(navController) }
                composable("notificaciones"){ NotificacionesView(navController) }
                composable("suscripciones") { suscripcion_view(navController) }
                composable("cupones") { promos_view(navController) }
                composable("detailProduct"){ ProductosView(navController)}
                composable("testimonios"){ testimonios(navController) }
                composable("metodosDepago"){ payment_metodo(navController) }

            }
            BottomNavigation(
                selectedDestination = selectedDestination,
                navigateTopLevelDestination = navigateTopLevelDestination,
            )
        }
    }
}
