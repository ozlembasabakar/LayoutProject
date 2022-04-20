package com.example.layoutproject

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.TextPaint
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.StyleSpan
import android.view.View
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.layoutproject.databinding.ActivityStartBinding
import com.example.layoutproject.PremiumActivity
import com.example.layoutproject.SignIn

class StartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_start)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_start)
        setupView()

        val ss = SpannableString("Don't have an account? Sign up")
        val clickableSpan: ClickableSpan = object : ClickableSpan() {

            override fun onClick(textView: View) {

                startActivity(Intent(this@StartActivity, PremiumActivity::class.java))
            }

            override fun updateDrawState(ds: TextPaint) {
                super.updateDrawState(ds)
                ds.setColor(Color.parseColor("#2C2B47"))
                ds.isUnderlineText = false
            }
        }
        ss.setSpan(clickableSpan, 23, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        val boldSpan = StyleSpan(Typeface.BOLD)
        ss.setSpan(boldSpan, 23, 30, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)


        val textView = findViewById<TextView>(R.id.createAccount)
        textView.text = ss
        textView.movementMethod = LinkMovementMethod.getInstance()
        textView.highlightColor = Color.TRANSPARENT
    }

    private fun setupView() {
        val data: SignIn = SignIn("Sign In","Email", "Password", "Let's Start!", "Don't have an account? Sign up")
        binding.setVariable(BR.signIn, data)
        // binding.signIn = data
    }
}
