package com.lxqljc.launchscreendemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

/**
 * Author: luoxiaoquan
 * Date: 2020-01-04
 * description: 描述 启动页面
 */
class LaunchActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.launch_activity)
        startMainActivity(this)
    }

    /**
     * 跳转到首页
     */
    private fun startMainActivity(context: Context) {
        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(context, MainActivity::class.java)
            context.startActivity(intent)
            finish()
        }, 10 * 1000)
    }

}