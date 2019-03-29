package com.abhishek.planetlist.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.abhishek.planetlist.R;
import com.abhishek.planetlist.Data.planet;
import com.abhishek.planetlist.Picasso.PicassoClient;

import java.util.ArrayList;

public class customAdapter extends BaseAdapter {
    //@Override

    Context c;
    ArrayList<planet>planets;
LayoutInflater inflater;
    public customAdapter(Context c, ArrayList<planet> planets) {
        this.c = c;
        this.planets = planets;
    }

    public int getCount() {
        return planets.size();
    }

    @Override
    public Object getItem(int position) {
        return planets.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(inflater==null){
            inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }
if(view==null){
            view=inflater.inflate(R.layout.rowitem,parent,false);

}
//Bind Data
MyHolder holder=new MyHolder(view);
holder.nameTxt.setText(planets.get(position).getName());
holder.distance.setText(planets.get(position).getDistance());
        PicassoClient.downloadImage(c,planets.get(position).getUrl(),holder.img);
return view;
    }
}
