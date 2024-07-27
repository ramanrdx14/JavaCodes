package Lec14;

public class TransposeOfMatrix {
    public static void main(String[] args) {
		int[][] arr = {{1,2,3},{5,6,7},{8,9,10}};
//    	For N*N Matrix
		int[][] ans1 = n_cross_n(arr);
//    	For N*M Matrix
		int[][] ans2 = n_cross_m(arr);
	}
    public static int[][] n_cross_n(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }
        int[][] temp = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                temp[i][j] = arr[i][j];
            }
        }
        return temp;
    }
    public static int[][] n_cross_m(int[][] arr){
        int[][] temp = new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                temp[j][i] = arr[i][j];
            }
        }
        return temp;
    }

}
