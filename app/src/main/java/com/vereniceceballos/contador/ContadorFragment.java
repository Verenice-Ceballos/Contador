package com.vereniceceballos.contador;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ContadorFragment extends Fragment {
    private final String CONTEO="com.vereniceceballos.contador.conteo";
    private TextView mConteoTextView;
    private Button mContarButton;
    private Button mReiniciarButton;
    private int mConteo;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_contador,container,false);

        mConteoTextView=view.findViewById(R.id.conteo_text_view);
        mContarButton = view.findViewById(R.id.contar_button);
        mReiniciarButton = view.findViewById(R.id.reiniciar_button);

        if(savedInstanceState !=null){
            mConteo = savedInstanceState.getInt(CONTEO);
        }
        else{
            mConteo=0;
        }
        //mConteoTextView.setText(Interger.toString(mConteo));
        mConteoTextView.setText(String.format("%d",mConteo));

        mContarButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mConteo++;
                mConteoTextView.setText(Integer.toString("%d",mConteo));
            }
        });

        mReiniciarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mConteo=0;
                mConteoTextView.setText(Integer.toString("%d",mConteo));
            }
        });
        return view;
    }

}
