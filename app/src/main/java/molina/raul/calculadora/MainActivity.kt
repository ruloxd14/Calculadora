package molina.raul.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.math.RoundingMode

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nu1: EditText = findViewById(R.id.numero1)
        val nu2: EditText = findViewById(R.id.numero2)
        val total: TextView = findViewById(R.id.tv_total)
        val mas: Button = findViewById(R.id.botonmas)
        val menos: Button = findViewById(R.id.botonmenos)
        val div: Button = findViewById(R.id.botondiv)
        val mul: Button = findViewById(R.id.botonmul)

        mas.setOnClickListener {
            val n1 = nu1.text.toString().trim().toBigDecimal()
            val n2 = nu2.text.toString().trim().toBigDecimal()
            total.text = n1.plus(n2).toString()
        }
        menos.setOnClickListener {
            val n1 = nu1.text.toString().trim().toBigDecimal()
            val n2 = nu2.text.toString().trim().toBigDecimal()
            total.text = n1.subtract(n2).toString()
        }
        div.setOnClickListener {
            val n1 = nu1.text.toString().trim().toBigDecimal()
            val n2 = nu2.text.toString().trim().toBigDecimal()
            total.text = n1.divide(n2, 2, RoundingMode.HALF_UP).toString()
        }
        mul.setOnClickListener {
            val n1 = nu1.text.toString().trim().toBigDecimal()
            val n2 = nu2.text.toString().trim().toBigDecimal()
            total.text = n1.multiply(n2).toString()
        }




    }
}