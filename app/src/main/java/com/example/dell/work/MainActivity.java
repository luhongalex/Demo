package com.example.dell.work;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dell.work.dao.DaoMaster;
import com.example.dell.work.dao.DaoSession;
import com.example.dell.work.dao.UserDao;

public class MainActivity extends AppCompatActivity {

    @butterknife.BindView(R.id.mPhoneEdit)
    android.widget.EditText mPhoneEdit;
    @butterknife.BindView(R.id.mPassEdit)
    android.widget.EditText mPassEdit;
    @butterknife.BindView(R.id.mForgetPass)
    android.widget.Button mForgetPass;
    @butterknife.BindView(R.id.mLogin)
     android.widget.Button mLogin;
    private UserDao userDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butterknife.ButterKnife.bind(this);
        DaoSession daoSession = DaoMaster.newDevSession(this, UserDao.TABLENAME);
        userDao = daoSession.getUserDao();
        initView();
    }

    private void initView() {

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = mPassEdit.getText().toString();
                String s1 = mPhoneEdit.getText().toString();
                if (s1.matches("[1][3,4,5,7,8][0-9]{9}")&&s.matches("[0-9]{6,16}")){
                    Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    User user = new User(null, s1, s);
                    userDao.insert(user);
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
