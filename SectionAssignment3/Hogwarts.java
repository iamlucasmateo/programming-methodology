package SectionAssignment3;

public class Hogwarts {
    public static void main(String[] args) {
        // System.out.println(4004 % 10);
        bludger(2001);
    };
    
    private static void bludger(int y) {
        int x = y / 1000;
        int z = (x + y);
        x = quaffle(z, y);
        System.out.println("Bludger should x = 1001; y = 2001; z = 2003;");
        System.out.println("bludger: x = " + x + ", y = " + y + ", z = " + z);
    
    };
    
    private static int quaffle(int x, int y) {
        int z = snitch(x + y, y);
        y /= z;
        System.out.println("Quaffle should x = 2003; y = 1; z = 1001;");
        System.out.println("quaffle: x = " + x + ", y = " + y + ", z = " + z);
        
        return z;
    
    };
    
    private static int snitch(int x, int y) {
        y = x / (x % 10);
        System.out.println("Snitch x = 4004; y = 1001;");
        System.out.println("snitch: x = " + x + ", y = " + y);
        
        return y;
    }; 
}
