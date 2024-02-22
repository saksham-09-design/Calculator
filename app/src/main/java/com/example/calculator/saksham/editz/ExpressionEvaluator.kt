package com.example.calculator.saksham.editz

import com.example.calculator.saksham.editz.org.mariuszgromada.math.mxparser.Expression

object ExpressionEvaluator {
    fun evaluateExpression(expression: String): Double {
        try {
            val expr = Expression(expression)
            return expr.calculate()
        } catch (e: Exception) {
            return Double.NaN
        }
    }
}
