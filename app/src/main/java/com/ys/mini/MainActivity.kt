package com.ys.mini

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ys.mini.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

	val binding: ActivityMainBinding by lazy {
		ActivityMainBinding.inflate(layoutInflater)
	}

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		binding.bottomNavigationView.background = null
		binding.bottomNavigationView.menu.getItem(2).isEnabled = false
	}
}