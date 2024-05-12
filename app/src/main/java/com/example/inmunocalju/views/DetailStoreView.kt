import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.inmunocalju.R
import com.example.inmunocalju.ui.theme.InmunocaljuTheme

@Preview(showBackground = true)
@Composable
fun PreviewRatingsAndReviewsView() {
    InmunocaljuTheme {
        RatingsAndReviewsView()
    }
}
@Composable
fun RatingsAndReviewsView() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Título "Rating & reviewers (234)"
        Text(
            text = "Rating & reviewers (234)",
            modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth(),
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center
        )

        // Texto "Summary"
        Text(
            text = "Summary",
            modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxWidth(),
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center
        )

        // Barra de puntajes
        RatingBar(score = 4.5f, totalReviews = 273, recommendedPercentage = 88)

        // Botón "Write a review"
        Button(
            onClick = { /* Acción al hacer clic */ },
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.White),
        ) {
            Text(text = "Write a review", color = LocalContentColor.current)
        }

        // Texto "Product reviews are managed by..."
        Text(
            text = "Product reviews are managed by a third party to verify " +
                    "authenticity and compliance with our Ratings & Reviews Guidelines",
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            style = MaterialTheme.typography.bodySmall
        )

        // Línea separadora
        Divider(modifier = Modifier.padding(vertical = 16.dp))

        // Título "Review this product"
        Text(
            text = "Review this product",
            modifier = Modifier
                .fillMaxWidth(),
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center
        )

        // Comentario de ejemplo
        ReviewItem(
            userName = "John Doe",
            country = "US",
            rating = 4,
            comment = "This is a great product! I highly recommend it.",
            helpfulYes = 2,
            helpfulNo = 0,
            date = "May 15, 2024"
        )

        // Botón "Recommended"
        Button(
            onClick = { /* Acción al hacer clic */ },
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Transparent),
        ) {
            Icon(
                imageVector = Icons.Outlined.Check,
                contentDescription = stringResource(id = R.string.recommended),
                modifier = Modifier.padding(end = 8.dp)
            )
            Text(text = stringResource(id = R.string.recommended))
        }
    }
}

@Composable
fun RatingBar(score: Float, totalReviews: Int, recommendedPercentage: Int) {
    // Cálculo de porcentaje
    val percentage = (recommendedPercentage.toFloat() / 100f) * 5

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Puntaje promedio y estrella
        Text(
            text = String.format("%.1f", score),
            modifier = Modifier.weight(1f),
            style = MaterialTheme.typography.titleSmall
        )
        Icon(
            imageVector = Icons.Default.Star,
            contentDescription = null,
            tint = Color.Yellow,
            modifier = Modifier.size(24.dp)
        )

        // Número de reseñas
        Text(
            text = "$totalReviews Reviews",
            modifier = Modifier.padding(start = 16.dp),
            style = MaterialTheme.typography.titleSmall
        )

        // Porcentaje recomendado
        Text(
            text = "$recommendedPercentage%",
            modifier = Modifier.padding(start = 16.dp),
            style = MaterialTheme.typography.titleSmall
        )

        // Texto "Recommended"
        Text(
            text = "Recommended",
            modifier = Modifier.padding(start = 16.dp),
            style = MaterialTheme.typography.titleSmall,
            color = Color.Gray
        )
    }

    // Barra de puntajes
    LinearProgressIndicator(
        progress = percentage,
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth(0.75f)
    )
}

@Composable
fun ReviewItem(
    userName: String,
    country: String,
    rating: Int,
    comment: String,
    helpfulYes: Int,
    helpfulNo: Int,
    date: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        // Nombre de usuario, país y calificación
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = userName)
            Text(
                text = country,
                color = Color.Gray,
                modifier = Modifier.padding(start = 8.dp)
            )
            repeat(rating) {
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = null,
                    tint = Color.Yellow,
                    modifier = Modifier.size(16.dp)
                )
            }
        }

        // Comentario
        Text(
            text = comment,
            modifier = Modifier.padding(top = 4.dp)
        )

        // Texto "Helpful? Yes (2) / NO (0)"
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Helpful? Yes ($helpfulYes) / No ($helpfulNo)",
                color = Color.Gray,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = date,
                color = Color.Gray,

            )
        }
    }

}


