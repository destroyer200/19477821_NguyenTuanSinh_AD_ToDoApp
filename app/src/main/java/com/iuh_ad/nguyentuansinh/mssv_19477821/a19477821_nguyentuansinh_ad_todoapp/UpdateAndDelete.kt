package com.iuh_ad.nguyentuansinh.mssv_19477821.a19477821_nguyentuansinh_ad_todoapp

interface UpdateAndDelete{
    fun modifyItem(itemUID : String , isDone : Boolean)
    fun onItemDelete(itemUID : String)
}