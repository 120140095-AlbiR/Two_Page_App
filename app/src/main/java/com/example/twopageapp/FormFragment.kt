package com.example.twopageapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.fragment.app.Fragment

class FormFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_form, container, false)

        val editTextName = view.findViewById<EditText>(R.id.editTextName)
        val editTextEmail = view.findViewById<EditText>(R.id.editTextEmail)
        val editTextPhone = view.findViewById<EditText>(R.id.editTextPhone)
        val radioGroupGender = view.findViewById<RadioGroup>(R.id.radioGroupGender)
        val buttonSubmit = view.findViewById<Button>(R.id.buttonSubmit)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val email = editTextEmail.text.toString()
            val phone = editTextPhone.text.toString()
            val genderId = radioGroupGender.checkedRadioButtonId
            val gender = if (genderId == R.id.radioMale) "Male" else "Female"

            val intent = Intent(activity, DisplayActivity::class.java).apply {
                putExtra("EXTRA_NAME", name)
                putExtra("EXTRA_EMAIL", email)
                putExtra("EXTRA_PHONE", phone)
                putExtra("EXTRA_GENDER", gender)
            }
            startActivity(intent)
        }

        return view
    }
}
