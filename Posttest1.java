/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

/**
 *
 * @author Asus Gk
 */

import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args) {
        System.out.println("Album Kpop Agnes");
        // Buat ArrayList untuk menyimpan objek Album
        ArrayList<Album> albums = new ArrayList<>();

        // Isi dengan 5 objek Album
        albums.add(new Album("The First Step: Chapter Two", "white", "Treasure"));
        albums.add(new Album("The First Step: Treasure Effect", "orange", "Treasure"));
        albums.add(new Album("Nama Album 3", "Versi C", "Artis C"));
        albums.add(new Album("Nama Album 4", "Versi A", "Artis A"));
        albums.add(new Album("Nama Album 5", "Versi D", "Artis D"));

        // Tampilkan info Album dalam ArrayList
        for (Album album : albums) {
            System.out.println("Album" + album.getNamaAlbum() +
                               " versi " + album.getVersi() +
                               " dari " + album.getArtis());
        }
    }
}


