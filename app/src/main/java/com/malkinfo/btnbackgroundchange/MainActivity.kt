package com.malkinfo.btnbackgroundchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun textMassage(view:View){
        /**set Toast Massage*/
        Toast.makeText(this,"Button is Click",Toast.LENGTH_SHORT).show()
    }
}