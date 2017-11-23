package com.example.ip.myapplication_3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by Sun_Sun on 2017-11-23.
 */

public class page_11 extends android.support.v4.app.Fragment {
    private Activity activity;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof Activity) {
            activity = (Activity) context;
        }

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.page, container, false);

        LinearLayout background = (LinearLayout) linearLayout.findViewById(R.id.background);

        Intent intent = new Intent(activity, Main2Activity.class);
        activity.startActivity(intent);

        activity.finish();

        return linearLayout;
    }
}