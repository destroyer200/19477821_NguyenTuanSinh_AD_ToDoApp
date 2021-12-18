package com.iuh_ad.nguyentuansinh.mssv_19477821.a19477821_nguyentuansinh_ad_todoapp

object Utils {

    fun getStatus(status: Boolean) : String {
        return when (status) {
            true -> "Completed"
            else -> "Not Completed"
        }
    }

}