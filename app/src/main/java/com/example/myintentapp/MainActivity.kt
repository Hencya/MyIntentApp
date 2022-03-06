package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveActivityWithData: Button = findViewById(R.id.btn_move_activity_with_data)
        btnMoveActivityWithData.setOnClickListener(this)

        val btnMoveActivityWithObject: Button = findViewById(R.id.btn_move_activity_with_object)
        btnMoveActivityWithObject.setOnClickListener(this)

        val btnDialNumber: Button = findViewById(R.id.btn_dial_number)
        btnDialNumber.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_with_data -> {
                val moveActivityWithData =
                    Intent(this@MainActivity, MoveActivityWithData::class.java)
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_NAME, "Faiz Rofi Hencya")
                moveActivityWithData.putExtra(MoveActivityWithData.EXTRA_AGE, 21)
                startActivity(moveActivityWithData)
            }
            R.id.btn_move_activity_with_object -> {
                val person = Person(
                    name = "Faiz Rofi Hencya",
                    age = 21,
                    email = "faiz.rofi01@gmail.com",
                    city = "Musi Rawas, South Sumatra"
                )

                val moveActivityWithObject =
                    Intent(this@MainActivity, MoveActivityWithObject::class.java)
                moveActivityWithObject.putExtra(MoveActivityWithObject.EXTRA_PERSON, person)
                startActivity(moveActivityWithObject)
            }
            R.id.btn_dial_number -> {
                val phoneNumber = "0899999999"
                val dialPhoneintent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phoneNumber"))
                startActivity(dialPhoneintent)

            }
        }
    }
}