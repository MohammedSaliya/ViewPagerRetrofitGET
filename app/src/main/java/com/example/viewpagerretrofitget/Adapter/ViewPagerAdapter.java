package com.example.viewpagerretrofitget.Adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.viewpagerretrofitget.Bean.DataBean;
import com.example.viewpagerretrofitget.MainActivity;
import com.example.viewpagerretrofitget.R;
import com.squareup.picasso.Picasso;

import java.util.List;


public class ViewPagerAdapter extends PagerAdapter {


    private Context context;
    private List<DataBean> statusBean;
    MainActivity mainActivity;

    public ViewPagerAdapter(MainActivity mainActivity, List<DataBean> statusBean) {
        this.statusBean = statusBean;
        this.mainActivity = mainActivity;
    }

    @Override
    public int getCount() {
        return statusBean.size();
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(container.getContext()).inflate(R.layout.view_layout, container, false);
        this.context = container.getContext();


        ImageView imageView = view.findViewById(R.id.imageview);
        Picasso.with(context).load(statusBean.get(position).getImageURL()).into(imageView);

        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view, 0);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }

}
