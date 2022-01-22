package com.careerdevs.songfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        //ask questions
        System.out.print("Enter title of song\nInput: ");
        String titleInput = scanner.nextLine();
        System.out.print("Enter artist name\nInput: ");
        String artistInput = scanner.nextLine();
        System.out.print("Enter genre\nInput: ");
        String genreInput = scanner.nextLine();
        System.out.print("Enter the length of the song in seconds\nInput: ");
        int songTimeInput = scanner.nextInt();
        //creating animal instance
        Song song = new Song(titleInput, artistInput, genreInput, songTimeInput);
        //output field vales for animal instance
        System.out.println(song);
    }
}

