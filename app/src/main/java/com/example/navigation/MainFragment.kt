package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //работа с UI без binding вау
        val buttonFrag2 = view.findViewById<Button>(R.id.buttonFragSecond)
        val buttonFrag3 = view.findViewById<Button>(R.id.buttonFragThird)
        //находим сам контролер через который по id и переключаем
        val controller = findNavController()
        buttonFrag2.setOnClickListener { controller.navigate(R.id.secondFragment) }
        buttonFrag3.setOnClickListener { controller.navigate(R.id.thirdFragment) }
    }
    //Т.К. мы переключаемся через Navigation нам не нужно что было тут
}