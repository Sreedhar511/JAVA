import java.text.SimpleDateFormat;
import java.util.Date;

class Date {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("DD/MM/YYYY");
        String strDate = formatter.format(date);
        System.out.println("Date Format with DD/MM/YYYY:" + strDate);
    }
}