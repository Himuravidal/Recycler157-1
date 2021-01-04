package com.example.recycler157_1;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.recycler157_1.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding mBinding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        mBinding = FragmentFirstBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Instanciamos el adapter y le pasamos el listado de datos
        WordsAdapter mAdapter = new WordsAdapter(wordList());
        //Le pasamos el adapter a nuestro Recycler View
        mBinding.rv.setAdapter(mAdapter);
        // le indicamos al RecyclerView como mostrar los elementos, podria ser grid, o staggered
        mBinding.rv.setLayoutManager(new LinearLayoutManager(getContext()));

    }

    private List<String> wordList(){
        List<String> listado = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listado.add("Palabra "+ i);
        }
        return listado;
    }

}