package com.androidcodefinder.prac02;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StaffViewHolder extends RecyclerView.ViewHolder {
    private TextView txtId, txtName, txtBirthDay,txtSalary;

    public StaffViewHolder(@NonNull View itemView){
        super(itemView);
    }
}
