package com.example.examdaniforteza;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import android.content.Context;

import android.widget.EditText;

public class Fragment1 extends Fragment {
    private Fragment1Listener listener;
    private EditText editText;
    private Button buttonOk;
    public String textoFragment2;
    public interface Fragment1Listener {
        void onInputASent(CharSequence input);
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1, container, false);

        editText = v.findViewById(R.id.edit_text);
        buttonOk = v.findViewById(R.id.change);

        buttonOk.setOnClickListener(v1 ->  {
                String text = null;
                text = String.valueOf(editText.getText());
                textoFragment2 = text;
                System.out.println(textoFragment2);

        });
        return v;
    }
    public void updateEditText(CharSequence newText) {
        editText.setText(newText);
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof Fragment1Listener) {
            listener = (Fragment1Listener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement Fragment1Listener");
        }
    }


}

