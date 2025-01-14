package com.example.deucapstone2023.ui.navigation

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Stable
import com.example.deucapstone2023.R

sealed class NavigationItem(
    val title:String,
    val route:String,
    @DrawableRes val icon:Int? = null,
    @DrawableRes val iconClicked:Int? = null,
) {
    object SEARCH: NavigationItem(
        title = "검색",
        route = "Search",
        icon = R.drawable.ic_home,
        iconClicked = R.drawable.ic_home_clicked
    )

    object SETTING: NavigationItem(
        title = "설정",
        route = "Setting",
        icon = R.drawable.ic_setting,
        iconClicked = R.drawable.ic_setting_clicked
    )

    object LIST: NavigationItem(
        title = "리스트",
        route = "list",
        icon = R.drawable.ic_list,
        iconClicked = R.drawable.ic_list_clicked
    )
}