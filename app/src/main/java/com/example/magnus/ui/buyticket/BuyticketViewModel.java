package com.example.magnus.ui.buyticket;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BuyticketViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BuyticketViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is buyticket fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}