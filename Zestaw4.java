import java.util.Arrays;

public class Main {
    public static int[] generujTablice(int n, int min, int max) {
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            int rand = (int) (Math.random() * max - min + 1) + min;
            tab[i] = rand;
        }
        return tab;
    }

    public static void Macierz(int[] tab, int n, int m) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("[ ");
            for (int j = 0; j < m; j++) {
                System.out.print(tab[count] + ", ");
                count++;
            }
            System.out.println("]");

        }
    }

    public static void ileNieparzystych(int[] tab) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Liczba nieparzystych: " + count);
    }

    public static void ileParzystych(int[] tab) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Liczba parzystych: " + count);
    }

    public static void ileDodatnich(int[] tab) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                count++;
            }
        }
        System.out.println("Liczba dodatnich: " + count);
    }

    public static void ileUjemnych(int[] tab) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                count++;
            }
        }
        System.out.println("Liczba ujemnych: " + count);
    }

    public static void ileMaksymalnych(int[] tab) {
        int count = 0;
        int l = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > l) {
                l = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == l) {
                count++;
            }
        }

        System.out.println("Liczba maksymalnych: " + count);
    }

    public static void ileMinimalnych(int[] tab) {
        int count = 0;
        int l = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < tab[0]) {
                l = tab[i];
            }
        }
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == l) {
                count++;
            }
        }

        System.out.println("Liczba minimalnych: " + count);
    }

    public static void ileZerowych(int[] tab) {
        int count = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == 0) {
                count++;
            }
        }

        System.out.println("Liczba zerowych: " + count);
    }

    public static void ileUnikalnych(int[] tab) {
        int count = 0;
        boolean c = true;
        int[] tablica = tab;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < i; j++) {
                if (tablica[i] == tab[j]) {
                    c = false;
                }
            }
            if (c) {
                count++;
            } else {
                c = true;
            }
        }
        System.out.println("Liczba unikalnych: " + count);
    }

    public static void sumaDodatnich(int[] tab) {
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > 0) {
                wynik += tab[i];
            }
        }
        System.out.println("Suma dodatnich: " + wynik);
    }

    public static void sumaUjemnych(int[] tab) {
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < 0) {
                wynik += tab[i];
            }
        }
        System.out.println("Suma ujemnych: " + wynik);
    }

    public static void sumaOdwrotnosci(double[] tab) {
        double wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            wynik += (1 / tab[i]);
        }
        System.out.println("Suma odwrotnosci: " + wynik);
    }

    public static void sredniaArytmetyczna(int[] tab) {
        int wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            wynik += tab[i];
        }
        wynik = wynik / tab.length;
        System.out.println("Srednia arytmetyczna: " + wynik);
    }

    public static void sredniaGeometryczna(double[] tab) {
        double wynik = 1;
        double dl = tab.length;
        double dl2 = 1.0 / dl;
        for (int i = 0; i < tab.length; i++) {
            wynik *= tab[i];
        }
        wynik = Math.pow(wynik, dl2);
        System.out.println("Srednia geometryczna: " + wynik);
    }

    public static void sredniaHarmoniczna(double[] tab) {
        double wynik = 0;
        for (int i = 0; i < tab.length; i++) {
            wynik += 1 / tab[i];
        }
        wynik = tab.length / wynik;
        System.out.println("Srednia harmoniczna: " + wynik);
    }

    public static void funkcjaLiniowa(double[] tab, int a, int b) {
        double[] wynik = tab;
        for (int i = 0; i < tab.length; i++) {
            wynik[i] = a * tab[i] + b;
        }
        System.out.print("[ ");
        for (int i = 0; i < wynik.length; i++) {
            System.out.print(wynik[i] + " ");
        }
        System.out.println("]");

    }

    public static void funkcjaKwadratowa(double[] tab, int a, int b, int c) {
        double[] wynik = tab;
        for (int i = 0; i < tab.length; i++) {
            wynik[i] = a * tab[i] * tab[i] + b * tab[i] + c;
        }
        System.out.print("[ ");
        for (int i = 0; i < wynik.length; i++) {
            System.out.print(wynik[i] + " ");
        }
        System.out.println("]");

    }

    public static void funkcjaWykladnicza(double[] tab2, int a) {
        double[] wynik = new double[tab2.length];
        for (int i = 0; i < tab2.length; i++) {
            wynik[i] = Math.pow(a, tab2[i]);
        }
        System.out.print("[ ");
        for (int i = 0; i < wynik.length; i++) {
            System.out.print(wynik[i] + " ");
        }
        System.out.println("]");

    }

    public static void funkcjaSignum(double[] tab2) {
        double[] wynik = new double[tab2.length];
        for (int i = 0; i < tab2.length; i++) {
            if (tab2[i] > 0) {
                wynik[i] = 1;
            } else if (tab2[i] < 0) {
                wynik[i] = -1;

            } else {
                wynik[i] = 0;
            }

        }
        System.out.print("[ ");
        for (int i = 0; i < wynik.length; i++) {
            System.out.print(wynik[i] + " ");
        }
        System.out.println("]");
    }

    public static void najdluzszyCiagDodatnich(int[] tab){
        int count = 0; // szukanie najdluzszego ciagu
        int count2 = 0; // moment w ktorym zapisac i
        int naj = 0; // najdluzszy ciag
        int licz = 0; // zmienna zapisujaca i
        int c = 0; // i najdluzszego ciagu
        for (int i = 0; i < tab.length; i++) {
            if (count2 == 0) {
                licz = i;
            }
            if (tab[i] > 0) {
                count++;
                count2++;
            } else {
                count2 = 0;
                if (count > naj) {
                    naj = count;
                    c = licz;

                }
                count = 0;
            }
        }
        if (count > naj) {
            naj = count;
            c = licz;

        }

        System.out.print("[ ");
        for(int i = c; i < c+naj; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("]");
    }
    public static void zakres(int n, double min, double max) {
        double[] tab = new double[n];
        double p = (max-min)/(n-1);

        for (int i = 0; i < tab.length; i++) {
            tab[i] = min+i*p;
        }
        System.out.print("[ ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("]");
        }

    public static void najdluzszyCiagLiczbUjemnych(int[] tab){
        int count = 0; // szukanie najdluzszego ciagu
        int count2 = 0; // moment w ktorym zapisac i
        int naj = 0; // najdluzszy ciag
        int licz = 0; // zmienna zapisujaca i
        int c = 0; // i najdluzszego ciagu
    for (int i = 0; i < tab.length; i++) {
        if (count2 == 0) {
            licz = i;
        }
        if (tab[i] < 0) {
            count++;
            count2++;
        } else {
            count2 = 0;
            if (count > naj) {
                naj = count;
                c = licz;

            }
            count = 0;
        }
    }
        if (count > naj) {
            naj = count;
            c = licz;

        }

        System.out.print("[ ");
    for(int i = c; i < c+naj; i++) {
        System.out.print(tab[i] + " ");
    }
        System.out.println("]");
    }
    public static void odwroc(int[] tab, int startIndex, int stopIndex){
        int count = stopIndex;
        for(int i = startIndex-1; i < stopIndex-1; i++) {
            if(i < count) {
                int temp = tab[i];
                tab[i] = tab[count];
                tab[count] = temp;
            count--;
            }
        }
        System.out.print("[ ");
        for(int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int tablica[] = generujTablice(50, -1, 5);
        int tab[] = {1,-2,3,4,1,1,1,-1,1,1,1,5,6,7};
        double tab2[] = {1,2,3,4,5,1,1,2};
        int[] tab3 = {1,-2,-3,4,-5,-6,-7,2,3,5,67,-60,15,-6,-1,-12,-13,-17,-18,-20,1,2,3,4};
        Macierz(tab,1,5);
        ileNieparzystych(tablica);
        ileParzystych(tablica);
        ileDodatnich(tablica);
        ileZerowych(tablica);
        ileUjemnych(tablica);
        ileMaksymalnych(tablica);
        ileMinimalnych(tablica);
        ileUnikalnych(tab);
        sumaDodatnich(tab);
        sumaUjemnych(tab);
        sumaOdwrotnosci(tab2);
        sredniaArytmetyczna(tab);
        sredniaGeometryczna(tab2);
        sredniaHarmoniczna(tab2);
        funkcjaLiniowa(tab2,1,5);
        funkcjaKwadratowa(tab2,1,5,2);
        funkcjaWykladnicza(tab2,2);
        funkcjaSignum(tab2);
        najdluzszyCiagDodatnich(tab3);
        najdluzszyCiagLiczbUjemnych(tab3);
        odwroc(tab3,1,10);
        zakres(5,5,11);
    }
}
