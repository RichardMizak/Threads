package Matrix;

public class Main {

    public static void main(String[] args) {
        int [][] arr2D_1={
                {3,7,5},{2,4,9}
        };
        int [][] arr2D_2={
                {7,2,9},{1,8,5},{0,2,4}
        };
        int [][] arr2D_3=new int[2][3];

        int length1=arr2D_1[0].length;
        int length2=arr2D_2[0].length;
        int length3=arr2D_1.length;

        for (int i=0;i<length1;i++){
            for (int j=0;j<length2;j++){
            //    arr2D_3[i][j]=length3;
                for (int k=0;k<length1;k++){
                    arr2D_3[i][j]+=arr2D_1[i][k]*arr2D_2[k][j];
                }
                System.out.print(arr2D_3[i][j]+" ");
            }

        }
    }
}
