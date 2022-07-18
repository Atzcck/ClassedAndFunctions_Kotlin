package com.alptazecicek.classedandfunctions_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
        //mySum(10, 20)
        // (Java) Void = Unit (Kotlin)

        //Return
        val result = myMultiply(10,20)
        //textView.text = "Result: ${result}"


        //Classes
        val homer = Simpson("Homer Simpson", 50, "Nuclear")
        homer.hairColor = "Yellow"


        //object & instance
        //homer.age = 50
        //homer.job = "Nuclear"
        //homer.name = "Homer Simpson"




        //Nullability
        //nullable (?) & non-null
        var myString: String? = null
        println(myString)       //output null
        var myAge: Int? = null

        //println(myAge!! * 10)
        //? variable ın değeri var mı yok mu belli olmayan durumlarda kullanılır.
        //!! işareti initialize edilmemiş değerin orda olduğuna kanaat getirip çalıştırılmasını sağlar
        //Eğer initialize edilmemiş variable mevcutsa ve operatör işlemlerine tabi tutulursa, app çöker. (Kotlin Null Pointer Exeption)


        //1) Null Safety
        if (myAge != null) {
            println(myAge*10)
        } else {
            print("myAge is null")
        }

        //2) Safe Call
        println(myAge?.compareTo(2))

        //3) Elvis
        val myResult = myAge?.compareTo(2) ?: -100
        println(myResult)


    }

    fun test(){
        println("test")
    }
    //input return

    fun mySum(a: Int, b: Int)   {
       // textView.text = "${a+b}"

    }

    fun myMultiply(x: Int, y: Int):Int{
        return x*y
    }

    fun makeSimpson(view: View){
        val name =  nameText.text.toString()
        var age = ageText.text.toString().toIntOrNull()
            if (age == null){
                age = 0
            }
        val job = jobText.text.toString()

        val simpson = Simpson(name,age,job)

        resultText.text = "Name: ${simpson.name}, Age: ${simpson.age}, Job: ${simpson.job}"


    }

    fun scopeExample(view: View) {
        //Scope
        println(name)

    }




}