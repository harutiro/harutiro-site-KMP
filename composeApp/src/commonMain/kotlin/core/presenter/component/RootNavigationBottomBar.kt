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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import core.entity.Page
import core.presenter.pages.history.HistoryPage
import core.presenter.pages.home.HomeMarkdown
import core.presenter.pages.portfolio.PortfolioPage
import core.presenter.pages.posts.PostsPage

@Composable
fun RootNavigationBottomBar() {
    var selectedItem by remember { mutableStateOf(Page.HOME) }
    val navController = rememberNavController()
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
        NavHost(
            navController = navController,
            startDestination = selectedItem.path,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            composable(Page.HOME.path) {
                HomeMarkdown()
            }
            composable(Page.HISTORY.path) {
                HistoryPage()
            }
            composable(Page.PORTFOLIO.path) {
                PortfolioPage()
            }
            composable(Page.POSTS.path) {
                PostsPage()
            }
        }
    }
}