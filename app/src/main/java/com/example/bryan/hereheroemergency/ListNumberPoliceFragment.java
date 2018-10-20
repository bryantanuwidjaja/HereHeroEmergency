package com.example.bryan.hereheroemergency;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ListNumberPoliceFragment extends Fragment {
    private Context context;
    private ArrayList<ListNumbers> arrayListNumbers;

    public ListNumberPoliceFragment(){

    }
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_view_fragment, container, false);
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadListView(view);
    }
    private void loadListView(View view) {
        ListView listView = (ListView) view.findViewById(R.id.list_view);

        //listView.setAdapter(adapter);
    }

}
