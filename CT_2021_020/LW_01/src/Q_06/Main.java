package Q_06;
import javax.swing.*;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the width of the frame (in pixels): ");
            int width = scanner.nextInt();

            System.out.print("Enter the height of the frame (in pixels): ");
            int height = scanner.nextInt();
            System.out.print("Enter the title of the frame: ");
            String title = scanner.next();

            scanner.close();

           JFrame frame;
            frame = new JFrame();
            frame.setSize(width, height);
            frame.setTitle(title);
            frame.setVisible(true);
        }
}


