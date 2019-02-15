
/*
二分法查找
 */
public class erfen {
    public static void main(String[] args)
    {
        //二分法查找：前提条件：被查找的数组必须是有序的

        int[] arr = {23,34,45,56,67,78,89,99,120};
        int key = 99;

        int index = rank(key,arr);
        System.out.println("index="+index);
    }

    public static int rank(int key,int[] a){
        int lo = 0;
        int hi = a.length-1;
        while (lo<=hi){
            int mid = lo + (hi-lo)/2;
            if (key < a[mid]){
                hi = mid-1;
            }else if (key > a[mid]){
                lo = mid+1;
            }else {
                return a[mid];
            }

        }
        return -1;

    }

    public static int rank2(int key,int[] a,int lo,int hi){
        if(lo>hi) return -1;
        int mid = lo +(hi-lo)/2;
        if (key < a[mid]){
            return rank2(key,a,lo,mid-1);
        }else if(key > a[mid]){
            return rank2(key,a,mid+1,lo);
        }else return a[mid];
    }


}
