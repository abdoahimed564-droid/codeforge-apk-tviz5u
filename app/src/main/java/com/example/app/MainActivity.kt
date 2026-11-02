package com.example.app

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
  override fun onCreate(b: Bundle?) {
    super.onCreate(b)
    val w = WebView(this)
    w.settings.javaScriptEnabled = true
    w.settings.domStorageEnabled = true
    setContentView(w)
    w.loadUrl("file:///android_asset/www/index.html")
  }
}