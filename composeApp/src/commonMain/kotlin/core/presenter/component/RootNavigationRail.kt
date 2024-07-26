package core.presenter.component

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import core.entity.Page

@Composable
fun RootNavigationRail(
    content: @Composable (selectedItem: Page) -> Unit = {}
) {
    var selectedItem by remember { mutableStateOf(Page.HISTORY) }
    val pages = Page.entries.toTypedArray()
    Row {
        NavigationRail {
            pages.forEachIndexed { index, item ->
                NavigationRailItem(
                    label = { Text(item.title) },
                    icon = { Icon(pages[index].icon, contentDescription = "") },
                    selected = selectedItem == pages[index],
                    onClick = { selectedItem = pages[index] }
                )
            }
        }

        content(selectedItem)
    }
}