import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner girdi = new Scanner(System.in);
    System.out.println("faktöriyeli hesaplanacak sayı giriniz");
   int sayi=girdi.nextInt();
    int sayac=1;
    int faktöriyel=1;
    while(sayac<=sayi){
      faktöriyel=faktöriyel*sayac;
      sayac++;
    }
    System.out.println("faktöriyel sonucu:" + faktöriyel);
  }
}