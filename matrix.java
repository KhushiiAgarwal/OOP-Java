import java.util.Arrays;
//import java.util.Scanner;
class Matrixi{ 
    // void getInputs(){
    //     Scanner sc= new Scanner(System.in);
    //     System.out.print("Enter a value:");
    //     val1=sc.nextInt();
    //     System.out.print("Enter a value:");
    //     val2=sc.nextInt();
    //     sc.close();  
    // }
        public static void main(String[] args) {
            int i,j;
            int x[][]={{1,2,3},{4,5,6},{7,8,9}};
            //System.out.println(Arrays.deepToString(x) );
             
                System.out.println("***");
                System.out.println(" ");
            for(i=0;i<3;i++){
                for( j=0;j<3;j++){
                    if(i<j){
                        if(i+j==2){ System.out.print(" "+x[i][j]);}
                }
            }
        }
        System.out.println(" ");
            for(i=0;i<3;i++){
                for( j=0;j<3;j++){
                    if(i<j){
                        if(i+j!=2){ System.out.print(" "+ x[i][j]);}
                    }
                }
            }
            System.out.println(" ");
            for(i=0;i<3;i++){
                for(j=0;j<3;j++){
                    if(i==j){
                        System.out.print(" "+ x[i][j]);
                    }
                }
            }
            System.out.println(" ");
            for( i=0;i<3;i++){
                for( j=0;j<3;j++){
                    if(i>j){
                        if(i+j!=2){System.out.print(" "+ x[i][j]);}
                        
                    }
                }
            }
            System.out.println(" ");
            for( i=0;i<3;i++){
                for( j=0;j<3;j++){
                    if(i>j){
                        if(i+j==2){System.out.print(" "+ x[i][j]);}
                        
                    }
                }
            }
            }
}
