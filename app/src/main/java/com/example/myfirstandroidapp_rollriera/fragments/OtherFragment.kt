package com.example.myfirstandroidapp_rollriera.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfirstandroidapp_rollriera.databinding.FragmentOtherBinding

class OtherFragment : Fragment() {

    private lateinit var binding : FragmentOtherBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentOtherBinding.inflate(inflater, container, false)

        return binding.root
    }

}