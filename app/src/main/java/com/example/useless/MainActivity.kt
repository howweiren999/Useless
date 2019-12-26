package com.example.useless

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var usefulViewModel: UsefulViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        //initialise the recyclerview adapter

        //initialise the viewmodel

        fab.setOnClickListener {
            val intent = Intent(this, AddActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode:Int, resultCode:Int, data: Intent?){
        if(requestCode == REQUEST_CODE){
            if(resultCode == Activity.RESULT_OK){
                //Save a useful record to the database
                Toast.makeText(
                    this,
                    "Record saved",
                    Toast.LENGTH_SHORT).show()
                }
            }
        super.onActivityResult(requestCode, resultCode, data)
        }
    companion object{
        const val REQUEST_CODE = 1
    }
    }


