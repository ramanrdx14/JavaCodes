package Lec22Assignment6;

public class Count_Number_Of_Unique_Digits {
    static int count = 0;
	public static int  countDigits(int n,int curr,boolean[] vis) {
		 if(curr == n) {
	            return 1;
		 	}
	        int res = 1;
	        for(int i=(curr == 0 ? 1 : 0);i<=9;i++)
	        {
	            if(vis[i])
	                continue;
	            vis[i] = true;
	            res+=countDigits(n,curr+1,vis);
	            vis[i] = false;
	        }
	        return res;
	}
	
	public static void printRec(int n,String current,boolean[] visited) {
		if(n == 0) {
			count++;
			return;
		}
		for(int i=0;i<=9;i++) {
			if(visited[i] == false) {
				visited[i] = true;
				printRec(n-1, current+i, visited);
				visited[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		//System.out.println(countDigits(2,0,new boolean[10]));
		printRec(5,"0",new boolean[10]);
		System.out.println(count);
	}
}
