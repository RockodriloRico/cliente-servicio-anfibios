// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

// Esto es para inyectar a nivel proyecto actuañizar las librerias o cualquier dato
//dentro de graiden es para sellar
buildscript{
    extra.apply {
        set("lifecycle_version", "2.6.1")
        set("retrofit2_version", "2.9.0")
    }
}