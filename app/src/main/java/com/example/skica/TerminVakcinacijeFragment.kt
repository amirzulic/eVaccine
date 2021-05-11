package com.example.skica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.skica.databinding.KontaktBinding
import com.example.skica.databinding.TerminVakcinacijeBinding
import kotlinx.android.synthetic.main.termin_vakcinacije.*

class TerminVakcinacijeFragment : Fragment(R.layout.termin_vakcinacije) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        postaviDatum()
        postaviTermin()
        postaviLokaciju()
        goToKontaktFromTermin()

    }


    val lokacijeVakcinacije = listOf<String>(
        "Lokacija: Sportska dvorana Zetra",
        "Lokacija: Klinički centar Univerziteta Sarajevo",
        "Lokacija: Opća bolnica Sarajevo",
        "Lokacija: Dom zdravlja Novi Grad",
        "Lokacija: Dom zdravlja Centar"
    )


    val listaTermina = listOf<String>(
        "Datum: 20/05/2021",
        "Datum: 21/05/2021",
        "Datum: 22/05/2021",
        "Datum: 23/05/2021",
        "Datum: 01/05/2021",
        "Datum: 02/05/2021",
        "Datum: 03/05/2021",
        "Datum: 08/06/2021",
        "Datum: 21/05/2021",
        "Datum: 17/05/2021",
        "Datum: 01/06/2021",
        "Datum: 02/06/2021",
        "Datum: 03/07/2021",
        "Datum: 9/07/2021",
        "Datum: 15/07/2021",
        "Datum: 25/07/2021",
        "Datum: 26/07/2021",
        "Datum: 29/07/2021",
    )

    val satnice = listOf<String>(
        "Vrijeme: 08:00h",
        "Vrijeme: 09:00h",
        "Vrijeme: 10:00h",
        "Vrijeme: 11:00h",
        "Vrijeme: 14:00h",
        "Vrijeme: 15:00h",
        "Vrijeme: 12:00h"
    )


    private fun goToKontaktFromTermin(){
        termin_vakcinacije_dugme_uredu.setOnClickListener {
            val action = TerminVakcinacijeFragmentDirections.actionTerminVakcinacijeFragmentToKontaktFragment()
            findNavController().navigate(action)

        }
    }




    private fun postaviDatum(){
        //termin_vakc_datum
        var datum = listaTermina.random()
        termin_vakcinacije_datum.text = datum
    }

    private fun postaviTermin(){
        var vrijeme = satnice.random()
        termin_vakcinacije_vrijeme.text = vrijeme
    }

    private fun postaviLokaciju(){
        var lokacija = lokacijeVakcinacije.random()
        termin_vakcinacije_lokacija.text = lokacija
    }










}