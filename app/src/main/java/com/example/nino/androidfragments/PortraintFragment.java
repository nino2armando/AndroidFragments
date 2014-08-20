package com.example.nino.androidfragments;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nino on 19/08/14.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class PortraintFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_portrait, container, false);
    }
}
