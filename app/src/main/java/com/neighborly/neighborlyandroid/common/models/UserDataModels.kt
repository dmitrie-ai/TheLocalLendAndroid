package com.neighborly.neighborlyandroid.common.models

// Successful Login


data class User(
    val full_name: String,
    val email: String,
    val house: House
)

data class House(
    val postcode: String,
    val house_number: String,
    val street: String,
    val apartment_number: String = ""
)

// Error Response
data class LoginErrorResponse(
    val errors: ErrorDetails
)

data class ErrorDetails(
    val detail: String
)
