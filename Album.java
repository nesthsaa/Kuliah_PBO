/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1;

/**
 *
 * @author Asus Gk
 */
public class Album {
    private String namaAlbum;
    private String versi;
    private String artis;

    public Album(String namaAlbum, String versi, String artis) {
        this.namaAlbum = namaAlbum;
        this.versi = versi;
        this.artis = artis;
    }

    public String getNamaAlbum() {
        return namaAlbum;
    }

    public String getVersi() {
        return versi;
    }

    public String getArtis() {
        return artis;
    }
}
