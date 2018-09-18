package com.example.vdabcursist.lesson_08_webview

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView_ID.setBackgroundColor(Color.TRANSPARENT)

        webView_ID.settings.javaScriptEnabled = true

        webView_ID.settings.loadsImagesAutomatically = true

        webView_ID.scrollBarStyle= View.SCROLLBARS_INSIDE_OVERLAY

        webView_ID.loadUrl("http://www.androidatc.com")
    }
}
