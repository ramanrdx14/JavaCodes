package Lec39Assignment9;
import java.util.*;
public class ExistOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t      = sc.nextInt();
		while(t-->0) {
			HashMap<Integer,Integer> hm = new HashMap<>();
			int n = sc.nextInt();
			for(int i=0;i<n;i++) {
				int k = sc.nextInt();
				if(hm.containsKey(k)) {
					hm.put(k, hm.get(k)+1);
				}else {
					hm.put(k, 1);
				}
			}
			int q = sc.nextInt();
			while(q-->0) {
				if(hm.containsKey(sc.nextInt())) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
	}

}
