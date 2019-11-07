package net.ebisoba.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.util.Log

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var answer = 1.0
    var symbol = "test"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this) // minus
        button2.setOnClickListener(this) // plus
        button3.setOnClickListener(this) // div
        button4.setOnClickListener(this) // multi

    }

    override fun onClick(v: View) {

        if(editText1.getText().toString().equals("") == false && editText2.getText().toString().equals("") == false){

//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            Log.d("test", editText1.text.toString())
            Log.d("test2", editText2.text.toString())
            Log.d("test3", symbol)

            if(v.id == R.id.button1){
                symbol = "minus"
                answer = (editText1.text.toString()).toDouble() - (editText2.text.toString()).toDouble()
            } else if(v.id == R.id.button2){
                symbol = "plus"
                answer = (editText1.text.toString()).toDouble() + (editText2.text.toString()).toDouble()
            } else if(v.id == R.id.button3){
                symbol = "div"
                answer = (editText1.text.toString()).toDouble() / (editText2.text.toString()).toDouble()
            } else if(v.id == R.id.button4){
                symbol = "multi"
                answer = (editText1.text.toString()).toDouble() * (editText2.text.toString()).toDouble()
            }

            Log.d("test4", symbol)
            Log.d("answer", answer.toString())

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("ANSWER", answer)
            intent.putExtra("Symbol", symbol)
            startActivity(intent)
        }
    }
}
