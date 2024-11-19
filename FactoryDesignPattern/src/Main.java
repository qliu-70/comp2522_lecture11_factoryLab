import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Allow user to define preferences
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your notification preferences (email, sms, push), separated by commas:");
        String input = scanner.nextLine();
        List<String> preferences = Arrays.asList(input.split(","));

        // Create a user
        User user = new User(name, preferences);

        // Get notifications based on preferences
        List<Notification> notifications = NotificationFactory.getNotifications(user.getPreferences());

        // Send notifications to all subscribed channels
        System.out.println("Enter the message to send:");
        String message = scanner.nextLine();

        System.out.println("Sending notifications to " + user.getName() + ":");
        for (Notification notification : notifications) {
            notification.showNotification();
        }

        scanner.close();
    }
}
