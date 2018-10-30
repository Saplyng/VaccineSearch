package e.saplyng.whatsmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.Duration
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idButton.setOnClickListener {
            try {
                //val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
                val today = LocalDate.now()
                //val formattedToday = today.format(formatter)
                //val birthDate = idDateOfBirth.text.split("-", "/", ".")
                //val vaccineDate = idVaccineDate.text.split("-", "/", ".")
                val parseBirth = LocalDate.parse(idDateOfBirth.text)


                //var dateOfBirth: LocalDate = LocalDate.of(birthDate[0].toInt(),birthDate[1].toInt(),birthDate[2].toInt())
                //ar dateOfVaccine: LocalDate = LocalDate.of(vaccineDate[0].toInt(),vaccineDate[1].toInt(),vaccineDate[2].toInt())
                println("working")
                //val calculatedTime = Duration.between(parseBirth, today)
                val calculatedTime =  parseBirth.until(today)
                println("calculatedTime")
                idInformation.text = "$calculatedTime"

            } catch (e: Exception) {
                Toast.makeText(this, "An Error Occured", Toast.LENGTH_SHORT).show()
            }
        }


    }
}
