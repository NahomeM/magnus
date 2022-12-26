package com.example.magnus.ui.logins;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.magnus.databinding.FragmentLoginsBinding;
import com.example.magnus.databinding.FragmentLoginsBinding;

public class LoginsFragment extends Fragment {

    private FragmentLoginsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LoginsViewModel loginsViewModel =
                new ViewModelProvider(this).get(LoginsViewModel.class);

        binding = FragmentLoginsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textLogins;
        loginsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}