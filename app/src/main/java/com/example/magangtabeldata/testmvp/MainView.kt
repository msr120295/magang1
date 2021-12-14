package com.example.magangtabeldata.testmvp

interface MainView {
    // menampilkan pesan toast
    fun showMessage(message:String)

    // menampilkan data yang telah diproses pada presenter
    fun showData(data:String)

    // clear edittext
    fun clearField()
}