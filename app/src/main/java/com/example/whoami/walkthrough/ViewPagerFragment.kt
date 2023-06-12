package com.example.whoami.walkthrough

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import com.example.whoami.R
import com.example.whoami.databinding.FragmentViewPagerBinding
import com.example.whoami.walkthrough.screens.firstScreen
import com.example.whoami.walkthrough.screens.scndScreen
import com.example.whoami.walkthrough.screens.thirdScreen
import java.util.zip.Inflater


class ViewPagerFragment : Fragment() {

    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Inflate the layout for this fragment
        _binding = FragmentViewPagerBinding.inflate(inflater, container, false)

        binding.viewPager

        val fragmentList = arrayListOf<Fragment>(
            firstScreen(),
            scndScreen(),
            thirdScreen()
        )

        val adapter = viewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}