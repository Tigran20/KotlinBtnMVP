package com.alextroy.kotlinmvpbtncounter.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alextroy.kotlinmvpbtncounter.R
import com.alextroy.kotlinmvpbtncounter.presenter.Contract
import com.alextroy.kotlinmvpbtncounter.presenter.Presenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Contract.View {

    private var presenter: Presenter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = Presenter(this)
    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        inc.setOnClickListener { presenter?.incrementValue() }
        dec.setOnClickListener { presenter?.decrementValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }
}
