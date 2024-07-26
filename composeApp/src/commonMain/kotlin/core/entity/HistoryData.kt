package core.entity

import harutirositekmp.composeapp.generated.resources.BrassBandPhoto
import harutirositekmp.composeapp.generated.resources.GeneralCompetitionTournament
import harutirositekmp.composeapp.generated.resources.Res
import harutirositekmp.composeapp.generated.resources.Toyokawa_te
import harutirositekmp.composeapp.generated.resources.ait
import harutirositekmp.composeapp.generated.resources.supporterz
import org.jetbrains.compose.resources.DrawableResource

data class HeaderHistories(
    val title: String,
    val items: List<HistoryItem>
)

data class HistoryItem(
    val title: String,
    val description: String,
    val date: String,
    val tags: List<String>,
    val link: String? = null,
    val imageUrl: DrawableResource
)

val HISTORY_ITEMS = listOf(
    HeaderHistories(
        title = "高校生",
        items = listOf(
            HistoryItem(
                title = "吹奏楽部入部",
                description = "プログラミング一色の人生ではなく、音楽の趣味も持っており、学校の定期演奏会などにクラリネットを持ち演奏をしています。",
                date = "2019年 4月",
                tags = listOf(
                    "吹奏楽",
                    "高校生"
                ),
                imageUrl = Res.drawable.BrassBandPhoto
            ),
            HistoryItem(
                title = "総合競技大会プログラム部門 2位",
                description = "電子回路とプログラムを行い、組み立てやプログラミングのスピードと正確さを競う大会にて、プログラムの部門にて2位を取得しました。総合部門では惜しくも9位でした。プログラミングではPICを用いたプログラミングで組み込みシステムについて勉強をおこなった",
                date = "2021年 6月",
                tags = listOf(
                    "Microchip",
                    "C言語",
                    "組み込みシステム",
                    "PIC",
                    "高校生"
                ),
                imageUrl = Res.drawable.GeneralCompetitionTournament
            ),
            HistoryItem(
                title = "豊川工科高校卒業",
                link = "https://toyokawa-te.aichi-c.ed.jp/cms/",
                description = "情報システム科を卒業 電子回路やプログラミング基礎などを勉強し、課題研究では、Pythonを用いシューティングゲームを開発したり、WebにてSIWの開発をおこなった",
                date = "2022年 3月",
                tags = listOf(
                    "高校生",
                    "卒業"
                ),
                imageUrl = Res.drawable.Toyokawa_te
            ),
        )
    ),
    HeaderHistories(
        title = "愛知工業大学入学",
        items = listOf(
            HistoryItem(
                title = "吹奏楽部入部",
                description = "情報科学部 情報科学科 コンピュータシステム専攻に入学し、より詳しい知識を勉強する。",
                date = "2022年 4月",
                tags = listOf(
                    "大学生",
                    "入学"
                ),
                link = "https://ait.ac.jp/",
                imageUrl = Res.drawable.ait
            ),
            HistoryItem(
                title = "サポーターズ技育キャンプ 努力賞受賞",
                description = "ハッカソンの一つである、技育キャンプにて「部室の人数をリアルタイムで表示してくれるサービス〜人の入り見れる蔵〜」にて、努力賞を受賞。 iBeaconやFirebaseなどの様々な技術やプラットフォームを用いてチーム開発を行なった。",
                date = "2022年 6月",
                tags = listOf(
                    "iBeacon",
                    "Firebase",
                    "ハッカソン",
                    "Android",
                    "Raspberry Pi",
                    "大学生"
                ),
                link = "https://docs.google.com/presentation/d/1nJJlpBWSvy_7nI_vquOpmU6FeEDkan8svN1KiU5exuY/present?slide=id.g132748071b6_4_45",
                imageUrl = Res.drawable.supporterz
            ),
        )
    )
)