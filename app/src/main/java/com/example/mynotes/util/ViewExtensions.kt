package com.example.mynotes.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.getText(): String {
    return editText?.text?.toString() ?: ""
}

fun TextInputEditText.getSting() = text.toString().trim()

fun FragmentManager.replaceFragment(
    idContainer: Int, fragment: Fragment, addToBackStack: Boolean = false
) {
    if (addToBackStack) {
        beginTransaction().replace(idContainer, fragment).addToBackStack("").commit()
    } else {
        beginTransaction().replace(idContainer, fragment).commit()
    }
}
