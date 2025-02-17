package com.example.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.mynavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnToCategory.setOnClickListener {
            view ->
            Toast.makeText(requireContext(), "Category Clicked", Toast.LENGTH_SHORT).show()
            view.findNavController().navigate(R.id.action_homeFragment_to_categoryFragment)
//            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_categoryFragment)
        }
        binding.btnToProfile.setOnClickListener {
            view -> view.findNavController().navigate(R.id.action_homeFragment_to_profileActivity)
//            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_profileActivity)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}