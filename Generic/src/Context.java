import java.util.HashMap;
import java.util.Map;

public class Context<T> {
    private final Map<String, Object> values = new HashMap<>();

    public <T> void put(String key, T value) {
        values.put(key, value);
    }

    public <T> T get(String key) {
        return (T)values.get(key);
    }

    public static void main(String... args) {
        Context<String> context = new Context<>();
        context.put("key", "value");
        System.out.println((String)context.get("key"));
    }
}
