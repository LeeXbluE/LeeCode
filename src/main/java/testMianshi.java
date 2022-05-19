import org.junit.Test;

import java.util.*;

/**
 * @title: testMianshi
 * @Author LeeX
 * @Date: 2022/3/18 15:30
 * @Version 1.0
 */
public class testMianshi {


    //        int[] arr = new int[10];
//        arr[0]=1;arr[1]=3;arr[2]=3;
//    @Test
//    public void findSingle(int[] arr) {
//
//        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
//        for (int i : arr) {
//            if (hashMap.containsKey(i)) {
//                hashMap.put(i, hashMap.get(i) + 1);
//            } else {
//                hashMap.put(i, 1);
//            }
//        }
//
//        Set<Integer> set = hashMap.keySet();
//        for (int i : set) {
//            if (hashMap.get(i) == 1) {
//                System.out.print(i+" ");
//            }
//        }
//    }


//    @Test
//    public void findClosest() {
//        int[] arr = new int[5];
//        for(int i=1;i<6;i++)
//            arr[i-1]=i;
//        int k = 4;
//        int x= 3;
//        List<Integer> res = new ArrayList();
//        int start =0;
//        int end = arr.length-1;
//        while(end - start>=k){
//            if(x-arr[start] > arr[end]-x){
//                start++;
//            }else{
//                end--;
//
//            }
//        }
//        for(int i=start;i<=end;i++){
//            res.add(arr[i]);
//        }
//        for(int i=0;i<res.size();i++)
//            System.out.println(res.get(i));
//
////        return res;
//    }

//    @Test
//    public List<Integer> findClosest(int[] arr, int k, int x) {
//        List<Integer> res = new ArrayList();
//        int start =0;
//        int end = arr.length-1;
//        while(end - start>=k){
//            if(x-arr[start] > arr[end]-x){
//                start++;
//            }else{
//                end--;
//            }
//        }
//        for(int i=start;i<=end;i++){
//            res.add(arr[i]);
//        }
//        return res;
//    }


//    @Test
//    public void judge() {
//        List<Integer> a = new ArrayList();
//        a.get(0)
//    }

    public void find(int[]numA,int[] numB) {
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i=0;i<numA.length;i++){
            hashMap.put(i,1);
        }
        for(int i=0;i<numB.length;i++){
            if (hashMap.containsKey(numB[i])) {
                System.out.println(numB[i]);
            }
        }
    }

    public List<Integer> findClosest(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList();
        int start =0;
        int end = arr.length-1;
        while(end - start>=k){
            if(x-arr[start] > arr[end]-x){
                start++;
            }else{
                end--;
            }
        }
        for(int i=start;i<=end;i++){
            res.add(arr[i]);
        }
        return res;
    }

    //    @Test
//    public void findSingle(int[] arr) {
//
//        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
//        for (int i : arr) {
//            if (hashMap.containsKey(i)) {
//                hashMap.put(i, hashMap.get(i) + 1);
//            } else {
//                hashMap.put(i, 1);
//            }
//        }
//
//        Set<Integer> set = hashMap.keySet();
//        for (int i : set) {
//            if (hashMap.get(i) == 1) {
//                System.out.print(i+" ");
//            }
//        }
//    }


//数组。规律偶数次数次、奇数数次的。  空间O(1),时间O(n)
//    12233
//    @Test
//    public void findSingle(int[] arr) {
//
//        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
//        for (int i : arr) {
//            if (hashMap.containsKey(i)) {
//                hashMap.put(i, hashMap.get(i) + 1);
//            } else {
//                hashMap.put(i, 1);
//            }
//        }
//
//        Set<Integer> set = hashMap.keySet();
//        for (int i : set) {
//            if (hashMap.get(i) == 1) {
//                System.out.print(i+" ");
//            }
//        }
//    }

    public void test(){

    }

}



