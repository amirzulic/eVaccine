package com.example.skica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.skica.databinding.ProvjeraPreprekeBinding
import com.example.skica.databinding.SazetakPodatakaBinding
import kotlinx.android.synthetic.main.sazetak_podataka.*

class SazetakPodatakaFragment : Fragment(R.layout.sazetak_podataka) {

    private val args: SazetakPodatakaFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        
        sazetak_podataka_ime_prezime.text = args.ime
        sazetak_podataka_jmbg.text = args.prezime
        sazetak_podataka_godine.text = args.datumRodenja
        sazetak_podataka_telefon.text = args.brojTelefona
        sazetak_podataka_ime_prezime2.text = args.jmbg
        sazetak_pod_vakcina.text = args.vrstaVakcine
        
        







    }




}