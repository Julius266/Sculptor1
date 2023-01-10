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

class screen4 : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private lateinit var drawer2: DrawerLayout
    private lateinit var toggle2: ActionBarDrawerToggle

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)

        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar_main2)
        setSupportActionBar(toolbar)

        drawer2 = findViewById(R.id.drawerlayout2)

        toggle2 = ActionBarDrawerToggle(this,drawer2,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close)
        drawer2.addDrawerListener(toggle2)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        val navigationView: NavigationView = findViewById(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)


        val ton3: Button = findViewById(R.id.buttonscreen4)

        ton3.setOnClickListener {
            val intent: Intent = Intent(this, screen2::class.java)
            startActivity(intent)
        }
    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.nav_item_one2 -> Toast.makeText(this,"Item1", Toast.LENGTH_SHORT).show()
            R.id.nav_item_two2 -> Toast.makeText(this,"Item2", Toast.LENGTH_SHORT).show()

        }
        drawer2.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle2.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle2.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle2.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}