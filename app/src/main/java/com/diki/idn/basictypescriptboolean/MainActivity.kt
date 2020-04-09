package com.diki.idn.basictypescriptboolean

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val firstNumber: Int = 2
    private val secondNumber: Int = 9
    private val thirdNumber: Int = 4

    private var t: Boolean? = null
    private var u: Boolean? = null
    private var v: Boolean? = null
    private var w: Boolean? = null
    private var x: Boolean? = null
    private var y: Boolean? = null
    private var z: Boolean? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        t = firstNumber < secondNumber && secondNumber > thirdNumber
        u = firstNumber < secondNumber || secondNumber < thirdNumber
        v = firstNumber < thirdNumber && firstNumber < secondNumber
        w = secondNumber > firstNumber && thirdNumber < secondNumber
        x = firstNumber < thirdNumber && secondNumber < thirdNumber
        y = firstNumber < thirdNumber || firstNumber > thirdNumber
        z = firstNumber > secondNumber && secondNumber < thirdNumber

        hasil.text = t.toString()
        hasil2.text = u.toString()
        hasil3.text = v.toString()
        hasil4.text = w.toString()
        hasil5.text = x.toString()
        hasil6.text = y.toString()
        hasil7.text = z.toString()
    }
}
