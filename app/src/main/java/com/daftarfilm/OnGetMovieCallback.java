package com.daftarfilm;

public interface OnGetMovieCallback {

    void onSuccess(Movie movie);

    void onError();
}
