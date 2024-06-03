///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
// */
//package Week1;
//
//import java.util.HashMap;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
///**
// *
// * @author ASUS
// */
//public class LetterCount {
//
//    /**
//     * @param args the command line arguments
//     */
//    private static final Scanner sc = new Scanner(System.in);
//    public static void main(String[] args) {
//        // TODO code application logic here
//         // Step 1: Ask user enter content
//        String str = inputString("Enter your content: ");
//        //Step 2 : Count and display number of words
//        countAndDisplayNumberOfWords(str);
//        //Step 3 : Count and display number of character
//        countAndDisplayNumberOfCharacter(str);
//    }
//    public static String inputString(String msg){
//        while(true){
//            System.out.println(msg);
//            String str = sc.nextLine();
//            if(str.isEmpty()){
//                System.out.println("Input is empty. Please re-enter!!!");
//                continue;
//            }
//            return str;
//        }
//    }
//    public static void countAndDisplayNumberOfWords(String str) {
//        HashMap<String, Integer> words = new HashMap<>();
//        StringTokenizer token = new StringTokenizer(str, " ");
//        String subStr;
//        // Loop to read all tokens in the string
//        while(token.hasMoreTokens()){
//            subStr = token.nextToken();    
//            // Check is existed key in the map
//            if(words.containsKey(subStr)){
//                words.put(subStr, words.get(subStr) + 1);
//            }else{
//                words.put(subStr,1);
//            }
//        }
//        System.out.println(words);
//    }
//
//    public  static void countAndDisplayNumberOfCharacter(String str) {
//        HashMap<Character, Integer> chars = new HashMap<>();
//        // Loop to read each character of the string
//        for(int i =0 ; i < str.length(); i++){
//            boolean check = false;
//            char character = str.charAt(i);
//            if(character == ' '){
//                check = true;
//            }
//             // Check is reading character is not a space character
//            if(check == false){
//                // Check is existed key in the map
//                if(chars.containsKey(character)){
//                    chars.put(character, chars.get(character) + 1);
//                }
//                else{
//                    chars.put(character, 1);
//                }
//            }
//        }
//        System.out.println(chars);
//    }
//}