import java.util.*;  
class Swap{
    public static void main(String[] args){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no 1:");
        num1=sc.nextInt();
        System.out.print("Enter no 2:");
        num2=sc.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping num1:"+num1+"\tnum2:"+num2);  
    }
}
