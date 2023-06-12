package com.example.whoami.walkthrough.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.whoami.R
import com.example.whoami.databinding.FragmentScndScreenBinding
import com.example.whoami.databinding.FragmentThirdScreenBinding


class thirdScreen : Fragment() {

    private var _binding: FragmentThirdScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentThirdScreenBinding.inflate(inflater, container, false)
        binding.start

        binding.start.setOnClickListener { _binding
            findNavController().navigate(R.id.action_viewPagerFragment_to_menu)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}