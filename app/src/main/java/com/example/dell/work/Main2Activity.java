package com.example.dell.work;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.mTeach)
    ImageView mTeach;
    @BindView(R.id.mInfo)
    ImageView mInfo;
    @BindView(R.id.mFrame)
    FrameLayout mFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.mTeach, R.id.mInfo})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.mTeach:
                initStart();

                break;
            case R.id.mInfo:
                initStart();
                break;
        }
    }
    private void initStart(){
        mTeach.setImageDrawable(getResources().getDrawable(R.mipmap.tab_teach_gray));
        mInfo.setImageDrawable(getResources().getDrawable(R.mipmap.tab_info_gray));
    }
}
