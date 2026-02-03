/*
- - - - A
- - - F B
- - J G C
- M K H D
O N L I E
*/
class counter21{
	public static void main(String args[]){
		int n=5;
		int count=1;
		for(int i=5;i>=1;i--){
			int c=count;
			for(int j=i;j>1;j--){
				System.out.print(" ");
				}
			for(int j=i;j<=n;j++){
				System.out.print((char)(c+64));
				c-=j;
			}
			System.out.println();
			count+=i;
		}
	}
}