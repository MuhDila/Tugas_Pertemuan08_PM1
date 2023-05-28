package com.example.tugas_pertemuan08.ui.macan;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.tugas_pertemuan08.R;
import com.example.tugas_pertemuan08.databinding.FragmentMacanBinding;
import com.example.tugas_pertemuan08.ui.tukan.HomeFragment;
import com.example.tugas_pertemuan08.ui.tukan.HomeViewModel;
import com.example.tugas_pertemuan08.ui.tukan.TukanDetailActivity;

public class NotificationsFragment extends Fragment {

    private HomeViewModel mViewModel;
    private View view;
    Button pindah;
    TextView textView;
    private FragmentMacanBinding binding;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_macan, container, false);
        pindah = view.findViewById(R.id.button_macan);
        textView = view.findViewById(R.id.text_notifications);
        textView.setText("Macan");

        pindah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MacanDetailActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        // TODO: Use the ViewModel
    }
}