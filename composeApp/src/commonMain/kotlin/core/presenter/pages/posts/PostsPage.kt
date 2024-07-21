package core.presenter.pages.posts

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mikepenz.markdown.coil3.Coil3ImageTransformerImpl
import com.mikepenz.markdown.compose.extendedspans.ExtendedSpans
import com.mikepenz.markdown.compose.extendedspans.RoundedCornerSpanPainter
import com.mikepenz.markdown.compose.extendedspans.SquigglyUnderlineSpanPainter
import com.mikepenz.markdown.compose.extendedspans.rememberSquigglyUnderlineAnimator
import com.mikepenz.markdown.m3.Markdown
import com.mikepenz.markdown.model.markdownExtendedSpans

@Composable
fun PostsPage(){
    val scrollState = rememberScrollState()

    Markdown(
        MARKDOWN,
        imageTransformer = Coil3ImageTransformerImpl,
        extendedSpans = markdownExtendedSpans {
            val animator = rememberSquigglyUnderlineAnimator()
            remember {
                ExtendedSpans(
                    RoundedCornerSpanPainter(),
                    SquigglyUnderlineSpanPainter(animator = animator)
                )
            }
        },
        modifier = Modifier.fillMaxSize().verticalScroll(scrollState).padding(16.dp)
    )
}

private const val MARKDOWN = """
### What's included 🚀

- Super simple setup
- Cross-platform ready
- Lightweight 
   - hogehoge

[google](https://google.com)

<img
  class="fit-picture"
  src="/media/cc0-images/grapefruit-slice-332-332.jpg"
  alt="Grapefruit slice atop a pile of other slices" />
  
https://pbs.twimg.com/media/GMXrzxZb0AA9Jw8?format=jpg&name=large

![](https://pbs.twimg.com/media/GMXrzxZb0AA9Jw8?format=jpg&name=large)

![Image](https://avatars.githubusercontent.com/u/1476232?v=4)

"""