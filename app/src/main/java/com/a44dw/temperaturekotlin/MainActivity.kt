package com.a44dw.temperaturekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.a44dw.temperaturekotlin.entity.Point
import com.a44dw.temperaturekotlin.helper.PointGeneratorHelper
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var mainLinesHolder: LinearLayout
    lateinit var metrics: DisplayMetrics
    lateinit var greeter: ConstraintLayout
    lateinit var generatorHelper: PointGeneratorHelper
    val points: List<Point> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUi()
        metrics = getScreenMetrics()
        generatorHelper = PointGeneratorHelper()

        //TODO replace preference manager with https://developer.android.com/guide/topics/ui/settings.html
    }

    private fun getScreenMetrics(): DisplayMetrics {
        val metrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(metrics)
        return metrics
    }

    private fun initUi() {
        mainLinesHolder = findViewById(R.id.mainTempLinesHolder)
        greeter = findViewById(R.id.mainGreetHolder)
        findViewById<FloatingActionButton>(R.id.createPoint).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
