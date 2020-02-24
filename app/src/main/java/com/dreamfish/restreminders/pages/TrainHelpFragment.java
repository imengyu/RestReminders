package com.dreamfish.restreminders.pages;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dreamfish.restreminders.R;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TrainHelpFragment extends Fragment {

    public static Fragment newInstance(){
        TrainHelpFragment fragment = new TrainHelpFragment();
        return fragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_page_trains_help,null);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
