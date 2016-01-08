package com.example.jameschaos.sunshine;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        String[] forecastArray = {
                "Today",
                "Today",
                "Today",
                "Today",
                "Today"
        };

        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray));

        return inflater.inflate(R.layout.fragment_blank, container, false);
    }


}
