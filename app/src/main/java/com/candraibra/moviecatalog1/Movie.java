package com.candraibra.moviecatalog1;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
     private int poster;
     private String judul;
     private String sinopsis;

     public int getPoster() {
         return poster;
     }

     public void setPoster(int poster) {
         this.poster = poster;
     }

     public String getJudul() {
         return judul;
     }

     public void setJudul(String judul) {
         this.judul = judul;
     }

     public String getSinopsis() {
         return sinopsis;
     }

     public void setSinopsis(String sinopsis) {
         this.sinopsis = sinopsis;
     }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.poster);
        dest.writeString(this.judul);
        dest.writeString(this.sinopsis);
    }

    public Movie() {
    }

    protected Movie(Parcel in) {
        this.poster = in.readInt();
        this.judul = in.readString();
        this.sinopsis = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
