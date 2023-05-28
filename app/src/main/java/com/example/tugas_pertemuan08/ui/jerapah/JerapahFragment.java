package com.example.tugas_pertemuan08.ui.jerapah;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tugas_pertemuan08.databinding.FragmentJerapahBinding;

public class JerapahFragment extends Fragment {

    private FragmentJerapahBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        JerapahViewModel jerapahViewModel =
                new ViewModelProvider(this).get(JerapahViewModel.class);

        binding = FragmentJerapahBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textJerapah;
        jerapahViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}