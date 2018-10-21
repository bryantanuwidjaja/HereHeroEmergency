package com.example.bryan.hereheroemergency;

import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

public class EarthquakeSlider extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] images_Slider = {
            R.drawable.ic_person,
            R.drawable.ic_person,
            R.drawable.ic_person,
            R.drawable.ic_person,
            R.drawable.ic_person,
            R.drawable.ic_person,
            R.drawable.ic_person
    };

    public String [] title_Slider ={
            "Get away from glass, large furniture, and other hazards, if possible.",
            "Drop to your hands and knees under a sturdy table or desk.",
            "Protect your head and neck from falling debris.",
            "Remain in your safe spot until the shaking stops.",
            "Use caution around debris after leaving your shelter.",
            "Check for injuries and render aid, if needed.",
            "Inspect the building for structural damage and hazards."
    };

    public String[] description_Slider = {
            "In the first few seconds after the shaking starts, try to quickly move away from anything that could fall and injure you. Get low and walk or crawl away from hazards such as windows, cabinets, televisions, and bookcases.",
            "Look for a sturdy piece of furniture, such as a solid table, that can offer cover from falling objects. Get down on your hands and knees, and crouch under the desk or table until the shaking stops.",
            "If possible, grab a pillow, sofa cushion, or another object to shield your face and head. If there’s nothing nearby to use as a shield, cover your face, head, and neck with your hands and arms.",
            "Stay put until the shaking has stopped for 1 or 2 minutes. Remain on guard when you get up, as aftershocks can occur at any time after an earthquake.",
            "Watch out for broken glass and rubble. If you’re not wearing shoes, tread lightly, and be extremely careful not to injure yourself. Grab a pair of heavy-soled shoes and, if you’re wearing light clothing, put on a pair of pants and a long-sleeved shirt.",
            "Call emergency services if you or someone nearby are injured and need medical attention. If you know first aid or CPR, administer emergency care as needed.",
            "Check for cracks in the building’s structure, fires, the smell of gas, and damaged wires or electrical appliances. If you believe the building is unsound, evacuate immediately. If possible, and if there’s no immediate threat that the building will collapse, respond to any utility hazards."
    };

    public EarthquakeSlider(EarthquakeActivity context) { this.context = context; }

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
