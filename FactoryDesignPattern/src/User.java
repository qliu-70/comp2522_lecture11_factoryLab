import java.util.List;

public class User {
    private String name;
    private List<String> preferences;

    public User(String name, List<String> preferences) {
        this.name = name;
        this.preferences = preferences;
    }

    public String getName() {
        return name;
    }

    public List<String> getPreferences() {
        return preferences;
    }
}


