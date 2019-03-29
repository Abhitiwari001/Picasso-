package com.abhishek.planetlist.list;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.abhishek.planetlist.R;

public class MyHolder {
    //to hold the views that you want to display
    TextView nameTxt,distance;
    ImageView img;

    public MyHolder(View v) {
    nameTxt=v.findViewById(R.id.nametxt);
    distance=v.findViewById(R.id.distance);
    img=v.findViewById(R.id.img);

    }
}
