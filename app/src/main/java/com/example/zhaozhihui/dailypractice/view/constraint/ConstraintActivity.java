package com.example.zhaozhihui.dailypractice.view.constraint;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.zhaozhihui.dailypractice.R;

public class ConstraintActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent intent = new Intent(context, ConstraintActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
    }
}
