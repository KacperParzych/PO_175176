
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
        Object w1 = (Math.sqrt(7)-1)/2+Math.pow(3,3)%2;
        System.out.println((int)w1);
        Object w2 = (2003/(27*3));
        System.out.println((int)w2);
        Object w3 = (3+Math.sqrt(3))/((Math.sqrt(5)/2)/3)+1;
        System.out.println((int)w3);





    }
}