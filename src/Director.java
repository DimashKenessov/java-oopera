public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, String gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() { return numberOfShows; }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
