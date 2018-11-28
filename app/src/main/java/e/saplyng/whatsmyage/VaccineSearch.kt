package e.saplyng.whatsmyage

import android.os.Bundle
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
import kotlinx.android.synthetic.main.listview_item.*


class VaccineSearch : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listview_item)

        val lv = mListView as ListView
        val searchBar = searchBar as MaterialSearchBar
        searchBar.setHint("search...")
        searchBar.setSpeechMode(false)

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
                    in hepatitusB.alias -> println(hepatitusB)
                    in rotavirus.alias -> println(rotavirus)
                    in dtap.alias -> println(dtap)
                    in hib.alias -> println(hib)
                    in pneumococcal.alias -> println(pneumococcal)
                    in polio.alias -> println(polio)
                    in influenza.alias -> println(influenza)
                    in mmr.alias -> println(mmr)
                    in varicella.alias -> println(varicella)
                    in hepA.alias -> println(hepA)
                    in serogroup.alias -> println(serogroup)
                    in menB.alias -> println(menB)
                    in tdap.alias -> println(tdap)
                    in hpv.alias -> println(hpv)

                    else -> println("not available")

                }

                Toast.makeText(this@VaccineSearch,adapter.getItem(i)!!.toString(), Toast.LENGTH_SHORT).show()
            }
        }


        //end

    }
}