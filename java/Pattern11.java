public class Pattern11 {
    public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=2*n-1;i++)
		{
			int star=0;
			if(i<=n)
				star=i;
			else    
				star=2*n-i;
            int space = n-star;
            for(int s=1;s<=space;s++)
                System.out.print(" ");
			
			for(int j=1;j<=star;j++)
			{

				System.out.print(j);
			}
            for(int j=star-1;j>=1;j--){
                System.out.print(j);}
			System.out.println();
			
		}
	}

}

