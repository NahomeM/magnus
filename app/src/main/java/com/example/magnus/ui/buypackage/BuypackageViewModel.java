package com.example.magnus.ui.buypackage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BuypackageViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public BuypackageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is buypackage fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}