package e.saplyng.whatsmyage

import android.app.DatePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
                idInformation.text = "The patient is currently ${calculatedTime.years} years ${calculatedTime.months} months old" +
                        "The patient got their vaccine when they were ${calcuatedVaccineTime.years} years ${calcuatedVaccineTime.months}" +
                        "It has been ${timeSinceVaccine.years} years ${timeSinceVaccine.months} months since the vaccine date"


            } catch (e: Exception) {
                Toast.makeText(this, "An Error Occurred", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
