import java.util.*;  
class Swapping{
    public static void main(String[] args){
        int num1,num2,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no 1:");
        num1=sc.nextInt();
        System.out.print("Enter no 2:");
        num2=sc.nextInt();
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping num1="+num1+"\tnum2="+num2);  
    }
}
