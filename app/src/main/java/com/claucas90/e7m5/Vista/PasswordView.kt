package com.claucas90.e7m5.Vista

import com.claucas90.e7m5.Modelo.PasswordStrength

interface PasswordView {
    fun updatePasswordStrength(strength: PasswordStrength)
}