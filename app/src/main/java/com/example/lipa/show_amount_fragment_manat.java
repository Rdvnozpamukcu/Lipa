package com.example.lipa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class show_amount_fragment_manat extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View v=inflater.inflate(R.layout.show_amount_fragment_manat,container,false);

        TextView t=v.findViewById(R.id.mnt_amout_fragment);
        t.setText(Anasayfa.db_tl);
        return v;
    }
}
