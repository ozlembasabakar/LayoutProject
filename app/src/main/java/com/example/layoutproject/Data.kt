package com.example.layoutproject

data class Start(val startNow: String, val mainText: String, val subText: String)
data class SignIn(val signIn: String, val emailText: String, val passwordText: String, val mainTextSignIn: String, val signUp: String)
data class GoPremium(val goPremiumButton: String, val mainText: String, val monthlyPaymentMain: String, val yearlyPaymentMain: String, val monthlyPaymentYear: String, val monthlyPaymentMonth: String, val yearlyPaymentYear: String, val yearlyPaymentMonth: String, val upRightMonthly: String, val upRightYearly: String)
