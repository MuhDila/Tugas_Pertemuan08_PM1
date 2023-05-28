package com.example.tugas_pertemuan08.ui.jerapah;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JerapahViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public JerapahViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Jerapah");
    }

    public LiveData<String> getText() {
        return mText;
    }
}