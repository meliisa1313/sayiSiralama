package Giris;

import java.util.Scanner;
 
public class Baslangic {
    public static void main(String[] args) {
       int sayi1,sayi2,sayi3;
       Scanner input=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz");
        sayi1=input.nextInt();
        System.out.println("sayi2 yi girin");
        sayi2=input.nextInt();
        System.out.println("sayi3 girin");
        sayi3=input.nextInt();
        if((sayi1>sayi2)&&(sayi1>sayi3)){
            if(sayi2>sayi3){
                System.out.println("sayi1>sayi2>sayi3");
            }
            else{
                System.out.println("sayi1>sayi3>sayi2");}
        }
        else if((sayi2>sayi3)&&(sayi2>sayi1)) {
            if (sayi3 > sayi1) {
                System.out.println("sayi2>sayi3>sayi1");
            } else {
                System.out.println("sayi2>sayi1>sayi3");
            }
        }
        else{
                if (sayi2 > sayi1) {
                    System.out.println("sayi3>sayi2>sayi1");
                }
                else {
                    System.out.println("sayi3>sayi1>sayi2");

                }
            }






        }






    }

