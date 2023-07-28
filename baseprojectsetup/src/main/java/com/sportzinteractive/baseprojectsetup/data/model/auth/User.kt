package com.sportzinteractive.baseprojectsetup.data.model.auth

import java.io.Serializable

data class User(
    val name:String?,
    val city: String?,
    val countryId: String?,
    val countryName: String?,
    val dob: String?,
    val favouritePlayerId: String?,
    val favouritePlayerName: Any?,
    val favouriteClub:String?,
    val firstName: String?,
    val gender: String?,
    val lastName: String?,
    val countryCode: String?,
    val mobileNo: String?,
    val pinCode: String?,
    val jerseyName: String?,
    val jerseyNumber: Int?,
    val profileCompletionPercentage: String?,
    val socialUserImage: String?,
    val socialUserName: String?,
    val subscribeForEmail: Boolean?,
    val termsAndCondition:Boolean?,
    val subscribeWhatsApp:Boolean?,
    val email: String?,
    val password: String?,
    val confirmPassword: String?,
    val accountCreateDateTime: String?,
    val accountCreateDate: String?,
    val status:Int?,
    val state: String?
) : Serializable {

    constructor(
        lastName: String?,
        mobileNo: String?,
        countryCode: String?,
        firstName: String?,
        gender: String?,
        dob: String?,
        pinCode: String?,
        favouritePlayerId: String?,
        jerseyName: String?,
        jerseyNumber: Int?,
        countryId: String?,
        city: String?,
        subscribeForEmail: Boolean?,
        favouritePlayerName: Any?,
        favouriteClub: String?,
        socialUserImage: String?
    ) : this(
        name = null,
        city = city,
        countryId = countryId,
        countryName = null,
        dob = dob,
        favouritePlayerId = favouritePlayerId,
        favouritePlayerName = favouritePlayerName,
        favouriteClub = favouriteClub,
        firstName = firstName,
        gender = gender,
        lastName = lastName,
        countryCode = countryCode,
        mobileNo = mobileNo,
        pinCode = pinCode,
        jerseyName = jerseyName,
        jerseyNumber = jerseyNumber,
        profileCompletionPercentage = null,
        socialUserImage = socialUserImage,
        socialUserName = null,
        subscribeForEmail = subscribeForEmail,
        termsAndCondition = null,
        subscribeWhatsApp = null,
        email = null,
        password = null,
        confirmPassword = null,
        accountCreateDateTime = null,
        accountCreateDate = null,
        status = null,
        state = null
    )
}