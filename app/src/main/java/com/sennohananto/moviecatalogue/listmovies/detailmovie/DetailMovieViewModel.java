package com.sennohananto.moviecatalogue.listmovies.detailmovie;

import androidx.lifecycle.ViewModel;

import com.sennohananto.moviecatalogue.listmovies.pojo.ResultsItem;

public class DetailMovieViewModel extends ViewModel {
    private ResultsItem resultsItem;

    public ResultsItem getResultsItem() {
        return resultsItem;
    }

    public void setResultsItem(ResultsItem resultsItem) {
        this.resultsItem = resultsItem;
    }
}
