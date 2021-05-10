package com.example.skica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.RadioButton
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.izbor_vakcine.*
import kotlinx.android.synthetic.main.prioriteti.*
import kotlinx.android.synthetic.main.sazetak_podataka.*

class IzborVakcineFragment : Fragment(R.layout.izbor_vakcine) {
    private val args: IzborVakcineFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onRadioButtonClickedVakcina()
    }


    var vakcina = ""

    fun onRadioButtonClickedVakcina() {

        radioGroupVakcina.setOnCheckedChangeListener { group, checkedId ->
            if (checkedId == R.id.izbor_vakcine_sputnik) {
                vakcina = R.id.izbor_vakcine_sputnik.toString()
            }
            if(checkedId == R.id.izbor_vakcine_moderna) {
                vakcina = R.id.izbor_vakcine_moderna.toString()
            }
            if(checkedId == R.id.izbor_vakcine_astra_zeneca) {
                vakcina = R.id.izbor_vakcine_astra_zeneca.toString()
            }
            if(checkedId == R.id.izbor_vakcine_pfitzer) {
                vakcina = R.id.izbor_vakcine_pfitzer.toString()
            }

        }


        izbor_vakcine_dugme_dalje.setOnClickListener {
            val vrstaVakcine = vakcina
            val textPrioritetna = args.prioritetnaGrupa
            val ime = args.ime
            val prezime = args.prezime
            val datum_rodenja = args.datumRodenja
            val broj_tel = args.brojTelefona
            val jmbg = args.jmbg

            val action = IzborVakcineFragmentDirections.actionIzborVakcineFragmentToSazetakPodatakaFragment(
                ime, prezime, datum_rodenja, broj_tel, jmbg, vrstaVakcine, textPrioritetna

            )
            findNavController().navigate(action)


        }


    }















}