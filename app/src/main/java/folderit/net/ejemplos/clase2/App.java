package folderit.net.ejemplos.clase2;

public class App {

    private Long id;
    private String name;
    private String version;
    private String developer;
    private String description;
    private float rating;

    public String getName() {
        return name;
    }

    public App setName(String name) {
        this.name = name;
        return this;
    }

    public Long getId() {
        return id;
    }

    public App setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDeveloper() {
        return developer;
    }

    public App setDeveloper(String developer) {
        this.developer = developer;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public App setDescription(String description) {
        this.description = description;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public App setRating(float rating) {
        this.rating = rating;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public App setVersion(String version) {
        this.version = version;
        return this;
    }
}
