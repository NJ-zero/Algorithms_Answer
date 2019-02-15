package chapter1_1;

public class Ex_1_11 {
    public static void printboolen(boolean[][] a){
        System.out.print((' '));
        for (int i=0;i<a[0].length;i++){
            System.out.print(i);
        }
        System.out.println();
        for (int i=0;i<a.length;i++){
            System.out.print(i);
            for (int j=0;j<a[i].length;j++){
                System.out.print((a[i][j] ? "*" : " "));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] a = { {true,false,true}, {false,true,false },
                { true,true,false } };
        printboolen(a);
    }


}
