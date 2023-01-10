package com.example.sculptor

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class screen5 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawer3: DrawerLayout
    private lateinit var toggle3: ActionBarDrawerToggle

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen5)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar_main3)
        setSupportActionBar(toolbar)

        drawer3 = findViewById(R.id.drawerlayout3)

        toggle3 = ActionBarDrawerToggle(this,drawer3,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        drawer3.addDrawerListener(toggle3)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)


        val ton4: Button = findViewById(R.id.buttonscreen5)

        ton4.setOnClickListener {
            val intent: Intent = Intent(this, screen2::class.java)
            startActivity(intent)
        }
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.nav_item_one3 -> Toast.makeText(this,"Item1", Toast.LENGTH_SHORT).show()
            R.id.nav_item_two3 -> Toast.makeText(this,"Item2", Toast.LENGTH_SHORT).show()

        }
        drawer3.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle3.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle3.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle3.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}