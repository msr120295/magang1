package com.example.magangtabeldata.testmvp

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.magangtabeldata.R

class MvpActivity : AppCompatActivity(), MainView {
    // var presenter
    lateinit var presenter: MainPresenter
    lateinit var edFirstName: EditText
    lateinit var edLastName: EditText
    lateinit var btnAdd: Button
    lateinit var btnShow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)
        edFirstName = findViewById(R.id.edFirstName)
        edLastName = findViewById(R.id.edLastName)
        btnAdd = findViewById(R.id.btnAdd)
        btnShow = findViewById(R.id.btnShow)

        // init presenter
        presenter = MainPresenterImp(this)

        // event click listener pada btnAdd
        btnAdd.setOnClickListener {
            // memanggil method addData pada presenter
            presenter.addData(edFirstName.text.toString(),edLastName.text.toString())
        }

        // event click listener pada btnShow
        btnShow.setOnClickListener {
            // memanggil method loadData pada presenter
            presenter.loadData()
        }
    }

    // view menampilkan pesan toast
    override fun showMessage(message: String) {
        Toast.makeText(applicationContext,message, Toast.LENGTH_SHORT).show()
    }

    // view menampilkan data
    override fun showData(data: String) {

        // meanmpilkan data pada dialog
        AlertDialog.Builder(this)
            .setTitle("Data")
            .setMessage(data)
            .setPositiveButton("Close", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.dismiss()
            })
            .show()

    }

    // view utk clear edittext
    override fun clearField() {
        edFirstName.setText("")
        edLastName.setText("")
    }
}