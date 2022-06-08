package day04_concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        //______________Implicit casting______________

        byte a = 15;
        short b = (short)a;
        int c = a; //i mplicit casting
        System.out.println(b);

        long d = 3000l;
        float f = d; // implicit casting

        //  explicit casting

        int x = 100;

        byte y = (byte)x;

        float z = 20.8f;

        short q = (short) z;//20.8
        System.out.println(q);

        double n1 = 2.5;
        byte n2 = (byte) n1;
        System.out.println(n2);
        System.out.println("____________________________");

        int num = 500;

        byte result = (byte) num; 
        
        int r = 50000;
        
        short t = (short) r;
        System.out.println("t = " + t);

        double u = 3000.5;// explicit casting
        int p = (int) u;
        System.out.println(p);

        int o = 100;

        double d1 = o;

        System.out.println(d1);

    }
}
