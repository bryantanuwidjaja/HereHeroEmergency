package com.example.bryan.hereheroemergency;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ListNumbersAdapter extends ArrayAdapter {
    private Context context;
    private List<ListNumbers> arrayListNumbers;
    private LayoutInflater inflater;
    private int indicator;

    public ListNumbersAdapter(Context context, List<ListNumbers>arrayListNumbers,int indicator){
        super(context, R.layout.list_custom_row_layout,arrayListNumbers);
        this.context = context;
        this.arrayListNumbers=arrayListNumbers;
        this.indicator = indicator;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getCount() {
        return arrayListNumbers.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayListNumbers.get(i);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,@NonNull ViewGroup parent){
        View listItems = inflater.inflate(R.layout.list_custom_row_layout,null,true);
        ImageView imageView_Flags = listItems.findViewById(R.id.imageView_ListNumberLayout_Flags);
        TextView textView_Country = listItems.findViewById(R.id.textView_ListNumberLayout_Country);
        TextView textView_Number = listItems.findViewById(R.id.textView_ListNumberLayout_Number);
        final ListNumbers listNumbers = arrayListNumbers.get(position);

        switch(indicator){
            case 1:
                textView_Country.setText(listNumbers.getCountry());
                textView_Number.setText(listNumbers.getNumberPolice());
                imageView_Flags.setImageResource(listNumbers.getDrawable());
                break;
            case 2:
                textView_Country.setText(listNumbers.getCountry());
                textView_Number.setText(listNumbers.getNumberMedical());
                imageView_Flags.setImageResource(listNumbers.getDrawable());
                break;
            case 3:
                textView_Country.setText(listNumbers.getCountry());
                textView_Number.setText(listNumbers.getNumberFire());
                imageView_Flags.setImageResource(listNumbers.getDrawable());
                break;
        }



        return listItems;
    }

}
