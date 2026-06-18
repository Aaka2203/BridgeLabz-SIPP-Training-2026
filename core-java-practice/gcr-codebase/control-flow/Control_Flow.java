public class Control_Flow {
    static int x;
    int y ; 

    void m1(){
        int y=10;
        System.out.println("This is method m1");
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        this.y=13;
        System.out.println("The value of y using this keyword is: " + this.y);
    }
    
    public static void main(String[] args) {
        Control_Flow obj1 = new Control_Flow();
        obj1.m1(); // Calling method m1

        Control_Flow obj2 = new Control_Flow();
        obj2.m1(); // Calling method m1
        

        int x=30;
        obj2.m1();

        switch (x) {
            case 10:
                System.out.println("x is 10");
                break;
            case 20:
                System.out.println("x is 20");
                break;
            case 30:
                System.out.println("x is 30");
                break;
            default:
                System.out.println("x is not 10, 20 or 30");
        }
       }
}
