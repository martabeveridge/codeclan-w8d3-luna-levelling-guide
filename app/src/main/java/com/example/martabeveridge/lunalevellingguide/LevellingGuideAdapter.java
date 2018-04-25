package com.example.martabeveridge.lunalevellingguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class LevellingGuideAdapter extends ArrayAdapter<Level>{

    public LevellingGuideAdapter(Context context, ArrayList<Level> levels){
        super (context, 0, levels);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.levelling_guide_item, parent, false);
        }

        Level currentLevel = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.rankingTextViewId);
        ranking.setText(currentLevel.getRanking().toString());

        TextView nameTextView = listItemView.findViewById(R.id.nameTextViewId);
        nameTextView.setText(currentLevel.getName().toString());

        TextView levelTextView = listItemView.findViewById(R.id.levelTextViewId);
        levelTextView.setText(currentLevel.getLevel().toString());

        return listItemView;
    }

}

//    public TopMoviesAdapter(Context context, ArrayList<Movie> movies){
//        super(context, 0, movies);
//    }
//
//    @Override
//    public View getView(int position, View listItemView, ViewGroup parent){
//        if (listItemView == null){
//            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.movie_list_item, parent, false);
//        }
//
//        Movie currentMovie = getItem(position);
//
//        TextView ranking = listItemView.findViewById(R.id.rankingTextViewId);
//        ranking.setText(currentMovie.getRanking().toString());
//
//        TextView titleTextView = listItemView.findViewById(R.id.titleTextViewId);
//        titleTextView.setText(currentMovie.getTitle());
//
//        TextView yearTextView = listItemView.findViewById(R.id.yearTextViewId);
//        yearTextView.setText(currentMovie.getYear().toString());
//
//        listItemView.setTag(currentMovie);
//
//        return listItemView;
//
//    }
