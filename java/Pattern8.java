public class Pattern8 {
    public static void main(String[] args) { 
        int n=5;				
        for(int i=1;i<=2*n-1;i++)		
            {		
            int space=0;		 
            if(i<=n){
            space=i;
        }
        else{
         space=2*n-i;}	
        for(int j=n-space;j>=1;j--){
        System.out.print(" ");}			
        int star=0;		
        for(int k=1;k<=2*space-1;k++) {
            System.out.print(k);
        }			
        System.out.println();
        }	
    }
}
