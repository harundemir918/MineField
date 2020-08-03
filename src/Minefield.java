/**
 * Author: harundemir918
 */

import java.util.Random;
import java.util.Scanner;

public class Minefield {
    public static void main(String[] args) {
        boolean oyunBitti = false;
        int puan = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen satır sayısını giriniz: ");
        int satir = scanner.nextInt();
        System.out.print("Lütfen sütun sayısını giriniz: ");
        int sutun = scanner.nextInt();
        scanner.nextLine();

        int [][] mayinTarlasi = new int[satir][sutun];
        String [][] mayinTarlasi2 = new String[satir][sutun];

        for (int i = 0; i < mayinTarlasi.length; i++) {
            for (int j = 0; j < mayinTarlasi[i].length; j++) {
                Random random = new Random();
                int sayi = random.nextInt(2);
                mayinTarlasi[i][j] = sayi;
            }
        }

        for (int i = 0; i < mayinTarlasi2.length; i++) {
            for (int j = 0; j < mayinTarlasi2[i].length; j++) {
                mayinTarlasi2[i][j] = "[]";
            }
        }

        for (int i = 0; i < mayinTarlasi2.length; i++) {
            for (int j = 0; j < mayinTarlasi2[i].length; j++) {
                System.out.print(mayinTarlasi2[i][j] + " ");
            }
            System.out.println();
        }

        while (oyunBitti == false) {
            System.out.print("Lütfen gitmek istediğiniz konumun satır numarasını giriniz: ");
            int konumSatir = scanner.nextInt();
            System.out.print("Lütfen gitmek istediğiniz konumun sütun numarasını giriniz: ");
            int konumSutun = scanner.nextInt();
            scanner.nextLine();

            if (mayinTarlasi[konumSatir][konumSutun] == 1) {
                oyunBitti = true;
                System.out.println("Oyun bitti! Puanınız: " + puan + "\n");
            }
            else {
                System.out.println("Hala hayattasın. Devam!");
                puan += 10;
            }
        }

        for (int i = 0; i < mayinTarlasi.length; i++) {
            for (int j = 0; j < mayinTarlasi[i].length; j++) {
                System.out.print(mayinTarlasi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
