package com.example.bryan.hereheroemergency;

import android.content.Context;
import android.graphics.Color;
import android.graphics.pdf.PdfDocument;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class HouseFireSlider extends PagerAdapter{

    Context context;
    LayoutInflater inflater;

    public int[] images_Slider = {
            R.drawable.fire1,
            R.drawable.fire2,
            R.drawable.fire3,
            R.drawable.fire4,
            R.drawable.fire5,
            R.drawable.fire6
    };

    public String [] title_Slider ={
            "React as soon as you hear your smoke alarm go off.",
            "Safely exit through doors.",
            "Protect yourself from smoke inhalation.",
            "Stop, drop, and roll if your clothes catch fire.",
            "Ward off the smoke if you can't get out.",
            "Call for help from a second story window.",
            "Escape from a second story window if you can."


    };

    public String[] description_Slider = {
            "Smoke from a fire will put you in deeper sleep. If you hear your smoke detector or alarm going off and see fire, try to exit your home as safely as possible. Do not try to grab your phone, valuables, or your other important possessions. Your only concern is to get out of there as fast as possible. Nothing else is as important as this. You should be getting yourself and your family members out safely. If it's nighttime, yell loudly to get everyone up. You may only have a few seconds to escape safely, so ignore all secondary concerns that have nothing to do with staying alive. If you have escaped from a home fire, remember once you get out stay out and dial Triple Zero (000) or 911, depending on where you live.",
            "If you see smoke under a door, then you cannot go out that door, because smoke is toxic and fire is sure to follow. If you don't see smoke, put the back of your hand up to the door to make sure it doesn't feel hot. If the door feels cool, then open it slowly and pass through it. If your door is open and there is a fire preventing you from exiting the room, close the door to protect yourself from the fire.\n" +
                    "If the door is hot or there's smoke under it and there are no other doors to pass through, you will have to try to escape through a window. Be careful!",
            "Get low to the floor and crouch or crawl on your hands and knees to evade the smoke. Though you may think that running is faster, encourage your family members to crouch or crawl, too. Smoke inhalation causes people to become disoriented and can even render a person unconscious. Knowing this, you should cover your nose and mouth if you have to walk by or through a heavily smoke-filled room.",
            "If your clothes catch fire, immediately stop what you're doing, drop flat to the ground, and roll around until you put the fire out. Rolling around will smother the fire quickly. Cover your face with your hands as you're rolling to protect yourself.",
            "If you can't escape your home and are waiting for help, don't panic. You may not be able to get out, but you can still take some measures to ward off the smoke and stay safe. Close your door and cover all vents and cracks around it with cloth or tape to keep the smoke out for as long as you can. Whatever you do, don't panic. You can always reclaim some measure of control, even if you feel trapped.",
            "If you are trapped in your second story room in the event of a fire, do what you can to get yourself to an area where people will be able to hear you or see you. You can take a sheet or something else - white preferably - and hang it out the window to signify that you need help when the first responders get there. Be sure to close the window -- leaving it open draws the fire towards the fresh oxygen. Put something down to prevent the smoke from coming underneath the door, such as a towel or anything that you can find.",
            "If you have a two-story house, you should have an escape ladder that you can throw out in case a fire or other problem happens. If you really must get out of the window, look for a ledge and if there is a ledge, you can get yourself out onto the ledge facing the building. Always face the building structure when exiting a window on an upper floor. From a second story, if you have to hang, you might get closer to the ground and you could potentially let go and fall to safety."
    };

    public HouseFireSlider(HouseFireActivity context) { this.context = context; }

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
            Color.rgb(239,85,85)
    };

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout)object);
    }

}
