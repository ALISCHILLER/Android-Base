package com.msa.thread_section1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.AnyThread
import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import com.msa.thread_section1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var biding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        biding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(biding.root)

        //backgrund Thread
        Thread(Runnable {



            var i=0
            while (i<Int.MAX_VALUE){
                // uiThread
                runOnUiThread(Runnable {
                    biding.txt.text="salam $i"
                })
                Thread.sleep(1000)
                i++

            }


        }).start()

    }


    @WorkerThread
    fun prosserWorkerThread(){

    }
    @AnyThread
    fun prosserAnyThread(){

    }
    @MainThread
    fun prosserMainThread(){

    }
}