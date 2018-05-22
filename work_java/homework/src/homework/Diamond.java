package homework;

public class Diamond {

	public static void main(String[] args) {
		int n=4;
		int[][] a=new int[2*n-1][2*n-1];
		int h;
		int v;
		int dirh=-1;
		int dirv=1;
		int m=1;
		h=n-1;
		v=0;
		
		for (int j=0;j<4;j++) {
			v=j;
			h=n-1;
			for (int i=1;i<=(n-j-1)*4;i++) {
				
				a[v][h]=m;
				m++;
				h=h+dirh;
				v=v+dirv;
				if((m-1)%((n-j-1)*2)==0) {
					dirv=dirv*-1;
				}
				if((m-1)%((n-j-1)*2)==n-j-1) {    //4, 8
					dirh=dirh*-1;
				}
				
			}
		}
		
			
			
		
		
		
		
		
		for (int i=0;i<2*n-1;i++) {
			for (int k=0;k<2*n-1;k++) {
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
		
		
	}

}
