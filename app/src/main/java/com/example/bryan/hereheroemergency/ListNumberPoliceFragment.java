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
    private ListNumbersAdapter adapter;


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
        arrayListNumbers = new ArrayList<>();
        ListNumbers number1 = new ListNumbers ("USA","911","911","911",R.drawable.usa);
        arrayListNumbers.add(number1);
        ListNumbers number2 = new ListNumbers ("Canada","911","911","911",R.drawable.canada);
        arrayListNumbers.add(number2);
        ListNumbers number3 = new ListNumbers ("Mexico","066","066","066",R.drawable.mexico);
        arrayListNumbers.add(number3);
        ListNumbers number4 = new ListNumbers ("China","110","120","119",R.drawable.china);
        arrayListNumbers.add(number4);
        ListNumbers number5 = new ListNumbers ("India","100","102","101",R.drawable.india);
        arrayListNumbers.add(number5);
        ListNumbers number6 = new ListNumbers ("Indonesia","110","118","113",R.drawable.indonesia);
        arrayListNumbers.add(number6);
        ListNumbers number7 = new ListNumbers("Iran","110","115","125",R.drawable.iran);
        arrayListNumbers.add(number7);
        ListNumbers number8 = new ListNumbers ("Malaysia","999","999","999",R.drawable.malaysia);
        arrayListNumbers.add(number8);
        ListNumbers number9 = new ListNumbers ("Singapore","999","995","995",R.drawable.singapore);
        arrayListNumbers.add(number9);
        loadListView(view);
    }
    private void loadListView(View view) {
        ListView listView = view.findViewById(R.id.list_view);
        adapter = new ListNumbersAdapter(context, arrayListNumbers,1);
        listView.setAdapter(adapter);
    }

}
