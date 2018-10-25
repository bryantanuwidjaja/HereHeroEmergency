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

public class CPRSlider extends PagerAdapter{
    Context context;
    LayoutInflater inflater;

    public int[] images_Slider = {
            R.drawable.cpr1,
            R.drawable.cpr2,
            R.drawable.cpr3,
            R.drawable.cpr4,
            R.drawable.cpr5,
            R.drawable.cpr6,
            R.drawable.cpr7,
            R.drawable.cpr8,
            R.drawable.cpr9,
            R.drawable.cpr10,
            R.drawable.cpr11,
            R.drawable.cpr12,
            R.drawable.cpr13,
            R.drawable.cpr14,
            R.drawable.cpr15


    };

    public String [] title_Slider ={
            "Check the scene for immediate danger.",
            "Assess the victim's consciousness.",
            "Send for help.",
            "Check for breathing.",
            "Place the victim on his or her back.",
            "Place the heel of one hand on the victim's breastbone, 2 finger-widths above the meeting area of the lower ribs, exactly between the normal position of the nipples.",
            "Place your second hand on top of the first hand, palms-down, interlock the fingers of the second hand between the first.",
            "Position your body directly over your hands so that your arms are straight and somewhat rigid.",
            "Perform 30 chest compressions.",
            "Give 2 rescue breaths.",
            "Continuing the Process Until Help Arrives\n" +
                    "Minimize pauses in chest compression that occur when changing providers or preparing for a shock.",
            "Make sure the airway is open.",
            "Repeat the cycle of 30 chest compressions followed by 2 rescue breaths.",
            "Position the patient only after the victim has been stabilized and is breathing on his/her own.",
            "Flex and raise one knee joint, push the victim`s hand that's on the opposite side from the raised knee, partially under the hip with the straight leg.",
            "Use the recovery position to help the victim to breathe more easily."
    };

    public String[] description_Slider = {
            "Make sure you're not putting yourself in harm's way by administering CPR to someone unconscious. Is there a fire? Is the person lying on a roadway? Do whatever is necessary to move yourself and the other person to safety.",
            "Gently tap his or her shoulder and ask \"Are you OK?\" in a loud, clear voice. If he or she responds agreement \"Yeah\" or such, CPR is not required. Instead, undertake basic first aid and take measures to prevent or treat shock[1], and assess whether you need to contact emergency services.",
            "The more people available for this step, the better. However, it can be done alone. Send someone to call for emergency medical services (EMS). If you’re alone, call for emergency services before starting.",
            "And, make sure that the airway is not blocked. If the mouth is closed, tilt their head back so it opens up. Remove any visible obstacle that is in your reach but never push your fingers too far inside. Put your ear close to the victim's nose and mouth, and listen for slight breathing. Watch for rising and falling of the chest. If the victim is coughing or breathing normally, do not perform CPR.",
            "Make sure he or she is lying as flat as possible - this is to prevent injury while you're doing chest compressions.Tilt their head back by using your palm against their forehead and a push against their chin.",
            "",
            "",
            "Don't flex the arms to push, but nearly lock your elbows, and use your upper body strength to push.",
            "Press down with both hands directly over the breastbone to perform a compression, which helps the heart beat. Chest compressions are more critical for correcting abnormal heart rhythms (ventricular fibrillation or pulseless ventricular tachycardia, heart rapidly quivering instead of beating).\n"+
                    "You should press down by about 2 inches (5 cm).\n" +
                    "Do the compressions in a relatively fast rhythm. Some agencies recommend doing compressions to the beat of the chorus of \"Stayin' Alive,\" a 1970s disco hit.",
            "If you are trained in CPR and totally confident, give 2 rescue breaths after your 30 chest compressions. Tilt their head and lift their chin. Pinch their nostrils shut and administer 1-second breaths mouth-to-mouth.",
            "Attempt to limit interruptions to less than 10 seconds.",
            "Place your hand on the victim's forehead and two fingers on their chin and tilt the head back to open the airway.",
            "If you're also doing rescue breaths, keep doing a cycle of 30 chest compressions, and then 2 rescue breaths; repeat the 30 compressions and 2 more breaths. Continue CPR until someone takes over for you or emergency personnel arrives.",
            "",
            "Then position the free hand onto the opposite shoulder, and roll the victim onto the side with the straight leg. The raised knee/bent leg is on top and helps stop the body from rolling over onto the abdomen. The arm with the hand tucked under the edge of the hip is kept from sticking out in the way when rolling the patient onto that side.",
            "This position keeps saliva from accumulating in the back of the mouth or throat, and helps the tongue to hang to the side without it falling/flopping into the back of the mouth and obstructing the airway."

    };

    public CPRSlider(CPRActivity context) { this.context = context; }

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
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212),
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89),
            Color.rgb(1,188,212),
            Color.rgb(55,55,55),
            Color.rgb(239,85,85),
            Color.rgb(110,49,89)
    };

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
