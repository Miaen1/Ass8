import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] f=new int[20];
        int count=20;    
        System.out.print(n1+" "+n2);//printing 0 and 1
       f[0]=0;
       f[1]=1;    
        printFibonacci(count-2,f,2);
        System.out.println("");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter series index");
        int i=scan.nextInt();
        scan.close();
        System.out.println("number " + i+" in fibinacci series is "+ f[i-1]);;

    }
    static int n1=0,n2=1,n3=0; 
       
 static void printFibonacci(int count,int [] a,int i){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3); 
         a[i]=n3;
         i++;  
         printFibonacci(count-1,a,i);    
     }    
 }    
}
