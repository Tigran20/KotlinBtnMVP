package com.alextroy.kotlinmvpbtncounter.presenter

interface Contract {
    interface View {
        fun initView()
        fun updateViewData()
    }

    interface Presenter {
        fun incrementValue()
        fun decrementValue()
        fun getCounter(): String
    }

    interface Model {
        fun getCounter(): Int
        fun incrementCounter()
        fun decrementCounter()
    }
}