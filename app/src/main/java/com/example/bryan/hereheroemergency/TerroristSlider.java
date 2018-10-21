package com.example.bryan.hereheroemergency;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class TerroristSlider extends PagerAdapter {


    Context context;
    LayoutInflater inflater;

    public int[] images_Slider = {
            R.drawable.ic_person,
            R.drawable.ic_person,
            R.drawable.ic_person,
            R.drawable.ic_person,
            R.drawable.ic_person
    };

    public String [] title_Slider ={
            "Escape if possible.",
            "Hide if you cannot run.",
            "Lie flat on the floor."


    };

    public String[] description_Slider = {
            "If a bomb explodes nearby and you are uninjured, head away from the site of the explosion. If a terrorist or group of terrorists is shooting into a crowd, look for an exit. If you can get to the exit without exposing yourself to greater danger, do so and keep running until you are far from the site of the terror incident.",
            "If you don’t believe it is possible to escape from the terrorists, hide behind a large counter or beneath a table. Alternately, seek shelter in a secure room and lock the door. Look for areas that are reinforced with brick or other sturdy materials.",
            "f you can neither escape nor hide without exposing yourself to danger, rest on your stomach and play dead. Be very still and do not move. Do not attempt to help rescuers and do not pick up any weapons."
    };

    public TerroristSlider(TerroristActivity context) { this.context = context; }

    @Override
    public int getCount (){ return title_Slider.length;}

    @Override
    public boolean isViewFromObject (View view, Object object){
        return (view==(ConstraintLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slider_information,container,false);
        ConstraintLayout layoutslide = (ConstraintLayout) view.findViewById(R.id.sliderLayout);
        ImageView imgslide = (ImageView)  view.findViewById(R.id.imageView_Slider);
        TextView txttitle= (TextView) view.findViewById(R.id.textView_TitleSlider);
        TextView description = (TextView) view.findViewById(R.id.textView_DescriptionSlider);
        imgslide.setImageResource(images_Slider[position]);
        txttitle.setText(title_Slider[position]);
        description.setText(description_Slider[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout)object);
    }

}
