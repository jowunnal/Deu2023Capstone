package com.example.deucapstone2023.data.datasource.remote.dto.response.poi
import com.google.gson.annotations.SerializedName

data class GroupSubLists(
    @SerializedName("groupSub")
    val groupSub: List<GroupSub?>?
)