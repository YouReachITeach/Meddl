public class hiac {

    String name;
    int alter;

    public hiac(int alter, String name) {
        this.name = name;
        this.alter = alter;
    }

    @Override
    public String toString() {
        return name + " ist " + alter + " Jahre alt.";
    }
}
