package com.example.pinaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//          return super.onCreateOptionsMenu(menu)
            menuInflater.inflate(R.menu.main_menu_2,menu);


        return true;
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.mGoBack1){

            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)



        }

        return super.onOptionsItemSelected(item)
    }
}