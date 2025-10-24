import java.util.ArrayList;
import java.util.HashSet;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printActors() {
        System.out.println("Актёры спектакля \"" + title + "\":");
        for (Actor actor : listOfActors) {
            System.out.println(" - " + actor);
        }
    }

    public void addActor(Actor actor) {
        if (actor == null) return;
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже участвует в спектакле \"" + title + "\"!");
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActor(String oldSurname, Actor newActor) {
        if (oldSurname == null || newActor == null) {
            System.out.println("Неверные аргументы для замены актёра.");
            return;
        }

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor a = listOfActors.get(i);
            if (a.getSurname().equalsIgnoreCase(oldSurname)) {
                if (listOfActors.contains(newActor)) {
                    System.out.println("Актёр " + newActor + " уже участвует в спектакле \"" + title + "\"! Замена невозможна.");
                    return;
                }
                listOfActors.set(i, newActor);
                System.out.println("Актёр с фамилией " + oldSurname + " заменён на " + newActor);
                return;
            }
        }

        System.out.println("Актёр с фамилией " + oldSurname + " не найден в спектакле \"" + title + "\".");
    }





    public void printDirectorInfo() {
        System.out.println("Режиссёр спектакля \"" + title + "\": " + director);
    }


    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }


    public static void printAllActors(ArrayList<Show> shows) {
        System.out.println("Все актёры театра:");
        HashSet<Actor> allActors = new HashSet<>();
        for (Show show : shows) {
            allActors.addAll(show.getListOfActors());
        }
        if (allActors.isEmpty()) {
            System.out.println(" - (актёры отсутствуют)");
        } else {
            for (Actor a : allActors) {
                System.out.println(" - " + a);
            }
        }
        System.out.println();
    }
}
