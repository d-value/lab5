package com.example.navigationapp.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.R

class GreenFragment : Fragment(R.layout.fragment_green) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().findViewById<Button>(R.id.navigation_green_button).setOnClickListener {
            findNavController().navigate(R.id.action_greenFragment_to_blueFragment)
        }
    }
}