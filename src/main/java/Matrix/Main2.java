package Matrix;



public class Main2 {
    public static void main(String[] args) {
        int a=16123609;
        String b=Integer.toBinaryString(a);
        System.out.println(b);
     /*   int[][] matrix = new int[][]{
                {2,5,9,8,1},
                {8,9,-5,2,7},
                {1,8,7,9,2},
                {-2,4,0,7,2}
        };
        int diagonal_1=1;
        int diagonal_2=1;
        int length1=matrix.length;
        int length2=matrix[0].length;
        for (int i=0;i<length1;i++){
            for (int j=0;j<length2;j++){
                if (i==j){
                    diagonal_1*=matrix[i][j];
                }
                if ((i+j)==(length2-1)){
                    diagonal_2*=matrix[i][j];
                }
            }
        }
        System.out.println(diagonal_1);
        System.out.println(diagonal_2);*/
    }
}
