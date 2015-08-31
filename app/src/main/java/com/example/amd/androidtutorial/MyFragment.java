package com.example.amd.androidtutorial;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MyFragment extends Fragment {

    private RecyclerView recyclerView;
    private RVAdapter adapter;

    public MyFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View layout  =  inflater.inflate(R.layout.fragment_my, container, false);
        recyclerView = (RecyclerView) layout.findViewById(R.id.drawerlist);
        adapter = new RVAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return layout;
    }

    public static List<Information> getData(){
        List<Information> list  = new ArrayList<>();
        String button="BUTTON ";
        String title="Title Goes Here ";
        String description = "This is detailed description of your title ";

        for(int i = 0 ; i < 10 ; i++){
            Information inf = new Information(button+i, title+i , description+i);
            list.add(inf);
        }
        return list;
    }


}
