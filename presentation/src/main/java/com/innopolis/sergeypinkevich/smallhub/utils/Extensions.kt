package com.innopolis.sergeypinkevich.smallhub.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * @author Sergey Pinkevich
 */
fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
}

fun ImageView.loadImageFromUrl(url: String) {
    Picasso.with(context).load(url).into(this)
}
