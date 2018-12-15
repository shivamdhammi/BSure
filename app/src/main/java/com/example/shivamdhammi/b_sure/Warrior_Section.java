package com.example.shivamdhammi.b_sure;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Warrior_Section extends Fragment {

    private FloatingActionButton floatbtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_warrior__section,container,false);

        floatbtn = (FloatingActionButton) view.findViewById(R.id.floatbtn);

        floatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Warrior_Story.class);
                startActivity(intent);
            }
        });

        return view;

    }
}
