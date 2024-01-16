import java.util.*;  
class FibonacciSeries{
    public static int fib(int num){
        if(num==0 || num==1){
                return num;
        }
        return (fib(num-1)+fib(num-2));
    }
    public static void main(String[] args){
        int num,i=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        num=sc.nextInt();
        System.out.print("Fibbonacci:");
        while(i<num){
            System.out.print(fib(i)+"\t");
            i++;
        }
    }
}
