import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mikepenz.markdown.coil3.Coil3ImageTransformerImpl
import com.mikepenz.markdown.compose.extendedspans.ExtendedSpans
import com.mikepenz.markdown.compose.extendedspans.RoundedCornerSpanPainter
import com.mikepenz.markdown.compose.extendedspans.SquigglyUnderlineSpanPainter
import com.mikepenz.markdown.compose.extendedspans.rememberSquigglyUnderlineAnimator
import com.mikepenz.markdown.m3.Markdown
import com.mikepenz.markdown.model.markdownExtendedSpans
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import harutirositekmp.composeapp.generated.resources.Res
import harutirositekmp.composeapp.generated.resources.compose_multiplatform

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("Markdown Sample") }
                )
            }
        ) {
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
    }
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