package com.example.amd.fragmenttutorial;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by amd on 8/27/15.
 */
public class FragmentB extends Fragment {

    TextView textView;
    String []descriptions;
    int index;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textView = (TextView) view.findViewById(R.id.textView);
        Resources resources = getResources();
        descriptions = resources.getStringArray(R.array.descriptions);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        if(savedInstanceState!=null){
            Log.e("ANAS", "On Activity Created B" );
            this.index = savedInstanceState.getInt("index");
            textView.setText(descriptions[index]);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("index", this.index);
    }

    public void changeData(int index){


        this.index = index;
        textView.setText(descriptions[index]);
    }
}
