package core.entity

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

enum class ReplyNavigationType {
    BOTTOM_NAVIGATION,
    NAVIGATION_RAIL,
}

var REPLY_NAVIGATION_TYPE = mutableStateOf(ReplyNavigationType.BOTTOM_NAVIGATION)