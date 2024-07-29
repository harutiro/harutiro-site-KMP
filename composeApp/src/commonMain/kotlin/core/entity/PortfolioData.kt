package core.entity

import harutirositekmp.composeapp.generated.resources.Res
import harutirositekmp.composeapp.generated.resources.my_icon
import org.jetbrains.compose.resources.DrawableResource

data class PortfolioData(
    val title: String,
    val description: String,
    val icons: List<String>,
    val image: DrawableResource,
    val markdown: DrawableResource,
    val date : String,
)

val PORTFOLIO_ITEMS = listOf(
    PortfolioData(
        title = "Harutiro",
        description = "Harutirodayodayodyodayo",
        icons = listOf(
            SkillIcons.JAVA.toString(),
            SkillIcons.KOTLIN.toString(),
            SkillIcons.REACT.toString(),
            SkillIcons.NEXTJS.toString(),
        ),
        image = Res.drawable.my_icon,
        markdown = Res.drawable.my_icon,
        date = "2023/01/01"
    ),
    PortfolioData(
        title = "Harutiro",
        description = "Harutirodayodayodyodayo",
        icons = listOf(
            SkillIcons.JAVA.toString(),
            SkillIcons.KOTLIN.toString(),
            SkillIcons.REACT.toString(),
            SkillIcons.NEXTJS.toString(),
        ),
        image = Res.drawable.my_icon,
        markdown = Res.drawable.my_icon,
        date = "2023/01/01"
    ),
    PortfolioData(
        title = "Harutiro",
        description = "Harutirodayodayodyodayo",
        icons = listOf(
            SkillIcons.JAVA.toString(),
            SkillIcons.KOTLIN.toString(),
            SkillIcons.REACT.toString(),
            SkillIcons.NEXTJS.toString(),
        ),
        image = Res.drawable.my_icon,
        markdown = Res.drawable.my_icon,
        date = "2023/01/01"
    ),
)

