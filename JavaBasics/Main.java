// 1. IF,ELSE IF, ELSE
// import java.util.Scanner;

// class Main{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("ENTER YOUR AGE");
//     int age=sc.nextInt();
//     if(age>18){
//       System.out.println("GO FOR VOTING");
//     }
//     else if(age==18){
//       System.out.println("You can vote");
//     }
//     else
//     {
//       System.out.println("You are not eligible for voting");
//     }
//   }
// }

// 2.Short hand of if else and else if:

// import java.util.Scanner;

// class Main{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     System.out.println("ENTER YOUR AGE");
//     int age=sc.nextInt();
//     String output=(age>=18)?"Eligible for voting":"Not Eligible for vote";
//     System.out.println(output);
//   }
// }

// 3. Switch Statements

// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the days number");
//     int num = sc.nextInt();
//     switch (num) {
//       case 1:
//         System.out.println("MONDAY");
//         break;
//       case 2:
//         System.out.println("MONDAY");
//         break;
//       case 3:
//         System.out.println("Tuesday");
//         break;
//       case 4:
//         System.out.println("WEDNESDAY");
//         break;
//       case 5:
//         System.out.println("THRUSDAY");
//         break;
//         case 6:
//         System.out.println("SATURDAY");
//         break;
  
//       case 7:
//       System.out.println("SUNDAY");
//         break;
//       default:
//       System.out.println("INVALID DAY NUMBER");
//     }
//   }
// }


// 4. LOOPING

// public class Main {
//   public static void main(String[] args) {
//     for(int i=0; i<=10; i++){
//       System.out.println(i);
//     }
//   }
// }



// public class Main {
//   public static void main(String[] args) {
//     int i=10;
//     while(i>0){
//       if(i==4){
//         // break;
//         i--;
//         continue;
//       }
//       System.out.println(i);
//       i--;
//     }
//   }
// }


// 5. PRINT STAR PATTERN

// public class Main {
//   public static void main(String[] args) {
//     for(int i=0; i<5; i++){
//       for(int j=0; j<5; j++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }



// public class Main {
//   public static void main(String[] args) {
//     for(int i=0; i<5; i++){
//       for(int j=0; j<i; j++){
//         System.out.print("* ");
//       }
//       System.out.println();
//     }
//   }
// }


// 6. CHECK PRIME NUMBER
// import java.util.Scanner;
// public class Main {
//   public static void main(String[] args) {
//     java.util.Scanner sc=new Scanner(System.in);
//     System.out.println("ENTER THE NUMBER : ");
//     int num=sc.nextInt();
//     int flag=0;
//     for(int i=2; i<num; i++){
//       if(num%i==0){
//         flag=1;
//         break;
//       }
//     }
//     if(flag==1){
//       System.out.println("It is composite");
//     }
//     else{
//       System.out.println("It is prime");
//     }
//   }
// }



// 7. REVERSE OF A NUMBER:
// import java.util.Scanner;
// public class Main {
//   public static void main(String[] args) {
//     java.util.Scanner sc=new Scanner(System.in);
//     System.out.println("ENTER THE NUMBER : ");
//     int num=sc.nextInt();
//     int rev=0;
//     while(num>0){
//       int rem=num%10;
//       rev=rev*10+rem;
//       num=num/10;
//     }
//     System.out.println(rev);
//   }
// }



// 8. Sum of digit of a number

// import java.util.Scanner;
// public class Main {
//   public static void main(String[] args) {
//     java.util.Scanner sc=new Scanner(System.in);
//     System.out.println("ENTER THE NUMBER : ");
//     int num=sc.nextInt();
//     int sum=0;
//     while(num>0){
//       int rem=num%10;
//       sum=sum+rem;
//       num=num/10;
//     }
//     System.out.println(sum);
//   }
// }


// 9. Find the factorial of a number:

// class Main{
//   static int fact(int n){
//     int f=1;
//     while(n>0){
//       f*=n;
//       n--;
//     }
//     return f;
//   }
//   public static void main(String[] args) {
//     System.out.println(fact(5));
//   }
// }



//10. Print prime number between
class Main{
  static boolean check(int a){
    for(int i=2; i<a; i++){
      if(a%i==0){
        return false;
      }
    }
    return true;
  }
  public static void main(String[] args) {
    int a=3;
    int b=12;
    for(int i=a; i<b; i++){
      if(check(i)){
        System.out.println(i);
      }
    }
  }
}