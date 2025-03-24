// public class Array{
//     public static void main(String args[]){
//         int[] arr={2,654,5,65,64,34};
//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }



// import java.util.Scanner;
// public class Array{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the no. of element");
//         int n=sc.nextInt();
//         int[] arr=new int[n];

//         for(int i=0; i<arr.length; i++){
//             arr[i]=sc.nextInt();
//         }

//         for(int i=0; i<arr.length; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }





// ARRAYLIST : IT IS A DYNAMIC ARRAY 

// import java.util.ArrayList;

// public class Array{
//     public static void main(String[] args) {
//         ArrayList<Integer> ages = new ArrayList<Integer>();
//         ages.add(2);
//         ages.add(45);
//         ages.add(78);
//         ages.add(899);
//         System.out.println(ages);
//     }
// }




// import java.util.ArrayList;

// public class Array{
//     public static void main(String[] args) {
//         ArrayList<Integer> ages = new ArrayList<Integer>();
//         ages.add(2);
//         ages.add(45);
//         ages.add(78);
//         ages.add(899);
//         System.out.println(ages.get(2));
//     }
// }



// import java.util.ArrayList;

// public class Array{
//     public static void main(String[] args) {
//         ArrayList<Integer> ages = new ArrayList<Integer>();
//         ages.add(2);
//         ages.add(45);
//         ages.add(78);
//         ages.add(899);
//         ages.set(2,78934);
//         System.out.println(ages);
//     }
// }






import java.util.ArrayList;
import java.util.Collections; 

public class Array{
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<Integer>();
        ages.add(2);
        ages.add(45);
        ages.add(78);
        ages.add(899);
        ages.set(2,78934);
        System.out.println(ages);
    }
}


