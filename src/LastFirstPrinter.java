public class LastFirstPrinter {
    private String title;
    private Name name;

    public LastFirstPrinter(String title, Name name) {
        this.title = title;
        this.name = name;
    }

    @Override
    public String toString() {
        return title.concat(" " + name.getLast() + ", " + name.getFirst());
    }
}
