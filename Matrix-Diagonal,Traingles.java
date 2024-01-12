import java.util.*;
class Matrix{
    public static void main(String[] args) {
        int i,j;
        int x[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Matrix:");

        for(i=0;i<3;i++){
            for( j=0;j<3;j++){
                System.out.print(" "+x[i][j]+"\t");
            }
                System.out.println(" ");
        }
        System.out.println("\nUpper Triangle");
        for(i=0;i<3;i++){
            for( j=0;j<3;j++){
                if(i<j){
                    System.out.print(" "+x[i][j]+"\t");}
                }
                System.out.println(" ");
        }
        System.out.println("Diagonal");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(i==j){
                    System.out.print(" "+ x[i][j]+"\t");
                }
            }
        }
        System.out.println("\n");
        System.out.print("Lower Traingle: ");
        for( i=0;i<3;i++){
            for( j=0;j<3;j++){
                if(i>j){System.out.print(" "+ x[i][j]+"\t");}
            }
            System.out.println(" ");
        }
    }
}
