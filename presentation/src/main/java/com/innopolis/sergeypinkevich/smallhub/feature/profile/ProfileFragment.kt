package com.innopolis.sergeypinkevich.domain.feature.profile

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.innopolis.sergeypinkevich.domain.R
import com.innopolis.sergeypinkevich.smallhub.utils.inflate
import com.innopolis.sergeypinkevich.smallhub.utils.loadImageFromUrl
import kotlinx.android.synthetic.main.fragment_profile.*

/**
 * @author Sergey Pinkevich
 */
class ProfileFragment : Fragment(), ProfileView {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_profile)
    }

    override fun showUserImage(imagePath: String) {
        user_avatar.loadImageFromUrl(imagePath)
    }

    override fun showUserName(name: String) {
        user_name.text = name
    }

    override fun showUserEmail(email: String) {
        user_email.text = email
    }

    override fun showUserLocation(location: String) {
        user_location_text.text = location
    }

    override fun showUserBio(bio: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}