package com.example.bryan.hereheroemergency;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ListNumberAdapter extends ArrayAdapter{
    private android.app.Activity context;
    private List<ListNumber> arrayListNumbers;
    private int selectedPosition = -1;
    private static final String TAG = "ListNumberAdapter";
    public String numberHolder = "118";

    public ListNumberAdapter(Activity context,List<ListNumber> arrayListNumbers){
        super(context,R.layout.listnumber_layout,arrayListNumbers);
        this.context=context;
        this.arrayListNumbers=arrayListNumbers;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();


        View listViewItem = inflater.inflate(R.layout.listnumber_layout,null,true);
        ImageView imageView_Flags = listViewItem.findViewById(R.id.imageView_ListNumberLayout_Flags);
        TextView textView_Country = listViewItem.findViewById(R.id.textView_ListNumberLayout_Country);
        final TextView textView_Number = listViewItem.findViewById(R.id.textView_ListNumberLayout_Number);
        RadioButton radioButton_SelectNumber = listViewItem.findViewById(R.id.radioButton_ListNumberLayout_SelectNumber);

        
        

        radioButton_SelectNumber.setChecked(position == selectedPosition);

        radioButton_SelectNumber.setTag(position);
        textView_Country.setTag(position);
        textView_Number.setTag(position);
        imageView_Flags.setTag(position);

        final ListNumber listNumber=arrayListNumbers.get(position);
        textView_Country.setText(listNumber.getCountry());
        textView_Number.setText(listNumber.getNumber());
        imageView_Flags.setImageResource(listNumber.getDrawable());

        textView_Country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberHolder = listNumber.getNumber();
                saveToSharedPreferences(numberHolder);
                Log.d(TAG, "onClick: country   "+ numberHolder);
                itemCheckChanged(v);

            }
        });

        textView_Number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberHolder = listNumber.getNumber();
                saveToSharedPreferences(numberHolder);
                Log.d(TAG, "onClick: num "+ numberHolder);
                itemCheckChanged(v);

            }
        });

        radioButton_SelectNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberHolder = listNumber.getNumber();
                saveToSharedPreferences(numberHolder);
                Log.d(TAG, "onClick: radio "+ numberHolder);
                itemCheckChanged(v);

            }
        });

        return listViewItem;
    }

    private void itemCheckChanged(View v) {
        selectedPosition = (Integer) v.getTag();
        notifyDataSetChanged();

    }
    private void saveToSharedPreferences(String numberHolder){
        SharedPreferences prefs = context.getSharedPreferences("mydata", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("Number",numberHolder);
        Log.d(TAG, "saveToSharedPreferences: In" + numberHolder);
        editor.apply();
    }

}
