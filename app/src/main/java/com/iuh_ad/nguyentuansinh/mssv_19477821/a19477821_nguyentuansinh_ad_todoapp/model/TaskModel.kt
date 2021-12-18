package com.iuh_ad.nguyentuansinh.mssv_19477821.a19477821_nguyentuansinh_ad_todoapp.model

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class TaskModel(
    val id: String? = null,
    val data: TaskItemModel? = null
)