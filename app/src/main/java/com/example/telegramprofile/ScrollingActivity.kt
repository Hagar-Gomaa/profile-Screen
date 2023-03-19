package com.example.telegramprofile

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.telegramprofile.databinding.ActivityScrolling2Binding
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener
import com.google.android.material.snackbar.Snackbar


class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrolling2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrolling2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        //hideOption()
//        setSupportActionBar(binding.toolbar)
//        binding.toolbar.title = title
         val tab1 =  binding.included.tablayout!!.newTab()
        tab1.text="media"
        binding.included.tablayout?.addTab(tab1)
        val tab2 =  binding.included.tablayout!!.newTab()
        tab2.text="links"
        binding.included.tablayout?.addTab(tab2)
//        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
//        binding.appBar.addOnOffsetChangedListener(object : OnOffsetChangedListener {
//            var isShow = false
//            var scrollRange = -1
//            override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
//                if (scrollRange == -1) {
//                    scrollRange = appBarLayout.totalScrollRange
//                }
//                if (scrollRange + verticalOffset == 0) {
//                    isShow = true
//                    showOption()
//                } else if (isShow) {
//                    isShow = false
//                    hideOption()
//                }
//            }
//        })
//    }
//     fun hideOption() {
//         //   binding.toolbarImage.isVisible=false
//        }
//            fun showOption() {
//         //       binding.toolbarImage.isVisible=true
//        }
    }}
