package com.example.navigationapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.navigationapp.R

class RedFragment : Fragment(R.layout.fragment_red) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().findViewById<Button>(R.id.navigation_red_button).setOnClickListener {
            findNavController().navigate(R.id.action_redFragment_to_greenFragment)
        }
    }
}