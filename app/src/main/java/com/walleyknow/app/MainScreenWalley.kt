package com.walleyknow.app

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.walleyknow.app.databinding.ActivityWalleyMainscreenBinding
import com.walleyknow.app.walleyutils.WalleyUtils
import kotlin.random.Random

class MainScreenWalley : AppCompatActivity() {
    private lateinit var binding : ActivityWalleyMainscreenBinding
    private var ldsdssrfe = false
    private var nchdsdfe: CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWalleyMainscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.pwewqeddqw.setOnClickListener {
            iwehsdsdfdf()
        }
    }


    private fun iwehsdsdfdf() = with(binding){
        var counter = 0
        nchdsdfe?.cancel()
        nchdsdfe = object : CountDownTimer(3000,100){
            override fun onTick(millisUntilFinished: Long) {
                counter++
                ldsdssrfe = true
                pwewqeddqw.alpha = 0.7f
                odadssd.visibility = View.GONE
                osjdqwdw.visibility = View.GONE
                if(counter>5) counter = 0
                bgdsfewf.setImageResource(WalleyUtils.nxjsdadw[counter])
            }

            override fun onFinish() {
                ksaddwqwqd()
                ldsdssrfe = false
                pwewqeddqw.alpha = 1.0f
                odadssd.visibility = View.VISIBLE
                osjdqwdw.visibility = View.VISIBLE

            }

        }.start()

    }

    private fun ksaddwqwqd() =with(binding) {
        val image = WalleyUtils.nxjsdadw[Random.nextInt(6)]
        val tipText = WalleyUtils.mnxkxsaaw[Random.nextInt(8)]
        bgdsfewf.setImageResource(image)
        osjdqwdw.text = tipText
    }
}