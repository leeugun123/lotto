package org.techtown.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import kotlinx.android.synthetic.main.activity_splash.*
import com.airbnb.lottie.LottieAnimationView as LottieAnimationView

class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler(Looper.getMainLooper())
        val runnable = Runnable {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        handler.postDelayed(runnable,2000)

        animationview.setOnClickListener(){
            handler.removeCallbacks(runnable)//또 다시 mainActivity가 뜨는 것을 방지해줌
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }



    }

    
}