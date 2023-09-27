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
        System.out.println("=== List Album Kpop Agnes ===");
        
        // Membuat ArrayList untuk menyimpan objek Album
        ArrayList<Album> albums = new ArrayList<>();

        //6 objek Album
        albums.add(new Album("HEART*IZ", "Sapphire", "IZ*One"));
        albums.add(new Album("The First Step: Chapter Two", "White", "Treasure"));
        albums.add(new Album("The First Step: Treasure Effect", "Orange", "Treasure"));
        albums.add(new Album("First Impact", "Connect O", "Kep1er"));
        albums.add(new Album("Get Up", "Bunny Beach Bag", "NewJeans"));
        albums.add(new Album("Youth in the Shade", "Youth", "Zerobaseone"));

        // Untuk menampilkan info album dalam ArrayList
        for (Album album : albums) {
            System.out.println("Album " + album.getNamaAlbum() +
                               " versi " + album.getVersi() +
                               " dari " + album.getArtis());
        }
    }
}


