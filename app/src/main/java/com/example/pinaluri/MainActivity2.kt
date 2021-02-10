package com.example.pinaluri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.google.firebase.auth.FirebaseAuth

class MainActivity2 : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        return super.onCreateOptionsMenu(menu)
            menuInflater.inflate(R.menu.main_menu,menu);

            return true;
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {

            if (item.itemId == R.id.mGoBack){

                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)



            }

            return super.onOptionsItemSelected(item)
        }
    }