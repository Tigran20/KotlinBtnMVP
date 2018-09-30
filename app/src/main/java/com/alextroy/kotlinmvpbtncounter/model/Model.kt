package com.alextroy.kotlinmvpbtncounter.model

import com.alextroy.kotlinmvpbtncounter.presenter.Contract

class Model : Contract.Model {
    private var counter = 0

    override fun decrementCounter() {
        if (counter > 0) {
            counter--
        }
    }

    override fun incrementCounter() {
        counter++
    }

    override fun getCounter() = counter

}