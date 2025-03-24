public class Method{
    static void greeting(){
        System.out.println("I LOVE MY COUNTRY");
    }

    static void greeting(String country){
        System.out.println("I LOVE MY "+ country);
    }

    static void total(int a, int b){
        System.out.println(a+b);
    }

    static int Total(int a, int b){
        return a+b;
    }

    public static void main(String[] args){
        System.out.println("Hello everyone");
        greeting();
        greeting("INDIA");
        total(3,5);
        System.out.println(Total(7,8));
    }
}





