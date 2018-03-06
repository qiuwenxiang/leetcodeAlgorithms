package java.Array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 删除排序数组中重复元素
 * Created by lenovo on 2017/6/29.
 */


public class _026RemoveDuplicates {

    @Test
    public void test(){
        int[] arr={1,2,2,2,3,4,5,6,6,7,7,7,8};
        List<Integer> list = remove01(arr);
        System.out.println(list.size());
    }

    @Test
    public void test03(){
        int[] arr={1,2,2,2,3,4,5,6,6,7,7,7,8};
        List<Integer> list = remove03(arr);
        System.out.println(list.size());
    }

    //借助map集合
    public List<Integer> remove01(int[] arr){
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i : arr){
            if (map.containsKey(i)){

            }else {
                map.put(i,i);
            }
        }
        for (Integer key : map.keySet()) {
            list.add(key);
        }
        return list;
    }

    //借助set集合

    //借助双指针{1,2,2,2,3,4,5,6,6,7,7,7,8}
    public List<Integer> remove02(int[] arr){
        if (arr==null || arr.length==0){
            return null;
        }
        List<Integer> list=new ArrayList<>();
        int end =arr.length-1;
        int i=0;
        while (i<=end){
            //i到最后了  添加
            if (i==end){
                list.add(arr[i]);
                i++;
            }else{
                int j =i+1;
                //
                if (arr[i]==arr[j]){
                    while (j<end&&arr[i]==arr[j]){
                        j++;
                    }
                }
                list.add(arr[i]);
                i=j;
            }

        }
        return list;
    }

    //借助临时变量
    public List<Integer> remove03(int[] arr){
        List<Integer> list=new ArrayList<>();
        int temp=0;
       for (int i :arr){
           if (i==temp){
               continue;
           }else{
               list.add(temp);
               temp=i;
           }
       }
        return list;
    }
}
