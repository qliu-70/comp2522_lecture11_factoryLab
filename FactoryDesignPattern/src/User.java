import java.util.List;

public class User 
{
    private String name;
    private List<String> preferences;

    public User(final String name,final List<String> preferences)
    {
        this.name = name;
        this.preferences = preferences;
    }

    public String getName()
    {
        return name;
    }

    public List<String> getPreferences()
    {
        return preferences;
    }
}


