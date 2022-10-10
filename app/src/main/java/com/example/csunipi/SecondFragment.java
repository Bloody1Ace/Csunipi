package com.example.csunipi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.csunipi.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.nea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.cs.unipi.gr/index.php?option=com_k2&view=itemlist&layout=category&task=category&id=16&Itemid=673&lang=el"));
                startActivity(viewIntent);
            }
        });


        binding.pms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.cs.unipi.gr/index.php?option=com_k2&view=item&layout=item&id=626&Itemid=815&lang=el"));
                startActivity(viewIntent);
            }

        });

        binding.psifiakos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.cs.unipi.gr/index.php?option=com_k2&view=item&layout=item&id=576&Itemid=626&lang=el"));
                startActivity(viewIntent);
            }

        });

        binding.psifiakos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.cs.unipi.gr/index.php?option=com_k2&view=item&layout=item&id=576&Itemid=626&lang=el"));
                startActivity(viewIntent);
            }

        });

        binding.kuvernoasfalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.cs.unipi.gr/index.php?option=com_k2&view=item&layout=item&id=609&Itemid=813&lang=el"));
                startActivity(viewIntent);
            }

        });

        binding.plhroforikh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.cs.unipi.gr/index.php?option=com_k2&view=item&layout=item&id=61&Itemid=627&lang=el"));
                startActivity(viewIntent);
            }

        });

        binding.proggramma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.cs.unipi.gr/index.php?option=com_k2&view=item&layout=item&id=59&Itemid=494&lang=el"));
                startActivity(viewIntent);
            }

        });

        binding.grammateia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://sso.unipi.gr/login?service=https%3A%2F%2Fsis-portal.unipi.gr%2Flogin%2Fcas"));
                startActivity(viewIntent);
            }

        });



    }




    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

};