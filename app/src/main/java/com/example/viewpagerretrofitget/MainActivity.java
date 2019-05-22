package com.example.viewpagerretrofitget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.viewpagerretrofitget.API.APIClient;
import com.example.viewpagerretrofitget.Adapter.ViewPagerAdapter;
import com.example.viewpagerretrofitget.Bean.StatusBean;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.util.List;
import java.util.Stack;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ViewPager iv_imageview;
    ViewPagerAdapter ViewPagerAdapter;
    Button button;

    private static final String TAG = "MainActivity";


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_imageview = findViewById(R.id.iv_imageview);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowView();
            }
        });


    }

    private void ShowView() {

        Call<StatusBean> listCall = APIClient
                .getapiClient()
                .getapiInterface()
                .getresponce();

        listCall.enqueue(new Callback<StatusBean>() {
            @Override
            public void onResponse(Call<StatusBean> call, Response<StatusBean> response) {

                Log.d(TAG, "onResponse: " + response.body().getStatusCode());
                StatusBean statusBeanss = response.body();

                ViewPagerAdapter = new ViewPagerAdapter(MainActivity.this, statusBeanss.getData());
                iv_imageview.setAdapter(ViewPagerAdapter);

                Toast.makeText(MainActivity.this, response.message(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<StatusBean> call, Throwable t) {
                Log.d("Erroe", t.getMessage());
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }


}
