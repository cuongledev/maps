package com.cuongle.mapsapplicationdemo;

import com.google.android.gms.maps.model.LatLng;

public class Map {

    private String title;
    private LatLng toado;

    public Map(String title, LatLng toado) {
        this.title = title;
        this.toado = toado;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LatLng getToado() {
        return toado;
    }

    public void setToado(LatLng toado) {
        this.toado = toado;
    }
}
