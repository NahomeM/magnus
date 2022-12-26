package com.example.magnus.ui.transportinfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.magnus.databinding.FragmentTransportinfoBinding;
import com.example.magnus.databinding.FragmentTransportinfoBinding;

public class TransportinfoFragment extends Fragment {

    private FragmentTransportinfoBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TransportinfoViewModel transportinfoViewModel =
                new ViewModelProvider(this).get(TransportinfoViewModel.class);

        binding = FragmentTransportinfoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textTransportinfo;
        transportinfoViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}