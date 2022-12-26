package com.example.magnus.ui.transportinfo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TransportinfoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public TransportinfoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Transportinfo fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}