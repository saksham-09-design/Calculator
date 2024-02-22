package com.example.calculator.saksham.editz

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.saksham.editz.databinding.ScienceActivityBinding

class ScienceActivity: AppCompatActivity() {
    private val binding: ScienceActivityBinding by lazy {
        ScienceActivityBinding.inflate(layoutInflater)
    }
    private  var raDG: Boolean = false
    private var ansP: String = "*1"
    override fun onCreate(savedIntenceState: Bundle?){
        super.onCreate(savedIntenceState)
        setContentView(binding.root)
        normalCalculator()
        backGround()
        obracket()
        one()
        two()
        three()
        four()
        five()
        six()
        sin()
        seven()
        cbracket()
        clear()
        plus()
        minus()
        eight()
        divide()
        dot()
        minus()
        multiply()
        equalsto()
        nine()
        zero()
        cos()
        tan()
        square()
        squareRoot()
        pi()
        log()
        ln()
        power()
        radianToDegree()
        exp()
        cosec()
        sec()
        cot()
        exp()
        answer()
    }
    private fun normalCalculator() {
        val nc = binding.normal
        nc.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun one(){
        val oneb = binding.one
        oneb.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            binding.mainfield.text = if(exp == "0") "1" else exp + "1"
        }
    }
    private fun two(){
        val oneb = binding.two
        oneb.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            binding.mainfield.text = if(exp == "0") "2" else exp + "2"
        }
    }
    private fun three(){
        val oneb = binding.three
        oneb.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            binding.mainfield.text = if(exp == "0") "3" else exp + "3"
        }
    }
    private fun four(){
        val oneb = binding.four
        oneb.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            binding.mainfield.text = if(exp == "0") "4" else exp + "4"
        }
    }
    private fun five(){
        val oneb = binding.five
        oneb.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            binding.mainfield.text = if(exp == "0") "5" else exp + "5"
        }
    }
    private fun six(){
        val oneb = binding.six
        oneb.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            binding.mainfield.text = if(exp == "0") "6" else exp + "6"
        }
    }
    private fun seven(){
        val oneb = binding.seven
        oneb.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            binding.mainfield.text = if(exp == "0") "7" else exp + "7"
        }
    }
    private fun eight(){
        val oneb = binding.eight
        oneb.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            binding.mainfield.text = if(exp == "0") "8" else exp + "8"
        }
    }
    private fun nine(){
        val oneb = binding.nine
        oneb.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            binding.mainfield.text = if(exp == "0") "9" else exp + "9"
        }
    }
    private fun zero(){
        val oneb = binding.zero
        oneb.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            binding.mainfield.text = if(exp == "0") "0" else exp + "0"
        }
    }
    private fun dot(){
        val oneb = binding.dot
        oneb.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp.last() == '+' || exp.last() == '*' || exp.last() == '/' || exp.last() == '-'){
                exp = exp
            } else{
                exp += "."
            }
            binding.mainfield.text = exp
        }
    }
    private fun plus(){
        val sign = binding.plus
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp.last() == '+' || exp.last() == '-' || exp.last() == '*' || exp.last() == '/'){
                exp = exp.substring(0,exp.length-1) + '+'
            } else if(exp.last() == '.'){
                exp = exp.substring(0,exp.length-1) + '+'
            } else{
                exp += "+"
            }
            binding.mainfield.text = exp
        }
    }
    private fun minus(){
        val sign = binding.minus
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp.last() == '+' || exp.last() == '-' || exp.last() == '*' || exp.last() == '/'){
                exp = exp.substring(0,exp.length-1) + '-'
            } else if(exp.last() == '.'){
                exp = exp.substring(0,exp.length-1) + '-'
            } else{
                exp += "-"
            }
            binding.mainfield.text = exp
        }
    }
    private fun divide(){
        val sign = binding.divide
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp.last() == '+' || exp.last() == '-' || exp.last() == '*' || exp.last() == '/'){
                exp = exp.substring(0,exp.length-1) + '/'
            } else if(exp.last() == '.'){
                exp = exp.substring(0,exp.length-1) + '/'
            } else{
                exp += "/"
            }
            binding.mainfield.text = exp
        }
    }
    private fun multiply(){
        val sign = binding.multiply
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp.last() == '+' || exp.last() == '-' || exp.last() == '*' || exp.last() == '/'){
                exp = exp.substring(0,exp.length-1) + '*'
            } else if(exp.last() == '.'){
                exp = exp.substring(0,exp.length-1) + '*'
            } else{
                exp += "*"
            }
            binding.mainfield.text = exp
        }
    }
    private fun cbracket(){
        val sign = binding.cbracket
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp.last() == '+' || exp.last() == '-' || exp.last() == '*' || exp.last() == '/'){
                exp = exp.substring(0,exp.length-1) + ')'
            } else if(exp.last() == '.'){
                exp = exp.substring(0,exp.length-1) + ')'
            } else if(exp == "0"){
                exp = ")"
            } else{
                exp += ")"
            }
            binding.mainfield.text = exp
        }
    }
    private fun obracket(){
        val sign = binding.obracket
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp.last() == '+' || exp.last() == '-' || exp.last() == '*' || exp.last() == '/'){
                exp = exp.substring(0,exp.length-1) + '('
            } else if(exp.last() == '.'){
                exp = exp.substring(0,exp.length-1) + '('
            } else if(exp == "0"){
                exp = "("
            }else{
                exp += "("
            }
            binding.mainfield.text = exp
        }
    }
    private fun sin() {
        val sign = binding.sin
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if (exp == "0")
                exp = "sin("
            else
                exp += "sin("
            binding.mainfield.text = exp
        }
        sign.setOnLongClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if (exp == "0")
                exp = "asin("
            else
                exp += "asin("
            binding.mainfield.text = exp
            true
        }
    }
    private fun cos(){
        val sign = binding.cos
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "cos("
            else
                exp += "cos("
            binding.mainfield.text = exp
        }
        sign.setOnLongClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if (exp == "0")
                exp = "acos("
            else
                exp += "acos("
            binding.mainfield.text = exp
            true
        }
    }
    private fun tan(){
        val sign = binding.tan
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "tan("
            else
                exp += "tan("
            binding.mainfield.text = exp
        }
        sign.setOnLongClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if (exp == "0")
                exp = "atan("
            else
                exp += "atan("
            binding.mainfield.text = exp
            true
        }
    }
    private fun answer(){
        val ans = binding.answer
        ans.setOnClickListener {
            var exp1 = binding.mainfield.text.toString()
            if(exp1 == "0")
                exp1 = "Ans"
            else
                exp1 += "Ans"
            binding.mainfield.text = exp1
        }
    }
    private fun cosec(){
        val sign = binding.cosec
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "cosec("
            else
                exp += "cosec("
            binding.mainfield.text = exp
        }
    }
    private fun sec(){
        val sign = binding.sec
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "sec("
            else
                exp += "sec("
            binding.mainfield.text = exp
        }
    }
    private fun cot(){
        val sign = binding.cot
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "cot("
            else
                exp += "cot("
            binding.mainfield.text = exp
        }
        sign.setOnLongClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if (exp == "0")
                exp = "actan("
            else
                exp += "actan("
            binding.mainfield.text = exp
            true
        }
    }
    private fun log(){
        val sign = binding.log
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "lg("
            else
                exp += "lg("
            binding.mainfield.text = exp
        }
    }
    private fun ln(){
        val sign = binding.ln
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "ln("
            else
                exp += "ln("
            binding.mainfield.text = exp
        }
    }
    private fun squareRoot(){
        val sign = binding.squareroot
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "√"
            else
                exp += "√"
            binding.mainfield.text = exp
        }
        sign.setOnLongClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "∛"
            else
                exp += "∛"
            binding.mainfield.text = exp
            true
        }
    }
    private fun square(){
        val sign = binding.square
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "0"
            else
                exp += "^2"
            binding.mainfield.text = exp
        }
    }
    private fun power(){
        val sign = binding.power
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "^"
            else
                exp += "^"
            binding.mainfield.text = exp
        }
    }
    private fun pi(){
        val sign = binding.pi
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "π"
            else
                exp += "π"
            binding.mainfield.text = exp
        }
    }
    private fun exp(){
        val sign = binding.exp
        sign.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            if(exp == "0")
                exp = "e"
            else
                exp += "e"
            binding.mainfield.text = exp
        }
    }
    private fun radianToDegree(){
        val ind = binding.rad
        ind.setOnClickListener {
            raDG = !raDG
            binding.rad.text = if(raDG) "Rad" else "Deg"
        }
    }
    private fun clear(){
        val cl = binding.clear
        cl.setOnClickListener {
            invalidInput()
            var exp = binding.mainfield.text.toString()
            exp = if (exp == "0")
                "0" else if (exp.length == 1)
                    "0" else if (exp == "")
                        "0" else
                            exp.substring(0,exp.length-1)
            binding.mainfield.text = exp
        }
        cl.setOnLongClickListener {
            binding.mainfield.text = "0"
            true
        }
    }
    private fun equalsto(){
        val evaluate = binding.equalsto
        evaluate.setOnClickListener {
            var exp = binding.mainfield.text.toString()
            var result: String
            if(exp.contains("/0")){
                result = "NaN"
            } else if(exp.last() == '+' || exp.last() == '/' || exp.last() == '*' || exp.last() == '-') {
                result = "NaN"
            } else if(exp.contains("NaN")){
                result = "0"
            } else if(exp.isNotEmpty()) {
                result = if(raDG) {
                    exp = exp.replace("sin(","sin((${Math.PI}/180)*")
                    exp = exp.replace("asin(","asin((${Math.PI}/180)*")
                    exp = exp.replace("cos(","cos((${Math.PI}/180)*")
                    exp = exp.replace("acos(","acos((${Math.PI}/180)*")
                    exp = exp.replace("tan(","tan((${Math.PI}/180)*")
                    exp = exp.replace("atan(","atan((${Math.PI}/180)*")
                    exp = exp.replace("sec(","sec((${Math.PI}/180)*")
                    exp = exp.replace("cosec(","cosec((${Math.PI}/180)*")
                    exp = exp.replace("cot(","cot((${Math.PI}/180)*")
                    exp = exp.replace("acot(","acot((${Math.PI}/180)*")
                    exp = if(ansP == "*1")
                        exp.replace("Ans","")
                    else
                        exp.replace("Ans",ansP)
                    ExpressionEvaluator.evaluateExpression(exp).toString()
                } else{
                    exp = if(ansP == "*1")
                        exp.replace("Ans","")
                    else
                        exp.replace("Ans",ansP)
                    ExpressionEvaluator.evaluateExpression(exp).toString()
                }
            } else{
                result = "0"
            }
            if(result!="NaN")
                ansP = result
            binding.mainfield.text = result
        }
    }
    private fun invalidInput(){
        val exp = binding.mainfield.text.toString()
        if(exp.contains("NaN") || exp == "0.0"){
            binding.mainfield.text = ""
        }
    }
    private fun backGround(){
        val color = ColorCode.getInstance()
        if(color.colorScience == 3){
            binding.root.setBackgroundResource(R.color.purpleLight)
            binding.square.setBackgroundResource(R.drawable.purpleb)
            binding.clear.setBackgroundResource(R.drawable.purpleb)
            binding.squareroot.setBackgroundResource(R.drawable.purpleb)
            binding.divide.setBackgroundResource(R.drawable.purpleb)
            binding.minus.setBackgroundResource(R.drawable.purpleb)
            binding.plus.setBackgroundResource(R.drawable.purpleb)
            binding.multiply.setBackgroundResource(R.drawable.purpleb)
            binding.equalsto.setBackgroundResource(R.drawable.purpleb)
            binding.power.setBackgroundResource(R.drawable.purpleb)
            binding.sin.setBackgroundResource(R.drawable.purpleb)
            binding.cos.setBackgroundResource(R.drawable.purpleb)
            binding.tan.setBackgroundResource(R.drawable.purpleb)
            binding.normal.setBackgroundResource(R.drawable.purpleb)
            binding.pi.setBackgroundResource(R.drawable.purpleb)
            binding.rad.setBackgroundResource(R.drawable.purpleb)
            binding.log.setBackgroundResource(R.drawable.purpleb)
            binding.ln.setBackgroundResource(R.drawable.purpleb)
            binding.obracket.setBackgroundResource(R.drawable.purpleb)
            binding.cbracket.setBackgroundResource(R.drawable.purpleb)
            binding.cosec.setBackgroundResource(R.drawable.purpleb)
            binding.sec.setBackgroundResource(R.drawable.purpleb)
            binding.cot.setBackgroundResource(R.drawable.purpleb)
            binding.answer.setBackgroundResource(R.drawable.purpleb)
            binding.exp.setBackgroundResource(R.drawable.purpleb)
            white()
        } else if(color.colorScience == 1){
            binding.root.setBackgroundResource(R.color.orangeLight)
            binding.square.setBackgroundResource(R.drawable.orangeb)
            binding.clear.setBackgroundResource(R.drawable.orangeb)
            binding.squareroot.setBackgroundResource(R.drawable.orangeb)
            binding.divide.setBackgroundResource(R.drawable.orangeb)
            binding.minus.setBackgroundResource(R.drawable.orangeb)
            binding.plus.setBackgroundResource(R.drawable.orangeb)
            binding.multiply.setBackgroundResource(R.drawable.orangeb)
            binding.equalsto.setBackgroundResource(R.drawable.orangeb)
            binding.power.setBackgroundResource(R.drawable.orangeb)
            binding.sin.setBackgroundResource(R.drawable.orangeb)
            binding.cos.setBackgroundResource(R.drawable.orangeb)
            binding.tan.setBackgroundResource(R.drawable.orangeb)
            binding.normal.setBackgroundResource(R.drawable.orangeb)
            binding.pi.setBackgroundResource(R.drawable.orangeb)
            binding.rad.setBackgroundResource(R.drawable.orangeb)
            binding.log.setBackgroundResource(R.drawable.orangeb)
            binding.ln.setBackgroundResource(R.drawable.orangeb)
            binding.obracket.setBackgroundResource(R.drawable.orangeb)
            binding.cbracket.setBackgroundResource(R.drawable.orangeb)
            binding.cosec.setBackgroundResource(R.drawable.orangeb)
            binding.sec.setBackgroundResource(R.drawable.orangeb)
            binding.cot.setBackgroundResource(R.drawable.orangeb)
            binding.answer.setBackgroundResource(R.drawable.orangeb)
            binding.exp.setBackgroundResource(R.drawable.orangeb)
            white()
        } else if(color.colorScience == 2){
            binding.root.setBackgroundResource(R.color.blueLight)
            binding.square.setBackgroundResource(R.drawable.blueb)
            binding.clear.setBackgroundResource(R.drawable.blueb)
            binding.squareroot.setBackgroundResource(R.drawable.blueb)
            binding.divide.setBackgroundResource(R.drawable.blueb)
            binding.minus.setBackgroundResource(R.drawable.blueb)
            binding.plus.setBackgroundResource(R.drawable.blueb)
            binding.multiply.setBackgroundResource(R.drawable.blueb)
            binding.equalsto.setBackgroundResource(R.drawable.blueb)
            binding.power.setBackgroundResource(R.drawable.blueb)
            binding.sin.setBackgroundResource(R.drawable.blueb)
            binding.cos.setBackgroundResource(R.drawable.blueb)
            binding.tan.setBackgroundResource(R.drawable.blueb)
            binding.normal.setBackgroundResource(R.drawable.blueb)
            binding.pi.setBackgroundResource(R.drawable.blueb)
            binding.rad.setBackgroundResource(R.drawable.blueb)
            binding.log.setBackgroundResource(R.drawable.blueb)
            binding.ln.setBackgroundResource(R.drawable.blueb)
            binding.obracket.setBackgroundResource(R.drawable.blueb)
            binding.cbracket.setBackgroundResource(R.drawable.blueb)
            binding.cosec.setBackgroundResource(R.drawable.blueb)
            binding.sec.setBackgroundResource(R.drawable.blueb)
            binding.cot.setBackgroundResource(R.drawable.blueb)
            binding.answer.setBackgroundResource(R.drawable.blueb)
            binding.exp.setBackgroundResource(R.drawable.blueb)
            white()
        } else if(color.colorScience == 4){
            binding.root.setBackgroundResource(R.color.safron)
            binding.square.setBackgroundResource(R.drawable.greenlb)
            binding.clear.setBackgroundResource(R.drawable.greenlb)
            binding.squareroot.setBackgroundResource(R.drawable.greenlb)
            binding.divide.setBackgroundResource(R.drawable.greenlb)
            binding.minus.setBackgroundResource(R.drawable.greenlb)
            binding.plus.setBackgroundResource(R.drawable.greenlb)
            binding.multiply.setBackgroundResource(R.drawable.greenlb)
            binding.equalsto.setBackgroundResource(R.drawable.greenlb)
            binding.power.setBackgroundResource(R.drawable.greenlb)
            binding.sin.setBackgroundResource(R.drawable.greenlb)
            binding.cos.setBackgroundResource(R.drawable.greenlb)
            binding.tan.setBackgroundResource(R.drawable.greenlb)
            binding.normal.setBackgroundResource(R.drawable.greenlb)
            binding.pi.setBackgroundResource(R.drawable.greenlb)
            binding.rad.setBackgroundResource(R.drawable.greenlb)
            binding.log.setBackgroundResource(R.drawable.greenlb)
            binding.ln.setBackgroundResource(R.drawable.greenlb)
            binding.obracket.setBackgroundResource(R.drawable.greenlb)
            binding.cbracket.setBackgroundResource(R.drawable.greenlb)
            binding.cosec.setBackgroundResource(R.drawable.greenlb)
            binding.sec.setBackgroundResource(R.drawable.greenlb)
            binding.cot.setBackgroundResource(R.drawable.greenlb)
            binding.answer.setBackgroundResource(R.drawable.greenlb)
            binding.exp.setBackgroundResource(R.drawable.greenlb)
            white()
        } else if(color.colorScience == 5){
            binding.root.setBackgroundResource(R.color.skinLight)
            binding.square.setBackgroundResource(R.drawable.skinb)
            binding.clear.setBackgroundResource(R.drawable.skinb)
            binding.squareroot.setBackgroundResource(R.drawable.skinb)
            binding.divide.setBackgroundResource(R.drawable.skinb)
            binding.minus.setBackgroundResource(R.drawable.skinb)
            binding.plus.setBackgroundResource(R.drawable.skinb)
            binding.multiply.setBackgroundResource(R.drawable.skinb)
            binding.equalsto.setBackgroundResource(R.drawable.skinb)
            binding.power.setBackgroundResource(R.drawable.skinb)
            binding.sin.setBackgroundResource(R.drawable.skinb)
            binding.cos.setBackgroundResource(R.drawable.skinb)
            binding.tan.setBackgroundResource(R.drawable.skinb)
            binding.normal.setBackgroundResource(R.drawable.skinb)
            binding.pi.setBackgroundResource(R.drawable.skinb)
            binding.rad.setBackgroundResource(R.drawable.skinb)
            binding.log.setBackgroundResource(R.drawable.skinb)
            binding.ln.setBackgroundResource(R.drawable.skinb)
            binding.obracket.setBackgroundResource(R.drawable.skinb)
            binding.cbracket.setBackgroundResource(R.drawable.skinb)
            binding.cosec.setBackgroundResource(R.drawable.skinb)
            binding.sec.setBackgroundResource(R.drawable.skinb)
            binding.cot.setBackgroundResource(R.drawable.skinb)
            binding.answer.setBackgroundResource(R.drawable.skinb)
            binding.exp.setBackgroundResource(R.drawable.skinb)
            white()
        }else if(color.colorScience == 6){
            binding.root.setBackgroundResource(R.color.yellow)
            binding.square.setBackgroundResource(R.drawable.yellowb)
            binding.clear.setBackgroundResource(R.drawable.yellowb)
            binding.squareroot.setBackgroundResource(R.drawable.yellowb)
            binding.divide.setBackgroundResource(R.drawable.yellowb)
            binding.minus.setBackgroundResource(R.drawable.yellowb)
            binding.plus.setBackgroundResource(R.drawable.yellowb)
            binding.multiply.setBackgroundResource(R.drawable.yellowb)
            binding.equalsto.setBackgroundResource(R.drawable.yellowb)
            binding.power.setBackgroundResource(R.drawable.yellowb)
            binding.sin.setBackgroundResource(R.drawable.yellowb)
            binding.cos.setBackgroundResource(R.drawable.yellowb)
            binding.tan.setBackgroundResource(R.drawable.yellowb)
            binding.normal.setBackgroundResource(R.drawable.yellowb)
            binding.pi.setBackgroundResource(R.drawable.yellowb)
            binding.rad.setBackgroundResource(R.drawable.yellowb)
            binding.log.setBackgroundResource(R.drawable.yellowb)
            binding.ln.setBackgroundResource(R.drawable.yellowb)
            binding.obracket.setBackgroundResource(R.drawable.yellowb)
            binding.cbracket.setBackgroundResource(R.drawable.yellowb)
            binding.cosec.setBackgroundResource(R.drawable.yellowb)
            binding.sec.setBackgroundResource(R.drawable.yellowb)
            binding.cot.setBackgroundResource(R.drawable.yellowb)
            binding.answer.setBackgroundResource(R.drawable.yellowb)
            binding.exp.setBackgroundResource(R.drawable.yellowb)
            white()
        }else if(color.colorScience == 7){
            binding.root.setBackgroundResource(R.color.blackbr)
            binding.square.setBackgroundResource(R.drawable.blackbrb)
            binding.clear.setBackgroundResource(R.drawable.blackbrb)
            binding.squareroot.setBackgroundResource(R.drawable.blackbrb)
            binding.divide.setBackgroundResource(R.drawable.blackbrb)
            binding.minus.setBackgroundResource(R.drawable.blackbrb)
            binding.plus.setBackgroundResource(R.drawable.blackbrb)
            binding.multiply.setBackgroundResource(R.drawable.blackbrb)
            binding.equalsto.setBackgroundResource(R.drawable.blackbrb)
            binding.power.setBackgroundResource(R.drawable.blackbrb)
            binding.sin.setBackgroundResource(R.drawable.blackbrb)
            binding.cos.setBackgroundResource(R.drawable.blackbrb)
            binding.tan.setBackgroundResource(R.drawable.blackbrb)
            binding.normal.setBackgroundResource(R.drawable.blackbrb)
            binding.pi.setBackgroundResource(R.drawable.blackbrb)
            binding.rad.setBackgroundResource(R.drawable.blackbrb)
            binding.log.setBackgroundResource(R.drawable.blackbrb)
            binding.ln.setBackgroundResource(R.drawable.blackbrb)
            binding.obracket.setBackgroundResource(R.drawable.blackbrb)
            binding.cbracket.setBackgroundResource(R.drawable.blackbrb)
            binding.cosec.setBackgroundResource(R.drawable.blackbrb)
            binding.sec.setBackgroundResource(R.drawable.blackbrb)
            binding.cot.setBackgroundResource(R.drawable.blackbrb)
            binding.answer.setBackgroundResource(R.drawable.blackbrb)
            binding.exp.setBackgroundResource(R.drawable.blackbrb)
            white()
        }else if(color.colorScience == 8){
            binding.root.setBackgroundResource(R.color.neon)
            binding.square.setBackgroundResource(R.drawable.neonb)
            binding.clear.setBackgroundResource(R.drawable.neonb)
            binding.squareroot.setBackgroundResource(R.drawable.neonb)
            binding.divide.setBackgroundResource(R.drawable.neonb)
            binding.minus.setBackgroundResource(R.drawable.neonb)
            binding.plus.setBackgroundResource(R.drawable.neonb)
            binding.multiply.setBackgroundResource(R.drawable.neonb)
            binding.equalsto.setBackgroundResource(R.drawable.neonb)
            binding.power.setBackgroundResource(R.drawable.neonb)
            binding.sin.setBackgroundResource(R.drawable.neonb)
            binding.cos.setBackgroundResource(R.drawable.neonb)
            binding.tan.setBackgroundResource(R.drawable.neonb)
            binding.normal.setBackgroundResource(R.drawable.neonb)
            binding.pi.setBackgroundResource(R.drawable.neonb)
            binding.rad.setBackgroundResource(R.drawable.neonb)
            binding.log.setBackgroundResource(R.drawable.neonb)
            binding.ln.setBackgroundResource(R.drawable.neonb)
            binding.obracket.setBackgroundResource(R.drawable.neonb)
            binding.cbracket.setBackgroundResource(R.drawable.neonb)
            binding.cosec.setBackgroundResource(R.drawable.neonb)
            binding.sec.setBackgroundResource(R.drawable.neonb)
            binding.cot.setBackgroundResource(R.drawable.neonb)
            binding.answer.setBackgroundResource(R.drawable.neonb)
            binding.exp.setBackgroundResource(R.drawable.neonb)
            black()
        }else if(color.colorScience == 9){
            binding.root.setBackgroundResource(R.color.greenl)
            binding.square.setBackgroundResource(R.drawable.greenlb)
            binding.clear.setBackgroundResource(R.drawable.greenlb)
            binding.squareroot.setBackgroundResource(R.drawable.greenlb)
            binding.divide.setBackgroundResource(R.drawable.greenlb)
            binding.minus.setBackgroundResource(R.drawable.greenlb)
            binding.plus.setBackgroundResource(R.drawable.greenlb)
            binding.multiply.setBackgroundResource(R.drawable.greenlb)
            binding.equalsto.setBackgroundResource(R.drawable.greenlb)
            binding.power.setBackgroundResource(R.drawable.greenlb)
            binding.sin.setBackgroundResource(R.drawable.greenlb)
            binding.cos.setBackgroundResource(R.drawable.greenlb)
            binding.tan.setBackgroundResource(R.drawable.greenlb)
            binding.normal.setBackgroundResource(R.drawable.greenlb)
            binding.pi.setBackgroundResource(R.drawable.greenlb)
            binding.rad.setBackgroundResource(R.drawable.greenlb)
            binding.log.setBackgroundResource(R.drawable.greenlb)
            binding.ln.setBackgroundResource(R.drawable.greenlb)
            binding.obracket.setBackgroundResource(R.drawable.greenlb)
            binding.cbracket.setBackgroundResource(R.drawable.greenlb)
            binding.cosec.setBackgroundResource(R.drawable.greenlb)
            binding.sec.setBackgroundResource(R.drawable.greenlb)
            binding.cot.setBackgroundResource(R.drawable.greenlb)
            binding.answer.setBackgroundResource(R.drawable.greenlb)
            binding.exp.setBackgroundResource(R.drawable.greenlb)
            white()
        }else if(color.colorScience == 10){
            binding.root.setBackgroundResource(R.color.purplen)
            binding.square.setBackgroundResource(R.drawable.purplelnb)
            binding.clear.setBackgroundResource(R.drawable.purplelnb)
            binding.squareroot.setBackgroundResource(R.drawable.purplelnb)
            binding.divide.setBackgroundResource(R.drawable.purplelnb)
            binding.minus.setBackgroundResource(R.drawable.purplelnb)
            binding.plus.setBackgroundResource(R.drawable.purplelnb)
            binding.multiply.setBackgroundResource(R.drawable.purplelnb)
            binding.equalsto.setBackgroundResource(R.drawable.purplelnb)
            binding.power.setBackgroundResource(R.drawable.purplelnb)
            binding.sin.setBackgroundResource(R.drawable.purplelnb)
            binding.cos.setBackgroundResource(R.drawable.purplelnb)
            binding.tan.setBackgroundResource(R.drawable.purplelnb)
            binding.normal.setBackgroundResource(R.drawable.purplelnb)
            binding.pi.setBackgroundResource(R.drawable.purplelnb)
            binding.rad.setBackgroundResource(R.drawable.purplelnb)
            binding.log.setBackgroundResource(R.drawable.purplelnb)
            binding.ln.setBackgroundResource(R.drawable.purplelnb)
            binding.obracket.setBackgroundResource(R.drawable.purplelnb)
            binding.cbracket.setBackgroundResource(R.drawable.purplelnb)
            binding.cosec.setBackgroundResource(R.drawable.purplelnb)
            binding.sec.setBackgroundResource(R.drawable.purplelnb)
            binding.cot.setBackgroundResource(R.drawable.purplelnb)
            binding.answer.setBackgroundResource(R.drawable.purplelnb)
            binding.exp.setBackgroundResource(R.drawable.purplelnb)
            black()
        }else if(color.colorScience == 11){
            binding.root.setBackgroundResource(R.color.pink)
            binding.square.setBackgroundResource(R.drawable.pinkb)
            binding.clear.setBackgroundResource(R.drawable.pinkb)
            binding.squareroot.setBackgroundResource(R.drawable.pinkb)
            binding.divide.setBackgroundResource(R.drawable.pinkb)
            binding.minus.setBackgroundResource(R.drawable.pinkb)
            binding.plus.setBackgroundResource(R.drawable.pinkb)
            binding.multiply.setBackgroundResource(R.drawable.pinkb)
            binding.equalsto.setBackgroundResource(R.drawable.pinkb)
            binding.power.setBackgroundResource(R.drawable.pinkb)
            binding.sin.setBackgroundResource(R.drawable.pinkb)
            binding.cos.setBackgroundResource(R.drawable.pinkb)
            binding.tan.setBackgroundResource(R.drawable.pinkb)
            binding.normal.setBackgroundResource(R.drawable.pinkb)
            binding.pi.setBackgroundResource(R.drawable.pinkb)
            binding.rad.setBackgroundResource(R.drawable.pinkb)
            binding.log.setBackgroundResource(R.drawable.pinkb)
            binding.ln.setBackgroundResource(R.drawable.pinkb)
            binding.obracket.setBackgroundResource(R.drawable.pinkb)
            binding.cbracket.setBackgroundResource(R.drawable.pinkb)
            binding.cosec.setBackgroundResource(R.drawable.pinkb)
            binding.sec.setBackgroundResource(R.drawable.pinkb)
            binding.cot.setBackgroundResource(R.drawable.pinkb)
            binding.answer.setBackgroundResource(R.drawable.pinkb)
            binding.exp.setBackgroundResource(R.drawable.pinkb)
            white()
        }else if(color.colorScience == 12){
            binding.root.setBackgroundResource(R.color.yellowLight)
            binding.square.setBackgroundResource(R.drawable.redb)
            binding.clear.setBackgroundResource(R.drawable.redb)
            binding.squareroot.setBackgroundResource(R.drawable.redb)
            binding.divide.setBackgroundResource(R.drawable.redb)
            binding.minus.setBackgroundResource(R.drawable.redb)
            binding.plus.setBackgroundResource(R.drawable.redb)
            binding.multiply.setBackgroundResource(R.drawable.redb)
            binding.equalsto.setBackgroundResource(R.drawable.redb)
            binding.power.setBackgroundResource(R.drawable.redb)
            binding.sin.setBackgroundResource(R.drawable.redb)
            binding.cos.setBackgroundResource(R.drawable.redb)
            binding.tan.setBackgroundResource(R.drawable.redb)
            binding.normal.setBackgroundResource(R.drawable.redb)
            binding.pi.setBackgroundResource(R.drawable.redb)
            binding.rad.setBackgroundResource(R.drawable.redb)
            binding.log.setBackgroundResource(R.drawable.redb)
            binding.ln.setBackgroundResource(R.drawable.redb)
            binding.obracket.setBackgroundResource(R.drawable.redb)
            binding.cbracket.setBackgroundResource(R.drawable.redb)
            binding.cosec.setBackgroundResource(R.drawable.redb)
            binding.sec.setBackgroundResource(R.drawable.redb)
            binding.cot.setBackgroundResource(R.drawable.redb)
            binding.answer.setBackgroundResource(R.drawable.redb)
            binding.exp.setBackgroundResource(R.drawable.redb)
            white()
        }
    }
    private fun white(){
        binding.square.setTextColor(Color.parseColor("#FFFFFF"))
        binding.clear.setTextColor(Color.parseColor("#FFFFFF"))
        binding.squareroot.setTextColor(Color.parseColor("#FFFFFF"))
        binding.divide.setTextColor(Color.parseColor("#FFFFFF"))
        binding.minus.setTextColor(Color.parseColor("#FFFFFF"))
        binding.plus.setTextColor(Color.parseColor("#FFFFFF"))
        binding.multiply.setTextColor(Color.parseColor("#FFFFFF"))
        binding.equalsto.setTextColor(Color.parseColor("#FFFFFF"))
        binding.power.setTextColor(Color.parseColor("#FFFFFF"))
        binding.sin.setTextColor(Color.parseColor("#FFFFFF"))
        binding.cos.setTextColor(Color.parseColor("#FFFFFF"))
        binding.tan.setTextColor(Color.parseColor("#FFFFFF"))
        binding.normal.setTextColor(Color.parseColor("#FFFFFF"))
        binding.pi.setTextColor(Color.parseColor("#FFFFFF"))
        binding.rad.setTextColor(Color.parseColor("#FFFFFF"))
        binding.log.setTextColor(Color.parseColor("#FFFFFF"))
        binding.ln.setTextColor(Color.parseColor("#FFFFFF"))
        binding.obracket.setTextColor(Color.parseColor("#FFFFFF"))
        binding.cosec.setTextColor(Color.parseColor("#FFFFFF"))
        binding.sec.setTextColor(Color.parseColor("#FFFFFF"))
        binding.cot.setTextColor(Color.parseColor("#FFFFFF"))
        binding.answer.setTextColor(Color.parseColor("#FFFFFF"))
        binding.exp.setTextColor(Color.parseColor("#FFFFFF"))
    }
    private fun black(){
        binding.square.setTextColor(Color.parseColor("#000000"))
        binding.clear.setTextColor(Color.parseColor("#000000"))
        binding.squareroot.setTextColor(Color.parseColor("#000000"))
        binding.divide.setTextColor(Color.parseColor("#000000"))
        binding.minus.setTextColor(Color.parseColor("#000000"))
        binding.plus.setTextColor(Color.parseColor("#000000"))
        binding.multiply.setTextColor(Color.parseColor("#000000"))
        binding.equalsto.setTextColor(Color.parseColor("#000000"))
        binding.power.setTextColor(Color.parseColor("#000000"))
        binding.sin.setTextColor(Color.parseColor("#000000"))
        binding.cos.setTextColor(Color.parseColor("#000000"))
        binding.tan.setTextColor(Color.parseColor("#000000"))
        binding.normal.setTextColor(Color.parseColor("#000000"))
        binding.pi.setTextColor(Color.parseColor("#000000"))
        binding.rad.setTextColor(Color.parseColor("#000000"))
        binding.log.setTextColor(Color.parseColor("#000000"))
        binding.ln.setTextColor(Color.parseColor("#000000"))
        binding.obracket.setTextColor(Color.parseColor("#000000"))
        binding.cbracket.setTextColor(Color.parseColor("#000000"))
        binding.cosec.setTextColor(Color.parseColor("#000000"))
        binding.sec.setTextColor(Color.parseColor("#000000"))
        binding.cot.setTextColor(Color.parseColor("#000000"))
        binding.answer.setTextColor(Color.parseColor("#000000"))
        binding.exp.setTextColor(Color.parseColor("#000000"))
    }
}