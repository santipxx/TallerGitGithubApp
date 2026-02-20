package co.edu.unab.santiagoruiz.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.unab.santiagoruiz.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TallerGitGithubAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Presetantion()
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Presetantion() {
    TarjetaPresentacion(
        nombre = "Santiago Pérez",
        rol = "Estudiante UNAB",
        edad = 20,
        correo = "santi@example.com",
        ciudad = "Bucaramanga",
        descripcion = "Me gusta el desarrollo móvil porque puedo crear apps útiles y fáciles de usar. Me interesa mejorar la experiencia del usuario y aprender buenas prácticas."
    )
}

@Composable
fun TarjetaPresentacion(
    nombre: String,
    rol: String,
    edad: Int,
    correo: String,
    ciudad: String,
    descripcion: String
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = MaterialTheme.shapes.extraLarge,
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(18.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Imagen circular
                Image(
                    painter = painterResource(id = R.drawable.pic),
                    contentDescription = "Foto de perfil",
                    modifier = Modifier
                        .size(110.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(12.dp))


            }
        }
    }
}

@Composable
private fun InfoFila(
    label: String,
    value: String,
    valueColor: androidx.compose.ui.graphics.Color = MaterialTheme.colorScheme.onSurface
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = label,
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            color = valueColor
        )
    }
}