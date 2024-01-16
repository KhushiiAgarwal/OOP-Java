import java.util.*;  
class Factorial{
    
    public static void main(String[] args){
        int num,fac=1,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no:");
        num=sc.nextInt();
        while(i<=num){
            fac=fac*i;
            i++;
        }
        System.out.print("Factorial:"+fac);
        sc.close();
    }
}
