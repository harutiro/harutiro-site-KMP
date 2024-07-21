package core.presenter.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import core.entity.Page

@Composable
fun RootNavigationBottomBar(
    content: @Composable (selectedItem: Page) -> Unit = {}
) {
    var selectedItem by remember { mutableStateOf(Page.HOME) }
    val pages = Page.entries.toTypedArray()

    Scaffold(
        bottomBar = {
            NavigationBar {
                pages.forEachIndexed { index, item ->
                    NavigationBarItem(
                        label = { Text(item.title) },
                        icon = { Icon(pages[index].icon, contentDescription = "") },
                        selected = selectedItem == pages[index],
                        onClick = { selectedItem = pages[index] }
                    )
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            content(selectedItem)
        }
    }
}