package com.leetcode.java.String;

/**
 * @author kylin.qiuwx@foxmail.com
 * @Description: 报数，一直读前一个数
 * 从1开始，读为1个1  故下一个数 = 11 ， 11读为2个1  ， 21.。。 1211。。。111221
 * @date 2018/4/24
 */
public class _38CountandSay {

    public String countAndSay(int n) {
        char[] seq=new char[100000];
        char[] bak=new char[100000];
        char[] tmp;
        char t;
        int top=1,index,l,r,num;
        seq[0]='1';seq[1]=0;
        while(--n >0){
            index=0;
            for(int i=0;i<top;i++){
                num=1;
                while(i+1<top && seq[i+1]==seq[i]){i++;num++;}
                l=index;
                while(num>0){
                    bak[index++]=(char)(num%10+'0');
                    num/=10;
                }
                r=index-1;
                while(l<r){t=bak[l];bak[l]=bak[r];bak[r]=t;l++;r--;}
                bak[index++]=seq[i];
            }
            top=index;
            tmp=seq;seq=bak;bak=tmp;
        }
        return new String(seq,0,top);
    }
}
