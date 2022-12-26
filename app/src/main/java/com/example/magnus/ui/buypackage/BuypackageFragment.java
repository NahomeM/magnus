package com.example.magnus.ui.buypackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.magnus.databinding.FragmentBuypackageBinding;
import com.example.magnus.databinding.FragmentBuypackageBinding;

public class BuypackageFragment extends Fragment {

    private FragmentBuypackageBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BuypackageViewModel buypackageViewModel =
                new ViewModelProvider(this).get(BuypackageViewModel.class);

        binding = FragmentBuypackageBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBuypackage;
        buypackageViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}