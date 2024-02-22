package com.example.calculator.saksham.editz

class ColorCode private constructor() {
    companion object {
        private var instance: ColorCode? = null

        fun getInstance(): ColorCode {
            if (instance == null) {
                instance = ColorCode()
            }
            return instance as ColorCode
        }
    }
    var ColorCode: Int = 1
    var colorScience: Int = 1
}