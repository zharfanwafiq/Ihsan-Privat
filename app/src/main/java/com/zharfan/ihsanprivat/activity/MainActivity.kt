package com.zharfan.ihsanprivat.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zharfan.ihsanprivat.R
import com.zharfan.ihsanprivat.databinding.ActivityMainBinding
import com.zharfan.ihsanprivat.fragment.HomeFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showHomeFragment()
    }

    private fun showHomeFragment() {
        val mFragmentManager = supportFragmentManager
        val mHomeFragment = HomeFragment()
        val fragment = mFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if (fragment !is HomeFragment){
            mFragmentManager.beginTransaction()
                .add(R.id.frameContainer,mHomeFragment,HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}