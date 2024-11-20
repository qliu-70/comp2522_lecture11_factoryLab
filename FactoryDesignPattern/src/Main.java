import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        final Scanner scanner = new Scanner(System.in);
        final String input;
        final String name; 
        final List<String> preferences;
        final User user;
        final String message;

        // Allow user to define preferences
        System.out.println("Enter your name:");
        name = scanner.nextLine();

        System.out.println("Enter your notification preferences (email, sms, push), separated by commas:");
        input = scanner.nextLine();
        preferences = Arrays.asList(input.split(","));

        // Create a user
        user = new User(name, preferences);

        // Get notifications based on preferences
        List<Notification> notifications = NotificationFactory.getNotifications(user.getPreferences());

        // Send notifications to all subscribed channels
        System.out.println("Enter the message to send:");
        message = scanner.nextLine();
        System.out.println("Sending notifications to " + user.getName() + ":");
        
        for (final Notification notification : notifications)
        {
            notification.showNotification();
        }

        scanner.close();
    }
}
