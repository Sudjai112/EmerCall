package namsudjai.snur.ac.th.emercall.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import namsudjai.snur.ac.th.emercall.R;

/**
 * Created by Admin on 20/2/2561.
 */

public class MainFragment extends Fragment{

    //  Explicit
    private String tag = "MyTagV1";



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //        For Station 1
        ImageView station1ImageView = getView().findViewById(R.id.imageViewStation1);
        station1ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d(tag, "You click Image Station1");
                callStation("1111");

            }
        });

        TextView station1TextView = getView().findViewById(R.id.textViewStation1);
        station1TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(tag, "Click Text" + getString(R.string.station1));
                callStation("1111");
            }
        });

        //        For Station 2
        ImageView staion2ImageView = getView().findViewById(R.id.imageViewStation2);
        staion2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callStation("2222");
            }
        });
        TextView station2TextView = getView().findViewById(R.id.textViewStation2);
        station2TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callStation("2222");

            }
        });


        //        For Station 3
        ImageView staion3ImageView = getView().findViewById(R.id.imageViewStation2);
        staion3ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callStation("3333");
            }
        });
        TextView station3TextView = getView().findViewById(R.id.textViewStation3);
        station3TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callStation("3333");

            }
        });


        //        For Station 4
        ImageView staion4ImageView = getView().findViewById(R.id.imageViewStation4);
        staion2ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callStation("4444");
            }
        });
        TextView station4TextView = getView().findViewById(R.id.textViewStation4);
        station2TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callStation("4444");

            }
        });


    }   //Main Method

    public void callStation(String numberCall) {

        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:=" + numberCall));
        startActivity(intent);

    }   //  callStation


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_police, container, false);
        return view;
    }
}   // Main Class
