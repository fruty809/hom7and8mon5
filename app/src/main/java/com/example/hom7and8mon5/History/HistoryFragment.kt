package com.example.hom7and8mon5.History

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hom24mon5.R
import com.example.hom24mon5.databinding.FragmentHistoryBinding
import com.example.hom7and8mon5.App

@Suppress("UNREACHABLE_CODE")
class HistoryFragment : Fragment() {
    private lateinit var binding: FragmentHistoryBinding
    lateinit var adapter: HistoryAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(layoutInflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = HistoryAdapter()
        binding.historyRv.adapter = adapter
        adapter.loveAdd(App.dataBase.loveDao().getAllData())

        binding.homeBtn.setOnClickListener {
            findNavController().navigate(R.id.mainFragment)
        }

    }
}