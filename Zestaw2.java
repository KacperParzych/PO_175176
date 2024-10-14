import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        Object w = 23.0+76;
        System.out.println(w.getClass());
        w=41*2.0+3;
        System.out.println(w.getClass());
        w = 5-33;
        System.out.println(w.getClass());
        w = 109%3;
        System.out.println(w.getClass());
        w=50/2;
        System.out.println(w.getClass());
        w=4|2;
        System.out.println(w.getClass());
        w=3^5;
        System.out.println(w.getClass());
        w=7&9;
        System.out.println(w.getClass());
        //2
        double w1 = (Math.sqrt(7)-1)/2+Math.pow(3,3)%2;
        System.out.println((int)w1);


        double w2 = (2003/(27*3));
        System.out.println((int)w2);


        double w3 = (3+Math.sqrt(3))/((Math.sqrt(5)/2)/3)+1;
        System.out.println((int)w3);


        int a = 1;
        int b = 2;
        int c = 3;

        double w4 = a%b%c;
        System.out.println((int)w4);


        String imie = "Kacper";
        String nazwisko = "Parzych";

        double w5 = (nazwisko.length()%imie.length()+1)/Math.pow(2,1.0/4);
        System.out.println((int)w5);

        //3
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pierwsze slowo:");
        String slowo1 = sc.nextLine();
        System.out.println("Podaj drugie slowo:");
        String slowo2 = sc.nextLine();

        System.out.println(slowo1);
        System.out.println(slowo2);

        //4
        System.out.println("Podaj pierwsza liczbe");
        int liczba1 = sc.nextInt();
        System.out.println("Podaj druga liczbe");
        int liczba2 = sc.nextInt();

        System.out.println(liczba1+liczba2);
        System.out.println(liczba1-liczba2);
        System.out.println(liczba1*liczba2);
        System.out.println(liczba1/liczba2);

        //5
        System.out.println("Podaj liczbe x:");
        double x = sc.nextInt();

        // Powiekszona o 140
        System.out.println(x+140);

        // Pomniejszona o 31
        System.out.println(x-31);

        // Powiekszona 7 razy
        System.out.println(x*7);

        // Pomniejszona 13 razy
        System.out.println(x/13);

        // Modulo 7
        System.out.println(x%7);

        //Czesc calkowita z dzielenia przez 4
        System.out.println((int)x/4);

        //Podniesiona do potegi 45
        System.out.println(Math.pow(x,45));

        //Iloczyn bitowy z 67
        System.out.println(67&(int)x);

        //Suma bitowa z 59
        System.out.println(59|(int)x);

        //Suma XOR z 23
        System.out.println(23^(int)x);

        //Przesuniecie bitow o 5 w lewo
        System.out.println((int)x << 5);

        //Przesuniecie bitow o 6 w prawo
        System.out.println((int)x >> 6);















    }
}