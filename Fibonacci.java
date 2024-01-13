import java.util.*;  
class Fibonacci{
    public static int Fibbonacci(int num){
        int t1=0,t2=1,fib=0;
        for(int i=0;i<num;i++){
            if(i==0){
                System.out.print(t1+"\t");
            }
             if(i==1){
                System.out.print(t2+"\t");
            }
                fib=t1+t2;
                t1=t2;
                t2=fib;
                System.out.print(fib+"\t");
        }
        return fib;
    }
    public static void main(String[] args){
        int num,fac=0,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        num=sc.nextInt();
        System.out.print("Fibbonacci:");
        Fibbonacci(num);
          
    }
}
