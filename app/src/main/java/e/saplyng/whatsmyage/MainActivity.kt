package e.saplyng.whatsmyage

import android.app.DatePickerDialog
import android.content.Intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import com.jakewharton.threetenabp.AndroidThreeTen
import org.threeten.bp.LocalDate
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    var dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.US)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidThreeTen.init(this)
        setContentView(R.layout.activity_main)

        idDateOfBirth.setOnClickListener {
            val now = Calendar.getInstance()
            val datePicker = DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                val selectedDate = Calendar.getInstance()
                selectedDate.set(Calendar.YEAR, year)
                selectedDate.set(Calendar.MONTH, month)
                selectedDate.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                val date = dateFormat.format(selectedDate.time)
                idDateOfBirth.text = date
                Toast.makeText(this, "$date", Toast.LENGTH_SHORT).show()
            }, now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH))
            datePicker.show()
        }

        idVaccineDate.setOnClickListener {
            val now = Calendar.getInstance()
            val datePicker = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                val selectedDate = Calendar.getInstance()
                selectedDate.set(Calendar.YEAR, year)
                selectedDate.set(Calendar.MONTH, month)
                selectedDate.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                val date = dateFormat.format(selectedDate.time)
                idVaccineDate.text = date
                Toast.makeText(this, "$date", Toast.LENGTH_SHORT).show()
            }, now.get(Calendar.YEAR), now.get(Calendar.MONTH), now.get(Calendar.DAY_OF_MONTH))
            datePicker.show()
        }


        idButton.setOnClickListener {
            try {
                //val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
                val today = LocalDate.now()
                val parseBirth = LocalDate.parse(idDateOfBirth.text)
                val parseVaccine = LocalDate.parse(idVaccineDate.text)


                println("working")
                //val calculatedTime = Duration.between(parseBirth, today)
                val calculatedTime =  parseBirth.until(today)
                val calcuatedVaccineTime = parseBirth.until(parseVaccine)
                val timeSinceVaccine = parseVaccine.until(today)
                println("calculatedTime")
                idInformation.text = "Patient Current Age: ${calculatedTime.years} years ${calculatedTime.months} months old"
                idInformation2.text = "Patient Age at Vaccine:  ${calcuatedVaccineTime.years} years ${calcuatedVaccineTime.months} months old"
                idInformation3.text = "Time Since Vaccination:  ${timeSinceVaccine.years} years ${timeSinceVaccine.months} months"


            } catch (e: Exception) {
                Toast.makeText(this, "An Error Occurred", Toast.LENGTH_SHORT).show()
            }
        }

        // button goes to new activity
        val btnNext1 = idButtonNext
        btnNext1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val in1 = Intent(this@MainActivity, VaccineSearch::class.java)
                startActivity(in1)
            }
        })







    }
}
