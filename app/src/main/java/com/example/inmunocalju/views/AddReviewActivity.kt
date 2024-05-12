import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Send
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.inmunocalju.views.LoginView

@Composable
fun ReviewForm(onSubmit: (ReviewFormData) -> Unit) {
    var rating by remember { mutableStateOf(0) }
    var title by remember { mutableStateOf("") }
    var description by remember { mutableStateOf("") }
    var userName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(text = "Leave a Review", style = MaterialTheme.typography.titleLarge)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = title,
            onValueChange = { title = it },
            label = { Text("Title") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = description,
            onValueChange = { description = it },
            label = { Text("Description") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = userName,
            onValueChange = { userName = it },
            label = { Text("User Name") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Aquí podrías agregar un componente para seleccionar el puntaje, por ejemplo, un RatingBar

        Button(
            onClick = { onSubmit(ReviewFormData(rating, title, description, userName, email)) },
            modifier = Modifier.fillMaxWidth(),
            enabled = title.isNotEmpty() && description.isNotEmpty() && userName.isNotEmpty() && email.isNotEmpty()
        ) {
            Text(text = "Submit Review")
            Icon(imageVector = Icons.Outlined.Send, contentDescription = "Submit")
        }
    }
}

data class ReviewFormData(
    val rating: Int,
    val title: String,
    val description: String,
    val userName: String,
    val email: String
)

@Preview(showBackground = true)
@Composable
fun PreviewReviewForm() {
    // Simplemente llamamos a la función ReviewForm con un onSubmit vacío para visualizar el formulario
    ReviewForm(onSubmit = {})
}