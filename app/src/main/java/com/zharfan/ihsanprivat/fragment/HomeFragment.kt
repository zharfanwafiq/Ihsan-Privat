package com.zharfan.ihsanprivat.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.zharfan.ihsanprivat.adapter.GridMenuAdapter
import com.zharfan.ihsanprivat.data.IhsanPrivatMenuHome
import com.zharfan.ihsanprivat.data.MenuDataList
import com.zharfan.ihsanprivat.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var gridMenuAdapter: GridMenuAdapter
    private val gridMenus : ArrayList<IhsanPrivatMenuHome> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    showGridMenu()
    }

    private fun showGridMenu() {
        gridMenus.addAll(MenuDataList.listData)
        gridMenuAdapter = GridMenuAdapter(gridMenus)
        binding.apply {
            with(rvMenus){
                layoutManager = GridLayoutManager(requireActivity(),3)
                adapter = gridMenuAdapter
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}