/*
----a  - - -  -  1
---cb  - - -  3  2
--fed  - - 6  5  4
-jihg  -10 9  8  7
onmlk 1514 13 12 11   
*/
class counter22{
	public static void main(String args[]){
		int n=5;
     		int count=1;
		for(int i=1;i<=5;i++){
			int c=count;
			for(int j=i;j<5;j++){
				System.out.print(" ");
				}
			for(int j=i;j>=1;j--){	
				System.out.print((char)(c+96));
				c--;
				}
				System.out.println();
				count+=i+1;
			}
		}
  }	