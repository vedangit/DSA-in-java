//this program explores some more basic one dimensional linear search problems

/* 1] search in string
 * 2] search in range
 * 3] minimum number in array
 */
 
import java.util.Scanner;
 public class linearsearch1{
    public static void main(String[] args) {

      //for the string function
      String arr = "Vedangi";
      char target = 'a';
      boolean ans = stringsearch(arr, target);
      System.out.println(ans);
      //capital S in String
      //single quotes in char, douvle in string


      int[] array = {-5678, 5, 6, 8, 3, 56, 34, 789, 57};
      
      //for the range
      int element = 3;
      System.out.println("enter the range : ");
      Scanner in = new Scanner(System.in);
      int a = in.nextInt();
      int b = in.nextInt();
      int answer = searchinrange(array, element, a, b);
      System.out.println(answer);

      //for the minimum
      int minimum = minimum(array);
      System.out.println("minimum : " + minimum);
        
    }

   
   
   //search for a particular character in a string
   static boolean stringsearch( String str, char target ){
      if(str.length()== 0){
         return false;
      }

      for(int i = 0; i<str.length(); i++){
         if(target == str.charAt(i)){
            return true;
         }
      }

      return false;

   }

   
   //search for an element in a particular range
   static int searchinrange(int[] arr, int target, int a, int b){
      for(int i = a; i<=b; i++){
         if(arr[i]==target){
            return i;
         }

      }
      return -1;
   }

   
   //print the element which has the lowest value
   static int minimum(int[] arr){
      int ans = arr[0];
      for(int i = 0; i<arr.length; i++)
      {
         if(arr[i]<arr[0]){
         ans = arr[i];
         }
      }
      return ans;
   }

    
 }


//output should be as follows:
/*
true
enter the range : 
1
4
4
minimum : -5678
*/
