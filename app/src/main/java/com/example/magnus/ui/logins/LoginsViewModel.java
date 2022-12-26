package com.example.magnus.ui.logins;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginsViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public LoginsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Logins fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}