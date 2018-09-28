package com.example.vdabcursist.mini_project_android

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_edit_list.*

class EditList : MenuItems() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_list)

        loadWebview()
    }

    private fun loadWebview (){

        create_list_webview_ID.settings.javaScriptEnabled=true
        create_list_webview_ID.settings.loadsImagesAutomatically=true
        create_list_webview_ID.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        create_list_webview_ID.setWebViewClient(WebViewClient())
        create_list_webview_ID.loadUrl("https://www.google.com")

    }
}
