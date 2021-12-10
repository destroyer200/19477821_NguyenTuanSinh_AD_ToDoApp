package com.iuh_ad.nguyentuansinh.mssv_19477821.a19477821_nguyentuansinh_ad_todoapp

class ToDoModel {
    companion object Factory{
        fun createList(): ToDoModel = ToDoModel()
    }
    var UID : String? = null
    var itemDataText : String? = null
    var done : Boolean? = false
}