package com.mdq.social.app.data.response.profileupdate

import com.google.gson.annotations.SerializedName

data class ProfileUpdateResponse(

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)
