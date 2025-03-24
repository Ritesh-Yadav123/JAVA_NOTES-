// class Person{
//     String name="Ritesh";
// }

// public class Oops {
//     public static void main(String args[]){
//         Person p1=new Person();
//         System.out.println(p1.name);
//     }
    
// }


// CONSTRUCTOR is a function which is called automatically where the object of a class is created

// class Person{
//     String name="Ritesh";
//     int age=89;
    
//     public Person()
//     {
//         System.out.println("My name is "+ this.name +" and "+ this.age);
//     }
// }

// public class Oops {
//     public static void main(String args[]){
//         Person p1=new Person();
//     }
// }





// class Person{
//     String name="Ritesh";
//     int age=89;
    
//     public Person()
//     {
//         System.out.println("My name is "+ this.name +" and "+ this.age);
//     }

//     public void hello(){
//         System.out.println("My name is "+ this.name +" and "+ this.age);
//     }
//     static void hello(){
//         System.out.println("My name is "+ this.name +" and "+ this.age);
//     }
// }

// public class Oops {
//     public static void main(String args[]){
//         Person p1=new Person();
//         p1.hello();
//         hello();
//     }
// }




// class Person{
//     String name="Ritesh";
//     int age=78;
// }
// public class Oops {
//     public static void main(String[] args) {
//         Person p1=new Person();
//         System.out.println(p1.age+" "+p1.name);
//     }
// }



// BUT THE PRIVATE attribute can only be accessed within the same class 

// public class Oops {
//     String name="Ritesh";
//     private int age=78;
//     public static void main(String[] args) {
//         Oops p1=new Oops();
//         System.out.println(p1.age+" "+p1.name);
//     }
// }


// The code is accessible in the same package and subclasses. You will learn more about
//  subclasses and superclasses in the Inheritance chapter

// class Person{
//     protected String name="Ritesh";
//     protected int age=78;
// }
// public class Oops {
//     public static void main(String[] args) {
//         Person p1=new Person();
//         System.out.println(p1.age+" "+p1.name);
//     }
// }


// ENCAPSULATION : IT HELP TO HIDE SENSITIVE DATA FROM THE USERS 

// class Person{
//     int account=12345;
//     private String pas="Ritesh1232@";
//     public String display(){
//         return this.pas;
//     }

//     public void setdisplay(String x){
//         this.pas=x;
//     }
// }

// public class Oops{
//     public static void main(String[] args) {
//         Person p1=new Person();
//         System.out.println(p1.account);

//         System.out.println(p1.display());
//         p1.setdisplay("Amit1234@");
//         System.out.println(p1.display());
//     }
// }


// INHERITANCE 
// class Person{
//     String name="Ritesh";
//     int age=56;
//     public void display(){
//         System.out.println(this.name+" " +this.age);
//     }
// }

// class Work extends Person{
//     String company="HCLTECH";
// }


// public class Oops{
// public static void main(String[] args) {
//     Work p1=new Work();
//     p1.display();
//     System.out.println(p1.company);
// }
// }


// class Person{
//     String name="Ritesh";
//     int age=56;
//     public void display(){
//         System.out.println(this.name+" " +this.age);
//     }
// }

// class Work extends Person{
//     String company="HCLTECH";
// }

// class Task extends Work{
//     String task="DEVELOPMENT";
// }


// public class Oops{
// public static void main(String[] args) {
//     Task p1=new Task();
//     p1.display();
//     System.out.println(p1.company);
//     System.out.println(p1.task);
// }
// }




// class Person{
//     String name="Ritesh";
//     int age=56;
//     public void display(){
//         System.out.println(this.name+" " +this.age);
//     }
// }

// class Work extends Person{
//     String company="HCLTECH";
// }

// class Task extends Work{
//     String task="DEVELOPMENT";

//     public void details(){
//         System.out.println(this.name +" work as " + this.task );
//     }
// }


// public class Oops{
// public static void main(String[] args) {
//     Task p1=new Task();
//     p1.display();
//     System.out.println(p1.company);
//     System.out.println(p1.task);
//     p1.details();
// }
// }



// POLYMORPHISM

// class Country{
//     public void info(){
//         System.out.println("There are many countries in the world");
//     }
// }

// class India extends Country{
//     public void info(){
//         System.out.println("I LOVE INDIA ");
//     }
// }

// class Pakistan extends Country{
//     public void info(){
//         System.out.println("I hate Pakistan ");
//     }
// }

// public class Oops {
// public static void main(String[] args) {
//     Country c=new Country();
//     Country i=new India();
//     Country p=new Pakistan();
//     c.info();
//     i.info();
//     p.info();
// }
// }




// class Outer{
//     String name="Ritesh";
//     class Inner{
//         int age=89;
//     }
//     public Outer(){
//         System.out.println("I AM FROM OUTER");
//     }
// }

// public class Oops {
//     public static void main(String[] args) {
//         Outer a=new Outer();
//         Outer.Inner b=a.new Inner();
//         System.out.println(a.name);
//         System.out.println(b.age);
//     }
// }




// ABSTRACTION: Khayal

// abstract class Animal{
//  abstract void walk();
//     Animal(){
//         System.out.println("I am from animal class");
//     }
// }

// class Cow extends Animal{
//     void walk(){
//         System.out.println("Cow walks on 4 legs");
//     }
// }

// class Hen extends Cow{
//      Hen(){
//         System.out.println("HEN class is created");
//     }
//     void walk(){
//         System.out.println("A Hen walk on 2 legs");
//     }
// }

// public class Oops {

//     public static void main(String[] args) {
//         Hen c=new Hen();
//         c.walk();
//     }
// }



