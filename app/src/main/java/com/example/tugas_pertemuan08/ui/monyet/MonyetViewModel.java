package com.example.tugas_pertemuan08.ui.monyet;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MonyetViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MonyetViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Monyet");
    }

    public LiveData<String> getText() {
        return mText;
    }
}