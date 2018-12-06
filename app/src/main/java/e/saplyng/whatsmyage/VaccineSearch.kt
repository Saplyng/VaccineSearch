package e.saplyng.whatsmyage

import android.content.Intent
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.Toast
import android.widget.AdapterView
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.mancj.materialsearchbar.MaterialSearchBar
import kotlinx.android.synthetic.main.activity_information.*
import kotlinx.android.synthetic.main.listview_item.*
import java.util.*


class VaccineSearch : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview_item)

        val lv = mListView as ListView
        val searchBar = searchBar as MaterialSearchBar
        searchBar.setHint("search...")
        searchBar.setSpeechMode(false)

        //sort vaccine array to alphabetacal order
        vaccines.sort()

        //ADAPTER
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vaccines)
        lv.adapter = adapter

        //SEARCHBAR TEXT CHANGE LISTENER
        searchBar.addTextChangeListener(object: TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(charSequence: CharSequence, start: Int, before: Int, count: Int) {
                //SEARCH FILTER
                adapter.filter.filter(charSequence)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })


        //LISTVIEW ITEM CLICKED
        lv.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {

                when(adapter.getItem(i)!!.toString()){
                    in hepatitusB.alias -> displayVaccine(hepatitusB)
                    in rotavirus.alias -> displayVaccine(rotavirus)
                    in dtap.alias -> displayVaccine(dtap)
                    in hib.alias -> displayVaccine(hib)
                    in pneumococcal.alias -> displayVaccine(pneumococcal)
                    in polio.alias -> displayVaccine(polio)
                    in influenza.alias -> displayVaccine(influenza)
                    in mmr.alias -> displayVaccine(mmr)
                    in varicella.alias -> displayVaccine(varicella)
                    in hepA.alias -> displayVaccine(hepA)
                    in serogroup.alias -> displayVaccine(serogroup)
                    in menB.alias -> displayVaccine(menB)
                    in tdap.alias -> displayVaccine(tdap)
                    in hpv.alias -> displayVaccine(hpv)

                    else -> println("not available")

                }

                Toast.makeText(this@VaccineSearch,adapter.getItem(i)!!.toString(), Toast.LENGTH_SHORT).show()
            }
        }


        //end

    }

    fun displayVaccine(vaccineName: Vaccine){
//        val in1 = Intent(this@VaccineSearch, Information::class.java)
//        startActivity(in1)
        setContentView(R.layout.activity_information)

        val items = LinkedList(vaccineName.alias)
        items.sort()
        items.push("List of Vaccine Names")
        //adapter
        val anotherAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items)
        idSpinnerAlias.adapter = anotherAdapter

        val anotherAdapter2 = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vaccineName.description)
        idInformationBox.adapter = anotherAdapter2

        idTitle.text = vaccineName.name


    }
}