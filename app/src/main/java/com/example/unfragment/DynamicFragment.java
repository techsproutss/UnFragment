package com.example.unfragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class DynamicFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dynamic, container, false);

        // Set animated content
        TextView textView = view.findViewById(R.id.dynamicTextView);
        textView.setText("Dynamic Fragment Loaded!");
        Animation bounce = AnimationUtils.loadAnimation(getContext(), R.drawable.bounce);
        textView.startAnimation(bounce);

        return view;
    }
}