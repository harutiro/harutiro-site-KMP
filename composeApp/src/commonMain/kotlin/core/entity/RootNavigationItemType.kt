package core.entity

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ReceiptLong
import androidx.compose.material.icons.filled.Construction
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocalPostOffice
import androidx.compose.material.icons.filled.ReceiptLong
import androidx.compose.material.icons.filled.Timeline
import androidx.compose.ui.graphics.vector.ImageVector

enum class Page(
    val title:String,
    val content: String,
    val icon: ImageVector,
    val path:String
){
    HOME(
        "ホーム",
        "はるちろのWebサイトのトップページです",
        Icons.Filled.Home,
        ""
    ),
    HISTORY(
        "歴史",
        "これまでの歴史を表示します",
        Icons.AutoMirrored.Filled.ReceiptLong,
        "/history"
    ),
    PORTFOLIO(
        "作品一覧",
        "今までに作ってきた作品一覧です",
        Icons.Filled.Construction,
        "/portfolio"
    ),
    POSTS(
        "記事一覧",
        "記事一覧",
        Icons.Filled.LocalPostOffice,
        "/posts"
    )
}