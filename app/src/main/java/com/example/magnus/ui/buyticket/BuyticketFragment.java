package com.example.magnus.ui.buyticket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.magnus.databinding.FragmentBuyticketBinding;
import com.example.magnus.databinding.FragmentBuyticketBinding;

public class BuyticketFragment extends Fragment {

    private FragmentBuyticketBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        BuyticketViewModel buyticketViewModel =
                new ViewModelProvider(this).get(BuyticketViewModel.class);

        binding = FragmentBuyticketBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBuyticket;
        buyticketViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}