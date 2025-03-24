// class ArrayList{
//   public static void main(String[] args) {
//     System.out.println("This is an arraylist");
//   }
// }




// import java.util.ArrayList;
// class  ArrList{
//   public static void main(String[] args) {
//     ArrayList<Integer> age=new ArrayList<Integer>();
//     age.add(1);
//     age.add(10);
//     age.add(56);
//     age.add(2,1000);
//     System.out.println(age);
//     System.out.println(age.get(0));
//     age.set(0,455);
//     System.out.println(age.get(0));
//   }
// }







// import java.util.ArrayList;
// class  ArrList{
//   public static void main(String[] args) {
//     ArrayList<Integer> age=new ArrayList<Integer>();
//     age.add(1);
//     age.add(10);
//     age.add(56);
//     age.add(2,1000);
//     for(int val:age){
//       System.out.print(val+" ");
//     }
//   }
// }




import java.util.Collections;

import java.util.ArrayList;
class  ArrList{
  public static void main(String[] args) {
    ArrayList<Integer> age=new ArrayList<Integer>();
    age.add(1);
    age.add(10);
    age.add(56);
    age.add(2,1000);
    Collections.sort(age);
    for(int val:age){
      System.out.print(val+" ");
    }
  }
}