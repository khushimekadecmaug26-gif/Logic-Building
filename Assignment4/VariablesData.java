class VariablesData {
    
    byte a = 101;
    short b = 23;
    int c = 23;
    long d = 24465788L;
    float e = 5.04f;
    double f = 454.0;
    char g = 'w';
    boolean h = true;

    public static void main(String args[]) {  
        VariablesData program = new VariablesData(); 
        
        System.out.println("byte a : " + program.a);
        System.out.println("short b : " + program.b);
        System.out.println("int c : " + program.c);
        System.out.println("long d : " + program.d);
        System.out.println("float e : " + program.e);
        System.out.println("double f : " + program.f);
        System.out.println("char g : " + program.g);
        System.out.println("boolean h : " + program.h);
    }
}