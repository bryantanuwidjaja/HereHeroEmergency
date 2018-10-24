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

public class TsunamiSlider extends PagerAdapter{

    Context context;
    LayoutInflater inflater;

    public int[] images_Slider = {
            R.drawable.tsunami1,
            R.drawable.tsunami2,
            R.drawable.tsunami3,
            R.drawable.tsunami4,
            R.drawable.tsunami5
    };

    public String [] title_Slider ={
            "Abandon belongings.",
            "Move inland, and to high ground.",
            "Climb high.",
            "Climb a sturdy tree.",
            "React quickly if you are caught up in the water."

    };

    public String[] description_Slider = {
            "If a tsunami hits, save lives, not possessions. Trying to retrieve things and belongings may hamper your escape by causing you to lose valuable time. Grab your safety pack, something to keep you warm, your family and leave immediately. Tsunami survivors act quickly, and usually, don't bother with trying to save possessions.",
            "The first thing you should try to do, if possible, is to move away from the coast, lagoons or other bodies of water, towards higher ground and even into hills or mountains. Move until you are either 2 miles (3,200 m) inland or 100 feet (30 m) above sea level.",
            "If you cannot head inland because you are trapped, head up. Although not ideal because the structure itself could collapse, if this is your only option, choose a high, sturdy and solid building and climb up it. Go as high as you possibly can, even onto the roof.",
            "As a very last resort, if you find yourself trapped and unable to move inland or climb a high building, find a strong and tall tree and climb up it as high as you can. There is a risk of trees being dragged under by the tsunami, however, so this really is a measure to be used only if all other alternatives are impossible. The stronger the tree, the higher it stands, and the sturdier its branches for resting on (you may be there for hours), the better your chances are of surviving.",
            " If you did not manage to evacuate but find yourself caught up in the tsunami for one reason or another, there are things that you can do to try to survive:\n" +
                    "Grab onto something that floats. Use a floating object as a raft to keep yourself above the water. Items that float such as tree trunks, doors, fishing equipment etc. may be in the water with you."
    };

    public TsunamiSlider(TsunamiActivity context) { this.context = context; }

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
            Color.rgb(55,55,55)
    };

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout)object);
    }

}

