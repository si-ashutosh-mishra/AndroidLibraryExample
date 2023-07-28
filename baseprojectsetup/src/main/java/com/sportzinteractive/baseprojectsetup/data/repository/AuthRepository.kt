package com.sportzinteractive.baseprojectsetup.data.repository

import com.sportzinteractive.baseprojectsetup.data.model.auth.OtpSignInState
import com.sportzinteractive.baseprojectsetup.data.model.auth.SignInOtpRequest
import com.sportzinteractive.baseprojectsetup.data.model.otp.OTPResponse
import com.sportzinteractive.baseprojectsetup.data.model.otp.SendEmailMobileOTPRequest
import com.sportzinteractive.baseprojectsetup.helper.Resource
import kotlinx.coroutines.flow.Flow

interface AuthRepository {


    fun sendOTP(sendEmailMobileOTPRequest: SendEmailMobileOTPRequest,url:String): Flow<Resource<OTPResponse?>>

    fun verifyOTP(sendEmailMobileOTPRequest: SendEmailMobileOTPRequest,url:String): Flow<Resource<OTPResponse?>>

    fun otpLogin(signInOtpRequest: SignInOtpRequest,url: String): Flow<OtpSignInState>


}