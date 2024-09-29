package com.androidcodefinder.prac02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StaffAdapter extends RecyclerView.Adapter<StaffAdapter.StaffViewHolder> {

    private List<Staff> staffList;

    public StaffAdapter(List<Staff> staffList) {
        this.staffList = staffList;
    }

    @NonNull
    @Override
    public StaffViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_staff, parent, false);
        return new StaffViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StaffViewHolder holder, int position) {
        Staff staff = staffList.get(position);
        holder.bind(staff);

    }

    @Override
    public int getItemCount() {
        return staffList.size();
    }

    static class StaffViewHolder extends RecyclerView.ViewHolder {
        TextView txtId, txtName,txtBirthDay,txtSalary;

        public StaffViewHolder(@NonNull View itemView) {
            super(itemView);
            txtId = itemView.findViewById(R.id.txtId);
            txtName = itemView.findViewById(R.id.txtName);
            txtBirthDay = itemView.findViewById(R.id.txtBirthDay);
            txtSalary = itemView.findViewById(R.id.txtSalary);

        }

        public void bind(Staff staff) {
            txtId.setText(staff.getId());
            txtName.setText(staff.getName());
            txtBirthDay.setText(staff.getBirthDate());
            txtSalary.setText(""+staff.getSalary());
        }
    }
}
