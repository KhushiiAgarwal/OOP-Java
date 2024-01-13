import java.util.*;  
class Factorial{
    public static int Factorial(int num){
        if(num>0){
            if(num==0 ||num==1){
                return 1;
            }
        }
        int fact=0;
        return num*Factorial(num-1);
    }
    
    public static void main(String[] args){
        int num,fac=0,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        num=sc.nextInt();
        fac=Factorial(num);
        System.out.println("Factorial:"+fac);  
    }
}
