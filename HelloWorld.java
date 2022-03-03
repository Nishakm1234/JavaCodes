public class HelloWorld {

    public static void main(String []args){
        System.out.println("Hello World");
//        add(3,4);
        System.out.println(add(3,4));
        Calculator c1=new Calculator();
        System.out.println(c1.multiplication(2,4));
        c1.subtract(6,4);//not right method since static methods don't need any object to be created
        Calculator.subtract(6,4);//right method to call static method of another class
    }
    public static int add(int a, int b){
        return a+b;
    }
}
