import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */


        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        Osoba o1= new Osoba("Jan","Nowak",123);
        Osoba o2= new Osoba("Ada","Kiel",456);
        Osoba o3= new Osoba("Pan","Kleks",789);
        Osoba o4= new Osoba("Adaś","Niezgódka",101);
        Osoba o5= new Osoba("Golarz","Filip",112);

        Student s1= new Student(o1,WydzialEnum.Prawo);
        Student s2= new Student(o2,WydzialEnum.Prawo);
        Student s3= new Student(o3,WydzialEnum.Prawo);
        Student s4= new Student(o4,WydzialEnum.Prawo);
        Student s5= new Student(o5,WydzialEnum.Prawo);

        ArrayList<Student> Lista = new ArrayList<> ();
        Lista.add(s1);
        Lista.add(s2);
        Lista.add(s3);
        Lista.add(s4);
        Lista.add(s5);

        for (Student s:Lista
             ) {
            System.out.println(s.toString());
        }



    }
}
