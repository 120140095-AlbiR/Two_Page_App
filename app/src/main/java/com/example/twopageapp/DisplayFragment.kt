package com.example.twopageapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DisplayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_display, container, false)

        val textViewName = view.findViewById<TextView>(R.id.textViewName)
        val textViewEmail = view.findViewById<TextView>(R.id.textViewEmail)
        val textViewPhone = view.findViewById<TextView>(R.id.textViewPhone)
        val textViewGender = view.findViewById<TextView>(R.id.textViewGender)

        val name = activity?.intent?.getStringExtra("EXTRA_NAME")
        val email = activity?.intent?.getStringExtra("EXTRA_EMAIL")
        val phone = activity?.intent?.getStringExtra("EXTRA_PHONE")
        val gender = activity?.intent?.getStringExtra("EXTRA_GENDER")

        textViewName.text = "Name: $name"
        textViewEmail.text = "Email: $email"
        textViewPhone.text = "Phone: $phone"
        textViewGender.text = "Gender: $gender"

        return view
    }
}
