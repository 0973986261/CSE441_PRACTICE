package com.androidcodefinder.prac02;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.util.List;
import java.util.ArrayList;

public class StaffViewModel extends ViewModel {
    private MutableLiveData<List<Staff>> staffList = new MutableLiveData<>();

    public LiveData<List<Staff>> getStaffList() {
        return staffList;
    }

    public void addStaff(Staff staff) {
        List<Staff> currentList = staffList.getValue();
        if (currentList == null) {
            currentList = new ArrayList<>();
        }
        currentList.add(staff);
        staffList.setValue(currentList);
    }
}
