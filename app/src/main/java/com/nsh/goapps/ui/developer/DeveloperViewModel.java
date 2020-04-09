package com.nsh.goapps.ui.developer;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DeveloperViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DeveloperViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Developer fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}