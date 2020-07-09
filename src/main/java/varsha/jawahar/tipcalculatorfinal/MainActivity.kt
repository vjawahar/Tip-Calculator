package varsha.jawahar.tipcalculatorfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        infoTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            // Bill
            if(billEditText.text.isEmpty() || tipEditText.text.isEmpty()){
                this.infoTextView.visibility = View.VISIBLE
                infoTextView.text = "Invalid Input"
            }
            else {
                val bill: Double = billEditText.text.toString().toDouble()
                //Tip Percentage
                val tipPercent: Double = tipEditText.text.toString().toDouble()
                //Tip
                val tip: Double = bill * (tipPercent / 100)
                //Total
                val total: Double = bill + tip

//            //set info text
                this.infoTextView.text = "Tip: $" + tip + " Total: $" + total

                //Make info text visible
                infoTextView.visibility = View.VISIBLE

            }

        }
    }
}
