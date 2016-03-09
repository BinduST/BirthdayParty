
public enum Gender {
    Male("Mr"),
    Female("Ms");

    private String title;

    Gender(String prefix) {
        this.title = prefix;
    }

    public String getTitle() {
        return title;
    }
}