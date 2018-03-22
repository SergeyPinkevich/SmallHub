package com.innopolis.sergeypinkevich.smallhub.feature.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.innopolis.sergeypinkevich.domain.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun showProgress() {
        progress_bar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        progress_bar.visibility = View.GONE
    }
}
