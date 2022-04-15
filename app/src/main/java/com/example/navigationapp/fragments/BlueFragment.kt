package com.example.navigationapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.R

class BlueFragment : Fragment(R.layout.fragment_blue) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().findViewById<Button>(R.id.navigation_blue_button).setOnClickListener {
            findNavController().navigate(R.id.action_blueFragment_to_redFragment)
        }
    }
}