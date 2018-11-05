package e.saplyng.whatsmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import com.jakewharton.threetenabp.AndroidThreeTen
import org.threeten.bp.LocalDate

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidThreeTen.init(this)
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
                idInformation.text = "Patient Current Age: ${calculatedTime.years} years ${calculatedTime.months} months old"
                idInformation2.text = "Patient Age at Vaccine:  ${calcuatedVaccineTime.years} years ${calcuatedVaccineTime.months} months old"
                idInformation3.text = "Time Since Vaccination:  ${timeSinceVaccine.years} years ${timeSinceVaccine.months} months"


            } catch (e: Exception) {
                Toast.makeText(this, "An Error Occurred", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
