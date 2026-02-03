/*
11
7  12
4   8   13
2   5    9   14
1   3    6   10  15
*/
class counter10{
	public static void main(String args[]){
		int n=5;
		int count=(n*(n+1)/2)-n+1;
		for(int i=5;i>=1;i--){
			int c=count;
			for(int j=i;j<=n;j++){
				System.out.print(c+"\t");
				c+=j+1;

				}
				System.out.println();
				count-=i-1;
			}
			
		}
	}