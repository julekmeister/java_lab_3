import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Mutant m1 = new Mutant("Elisabeth","Bradock","Captain Britain",6);
        System.out.println(m1.toString());
        System.out.println("POWER: " + m1.calcPower() + "\n");

        Xmen x1=new Xmen("Remy","LeBeau","Gambit",2,8);
        System.out.println(x1.toString());
        System.out.println("POWER: " + x1.calcPower() + "\n");

        Omega o1=new Omega("Hope","Summers","Phoenix",2,0,100,true);
        System.out.println(o1.toString());
        System.out.println("POWER: " + o1.calcPower() + "\n");

        Omega o2=new Omega("Ororo","Munroe","Storm",5,3,60,false);
        System.out.println(o2.toString());
        System.out.println("POWER: " + o2.calcPower() + "\n");

        List<Mutant> mra =new ArrayList<>();
        mra.add(m1);
        mra.add(x1);
        mra.add(o1);
        mra.add(o2);
        System.out.println(mra);
    }
}
