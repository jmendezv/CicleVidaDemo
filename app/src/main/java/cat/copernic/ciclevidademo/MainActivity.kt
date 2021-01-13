package cat.copernic.ciclevidademo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cat.copernic.ciclevidademo.databinding.ActivityMainBinding
import cat.copernic.ciclevidademo.databinding.FragmentBlankBinding

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "MainActivity onCreate()")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "MainActivity onRestart()")
    }
}