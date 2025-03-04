import java.util.Objects;
import java.lang.StringBuilder;
import java.util.Scanner;

public class Main {
    public static void trojkiPitagorejskie(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (i * i + j * j == k * k) {
                        System.out.println(i + ", " + j + ", " + k);
                    }
                }
            }
        }
    }

    public static void funKwaRozwiazania(int n) {
        System.out.println("Funkcja kwadratowa");
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int d = 4 * i * k - j * j;
                    if (d > 0) {
                        System.out.println(i + ", " + j + ", " + k);
                    }
                }
            }
        }

    }

    public static void funKwaDelta(int n) {
        System.out.println("Funkcja kwadratowa - delta");
        for (int i = -n; i <= n; i++) {
            for (int j = -n; j <= n; j++) {
                for (int k = -n; k <= n; k++) {
                    if (i != 0) {
                        double delta = j * j - 4 * i * k;
                        if (delta >= 0) {
                            double d2 = Math.sqrt(delta);
                            if (d2 % 1 == 0) {
                                System.out.println(i + ", " + j + ", " + k);
                            }
                        }
                    }
                }
            }
        }

    }

    public static void liczbyPierwsze(int n) {
        for (int i = 2; i <= n; i++) {
            if (i % i == 0 && i % 1 == 0 && i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void liczbyPodzielne(int n, int m) {
        double limit = Math.pow(10, m);

        for (double i = Math.pow(10, m - 1); i < limit; i++) {
            if (i % n == 0) {
                System.out.println(i);
            }
        }
    }

    public static void piramida(int n) {
        String spacja = " ";
        String gwiazdka = "*";
        int gwc = 1;
        int spc = 1;
        for (int i = n; i > 0; i--) {
            System.out.println(spacja.repeat(i) + gwiazdka.repeat(gwc));
            gwc += 2;
        }
        for (int i = n + (n - 1); i > 1; i -= 2) {
            System.out.println(spacja.repeat(spc) + gwiazdka.repeat(i));
            spc++;
        }
        System.out.println(spacja.repeat(n) + gwiazdka.repeat(1));
    }

    public static int silnia(int n) {
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static void silniapodwojna(int n) {
        int wynik = 1;
        for (int i = n; i > 0; i -= 2) {
            wynik *= i;
        }
        System.out.println("Silniapodwojna");
        System.out.println(wynik);
    }

    public static void silnia2(int n, int m) {
        int wynik = 1;
        for (int i = n; i > 0; i -= m) {
            wynik *= i;
        }
        System.out.println("Silnia2");
        System.out.println(wynik);
    }

    public static void Newton(int n, int k) {
        int wynik = silnia(n) / (silnia(k) * silnia(n - k));
        System.out.println("Newton");
        System.out.println(wynik);
    }

    public static void Fibonacci(int n) {
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = i;
        }
        for (int i = 2; i < n; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }

        System.out.println("Fibonacci");
        System.out.println(tab[n - 1]);
    }

    public static void SumaLiczbNaturalnych(int n) {
        int wynik = 0;
        for (int i = 0; i <= n; i++) {
            wynik += i;
        }
        System.out.println("SumaLiczbNaturalnych");
        System.out.println(wynik);
    }

    public static void SumaLiczbParzystych(int n) {
        int wynik = 0;
        for (int i = 0; i <= n; i += 2) {
            wynik += i;
        }
        System.out.println("SumaLiczbParzystych");
        System.out.println(wynik);
    }

    public static void SumaLiczbNieParzystych(int n) {
        int wynik = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                wynik += i;
            }
        }
        System.out.println("SumaLiczbNieParzystych");
        System.out.println(wynik);
    }

    public static void SumaKwaLiczbNaturalnych(int n) {
        int wynik = 0;
        for (int i = 0; i <= n; i++) {
            wynik += i * i;
        }
        System.out.println("SumaLiczbNaturalnych");
        System.out.println(wynik);
    }

    public static void SumaSzeLiczbNaturalnych(int n) {
        int wynik = 0;
        for (int i = 0; i <= n; i++) {
            wynik += i * i * i;
        }
        System.out.println("SumaLiczbNaturalnych");
        System.out.println(wynik);
    }

    public static void SumaOdwLiczbNaturalnych(double n) {
        double wynik = 0;
        for (double i = 1; i <= n; i++) {
            wynik += 1 / i;
        }
        System.out.println("SumaOdwLiczbNaturalnych");
        System.out.println(wynik);
    }

    public static void CzyPalindrom(String n) {
        String ow = new StringBuilder(n).reverse().toString();
        if (n.equals(ow)) {
            System.out.println("Palindrom");

        } else {
            System.out.println("Nie Palindrom");
        }
    }

    public static void TrojkatPascala(int n) {
        int m = n;
        String spacja = " ";
        for (int rzad = 0; rzad < (n + 1); rzad++) {
            System.out.print(spacja.repeat(m));
            m--;

            for (int miejsce = 0; miejsce < rzad; miejsce++) {
                System.out.print(silnia(rzad) / (silnia(miejsce) * silnia(rzad - miejsce)) + " ");
            }
            System.out.print(1);
            System.out.println();
        }
        System.out.println();
    }
    public static void CzyDoskonala(int n) {
        int wynik = 0;
        for(int i = 1; i<n; i++){
            if (n%i==0) {
                wynik += i;
            }
        }
        if (wynik == n) {
            System.out.println("Doskonala");
        }
        else {
            System.out.println("Nie doskonala");
        }
    }

    public static boolean CzyPierwsza(int n) {
        for(int i = 2; i<Math.sqrt(n); i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static void NWD(int a, int b) {
        int wynik = 0;
        for(int i = 1; i<=a; i++){
            if(a%i==0) {
                if(b%i==0) {
                    wynik = i;
                }
            }

        }
        System.out.println("NWD tych liczb to: " + wynik);
    }
    public static void WczytajTablice(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = scanner.nextInt();
        }
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(tab[i]+", ");
        }
        System.out.print("]");
    }
    public static void podzbiory(int[] tab) {
        int a = tab.length;
        int b = 1 << a;
        int[][] podzbiory = new int[b][a];

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                podzbiory[i][j] = 0;
            }
        }

        for (int i = 0; i < b; i++) {
            int c = 0;
            for (int j = 0; j < a; j++) {
                if ((i & (1 << j)) != 0) {
                    podzbiory[i][c++] = tab[j];
                }
            }
        }

        for (int[] p : podzbiory) {
            System.out.print("[");
            boolean g = true;
            for (int i = 0; i < p.length; i++) {
                if (p[i] != 0) {
                    if (!g) System.out.print(", ");
                    System.out.print(p[i]);
                    g = false;
                }
            }
            System.out.println("]");
        }
    }
    public static void main(String[] args) {
        trojkiPitagorejskie(10);
        funKwaRozwiazania(5);
        funKwaDelta(5);
        liczbyPierwsze(100);
        liczbyPodzielne(10,2);
        piramida(10);
        silnia(3);
        silniapodwojna(4);
        silnia2(10,5);
        Newton(5,2);
        Fibonacci(6);
        SumaLiczbNaturalnych(25);
        SumaLiczbParzystych(4);
        SumaLiczbNieParzystych(4);
        SumaKwaLiczbNaturalnych(3);
        SumaSzeLiczbNaturalnych(3);
        SumaOdwLiczbNaturalnych(3);
        CzyPalindrom("abc");
        TrojkatPascala(10);
        CzyDoskonala(8128);
        if(CzyPierwsza(5)){
            System.out.println("Pierwsza");
        }
        else{
            System.out.println("Nie pierwsza");
        }
        NWD(56,98);
        WczytajTablice(5);
        int tab[] = {1,2,3,4};
        podzbiory(tab);
    }
}