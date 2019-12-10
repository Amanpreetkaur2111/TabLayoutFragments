package com.example.fragmenttab;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView camera,chat,status,call;
    ViewPager viewPager;
    PagerViewAdapter pagerViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        camera = (TextView)findViewById(R.id.camera);
        chat = (TextView)findViewById(R.id.chat);
        status =(TextView)findViewById(R.id.status);
        call =(TextView)findViewById(R.id.call);
        viewPager = (ViewPager) findViewById(R.id.fragment_container);

        pagerViewAdapter = new PagerViewAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerViewAdapter);

        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(0);
            }
        });

        chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(1);
            }
        });

        status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(2);
            }
        });

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(3);
            }
        });


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                onChangeTab(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void onChangeTab(int position) {
        if (position == 0){
            camera.setTextSize(25);


            chat.setTextSize(20);


            status.setTextSize(20);


            call.setTextSize(20);


        }

        if (position == 1){
            camera.setTextSize(20);


            chat.setTextSize(25);


            status.setTextSize(20);


            call.setTextSize(20);


        }

        if (position == 2){
            camera.setTextSize(20);


            chat.setTextSize(20);


            status.setTextSize(25);


            call.setTextSize(20);


        }

        if (position == 3){
            camera.setTextSize(20);


            chat.setTextSize(20);


            status.setTextSize(20);


            call.setTextSize(25);


        }


    }
}
