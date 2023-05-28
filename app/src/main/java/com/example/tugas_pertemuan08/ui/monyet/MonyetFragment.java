package com.example.tugas_pertemuan08.ui.monyet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tugas_pertemuan08.databinding.FragmentMonyetBinding;

public class MonyetFragment extends Fragment {

    private FragmentMonyetBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MonyetViewModel monyetViewModel =
                new ViewModelProvider(this).get(MonyetViewModel.class);

        binding = FragmentMonyetBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMonyet;
        monyetViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}