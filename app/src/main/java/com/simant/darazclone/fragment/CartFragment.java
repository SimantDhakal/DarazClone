package com.simant.darazclone.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.simant.darazclone.R;
import com.simant.darazclone.activity.LandingActivity;

public class CartFragment extends Fragment {

    public static Boolean loginStatus = false;

    public CartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        // sharedpreference here
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        String strLoginStatus = preferences.getString("statusLogin", "");

        if (loginStatus.booleanValue() == false) {
            Intent intent = new Intent(getActivity(), LandingActivity.class);
            startActivity(intent);
        } else {

        }

        return view;
    }

}
