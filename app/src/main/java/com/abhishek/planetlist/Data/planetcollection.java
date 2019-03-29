package com.abhishek.planetlist.Data;

import java.util.ArrayList;

public class planetcollection {
    public static ArrayList<planet>getPlanets(){
        ArrayList<planet>planets=new ArrayList<>();
        planet p=new planet();
        p.setName("Sun");
        p.setUrl("https://pbs.twimg.com/profile_images/641353910561566720/VSxsyxs7_400x400.jpg");
        planets.add(p);

        p=new planet();
        p.setName("Mercury");
        p.setUrl("https://3c1703fe8d.site.internapcdn.net/newman/csz/news/800/2015/whatsimporta.jpg");
        p.setDistance("36 Million miles away ");
        planets.add(p);


        p=new planet();
        p.setName("Venus");
        p.setUrl("http://planetary.s3.amazonaws.com/assets/images/2-venus/20180113_uvi_20160517_201715_365_l2b_v10_PseudoRGB.jpg");
        p.setDistance("67.2 Million miles away ");
        planets.add(p);

        p=new planet();
        p.setName("Earth");
        p.setUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQI4EDeWRLnRxGacCcGCFpwdJ_zLW7fcpJBeBIq4uMAFun1hr5Q5Q");
        p.setDistance("93 Million miles away ");
        planets.add(p);

        p=new planet();
        p.setName("Mars");
        p.setUrl("https://s.hswstatic.com/gif/mars-a1.jpg");
        p.setDistance("141.6 Million miles away ");
        planets.add(p);

        p=new planet();
        p.setName("Jupiter");
        p.setUrl("http://cdn.sci-news.com/images/enlarge3/image_4461e-Jupiter.jpg");
        p.setDistance("483.8 Million miles away ");
        planets.add(p);

        p=new planet();
        p.setName("Saturn");
        p.setUrl("http://planetary.s3.amazonaws.com/assets/images/6-saturn/2012/20120909_jbny02sqq_drzcolormarch12_f840.jpg");
        p.setDistance("886.7 Million miles away ");
        planets.add(p);

        p=new planet();
        p.setName("Neptune");
        p.setDistance("45km");
        p.setUrl("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQBqLXnk4GQjNvSKTBdkCijN672aZ1-xT_kH0qfd5ww2tfixabI");
        p.setDistance("2794 Million miles away ");
        planets.add(p);

        return planets;


    }



}
