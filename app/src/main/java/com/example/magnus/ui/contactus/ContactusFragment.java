package com.example.magnus.ui.contactus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.magnus.databinding.FragmentContactusBinding;
import com.example.magnus.databinding.FragmentHomeBinding;

public class ContactusFragment extends Fragment {

    private FragmentContactusBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ContactusViewModel contactusViewModel =
                new ViewModelProvider(this).get(ContactusViewModel.class);

        binding = FragmentContactusBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textContactus;
        contactusViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}