package io.github.password_generator

import java.util.*

class PasswordGenerator
{
    fun getPassword() : String{
        val passwordLength = 16
        val alphabetArray = arrayListOf<Char>('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z')
        val symbolArray = arrayListOf<String>("!","@","#","$","%","^","&","*","+","_")
        val numArray = arrayListOf<String>("0","1","2","3","4","5","6","7","8","9")
        val tempPasswordArray = arrayListOf<String>()
        for (i in 0..16){
            if (i >=0 && i <= 3){
                tempPasswordArray.add(alphabetArray[(Math.random()*26).toInt()].toString())
            }
            else if (i >=4 && i <= 7){
                tempPasswordArray.add(alphabetArray[(Math.random()*26).toInt()].toString().toUpperCase(Locale.ROOT))
            }
            else if (i >=8 || i <=11){
                tempPasswordArray.add(symbolArray[(Math.random()*10).toInt()])
            }
            else{
                tempPasswordArray.add(numArray[(Math.random()*10).toInt()])
            }
        }
        var rn = (Math.random()*16).toInt()
        var password = ""
        var count = 0
        for (j in 0..16){
            if (rn > 0){
                password += tempPasswordArray[rn]
                count++
                rn--
            }else{
                password += tempPasswordArray[count]
                count++
            }
        }
        return password
    }
}