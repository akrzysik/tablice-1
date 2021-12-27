import java.io.*;
import java.util.*;

public class Main {

  public static int losuj(int max) {
    Random rand = new Random();
    return rand.nextInt(max);
  }

  public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 0; i < rozmiar; i++) {
      System.out.println("Podaj liczbe: ");
      tablica[i] = Integer.parseInt(in.readLine());
    }
  }

  public static void losuj_tablice(int[] tablica, int rozmiar, int max) {
    for (int i = 0; i < rozmiar; i++) {
      tablica[i] = losuj(max);
    }
  }

  public static void potegi_dwojki(int[] tablica, int rozmiar) {
    for (int i = 0; i < rozmiar; i++) {
      double pow = Math.pow(2, i);
      tablica[i] = (int)pow;
    }
  }

  public static void dodaj_trojki(int[] tablica, int rozmiar) {
    for (int i = 0; i < rozmiar; i++) {
      tablica[i] = i*3;
    }
  }

  public static void wypisz_tablice(int[] tablica, int rozmiar) {
    for (int i = 0; i < rozmiar; i++)
      System.out.println("tablica[" + i + "] = " + tablica[i]);
  }

  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int r;
      System.out.println("Podaj rozmiar: ");
      r = Integer.parseInt(in.readLine());
      int[] t = new int[r];
      //wczytaj_tablice(t, r);

      //1.a
      losuj_tablice(t, r, 100);
      System.out.println("Tablica zawiera nastepujace liczby wylosowane z zakresu 1 - 100:");
      wypisz_tablice(t, r);
      int max;
      System.out.println("Podaj max: ");
      max = Integer.parseInt(in.readLine());
      
      //1.b
      losuj_tablice(t, r, max);
      System.out.println("Tablica zawiera nastepujace liczby wylosowane z zakresu 1 - " + max + ":");
      wypisz_tablice(t, r);

      //2.a
      potegi_dwojki(t, r);
      System.out.println("Tablica zawiera nastepujace potęgi 2:");
      wypisz_tablice(t, r);

      //2.b
      dodaj_trojki(t, r);
      System.out.println("Tablica zawiera nastepujace wielokrotności 3:");
      wypisz_tablice(t, r);
    } catch (IOException e) {
    }
  }
}

/*
 * Cwiczenia: 1. Zamiast wczytywac elementy tablicy, wylosuj je z przedzialu od
 * 0 do 100, a nastepnie do wartosci podanej przez uzytkownika. 2. Zamiast
 * wczytywac elementy tablicy, wypelnij ja kolejnymi liczbami calkowitymi,
 * kolejnymi potegami dwojki itp.
 */
