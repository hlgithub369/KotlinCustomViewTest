package com.example.kotlintest

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.widget.FrameLayout
import android.widget.LinearLayout

class TouchViewGroup : FrameLayout {
     var name  = "viewGroup"

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ){

    }


    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        Log.i("hltag", "ViewGroup:${name}   dispatchTouchEvent  :${ev?.action}")
        return super.dispatchTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        Log.i("hltag", "ViewGroup:${name}  onInterceptTouchEvent ")
        return super.onInterceptTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        Log.i("hltag", "ViewGroup:${name}   onTouchEvent " + event?.action)
        return super.onTouchEvent(event)

    }
}