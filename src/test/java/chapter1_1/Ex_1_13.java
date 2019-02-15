package chapter1_1;

public class Ex_1_13 {
    public static void trans(int[][] a){
        for (int i=0;i<a[0].length;i++){
            for (int j=0;j<a.length;j++){
                System.out.print(a[j][i]);
            }
            System.out.println();
        }
    }
    public static void before(int[][] a){
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("原始数组 :");
        before(a);
        System.out.println("置换结果：");
        trans(a);

    }

}
