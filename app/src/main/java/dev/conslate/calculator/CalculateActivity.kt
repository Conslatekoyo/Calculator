package dev.conslate.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculateActivity : AppCompatActivity() {
    lateinit var btnAdd:Button
    lateinit var btnSubst:Button
    lateinit var btnMult:Button
    lateinit var btnModul:Button
    lateinit var tvTotality:TextView
    lateinit var etFirstNumber:EditText
    lateinit var etSecondNo:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        btnAdd=findViewById(R.id.btnAdding)
        btnSubst=findViewById(R.id.btnSubst)
        btnModul=findViewById(R.id.btnModul)
        btnMult=findViewById(R.id.btnMult)
        tvTotality=findViewById(R.id.tvTotality)
        etFirstNumber=findViewById(R.id.etFirstNumber)
        etSecondNo=findViewById(R.id.etSecondNo)
//
            val First=etFirstNumber.text.toString()
            val Second=etSecondNo.text.toString()
            if (First.isBlank()){
                etFirstNumber.setError("Input Number")
            }
            if (Second.isBlank()){
                etSecondNo.setError("Input Number")
            }

        btnAdd.setOnClickListener {
            tvTotality.text=""
            val number1=etFirstNumber.text.toString().toDouble()
            val number2=etSecondNo.text.toString().toDouble()
            addition(number1,number2)


        }
        btnSubst.setOnClickListener {
            tvTotality.text=""
            val number1=etFirstNumber.text.toString().toDouble()
            val number2=etSecondNo.text.toString().toDouble()
            substraction(number1,number2)
        }
        btnMult.setOnClickListener {
            tvTotality.text=""
            val number1=etFirstNumber.text.toString().toDouble()
            val number2=etSecondNo.text.toString().toDouble()
            multiplication(number1,number2)
        }
        btnModul.setOnClickListener {
            tvTotality.text=""
            val number1=etFirstNumber.text.toString().toDouble()
            val number2=etSecondNo.text.toString().toDouble()
            modulus(number1,number2)
        }
    }

    fun substraction(number1:Double,number2:Double){
        val subtract=number1-number2
        tvTotality.text=subtract.toString()

    }
    fun multiplication(number1:Double,number2:Double){
        val multiply=number1*number2
        tvTotality.text=multiply.toString()

    }
    fun modulus(number1:Double,number2:Double){
        val remainder=number1%number2
        tvTotality.text=remainder.toString()

    }
    fun addition(number1:Double,number2:Double){
        val add=number1+number2
        tvTotality.text=add.toString()

    }
}