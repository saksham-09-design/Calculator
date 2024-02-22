package com.example.calculator.saksham.editz

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.saksham.editz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        one()
        two()
        three()
        four()
        five()
        six()
        seven()
        eight()
        nine()
        zero()
        plus()
        minus()
        multiply()
        divide()
        clear()
        dot()
        equalsto()
        clearLast()
        sharedPrefOut()
        backGround()
        scientific()
        about()
        help()
    }
    private fun help(){
        val hel = binding.help
        hel.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_VIEW)
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.setData(Uri.parse("https://drive.google.com/file/d/1pbPzcBXn9qtb3ZZ0LHzTl1X94ipNPsGC/view?usp=sharing"))
            startActivity(intent)
        }
    }
    private fun about() {
        val abt = binding.About
        abt.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
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
    private fun scientific(){
        val sc = binding.science
        sc.setOnClickListener {
            val intent = Intent(this,ScienceActivity::class.java)
            startActivity(intent)
            finish()
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
                exp = exp + "."
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
    private fun clear(){
        val cl = binding.clear
        cl.setOnClickListener {
            binding.mainfield.text = "0"
        }
    }
    private fun clearLast(){
        val clear = binding.clearlast
        clear.setOnClickListener {
            val exp = binding.mainfield.text.toString()
            if(exp == "0"){
                binding.mainfield.text = "0"
            } else if(exp.length == 1){
                binding.mainfield.text = "0"
            } else if(exp.contains("In")){
                binding.mainfield.text = "0"
            } else{
                binding.mainfield.text = exp.substring(0,exp.length-1)
            }
        }
    }
    private fun equalsto(){
        val evaluate = binding.equalsto
        evaluate.setOnClickListener {
            val exp = binding.mainfield.text.toString()
            var result: String
            if(exp.contains("/0")){
                result = "Invalid Input"
            } else if(exp.last() == '+' || exp.last() == '/' || exp.last() == '*' || exp.last() == '-') {
                result = "Invalid Input"
            } else if(exp.contains("Inv")){
                result = "0"
            } else if(exp.isNotEmpty()) {
                result = ExpressionEvaluator.evaluateExpression(exp).toString()
            } else{
                result = "0"
            }
            binding.mainfield.text = result
        }
    }
    private fun invalidInput(){
        val exp = binding.mainfield.text.toString()
        if(exp.contains("Invalid")){
            binding.mainfield.text = ""
        }
    }
    private fun sharedPrefInp(Color: Int){
        val sharedPreference = getSharedPreferences("ColorCode", MODE_PRIVATE)
        val editor = sharedPreference.edit()
        editor.putInt("ColorCode",Color)
        editor.apply()
    }
    private fun sharedPrefOut(){
        val sharedPreference = getSharedPreferences("ColorCode", MODE_PRIVATE)
        val Color = sharedPreference.getInt("ColorCode",1)
        val colorC = ColorCode.getInstance()
        colorC.colorScience = Color
    }
    @SuppressLint("ResourceAsColor")
    private fun backGround(){
        val bg = binding.bgchange
        val colorC = ColorCode.getInstance()
        if(colorC.colorScience == 3){
            binding.root.setBackgroundResource(R.color.purpleLight)
            binding.bgchange.setBackgroundResource(R.drawable.purpleb)
            binding.clear.setBackgroundResource(R.drawable.purpleb)
            binding.clearlast.setBackgroundResource(R.drawable.purpleb)
            binding.divide.setBackgroundResource(R.drawable.purpleb)
            binding.minus.setBackgroundResource(R.drawable.purpleb)
            binding.plus.setBackgroundResource(R.drawable.purpleb)
            binding.multiply.setBackgroundResource(R.drawable.purpleb)
            binding.equalsto.setBackgroundResource(R.drawable.purpleb)
            binding.science.setBackgroundResource(R.drawable.purpleb)
            white()
        } else if(colorC.colorScience == 1){
            binding.root.setBackgroundResource(R.color.orangeLight)
            binding.bgchange.setBackgroundResource(R.drawable.orangeb)
            binding.clear.setBackgroundResource(R.drawable.orangeb)
            binding.clearlast.setBackgroundResource(R.drawable.orangeb)
            binding.divide.setBackgroundResource(R.drawable.orangeb)
            binding.minus.setBackgroundResource(R.drawable.orangeb)
            binding.plus.setBackgroundResource(R.drawable.orangeb)
            binding.multiply.setBackgroundResource(R.drawable.orangeb)
            binding.equalsto.setBackgroundResource(R.drawable.orangeb)
            binding.science.setBackgroundResource(R.drawable.orangeb)
            white()
        } else if(colorC.colorScience == 2){
            binding.root.setBackgroundResource(R.color.blueLight)
            binding.bgchange.setBackgroundResource(R.drawable.blueb)
            binding.clear.setBackgroundResource(R.drawable.blueb)
            binding.clearlast.setBackgroundResource(R.drawable.blueb)
            binding.divide.setBackgroundResource(R.drawable.blueb)
            binding.minus.setBackgroundResource(R.drawable.blueb)
            binding.plus.setBackgroundResource(R.drawable.blueb)
            binding.multiply.setBackgroundResource(R.drawable.blueb)
            binding.equalsto.setBackgroundResource(R.drawable.blueb)
            binding.science.setBackgroundResource(R.drawable.blueb)
            white()
        } else if(colorC.colorScience == 4){
            binding.root.setBackgroundResource(R.color.safron)
            binding.bgchange.setBackgroundResource(R.drawable.greenlb)
            binding.clear.setBackgroundResource(R.drawable.greenlb)
            binding.clearlast.setBackgroundResource(R.drawable.greenlb)
            binding.divide.setBackgroundResource(R.drawable.greenlb)
            binding.minus.setBackgroundResource(R.drawable.greenlb)
            binding.plus.setBackgroundResource(R.drawable.greenlb)
            binding.multiply.setBackgroundResource(R.drawable.greenlb)
            binding.equalsto.setBackgroundResource(R.drawable.greenlb)
            binding.science.setBackgroundResource(R.drawable.greenlb)
            white()
        } else if(colorC.colorScience == 5){
            binding.root.setBackgroundResource(R.color.skinLight)
            binding.bgchange.setBackgroundResource(R.drawable.skinb)
            binding.clear.setBackgroundResource(R.drawable.skinb)
            binding.clearlast.setBackgroundResource(R.drawable.skinb)
            binding.divide.setBackgroundResource(R.drawable.skinb)
            binding.minus.setBackgroundResource(R.drawable.skinb)
            binding.plus.setBackgroundResource(R.drawable.skinb)
            binding.multiply.setBackgroundResource(R.drawable.skinb)
            binding.equalsto.setBackgroundResource(R.drawable.skinb)
            binding.science.setBackgroundResource(R.drawable.skinb)
            white()
        } else if(colorC.colorScience == 6){
            binding.root.setBackgroundResource(R.color.yellow)
            binding.bgchange.setBackgroundResource(R.drawable.yellowb)
            binding.clear.setBackgroundResource(R.drawable.yellowb)
            binding.clearlast.setBackgroundResource(R.drawable.yellowb)
            binding.divide.setBackgroundResource(R.drawable.yellowb)
            binding.minus.setBackgroundResource(R.drawable.yellowb)
            binding.plus.setBackgroundResource(R.drawable.yellowb)
            binding.multiply.setBackgroundResource(R.drawable.yellowb)
            binding.equalsto.setBackgroundResource(R.drawable.yellowb)
            binding.science.setBackgroundResource(R.drawable.yellowb)
            white()
        } else if(colorC.colorScience == 7){
            binding.root.setBackgroundResource(R.color.blackbr)
            binding.bgchange.setBackgroundResource(R.drawable.blackbrb)
            binding.clear.setBackgroundResource(R.drawable.blackbrb)
            binding.clearlast.setBackgroundResource(R.drawable.blackbrb)
            binding.divide.setBackgroundResource(R.drawable.blackbrb)
            binding.minus.setBackgroundResource(R.drawable.blackbrb)
            binding.plus.setBackgroundResource(R.drawable.blackbrb)
            binding.multiply.setBackgroundResource(R.drawable.blackbrb)
            binding.equalsto.setBackgroundResource(R.drawable.blackbrb)
            binding.science.setBackgroundResource(R.drawable.blackbrb)
            white()
        } else if(colorC.colorScience == 8){
            binding.root.setBackgroundResource(R.color.neon)
            binding.bgchange.setBackgroundResource(R.drawable.neonb)
            binding.clear.setBackgroundResource(R.drawable.neonb)
            binding.clearlast.setBackgroundResource(R.drawable.neonb)
            binding.divide.setBackgroundResource(R.drawable.neonb)
            binding.minus.setBackgroundResource(R.drawable.neonb)
            binding.plus.setBackgroundResource(R.drawable.neonb)
            binding.multiply.setBackgroundResource(R.drawable.neonb)
            binding.equalsto.setBackgroundResource(R.drawable.neonb)
            binding.science.setBackgroundResource(R.drawable.neonb)
            black()
        } else if(colorC.colorScience == 9){
            binding.root.setBackgroundResource(R.color.greenl)
            binding.bgchange.setBackgroundResource(R.drawable.greenlb)
            binding.clear.setBackgroundResource(R.drawable.greenlb)
            binding.clearlast.setBackgroundResource(R.drawable.greenlb)
            binding.divide.setBackgroundResource(R.drawable.greenlb)
            binding.minus.setBackgroundResource(R.drawable.greenlb)
            binding.plus.setBackgroundResource(R.drawable.greenlb)
            binding.multiply.setBackgroundResource(R.drawable.greenlb)
            binding.equalsto.setBackgroundResource(R.drawable.greenlb)
            binding.science.setBackgroundResource(R.drawable.greenlb)
            white()
        } else if(colorC.colorScience == 10){
            binding.root.setBackgroundResource(R.color.purplen)
            binding.bgchange.setBackgroundResource(R.drawable.purplelnb)
            binding.clear.setBackgroundResource(R.drawable.purplelnb)
            binding.clearlast.setBackgroundResource(R.drawable.purplelnb)
            binding.divide.setBackgroundResource(R.drawable.purplelnb)
            binding.minus.setBackgroundResource(R.drawable.purplelnb)
            binding.plus.setBackgroundResource(R.drawable.purplelnb)
            binding.multiply.setBackgroundResource(R.drawable.purplelnb)
            binding.equalsto.setBackgroundResource(R.drawable.purplelnb)
            binding.science.setBackgroundResource(R.drawable.purplelnb)
            black()
        } else if(colorC.colorScience == 11){
            binding.root.setBackgroundResource(R.color.pink)
            binding.bgchange.setBackgroundResource(R.drawable.pinkb)
            binding.clear.setBackgroundResource(R.drawable.pinkb)
            binding.clearlast.setBackgroundResource(R.drawable.pinkb)
            binding.divide.setBackgroundResource(R.drawable.pinkb)
            binding.minus.setBackgroundResource(R.drawable.pinkb)
            binding.plus.setBackgroundResource(R.drawable.pinkb)
            binding.multiply.setBackgroundResource(R.drawable.pinkb)
            binding.equalsto.setBackgroundResource(R.drawable.pinkb)
            binding.science.setBackgroundResource(R.drawable.pinkb)
            white()
        } else if(colorC.colorScience == 12){
            binding.root.setBackgroundResource(R.color.white)
            binding.bgchange.setBackgroundResource(R.drawable.redb)
            binding.clear.setBackgroundResource(R.drawable.redb)
            binding.clearlast.setBackgroundResource(R.drawable.redb)
            binding.divide.setBackgroundResource(R.drawable.redb)
            binding.minus.setBackgroundResource(R.drawable.redb)
            binding.plus.setBackgroundResource(R.drawable.redb)
            binding.multiply.setBackgroundResource(R.drawable.redb)
            binding.equalsto.setBackgroundResource(R.drawable.redb)
            binding.science.setBackgroundResource(R.drawable.redb)

            white()
        }
        bg.setOnClickListener {
            if(colorC.ColorCode == 3){
                binding.root.setBackgroundResource(R.color.purpleLight)
                binding.bgchange.setBackgroundResource(R.drawable.purpleb)
                binding.clear.setBackgroundResource(R.drawable.purpleb)
                binding.clearlast.setBackgroundResource(R.drawable.purpleb)
                binding.divide.setBackgroundResource(R.drawable.purpleb)
                binding.minus.setBackgroundResource(R.drawable.purpleb)
                binding.plus.setBackgroundResource(R.drawable.purpleb)
                binding.multiply.setBackgroundResource(R.drawable.purpleb)
                binding.equalsto.setBackgroundResource(R.drawable.purpleb)
                binding.science.setBackgroundResource(R.drawable.purpleb)
                white()
                colorC.ColorCode = 4
                colorC.colorScience = 3
                sharedPrefInp(3)
            } else if(colorC.ColorCode == 1){
                binding.root.setBackgroundResource(R.color.orangeLight)
                binding.bgchange.setBackgroundResource(R.drawable.orangeb)
                binding.clear.setBackgroundResource(R.drawable.orangeb)
                binding.clearlast.setBackgroundResource(R.drawable.orangeb)
                binding.divide.setBackgroundResource(R.drawable.orangeb)
                binding.minus.setBackgroundResource(R.drawable.orangeb)
                binding.plus.setBackgroundResource(R.drawable.orangeb)
                binding.multiply.setBackgroundResource(R.drawable.orangeb)
                binding.equalsto.setBackgroundResource(R.drawable.orangeb)
                binding.science.setBackgroundResource(R.drawable.orangeb)
                white()
                colorC.ColorCode = 2
                colorC.colorScience = 1
                sharedPrefInp(1)
            } else if(colorC.ColorCode == 2){
                binding.root.setBackgroundResource(R.color.blueLight)
                binding.bgchange.setBackgroundResource(R.drawable.blueb)
                binding.clear.setBackgroundResource(R.drawable.blueb)
                binding.clearlast.setBackgroundResource(R.drawable.blueb)
                binding.divide.setBackgroundResource(R.drawable.blueb)
                binding.minus.setBackgroundResource(R.drawable.blueb)
                binding.plus.setBackgroundResource(R.drawable.blueb)
                binding.multiply.setBackgroundResource(R.drawable.blueb)
                binding.equalsto.setBackgroundResource(R.drawable.blueb)
                binding.science.setBackgroundResource(R.drawable.blueb)
                white()
                colorC.ColorCode = 3
                colorC.colorScience = 2
                sharedPrefInp(2)
            } else if(colorC.ColorCode == 4){
                binding.root.setBackgroundResource(R.color.safron)
                binding.bgchange.setBackgroundResource(R.drawable.greenlb)
                binding.clear.setBackgroundResource(R.drawable.greenlb)
                binding.clearlast.setBackgroundResource(R.drawable.greenlb)
                binding.divide.setBackgroundResource(R.drawable.greenlb)
                binding.minus.setBackgroundResource(R.drawable.greenlb)
                binding.plus.setBackgroundResource(R.drawable.greenlb)
                binding.multiply.setBackgroundResource(R.drawable.greenlb)
                binding.equalsto.setBackgroundResource(R.drawable.greenlb)
                binding.science.setBackgroundResource(R.drawable.greenlb)
                white()
                colorC.ColorCode = 5
                colorC.colorScience = 4
                sharedPrefInp(4)
            } else if(colorC.ColorCode == 5){
                binding.root.setBackgroundResource(R.color.skinLight)
                binding.bgchange.setBackgroundResource(R.drawable.skinb)
                binding.clear.setBackgroundResource(R.drawable.skinb)
                binding.clearlast.setBackgroundResource(R.drawable.skinb)
                binding.divide.setBackgroundResource(R.drawable.skinb)
                binding.minus.setBackgroundResource(R.drawable.skinb)
                binding.plus.setBackgroundResource(R.drawable.skinb)
                binding.multiply.setBackgroundResource(R.drawable.skinb)
                binding.equalsto.setBackgroundResource(R.drawable.skinb)
                binding.science.setBackgroundResource(R.drawable.skinb)
                white()
                colorC.ColorCode = 6
                colorC.colorScience = 5
                sharedPrefInp(5)
            } else if(colorC.ColorCode == 6){
                binding.root.setBackgroundResource(R.color.yellow)
                binding.bgchange.setBackgroundResource(R.drawable.yellowb)
                binding.clear.setBackgroundResource(R.drawable.yellowb)
                binding.clearlast.setBackgroundResource(R.drawable.yellowb)
                binding.divide.setBackgroundResource(R.drawable.yellowb)
                binding.minus.setBackgroundResource(R.drawable.yellowb)
                binding.plus.setBackgroundResource(R.drawable.yellowb)
                binding.multiply.setBackgroundResource(R.drawable.yellowb)
                binding.equalsto.setBackgroundResource(R.drawable.yellowb)
                binding.science.setBackgroundResource(R.drawable.yellowb)
                white()
                colorC.ColorCode = 7
                colorC.colorScience = 6
                sharedPrefInp(6)
            } else if(colorC.ColorCode == 7){
                binding.root.setBackgroundResource(R.color.blackbr)
                binding.bgchange.setBackgroundResource(R.drawable.blackbrb)
                binding.clear.setBackgroundResource(R.drawable.blackbrb)
                binding.clearlast.setBackgroundResource(R.drawable.blackbrb)
                binding.divide.setBackgroundResource(R.drawable.blackbrb)
                binding.minus.setBackgroundResource(R.drawable.blackbrb)
                binding.plus.setBackgroundResource(R.drawable.blackbrb)
                binding.multiply.setBackgroundResource(R.drawable.blackbrb)
                binding.equalsto.setBackgroundResource(R.drawable.blackbrb)
                binding.science.setBackgroundResource(R.drawable.blackbrb)
                white()
                colorC.ColorCode = 8
                colorC.colorScience = 7
                sharedPrefInp(7)
            } else if(colorC.ColorCode == 8){
                binding.root.setBackgroundResource(R.color.neon)
                binding.bgchange.setBackgroundResource(R.drawable.neonb)
                binding.clear.setBackgroundResource(R.drawable.neonb)
                binding.clearlast.setBackgroundResource(R.drawable.neonb)
                binding.divide.setBackgroundResource(R.drawable.neonb)
                binding.minus.setBackgroundResource(R.drawable.neonb)
                binding.plus.setBackgroundResource(R.drawable.neonb)
                binding.multiply.setBackgroundResource(R.drawable.neonb)
                binding.equalsto.setBackgroundResource(R.drawable.neonb)
                binding.science.setBackgroundResource(R.drawable.neonb)
                black()
                colorC.ColorCode = 9
                colorC.colorScience = 8
                sharedPrefInp(8)
            } else if(colorC.ColorCode == 9){
                binding.root.setBackgroundResource(R.color.greenl)
                binding.bgchange.setBackgroundResource(R.drawable.greenlb)
                binding.clear.setBackgroundResource(R.drawable.greenlb)
                binding.clearlast.setBackgroundResource(R.drawable.greenlb)
                binding.divide.setBackgroundResource(R.drawable.greenlb)
                binding.minus.setBackgroundResource(R.drawable.greenlb)
                binding.plus.setBackgroundResource(R.drawable.greenlb)
                binding.multiply.setBackgroundResource(R.drawable.greenlb)
                binding.equalsto.setBackgroundResource(R.drawable.greenlb)
                binding.science.setBackgroundResource(R.drawable.greenlb)
                white()
                colorC.ColorCode = 10
                colorC.colorScience = 9
                sharedPrefInp(9)
            } else if(colorC.ColorCode == 10){
                binding.root.setBackgroundResource(R.color.purplen)
                binding.bgchange.setBackgroundResource(R.drawable.purplelnb)
                binding.clear.setBackgroundResource(R.drawable.purplelnb)
                binding.clearlast.setBackgroundResource(R.drawable.purplelnb)
                binding.divide.setBackgroundResource(R.drawable.purplelnb)
                binding.minus.setBackgroundResource(R.drawable.purplelnb)
                binding.plus.setBackgroundResource(R.drawable.purplelnb)
                binding.multiply.setBackgroundResource(R.drawable.purplelnb)
                binding.equalsto.setBackgroundResource(R.drawable.purplelnb)
                binding.science.setBackgroundResource(R.drawable.purplelnb)
                black()
                colorC.ColorCode = 11
                colorC.colorScience = 10
                sharedPrefInp(10)
            } else if(colorC.ColorCode == 11){
                binding.root.setBackgroundResource(R.color.pink)
                binding.bgchange.setBackgroundResource(R.drawable.pinkb)
                binding.clear.setBackgroundResource(R.drawable.pinkb)
                binding.clearlast.setBackgroundResource(R.drawable.pinkb)
                binding.divide.setBackgroundResource(R.drawable.pinkb)
                binding.minus.setBackgroundResource(R.drawable.pinkb)
                binding.plus.setBackgroundResource(R.drawable.pinkb)
                binding.multiply.setBackgroundResource(R.drawable.pinkb)
                binding.equalsto.setBackgroundResource(R.drawable.pinkb)
                binding.science.setBackgroundResource(R.drawable.pinkb)
                white()
                colorC.ColorCode = 12
                colorC.colorScience = 11
                sharedPrefInp(11)
            } else if(colorC.ColorCode == 12){
                binding.root.setBackgroundResource(R.color.yellowLight)
                binding.bgchange.setBackgroundResource(R.drawable.redb)
                binding.clear.setBackgroundResource(R.drawable.redb)
                binding.clearlast.setBackgroundResource(R.drawable.redb)
                binding.divide.setBackgroundResource(R.drawable.redb)
                binding.minus.setBackgroundResource(R.drawable.redb)
                binding.plus.setBackgroundResource(R.drawable.redb)
                binding.multiply.setBackgroundResource(R.drawable.redb)
                binding.equalsto.setBackgroundResource(R.drawable.redb)
                binding.science.setBackgroundResource(R.drawable.redb)
                white()
                colorC.ColorCode = 1
                colorC.colorScience = 12
                sharedPrefInp(12)
            }
        }
    }
    @SuppressLint("ResourceAsColor")
    private fun black(){
        binding.bgchange.setTextColor(Color.parseColor("#000000"))
        binding.clear.setTextColor(Color.parseColor("#000000"))
        binding.clearlast.setTextColor(Color.parseColor("#000000"))
        binding.divide.setTextColor(Color.parseColor("#000000"))
        binding.minus.setTextColor(Color.parseColor("#000000"))
        binding.plus.setTextColor(Color.parseColor("#000000"))
        binding.multiply.setTextColor(Color.parseColor("#000000"))
        binding.equalsto.setTextColor(Color.parseColor("#000000"))
        binding.science.setTextColor(Color.parseColor("#000000"))
    }
    @SuppressLint("ResourceAsColor")
    private fun white(){
        binding.bgchange.setTextColor(Color.parseColor("#FFFFFF"))
        binding.clear.setTextColor(Color.parseColor("#FFFFFF"))
        binding.clearlast.setTextColor(Color.parseColor("#FFFFFF"))
        binding.divide.setTextColor(Color.parseColor("#FFFFFF"))
        binding.minus.setTextColor(Color.parseColor("#FFFFFF"))
        binding.plus.setTextColor(Color.parseColor("#FFFFFF"))
        binding.multiply.setTextColor(Color.parseColor("#FFFFFF"))
        binding.equalsto.setTextColor(Color.parseColor("#FFFFFF"))
        binding.science.setTextColor(Color.parseColor("#FFFFFF"))
    }
}
