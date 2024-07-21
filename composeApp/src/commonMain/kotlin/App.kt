import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.*
import core.entity.Page
import core.entity.ReplyNavigationType
import core.presenter.component.RootNavigationBottomBar
import core.presenter.component.RootNavigationRail
import core.presenter.pages.history.HistoryPage
import core.presenter.pages.home.HomeMarkdown
import core.presenter.pages.portfolio.PortfolioPage
import core.presenter.pages.posts.PostsPage
import org.jetbrains.compose.ui.tooling.preview.Preview

import core.presenter.theme.HarutiroSiteKMPTheme

@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
@Preview
fun App() {
    HarutiroSiteKMPTheme {
        val windowSizeClass = calculateWindowSizeClass()

        val navigationType = when (windowSizeClass.widthSizeClass) {
            WindowWidthSizeClass.Compact -> ReplyNavigationType.BOTTOM_NAVIGATION
            WindowWidthSizeClass.Medium -> ReplyNavigationType.NAVIGATION_RAIL
            WindowWidthSizeClass.Expanded -> ReplyNavigationType.NAVIGATION_RAIL
            else -> ReplyNavigationType.BOTTOM_NAVIGATION
        }

        if (navigationType == ReplyNavigationType.BOTTOM_NAVIGATION) {
            RootNavigationBottomBar{
                when(it){
                    Page.HOME -> HomeMarkdown()
                    Page.HISTORY -> HistoryPage()
                    Page.PORTFOLIO -> PortfolioPage()
                    Page.POSTS -> PostsPage()
                }
            }
        }else if(navigationType == ReplyNavigationType.NAVIGATION_RAIL){
            RootNavigationRail{
                when(it){
                    Page.HOME -> HomeMarkdown()
                    Page.HISTORY -> HistoryPage()
                    Page.PORTFOLIO -> PortfolioPage()
                    Page.POSTS -> PostsPage()
                }
            }
        }
    }
}
