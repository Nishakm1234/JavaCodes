public class ArrayOfObjects {
    public static void main(String[] args) {
      Student arr[]=new Student[5];
      arr[0]=new Student(1,"Amal");
      arr[1]=new Student(2,"Benny");
      arr[2]=new Student(3,"Charlie");
      arr[3]=new Student(4,"Diana");
      arr[4]=new Student(5,"Geo");
      for(int i=0;i< arr.length;i++){
          System.out.println("Element at"+i+":"+arr[i].rollNo+" "+arr[i].name);
      }
    }
}
