package com.example.navigation_controller;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentThree#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentThree extends Fragment {

    public FragmentThree() {
    }


    public static FragmentThree newInstance() {
        FragmentThree fragment = new FragmentThree();

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
        View view = inflater.inflate(R.layout.fragment_three, container, false);

        LinearLayout layout = view.findViewById(R.id.layout3);
        Toast.makeText(getContext(), "Value : "+ getArguments().getString("amount"), Toast.LENGTH_SHORT).show();

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Bundle bundle = new Bundle();
                bundle.putString("amount", "50");*/

                Navigation.findNavController(view).navigate(R.id.action_fragmentThree_to_fragmentOne);
            }
        });

        return view;
    }
}