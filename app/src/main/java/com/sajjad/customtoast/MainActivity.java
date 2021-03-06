package com.sajjad.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowCustomToast(final View view) {
        Toast toast = new Toast(this);
        View customView = LayoutInflater.from(this).inflate(R.layout.custom_toast, null);
        toast.setView(customView);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();

    }
}