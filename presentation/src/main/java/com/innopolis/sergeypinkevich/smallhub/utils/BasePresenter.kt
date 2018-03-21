package com.innopolis.sergeypinkevich.domain.utils

import com.arellomobile.mvp.MvpPresenter
import com.arellomobile.mvp.MvpView
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * @author Sergey Pinkevich
 */
open class BasePresenter<T> : MvpPresenter<T>() where T : MvpView {

    private val compositeDisposable by lazy { CompositeDisposable() }

    override fun onDestroy() {
        compositeDisposable.dispose()
        super.onDestroy()
    }

    protected fun safeSubscribe(action: () -> Disposable) {
        compositeDisposable.add(action())
    }
}