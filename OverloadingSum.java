//If methods are declared static
/*public class OverloadingSum {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    static public double sum(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10.7,20.9));
    }
}*/

//if methods are not static

public class OverloadingSum {
    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a,int b,int c){
        return a+b+c;
    }
    public double sum(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        OverloadingSum s=new OverloadingSum();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,20,30));
        System.out.println(s.sum(10.7,20.9));
    }
}