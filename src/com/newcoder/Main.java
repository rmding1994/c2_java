package com.newcoder;

//import javafx.scene.input.DataFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import sun.net.www.content.text.PlainTextInputStream;

import java.util.*;

public class Main {

    public static void print(int index, Object obj ){
        System.out.println(String.format("{%d}, %s",index,obj.toString()));
    }
    public static void demoString(){
        String str="hello newcoder";
        print(1,str.indexOf('e'));
        print(2,str.charAt(6));
        print(3,str.compareTo("hello mowcoder"));
        print(4,str.compareTo("hello powcoder"));
        print(5,str.compareToIgnoreCase("Hello Newcoder"));
        print(6,str.concat("**"));
        print(7,str.replace('o','a'));
    }
    public static void demoList(){
        List<String> strList=new ArrayList<String>();
        for(int i=0;i<4;i++){
            strList.add(String.valueOf(i));
            print(1,strList.get(i));
        }
        Collections.sort(strList);
        print(2,strList);
    }

    public static void demoSet(){
        Set<String> strSet=new HashSet<String>();
        for(int i=0;i<6;i++){
            strSet.add(String.valueOf(i));
            strSet.add(String.valueOf(i));
        }
        print(1,strSet);
    }

    public static void demoKeyValue(){
       Map<String,String> map = new HashMap<>();
       for (int i = 0; i < 4; i++) {
           map.put(String.valueOf(i),String.valueOf(i*i));
       }
       print(1,map);
       for(Map.Entry<String,String>entry:map.entrySet()){//遍历输出
           print(2,entry.getKey()+":"+entry.getValue());
       }
    }

    public static void demoException(){
        try{
            print(1,"hello");
            int a=2;
            a=a/0;//Exception异常，一旦检测到该异常，后续的代码便不再执行
            String b=null;
            b.indexOf('b');//NullPointerException异常
        }catch(NullPointerException npe){//空异常
            print(2,"NPE");
        }catch(Exception e){
            print(3,"Exception");
        }finally {//无论有无异常，以及有哪个异常，最后都会执行finally
            print(4, "finally");
            //做清理工作
        }
    }

    public static void demoCommon(){//常用的类：Random，Date,UUID
        Random random=new Random();//伪随机数，完全取决于种子
        random.setSeed(2);
        for(int i=0;i<4;i++){
            print(1,random.nextInt(100));
        }

        Date date=new Date();
        print(2,date);
        DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(3,df.format(date));
        //习题，已知今天日期，计算未来的时间是星期几

        print(4,UUID.randomUUID());
    }

    public static void main( String args[]){
        System.out.println("hello newcoder!");
        //demoString();
        //demoList();
        //demoSet();
        //demoKeyValue();
       // demoException();
        //demoCommon();
        demoCommon();
    }

}
