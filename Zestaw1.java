import java.time.LocalTime;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("Kacper Parzych");
        //2
        String in = "Kacper Parzych";
        int dlugosc = in.length();
        System.out.println(dlugosc);
        //3
        String A = "Ala";
        String B = "Ma";
        String C = "Kota";
        System.out.println(A+B+C);
        //4.1
        String gwi = "* ";
        String spc = " ";
        System.out.println(spc.repeat(20)+gwi.repeat(1)+spc.repeat(8));
        System.out.println(spc.repeat(20)+gwi.repeat(2)+spc.repeat(6));
        System.out.println(spc.repeat(20)+gwi.repeat(3)+spc.repeat(4));
        System.out.println(gwi.repeat(14)+spc.repeat(1));
        System.out.println(gwi.repeat(15));
        System.out.println(gwi.repeat(14)+spc.repeat(1));
        System.out.println(spc.repeat(20)+gwi.repeat(3)+spc.repeat(4));
        System.out.println(spc.repeat(20)+gwi.repeat(2)+spc.repeat(6));
        System.out.println(spc.repeat(20)+gwi.repeat(1)+spc.repeat(8));
        //4.2
        System.out.println(spc.repeat(6)+gwi.repeat(1));
        System.out.println(spc.repeat(5)+gwi.repeat(2));
        System.out.println(spc.repeat(4)+gwi.repeat(3));
        System.out.println(spc.repeat(3)+gwi.repeat(4));
        System.out.println(spc.repeat(2)+gwi.repeat(5));
        System.out.println(spc.repeat(1)+gwi.repeat(6));
        System.out.println(spc.repeat(2)+gwi.repeat(5));
        System.out.println(spc.repeat(3)+gwi.repeat(4));
        System.out.println(spc.repeat(4)+gwi.repeat(3));
        System.out.println(spc.repeat(5)+gwi.repeat(2));
        System.out.println(spc.repeat(6)+gwi.repeat(1));

        //5
        String s = "Ala ma kota";
        s = s.replace("a","e");
        System.out.println(s);
        //6
        String sl = "Ala ma kota";
        String s1 = sl.toLowerCase();
        String s2 = sl.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);
        //7
        char znak1 = 'A';
        char znak2 = '!';
        char znak3 = '@';
        char znak4 = '>';
        char znak5 = '~';
        char znak6 = '\n';
        char znak7 = '\b';
        int znakk1 = znak1;
        int znakk2 = znak2;
        int znakk3 = znak3;
        int znakk4 = znak4;
        int znakk5 = znak5;
        int znakk6 = znak6;
        int znakk7 = znak7;
        System.out.println(znakk1);
        System.out.println(znakk2);
        System.out.println(znakk3);
        System.out.println(znakk4);
        System.out.println(znakk5);
        System.out.println(znakk6);
        System.out.println(znakk7);
        // 8
        // Male litery =97-122
        // Duze liter =65-90
        // Cyfry =48-57
        // 9
        String slowo1 = "slowo1";
        String slowo2 = "slowo2";
        String slowo3 = "slowo3";
        System.out.println("Grzesiek nie wiedzial dlaczego "+slowo1+" jest tak drapieznym "+slowo2+" mimo, ze jego "+slowo3+" na to nie wskazuje");
        // 10
        String uk = "Ulubiona ksiazka";
        String ua = "Ulubionego aktora";
        System.out.println(uk+" to najlepsza ksiazka napisana przez "+ua);
        // 11
        String zmienna = "wodrze";
        System.out.println(zmienna.repeat(5));
        System.out.println();
        // 12
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        System.out.println("Dzisiaj jest "+d.getDayOfMonth()+"-"+d.getMonth()+"-"+d.getYear()+" godzina "+t.getHour()+"-"+t.getMinute()+"-"+t.getSecond());
        //13
        char zn1 = 54;
        char zn2 = 103;
        char zn3 = 241;
        char zn4 = 67;
        char zn5 = 9999;
        char zn6 =(char) 175176;
        char zn7 = (char) dlugosc;

        System.out.println(zn1+" "+zn2+" "+zn3+" "+zn4+" "+zn5+" "+zn6+" "+zn7);

    }
}