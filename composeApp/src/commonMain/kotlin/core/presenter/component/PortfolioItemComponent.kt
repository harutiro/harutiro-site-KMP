package core.presenter.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import core.entity.PortfolioData
import org.jetbrains.compose.resources.painterResource

@Composable
fun PortfolioItemComponent(
    portfolioItem: PortfolioData,
){
    val modifier = Modifier
        .padding(4.dp)

    Card {
        Column(
            modifier = modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Center {
                Image(
                    modifier = modifier
                        .clip(RoundedCornerShape(10.dp))
                        .height(250.dp)
                        .width(250.dp),
                    painter = painterResource(portfolioItem.image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                modifier = modifier,
                text = portfolioItem.title,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )

            Text(
                modifier = modifier,
                text = portfolioItem.date
            )

            Text(
                modifier = modifier,
                text = portfolioItem.description
            )

            LazyRow {
                items(portfolioItem.icons){item ->
                    AsyncImage(
                        modifier = modifier
                            .height(50.dp)
                            .width(50.dp),
                        model = item,
                        contentDescription = null,
                    )
                }
            }

            Text(
                modifier = modifier
                    .padding(top = 8.dp),
                text = "View Project→",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
        }
    }
}