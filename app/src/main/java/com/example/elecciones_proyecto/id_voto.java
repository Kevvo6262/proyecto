package com.example.elecciones_proyecto;

import java.io.Serializable;

public class id_voto implements Serializable {
    int voto;
    String cip;
    //String id;

    public id_voto(int voto, String cip) {
        this.voto = voto;
        this.cip = cip;
       // this.id = id;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }


    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }

    /*
    public String getId() {
        return id;
    }

    public void setId(String id) {this.id = id;}    */
}