package chapter1_1;

/*
给出以下表达式的值：
a. ( 0 + 15 ) / 2
b. 2.0e-6 * 100000000.1
c. true && false || true && true
 */
public class Ex1_1_1 {
    public static void main(String [] args){
        System.out.println(((0 + 15) / 2));  //7
        System.out.println(2.0e-6 * 100000000.1);  //小数点往前进6个点 *2
        System.out.println(true && false || true && true); //true
    }

}
