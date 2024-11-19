import java.util.ArrayList;
import java.util.List;

public class NotificationFactory {
    public static List<Notification> getNotifications(List<String> preferences) {
        List<Notification> notifications = new ArrayList<>();
        for (String preference : preferences) {
            switch (preference.toLowerCase()) {
                case "email":
                    notifications.add(new EmailNotification());
                    break;
                case "sms":
                    notifications.add(new SMSNotification());
                    break;
                case "push":
                    notifications.add(new PushNotification());
                    break;
                default:
                    System.out.println("Unknown notification type: " + preference);
            }
        }
        return notifications;
    }
}

