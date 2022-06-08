package com.example.fx;

import java.util.HashMap;

public class DummyJava {
    boolean check=true;
    static HashMap<Integer,Integer> hashMap;
    public static void main(String[] args) {
//        String a="Aryanaa";
//        char[] b={'^','/','*','+','-'};
////        System.out.println(a.substring(1,4).replace("a","b"));
//        System.out.println(a.replace(a.substring(1,4),"sm"));
//        System.out.println(b.length);
//
//        for (int i=0;i<5;i++){
//            hashMap=new HashMap<>();
//            for (int j=0;j<=i;j++){
//                hashMap.put(j,j);
//            }
//            System.out.println(hashMap);
//        }

        int[] array;

        for (int i=1;i<=5;i++){
            array=new int[i];
            for (int j=0;j<i;j++){
                array[j]=i;
            }
            for (int j=0;j<array.length;j++){
                System.out.print(array[j]);
            }
            System.out.println();
        }


//        System.out.println(a.replace("a","b"));
    }

    //    public String checkMethod(String string){
//        while (check) {
//            if (string.charAt(0) == '*' || string.charAt(0) == '/') {
//                check = false;
//            } else
//                return result(string);
//        }
//        return "Error --> Clear and re-Enter for calculation";
//    }
    public void result(String string){
        String string1;
        HashMap<Integer,String> hashMap=new HashMap<>();
        for (int i=0;i<string.length();i++){
            string1="";
            if (string.charAt(i)=='*'||string.charAt(i)=='/'||string.charAt(i)=='+'||string.charAt(i)=='-'||string.charAt(i)=='^'){
                string1=string1+string.charAt(i);
                hashMap.put(i,string1);
            }
        }

    }
}
