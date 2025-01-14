package com.example.myapplication;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityAdminDashboardBinding;

public class Admin_Dashboard extends AppCompatActivity {
    ActivityAdminDashboardBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding=ActivityAdminDashboardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.additem.setOnClickListener(v->AddItemPopup());


    }
   public void AddItemPopup(){
       Dialog dialog=new Dialog(this);
       View popup= LayoutInflater.from(this).inflate(R.layout.additem,null);
       dialog.setContentView(popup);
      dialog.getWindow().setLayout((int) (getResources().getDisplayMetrics().widthPixels * 0.9),
              (int)( getResources().getDisplayMetrics().heightPixels * 0.9 )
      );
      if (dialog.getWindow() != null){
          dialog.getWindow().setBackgroundDrawableResource(android.R.color.white);
      }
      dialog.setCanceledOnTouchOutside(true);
       dialog.show();


    }
}