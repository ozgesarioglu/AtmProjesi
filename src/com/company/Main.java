/*        ********** Java switch-case ile kullanıcının hesabını yönetebildiği program ***********   */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int right=3, select;
        double balance=1500;

        while(right>0) {
            System.out.print("Lütfen kullanıcı adınızı giriniz: ");
            String username = scan.nextLine();
            System.out.print("Lütfen parolanızı giriniz: ");
            String password = scan.nextLine();

            if (username.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, hoş geldiniz!");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");

            do {
                System.out.println(
                        "\n1- Para yatırma\n" +
                                "2- Para çekme\n" +
                                "3- Bakiye sorgulama\n" +
                                "4- Çıkış"
                );

                select = scan.nextInt();

                if (select == 1) {
                    System.out.println("Yatırılacak para miktarı: ");
                    int price = scan.nextInt();
                    balance += price;
                    System.out.println("İşlem başarılı, yeni bakiyeniz: " + balance + " TL");

                }else if (select == 2) {
                        System.out.println("Lütfen çekmek istediğiniz para miktarını giriniz: ");
                        int price = scan.nextInt();
                        if (price > balance) {
                            System.out.println("Yetersiz bakiye!");
                        } else {
                            balance -= price;
                            System.out.println("işlem başarılı, yeni bakiyeniz: " + balance + " TL");
                        }
                } else if (select == 3) {
                    System.out.println("Güncel bakiyeniz: " + balance + " TL");

                }

            }while (select != 4);
                System.out.println("Çıkış yapıldı, tekrar görüşmek üzere...");
                break;

            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya parola");
                if (right==0) {
                    System.out.println("Fazla sayıda hatalı giriş yaptınız. Hesabınız bloke olmuştur.\nLütfen bankanız ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}
