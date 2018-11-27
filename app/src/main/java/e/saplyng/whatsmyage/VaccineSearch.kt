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
        searchBar.setSpeechMode(true)

        var vaccines = arrayOf(
            "Hepatitis B", "HepB",
            "Recombivax HB", "Engerix-B",
            "Elovac B", "Genevac B",
            "Shanvac B", "Heplisav-B",
            "Amvax B", "Bio-Hep-B",
            "Fendrex", "H-B-Vax II",
            "HB-Vax", "HBvaxPRO",
            "Hepavax Gene",
            "Rotavirus", "Rotarix",
            "RotaTeq", "Rotavac",
            "Rotavin-M1", "Lanzhou lamb",
            "Rotasiil", "RoatTeq",
            "Lou Te Wei",
            "Diphteria, tetanus, and acellular pertussis", "DTaP",
            "Daptacel", "Infanrix",
            "ACEL-IMUNE", "Certiva",
            "Tripedia", "D.T COQ",
            "Dif per tet all", "P.D.T. Vax Purified",
            "Tripacel", "Tripavac",
            "Tripvac",
            "Haemophilus influenzae type B", "Hib",
            "ActHIB", "Hiberix",
            "PedvaxHIB",
            "HibTITER", "HIBest",
            "Pneumococcal", "PCV 7",
            "Prevar", "Prevenar",
            "PCV 13", "Prevnar 13",
            "Pneumovax", "Pneumovax 23",
            "Synflorix", "PPV",
            "inactivated poliovirus vaccine","IPV",
            "Ipol", "Imovax Polio",
            "Opvero", "Polio Salk (Sero)",
            "Polio Sabin One and Three",
            "influenza", "flu",
            "Afluria", "fluad",
            "Fluarix", "Flublok",
            "Flucelvax", "FluLaval",
            "FluMist", "Fluvirin",
            "Fluzone", "Fluzone-High-Dose",
            "Fluzone Intradermal", "Agriflu",
            "IIV3", "IIV4","RIV3","ccIIV4",
            "measles, mumps, and rubella", "MMR",
            "M-M-R II", "ProQuad",
            "M-M-R Vax", "M-M-R Vaxpro",
            "Morupar", "Mumeru Vax",
            "Pluserix", "Priorix",
            "Prioryks", "ROR Vax",
            "Trimovax", "Triviraten Berna",
            "varicella", "VAR",
            "Varivax", "Okavax",
            "Vaccin Varilrix",
            "Varicela Biken",
            "Varcelvax", "varipox",
            "Varivax III", "V-Z Vax",
            "hepatitis A", "HepA",
            "Havrix", "Vaqta",
            "Avaxim", "Epaxal",
            "HAVpur", "Havrix 1440",
            "Havrix Junior", "Havrix Monodose",
            "Havryks", "Mevac-A",
            "serogroup A, C, W, Y", "Menveo",
            "Menactra", "Menacttra",
            "Serogroup B meningococcal", "Bexsero",
            "Trumenba", "MenB",
            "tetanus, diphteria, and acellular pertussis", "Tdap",
            "Adacel", "Boostrix",
            "human papillomavirus", "HPV",
            "Gardasil", "Cervarix",
            "Gardasil 9"
        )

        //ADAPTER
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, vaccines)
        lv.setAdapter(adapter)

        //SEARCHBAR TEXT CHANGE LISTENER
        searchBar.addTextChangeListener(object: TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(charSequence: CharSequence, start: Int, before: Int, count: Int) {
                //SEARCH FILTER
                adapter.getFilter().filter(charSequence)
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        //LISTVIEW ITEM CLICKED
        lv.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(adapterView: AdapterView<*>, view: View, i: Int, l: Long) {
                Toast.makeText(this@VaccineSearch,adapter.getItem(i)!!.toString(), Toast.LENGTH_SHORT).show()
            }
        })


        //end

    }
}