package MyBirthday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date3 {
    public static void main(String[] args) throws ParseException {
//方法1：
        /*SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        Date d=sdf1.parse("2018-2-14");

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd-EE");//EE代表的是星期几
        String s=sdf.format(d);


        System.out.println(d);
        System.out.println(s);*/


//方法2：
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
Date d=sdf.parse("2018-02-04");
SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd-EE");
String s=sdf1.format(d);
        System.out.println(s);

    }
}
