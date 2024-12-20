import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.*
import core.entity.Page
import core.entity.REPLY_NAVIGATION_TYPE
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

    getPlatform()
    println(getPlatform().name)

    HarutiroSiteKMPTheme {
        SelectionContainer{
            val windowSizeClass = calculateWindowSizeClass()

            REPLY_NAVIGATION_TYPE.value = when (windowSizeClass.widthSizeClass) {
                WindowWidthSizeClass.Compact -> ReplyNavigationType.BOTTOM_NAVIGATION
                WindowWidthSizeClass.Medium -> ReplyNavigationType.BOTTOM_NAVIGATION
                WindowWidthSizeClass.Expanded -> ReplyNavigationType.NAVIGATION_RAIL
                else -> ReplyNavigationType.BOTTOM_NAVIGATION
            }

            if (REPLY_NAVIGATION_TYPE.value == ReplyNavigationType.BOTTOM_NAVIGATION) {
                RootNavigationBottomBar()
            }else if(REPLY_NAVIGATION_TYPE.value == ReplyNavigationType.NAVIGATION_RAIL){
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
}
