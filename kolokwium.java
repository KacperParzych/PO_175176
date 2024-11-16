// Kacper Parzych 175176

public class Main {
    public static boolean dokladnosc(double x, double y,int k) {
        double a = y-x;
        if(a<0){
            a = a*-1;
        }
        if(a <= Math.pow(10,-k)){
            return true;
        }
        else{
            return false;
        }
    }
    public static double najblizszySasiad(double S){
        double wynik = Math.sqrt(S);
        int a = (int)wynik;
        double o = (Math.pow(a,2)-S)*-1;
        double o2 = Math.pow(a+1,2)-S;
        if(o<o2){
            wynik = a;
        }
        else{
            wynik = a+1;
        }
        return wynik;
    }

//  public static void pierwiastek(int S, int n, int k){

    //}
    public static int podciag(int[] tab){
        int count = 1;
        int wynik = 0;
        for(int i = 1; i<tab.length; i++){
            if(tab[i]>tab[i-1]){
                count++;
            }
            else{
                if(count>wynik) {
                    wynik = count;
                }
                count = 1;
            }

        }
        if(count>wynik) {
            wynik = count;
        }
        return wynik;
    }
    public static int podciag(int[] tab, int r){
        int count = 1;
        int wynik = 0;
        for(int i = 1; i<tab.length; i++){
            if(tab[i-1]-tab[i]==r) {
                if (tab[i] < tab[i - 1]) {
                    count++;
                } else {
                    if (count > wynik) {
                        wynik = count;
                    }
                    count = 1;
                }
            }

        }
        if(count>wynik) {
            wynik = count;
        }
        return wynik;
    }
    public static boolean czyPalindrom(int n){
        int z = 0;
        int a = n;
        while(n!=0){
            z = z*10+n%10;
            n = n/10;
        }
        if(a==z) {
            return true;
        }
        else{
            return false;
        }
    }
    public static void palindromLiczbowy(int m) {

        for (double i = Math.pow(10, m-1); i < Math.pow(10, m); i++) {
            for (double j = Math.pow(10, m-1); j < Math.pow(10, m); j++) {
                int b = (int)(i * j);
                int z1 = 0;
                int a1 = b;
                while (b != 0) {
                    z1 = z1 * 10 + b % 10;
                    b = b / 10;
                }
                if (a1 == z1) {
                    System.out.println((int)i+"x"+(int)j+"="+(int)(i*j));
                }
            }
        }
    }
    public static void main(String[] args) {
    if(dokladnosc(2,2,2)){
        System.out.println("true");
    }
    System.out.println(najblizszySasiad(22));
    int[] tab = {2,0};
    System.out.println(podciag(tab));
    System.out.println(najblizszySasiad(20));
    System.out.println(podciag(tab,2));
    if(czyPalindrom(111)){
        System.out.println("true");
    }
    palindromLiczbowy(3);
    }
}
