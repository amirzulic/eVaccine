package com.example.skica

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.skica.databinding.TerminVakcinacijeBinding

class TerminVakcinacijeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<TerminVakcinacijeBinding>(inflater, R.layout.termin_vakcinacije, container, false)
        return binding.root
    }
}