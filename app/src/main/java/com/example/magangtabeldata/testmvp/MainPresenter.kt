package com.example.magangtabeldata.testmvp

interface MainPresenter {
    // menambah data
    fun addData(firstName:String, lastName:String)

    // memproses data
    fun loadData()
}