package core.presenter.pages.portfolio

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import core.entity.PORTFOLIO_ITEMS
import core.entity.REPLY_NAVIGATION_TYPE
import core.entity.ReplyNavigationType
import core.presenter.component.PortfolioItemComponent

@Composable
fun PortfolioPage(){

    val cellCount = if(REPLY_NAVIGATION_TYPE.value == ReplyNavigationType.BOTTOM_NAVIGATION) 1 else 2

    LazyVerticalGrid(
        modifier = Modifier
            .padding(16.dp),
        columns = GridCells.Fixed(cellCount),
        horizontalArrangement = Arrangement.spacedBy(22.dp),
        verticalArrangement = Arrangement.spacedBy(22.dp),
    ) {
        items(PORTFOLIO_ITEMS) { item ->
            PortfolioItemComponent(item)
        }
    }
}