/*A simple program which have two class CheckThread and CheckRunnable where former extends thread class and later implements runnable interface
   both the class check wheter a number is odd or not*/
import java.util.*;
class CheckRunnable implements Runnable{//here CheckRunnable class implements runnable interface

      public void run(){//overrides run() method of runnable interface
             int k=1;
             System.out.println("Runnable Interface: enter a number");
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             for(int i=2;i<n/2;i++){
                   if(n%i==0){//number is not prime
                         System.out.println("Runnable Interface:"+n+ " is not prime");
                         k++;break;
                   }
                      else if(n%i!=0)
                           continue;
 
             }
            if(k==1)//number is prime
                System.out.println("Runnable Interface:"+n+" is prime"); 
      }
}

class CheckThread extends Thread{//here CheckThread class extends Thread class

      public void run(){//overrides run method of Thread class
             int k=1;
             System.out.println("Thread class: enter a number");
             Scanner sc=new Scanner(System.in);
             int n=sc.nextInt();
             for(int i=2;i<n/2;i++){
                   if(n%i==0){//number is not prime
                         System.out.println("Thread class:"+n+ " is not prime");
                         k++;break;
                   }
                      else if(n%i!=0)
                           continue;
 
             }
            if(k==1)//number is prime
                System.out.println("Thread class:"+n+ " is prime"); 
      }
}
public class Session8b{

     public static void main(String []args){
           CheckThread c1=new CheckThread();
           Thread t1=new Thread(new CheckRunnable());
           c1.start();
           t1.start();
    }
}
