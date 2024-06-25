class Student{
   int rollno;
   String name;
    Student(int rollno,String name){
       this.rollno=rollno;
       this.name=name;
     }
}
class Test{
   public static void main(String args[]){
      Student   obj1=new Student(101,"Ravi");
      Student   obj2=new Student(102,"Pawan");
      Student   obj3=new Student(103,"Rajesh");
      System.out.println(obj1.rollno);
      System.out.println(obj1.name);
      System.out.println(obj2.rollno);
      System.out.println(obj2.name);
    }
}