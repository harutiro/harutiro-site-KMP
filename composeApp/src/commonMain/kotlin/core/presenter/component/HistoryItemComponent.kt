package core.presenter.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.ImageLoader
import coil3.compose.AsyncImage
import coil3.compose.LocalPlatformContext
import coil3.util.DebugLogger
import core.entity.HistoryItem
import core.entity.REPLY_NAVIGATION_TYPE
import core.entity.ReplyNavigationType
import harutirositekmp.composeapp.generated.resources.Res
import harutirositekmp.composeapp.generated.resources.my_icon
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview





@Composable
fun HistoryItemComponent(
    historyItem: HistoryItem,
){
    val modifier = Modifier
        .padding(4.dp)

    if(REPLY_NAVIGATION_TYPE.value == ReplyNavigationType.BOTTOM_NAVIGATION){
        HistoryPhoneComponent(
            modifier = modifier,
            historyItem = historyItem
        )
    }else{
        HistoryPCComponent(
            modifier = modifier,
            historyItem = historyItem
        )
    }
}

@Composable
fun HistoryPCComponent(
    modifier: Modifier,
    historyItem: HistoryItem,
){

    Row (
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically,
    ){
        Image(
            modifier = modifier
                .height(250.dp)
                .width(250.dp),
            painter = painterResource(historyItem.imageUrl),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        HistoryDetailComponent(
            historyItem = historyItem,
            modifier = modifier
        )
    }
}

@Composable
fun HistoryPhoneComponent(
    modifier: Modifier,
    historyItem: HistoryItem,
){
    Column (
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Image(
            modifier = modifier
                .height(250.dp)
                .width(250.dp),
            painter = painterResource(historyItem.imageUrl),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        HistoryDetailComponent(
            historyItem = historyItem,
            modifier = modifier
        )
    }
}

@Composable
fun HistoryDetailComponent(
    historyItem: HistoryItem,
    modifier: Modifier = Modifier,
){
    Column(
        modifier = modifier,
    ) {
        Text(
            modifier = modifier,
            text = historyItem.title,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            modifier = modifier,
            text = historyItem.description
        )
        Text(
            modifier = modifier,
            text = historyItem.date
        )
        Row{
            historyItem.tags.forEach {
                AssistChip(
                    modifier = modifier,
                    onClick = {  },
                    label = { Text(text = it) },
                )
            }
        }
    }
}

