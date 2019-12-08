package MyBirthday;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {
    public static void main(String[] args) throws ParseException {
        String s="2018-3-4";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date d=sdf.parse(s);

        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy年MM月dd日");
        String x=sdf1.format(d);
        System.out.println(x);



    }
}
