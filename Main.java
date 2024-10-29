import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//1.
//        ArrayList<String> s = new ArrayList<>();
//        s.add("cat");s.add("dog");s.add("red");s.add("is");s.add("am");
//        System.out.println(find(s));

//2.
//        ArrayList<Integer> numbers= new ArrayList<>();
//        numbers.add(1);numbers.add(1);numbers.add(1);numbers.add(3);numbers.add(3);numbers.add(5);
//        check(numbers,3);
//        check(numbers,1);
//        check(numbers,9);

//3.
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);numbers.add(4);numbers.add(17);numbers.add(7);numbers.add(25);numbers.add(3);numbers.add(100);
//        largest(numbers,3);

//4.
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);numbers.add(4);numbers.add(3);numbers.add(2);numbers.add(1);
//        reverse(numbers);

//5.Write a menu driven Java program with following option
//        int[] array;
//        int size;
//
//        System.out.print("Enter the size of the array: ");
//        size = sc.nextInt();
//        array = new int[size];
//
//        boolean running = true;
//
//        while (running) {
//            System.out.println("\nMenu:");
//            System.out.println("1. Accept elements of an array");
//            System.out.println("2. Display elements of an array");
//            System.out.println("3. Search the element within array");
//            System.out.println("4. Sort the array");
//            System.out.println("5. Stop");
//            System.out.print("Choose an option (1-5): ");
//            int choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter " + size + " elements:");
//                    for (int i = 0; i < size; i++) {
//                        array[i] = sc.nextInt();
//                    }
//                    break;
//
//                case 2:
//                    System.out.println("Array elements: " + Arrays.toString(array));
//                    break;
//
//                case 3:
//                    System.out.print("Enter the element to search: ");
//                    int searchElement = sc.nextInt();
//                    boolean found = false;
//                    for (int num : array) {
//                        if (num == searchElement) {
//                            found = true;
//                            break;
//                        }
//                    }
//                    if (found) {
//                        System.out.println(searchElement + " is found in the array.");
//                    } else {
//                        System.out.println(searchElement + " is not found in the array.");
//                    }
//                    break;
//
//                case 4:
//                    Arrays.sort(array);
//                    System.out.println("Array sorted.");
//                    break;
//
//                case 5:
//                    running = false;
//                    System.out.println("Exiting...");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice. Please choose between 1 and 5.");
//            }
//        }

//6.Create a method that generates a random number within a given range. Allow the user to specify the range and call the method to display random numbers.
//        System.out.println("Enter the minimum number:");
//        int min=sc.nextInt();
//        System.out.println("Enter the maximum number: ");
//        int max = sc.nextInt();
//        System.out.println("Enter how many numbers do you want to generate:");
//        int rNum = sc.nextInt();
//
//        for (int i = 0; i <rNum ; i++) {
//            System.out.println((int)(Math.random()*(max-min))+min);
//        }

//7.Write a program that checks the strength of a password. Create a method that evaluates a password based on criteria like length, inclusion of special characters, and uppercase/lowercase letters
//        System.out.println("Enter a password: ");
//        String pass=sc.nextLine();
//        System.out.println(totalScore(pass));

//8.Create a method that generates the Fibonacci sequence up to a specified number of terms.
//        fibonacci(10);
    }







//1.Write a program to find all of the longest word in a given dictionary.
//    public static ArrayList<String> find(ArrayList<String> arr){
//        ArrayList<String> newArr = new ArrayList<>();
//        int longest=0;
//        for (String s :arr){
//            if(s.length()>=longest){longest=s.length(); newArr.add(s);}
//        }
//        return newArr;
//    }

//2.Write a program that displays the number of occurrences of an element in the array
//    public static void check(ArrayList<Integer> arr,int num){
//            int counter = 0;
//                for (Integer n : arr) {
//                    if (n == num) counter++;
//                }
//            System.out.println(num + " occurs " + counter + " times");
//    }

//3.Write a program to find the k largest elements in a given array. Elements in the array can be in any order
//public static void largest(ArrayList<Integer> arr,int n){
//        for (int i = 0; i <n ; i++) {
//            int max=0;
//            int maxIndex=0;
//            for (int j = 0;j < arr.size(); j++) {
//                if(arr.get(j)>max){
//                    max = arr.get(j);
//                    maxIndex=j;
//                }
//            }
//                System.out.println(max);
//                arr.remove(maxIndex);
//        }
//}

//4.Create a method to reverse an array of integers. Implement the method without creating a new array.
//public static void reverse(ArrayList<Integer> arr){
//    System.out.println(arr.reversed());
//}

//7.
//    public static int checkLength(String s){
//        int score=0;
//        if(s.length()>7)score+=3;
//        else if (s.length()==6 || s.length()==7)score+=2;
//
//        return score;
//    }
//
//    public static int checkSpecialCharacters(String s){
//        int score=0;
//        String regex = "[^a-zA-Z0-9]";
//        Pattern pattern = Pattern.compile(regex);
//            if(pattern.matcher(s).find()) score+=2;
//    return score;
//    }
//
//    public static int checkUpperCaseLowerCase(String s){
//       boolean upCs= false;
//       boolean loCs= false;
//       int score=0;
//        for (char c: s.toCharArray()) if(Character.isUpperCase(c)) upCs=true;
//        for (char c: s.toCharArray()) if(Character.isLowerCase(c)) loCs=true;
//        if(upCs==true && loCs==true) score+=3;
//
//        return score;
//    }
//
//    public static String totalScore(String s){
//        int total=checkLength(s)+checkSpecialCharacters(s)+checkUpperCaseLowerCase(s);
//        if (total>7)    return "Strong";
//        else if(total<5)    return "Weak";
//        else return "Moderately strong";
//    }

//8.
//        public static void fibonacci(int terms) {
//            if (terms <= 0) {
//                 System.out.println("Please enter a positive integer.");
//            return;
//            }
//            int first = 0, second = 1;
//            System.out.print("Fibonacci Sequence up to " + terms + " terms: ");
//
//            for (int i = 1; i <= terms; i++) {
//                System.out.print(first + " ");
//                int next = first + second;
//                first = second;
//                second = next;
//            }
//        }

}