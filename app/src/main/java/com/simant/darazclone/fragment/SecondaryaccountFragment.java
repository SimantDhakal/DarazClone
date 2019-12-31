package com.simant.darazclone.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.simant.darazclone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondaryaccountFragment extends Fragment {


    public SecondaryaccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secondaryaccount, container, false);
    }

}
