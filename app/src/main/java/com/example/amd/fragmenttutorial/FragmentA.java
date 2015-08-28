package com.example.amd.fragmenttutorial;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by amd on 8/27/15.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener {

    ListView listView;
    Communicator communicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.titles, android.R.layout.simple_list_item_1  );
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        communicator = (Communicator) getActivity();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicator.respond(position);
    }


    public void setCommunicator(Communicator communicator){
        this.communicator = communicator;
    }


    /**
     * Created by amd on 8/27/15.
     */
    public static interface Communicator {

        public void respond(int index);
    }
}
