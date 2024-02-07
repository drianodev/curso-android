package br.com.drianodev.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import br.com.drianodev.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.buttonCalculate) {
            calculate()
        }
    }

    private fun isValid(): Boolean {
        val distanceString = binding.editDistance.text.toString()
        val priceString = binding.editPrice.text.toString()
        val autonomyString = binding.editAutonomo.text.toString()

        return (distanceString.isNotEmpty() && priceString.isNotEmpty() && autonomyString.isNotEmpty())
    }

    private fun calculate() {
        if (isValid()) {
            val distance = binding.editDistance.text.toString().toFloat()
            val price = binding.editPrice.text.toString().toFloat()
            val autonomy = binding.editAutonomo.text.toString().toFloat()

            if (autonomy != 0f) {
                val totalValue = (price * distance) / autonomy
                val totalValueStr = "R$ ${"%.2f".format(totalValue)}"
                binding.labelResultado.text = totalValueStr
            } else {
                Toast.makeText(this, R.string.textValidDivisao, Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, R.string.textValidPrenchimento, Toast.LENGTH_SHORT).show()
        }
    }
}