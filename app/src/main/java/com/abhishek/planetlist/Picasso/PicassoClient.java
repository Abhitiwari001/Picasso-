package com.abhishek.planetlist.Picasso;

import android.content.Context;
import android.widget.ImageView;

import com.abhishek.planetlist.R;
import com.squareup.picasso.Picasso;

public class PicassoClient {
public static void downloadImage(Context c, String url, ImageView img){

    if(url!=null && url.length()>0){
        Picasso.with(c).load(url).placeholder(R.drawable.tom).into(img);

    }else{
        Picasso.with(c).load(R.drawable.tom).into(img);
    }

}


}
