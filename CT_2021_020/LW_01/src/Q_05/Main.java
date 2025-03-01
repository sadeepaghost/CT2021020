package Q_05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

        public static void main(String[] args) {
            Date today = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
            String date = formatter.format(today);
            System.out.println("Today's date: " + date);
        }

    }

