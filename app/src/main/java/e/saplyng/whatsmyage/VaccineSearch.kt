package e.saplyng.whatsmyage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.SearchView
import kotlinx.android.synthetic.main.vaccine_search.*
import android.widget.Toast
import e.saplyng.whatsmyage.R.id.searchView



class VaccineSearch : AppCompatActivity(){



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vaccine_search)

        val searchView = idSearchView
        searchView.queryHint = "Search View"





    }
}