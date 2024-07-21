package core.presenter.pages.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.mikepenz.markdown.coil3.Coil3ImageTransformerImpl
import com.mikepenz.markdown.compose.extendedspans.ExtendedSpans
import com.mikepenz.markdown.compose.extendedspans.RoundedCornerSpanPainter
import com.mikepenz.markdown.compose.extendedspans.SquigglyUnderlineSpanPainter
import com.mikepenz.markdown.compose.extendedspans.rememberSquigglyUnderlineAnimator
import com.mikepenz.markdown.m3.Markdown
import com.mikepenz.markdown.model.markdownExtendedSpans
import harutirositekmp.composeapp.generated.resources.Res
import harutirositekmp.composeapp.generated.resources.compose_multiplatform
import harutirositekmp.composeapp.generated.resources.my_icon
import org.jetbrains.compose.resources.painterResource

@Composable
fun HomeMarkdown(){

    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .padding(16.dp)
    ){
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Center,
        ){
            Image(
                painter = painterResource(Res.drawable.my_icon),
                contentDescription = "私のアイコン",
                modifier = Modifier
                    .size(256.dp)
                    .clip(CircleShape)
            )
        }

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
        )

    }
}

private const val MARKDOWN = """
# 愛知県出身の駆け出しエンジニアです
たくさんの人に役に立つツールを開発しています。

主に、Kotlinを用いてAndroidのモバイル開発を行なっていますが、Web開発やiOS開発にも注目しており、日々さまざまなプラットフォームで開発をしています。
趣味で、遠くに旅行をして、様々な地域の美味しい食べ物を食べることが好きです。
今度は香川に行ってうどんを食べたいです。

# 自己PR
私の長所は、様々な作品を日々生み出し、リリースしていることです。世の中の課題に対処し、利用者を喜ばせることができる創造力と実行力を養いました。これにより、将来的にもアプリケーションを中心としたサービスを展開したいと考えています。

私はこれまで、具体的なプロジェクトで課題解決に貢献してきました。例えば、電車で居眠りをする友人のために、自動的に起こしてくれるアプリを制作しました。また、父が在庫管理で悩んでいる時に、簡単なボタン操作で管理できるアプリを開発しました。

これまでの経験から、私は身近な課題を見つけ、アプリケーションを通じて解決することに注力してきました。そのプロセスでは、チームワークや技術的な挑戦を通じて成長しました。このような経験が、私の柔軟性や問題解決能力を向上させました。

私は日々の制作活動を通じて培った創造力と実行力が、将来的にも新たなイノベーションを生み出し、社会に貢献できるサービスを提供していきたいと考えています。


## 自信があるもの
- Android
- iOS
- Flutter
- Firebase

## 趣味やサークルで学んだもの
- Next
- React
- Ruby on Rails
- Go (バックエンド)
- Python (データ処理・グラフ表示等)
- Docker
- インフラ (ネットワークからサービス構築)

# この先やっていきたいこと
世の中のたくさんの人に使ってもらえる、人の役に立つアプリケーションを作成したいと考えています。

ユーザーの視点を重視したプロダクト開発に携わりたいと思っています。ユーザーのニーズを無視したプロダクトは、目的や価値が不明確で、使われないサービスになってしまうと考えています。そのため、開発チームや営業チームとのコミュニケーションを大切にし、スムーズに開発を進めたいと思っています。そして、2〜3年後には、周りの意見を聞き入れることができるPMになりたいという目標があります。

"""
