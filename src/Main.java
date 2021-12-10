import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        s1.imie = "Julian";
        s1.nazwisko="Miskiewicz";
        s1.index=1238;
        s1.zal=true;

        s2.imie = "Janek";
        s2.nazwisko="Kowalski";
        s2.index=1233;
        s2.zal=true;

        s3.imie = "Adam";
        s3.nazwisko="Nowakowski";
        s3.index=1231;
        s3.zal=false;




        student[] tab = new student[3];

        tab[1]=s1;
        tab[0]=s2;
        tab[2]=s3;

        System.out.print("Imię\t\tNazwisko\t\tIndeks\t\tCzy zaliczona sesja\n");
        for (student i:tab
             ) {
            System.out.print(i.imie+"\t\t" +i.nazwisko+"\t\t"+i.index+"\t\t"+i.zal+"\t\t\n");
            //System.out.println("Imię: "+i.imie+"\nNazwisko: "+i.nazwisko+"\nNr indeksu: "+i.nazwisko+"\nCzy sesja zaliczona: "+i.zal+"\n");
        }


    }
}
