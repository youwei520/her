package MyBirthday;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) throws ParseException {
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生年月日");
      String s=sc.next();
      SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
      Date d=sdf.parse(s);
        long time = d.getTime();
//        long today=new Date().getTime();
        long today =System.currentTimeMillis();
        long l= today - time;
        System.out.println(l);
        System.out.println(l/1000/60/60/24+"天");*/

/*

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生年月日，格式：yyyy-MM-dd");
        String s = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);
        long a = d.getTime();
        long b = (new Date()).getTime();//new Date.getTime;     long b=System.currentTimeMillis();
        long time = b - a;
        System.out.println(time / 1000 / 60 / 60 / 24 + "天");

*/
Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的出生年月日，要求的格式必须是:yyyy年MM月dd日");
        String brithday=sc.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");
        Date d=sdf.parse(brithday);
        long l=d.getTime();

        System.out.println( (System.currentTimeMillis()-l)/1000/60/60/24);


    }
}
