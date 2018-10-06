package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Введите ключ продукта, если ничего не введете то откроете Бесплатную версию программы, если введете 2 то версию Про," +
                " если 3 то версию Експерт");
        System.out.println("Введите ключ продукта : ");
        int key = sc.nextInt();
        switch (key){
            case 2:
                DokumentWorker proDokumentWorker = new ProDokumentWorker();
                System.out.println("Версия Про ");
                break;
            case 3:
                DokumentWorker expertDokument = new ExpertDokument();
                System.out.println("Версия Експерт ");
                break;
                default:
                    DokumentWorker dokumentWorker = new DokumentWorker();
                    System.out.println("Бесплатная версия программы ");
        }
    }
}
