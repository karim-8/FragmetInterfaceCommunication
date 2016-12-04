package com.example.karim.fragmetinterfacecommunication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

//3amalt implement ll clicklisener 3lashan attribute bat3 on click hy3amlii mashakell
public class FragmentA extends Fragment implements View.OnClickListener
{

    Button button;
    int counter = 0;
    Communicator communicator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

//This method called after activity created in the main activity

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //refrence ll mainActivity
        communicator = (Communicator) getActivity();
        button = (Button) getActivity().findViewById(R.id.clickme);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        counter++;
        communicator.respond("The Button was clicked"+counter+"times");

    }
}
