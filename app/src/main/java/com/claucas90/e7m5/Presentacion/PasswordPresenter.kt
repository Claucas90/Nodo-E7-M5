package com.claucas90.e7m5.Presentacion

import com.claucas90.e7m5.Modelo.PasswordChecker
import com.claucas90.e7m5.Modelo.PasswordStrength
import com.claucas90.e7m5.Vista.PasswordView

class PasswordPresenter(private val view: PasswordView) {

    private val passwordChecker = PasswordChecker()

    fun onPasswordChanged(password: String) {
        val strength = passwordChecker.checkPasswordStrength(password)
        view.updatePasswordStrength(strength)
    }
}