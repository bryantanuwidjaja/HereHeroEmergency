package com.example.bryan.hereheroemergency;

import android.content.Context;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CarAccidentSlider extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] images_Slider = {
            R.drawable.car1,
            R.drawable.car2,
            R.drawable.car3,
            R.drawable.car4,
            R.drawable.car5,
            R.drawable.car6,
            R.drawable.car7,
            R.drawable.car8,
            R.drawable.car9,
            R.drawable.car10,
            R.drawable.car11,
            R.drawable.car12,
            R.drawable.car13
    };

    public String [] title_Slider ={
            "Park your car to the side of the road.",
            "Remain calm.",
            "Look over the scene quickly.",
            "Call emergency services.",
            "Warn oncoming traffic.",
            "Check for danger.",
            "Ask the victim about assistance.",
            "Avoid moving the victim.",
            "Check the airway.",
            "Administer aid—as necessary.",
            "Treat shock.",
            "Comfort the victim.",
            "Turn over care to emergency personnel."

    };

    public String[] description_Slider = {
            "If you are the first responder to an accident or someone who can and/ or wants to provide assistance, pull your car to the side of the road. If the victim is in the road, use your car as a barrier. Make sure your car is safely out of traffic lanes and not blocking access to the scene or victim in any way.",
            "It’s important to you and any victims that you remain calm. This will help you make informed and rational decisions to best deal with the accident. If you feel yourself panicking in any way, take a deep breath to refocus or delegate tasks to others at the scene.",
            "Although your first instinct may be to call for help, taking a few seconds to quickly assess the situation can help you provide vital information to emergency services. In addition, it may also alert you to things that should be done before attending to victims.",
            "Once you’ve made a quick assessment of the accident scene, call emergency services. Provide the person with whom you are speaking any information request to the best of your knowledge. Ask other witnesses and bystanders to call emergency services as well. These people may have additional information or noticed something about the accident and victim you didn’t. Remember that the more information emergency services has, the better they can respond to an accident.",
            "It’s important to let other drivers know that there is an accident that they need to avoid. Using flagmen, which are bystanders who warn traffic, or flares can alert oncoming traffic to slow down. In turn, this may alert other drivers that they need to stop and assist with the scene and any victims.",
            "Before you can approach an accident victim, it’s important to make sure the scene is safe for you, too. Check to see if you see fuel flowing, fire, smoke, or exposed wires. If this is the case, you may be better not providing aid and simply calling emergency services.",
            "If the accident victim is conscious, ask if the person wants assistance. This is an important step because not every accident victim may want help, even if it appears the person needs it. By not respecting a victim’s wishes, you could be subject to legal action under Good Samaritan laws.",
            "Remember that many injuries are not visible on the skin. Unless the victim is in imminent danger from fire or something else, leave the person in place until emergency services arrive.",
            "Breathing is an absolute necessity to any person’s life. If a person is unconscious or loses consciousness, it’s vital to check the victim’s airway to ensure the person is breathing properly. If not, you may need to give CPR to restart the circulatory and respiratory systems.",
            "Many advocates suggest providing first aid only if the victim has life threatening injuries. If the victim has injuries that require bandaging, splinting broken bones, or using other advanced first-aid techniques, it’s generally recommend to wait for professional help, especially if you know it is on the way.",
            "It’s common for car accident victims to be in or fall into shock from the accident. Shock can be life-threatening if not treated, so if you notice the most common symptom of shock—pale skin—then treat the person for it.",
            "Chances are that the accident victim is scared and possibly hurt. Talking to and giving the victim encouraging words can help calm the person down until emergency services arrive.",
            "Once emergency services arrive, let the personnel take over the person’s care. These individuals are better trained to handle car accidents and any injuries."
    };

    public CarAccidentSlider(CarAccidentActivity context) { this.context = context; }

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
        ConstraintLayout layoutslide =  view.findViewById(R.id.sliderLayout);
        ImageView imgslide =   view.findViewById(R.id.imageView_Slider);
        TextView txttitle=  view.findViewById(R.id.textView_TitleSlider);
        TextView description =  view.findViewById(R.id.textView_DescriptionSlider);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(images_Slider[position]);
        txttitle.setText(title_Slider[position]);
        description.setText(description_Slider[position]);
        container.addView(view);
        return view;
    }

    public int[]  lst_backgroundcolor = {
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212),
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212),
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212),
            Color.rgb(55,55,55)
    };

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout)object);
    }

}

