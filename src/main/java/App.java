public class App {
    private String name;

    public App(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getGreeting(String name) {
        return String.format("Hello %s", name);
    }
}
