package com.alextroy.kotlinmvpbtncounter.presenter

import com.alextroy.kotlinmvpbtncounter.model.Model


class Presenter(viewC: Contract.View) : Contract.Presenter {

    private var view: Contract.View = viewC
    private var model: Contract.Model = Model()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun decrementValue() {
        model.decrementCounter()
        view.updateViewData()
    }

    override fun getCounter(): String {
        return model.getCounter().toString()
    }
}