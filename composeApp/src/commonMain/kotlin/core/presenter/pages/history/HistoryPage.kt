package core.presenter.pages.history

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.HistoricalChange
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import core.entity.HISTORY_ITEMS
import core.entity.HistoryItem
import core.presenter.component.HistoryItemComponent

@Composable
fun HistoryPage(){

    LazyColumn {
        itemsIndexed(HISTORY_ITEMS) { _, historyItem ->
            Text(
                modifier = Modifier
                    .padding(16.dp),
                text = historyItem.title,
                fontSize = 42.sp,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
            for (historicalChange in historyItem.items) {
                HistoryItemComponent(historicalChange)
            }
        }
    }
}