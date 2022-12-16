package com.example.navigation_controller;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class BtmShtFragment extends BottomSheetDialogFragment {

    public BtmShtFragment() {
        // Required empty public constructor
    }
    public static BtmShtFragment newInstance() {
        BtmShtFragment fragment = new BtmShtFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_btm_sht, container, false);

        TextView hello = view.findViewById(R.id.hello);


        return view;
    }
}