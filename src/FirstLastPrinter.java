public class FirstLastPrinter {

    private String title;
    private Name name;

    public FirstLastPrinter(String title, Name name) {
        this.title = title;
        this.name = name;
    }

    @Override
    public String toString() {
        return title.concat(" " + name.getFirst() + " " + name.getLast());
    }
}