package com.example.whoami.walkthrough.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.whoami.R
import com.example.whoami.databinding.FragmentFirstScreenBinding
import com.example.whoami.databinding.FragmentScndScreenBinding


class scndScreen : Fragment() {

    private var _binding: FragmentScndScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentScndScreenBinding.inflate(inflater, container, false)
        binding.next2

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.next2.setOnClickListener { _binding
            viewPager?.currentItem = 2
        }

        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}