package keypad;

import java.util.Scanner;

public class key {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		   System.out.println("Enter a string");
		   String str=scan.next();
		   String s=" ";
		   int count=0;
		      if (str.charAt(0) == '.') {
		         System.out.println("1");
		      }
		      for(int i=0;i<str.length();i++){
		         int d=str.charAt(i);
		         if(d>=97 && d<=99){
		            count++;
		         }
		      }
		      if(count==str.length()){
		         System.out.println("2");
		      }
		      count=0;
		      for(int i=0;i<str.length();i++){
		         int d=str.charAt(i);
		         if(d>=100 && d<=102){
		            count++;
		         }
		      }
		      if(count==str.length()){
		         System.out.println("3");
		      }
		      count=0;
		      for(int i=0;i<str.length();i++){
		         int d=str.charAt(i);
		         if(d>=103 && d<=105){
		            count++;
		         }
		      }
		      if(count==str.length()){
		         System.out.println("4");
		      }
		      count=0;
		      for(int i=0;i<str.length();i++){
		         int d=str.charAt(i);
		         if(d>=106 && d<=108){
		            count++;
		         }
		      }
		      if(count==str.length()){
		         System.out.println("5");
		      }
		      count=0;
		      for(int i=0;i<str.length();i++){
		         int d=str.charAt(i);
		         if(d>=109 && d<=111){
		            count++;
		         }
		      }
		      if(count==str.length()){
		         System.out.println("6");
		      }
		      count=0;
		      for(int i=0;i<str.length();i++){
		         int d=str.charAt(i);
		         if(d>=112 && d<=115){
		            count++;
		         }
		      }
		      if(count==str.length()){
		         System.out.println("7");
		      }
		      count=0;
		      for(int i=0;i<str.length();i++){
		         int d=str.charAt(i);
		         if(d>=116 && d<=119){
		            count++;
		         }
		      }
		      if(count==str.length()){
		         System.out.println("8");
		      }
		      count=0;
		      for(int i=0;i<str.length();i++){
		         int d=str.charAt(i);
		         if(d>=120 && d<=123){
		            count++;
		         }
		      }
		      if(count==str.length()){
		         System.out.println("9");
		      }

	}

}
