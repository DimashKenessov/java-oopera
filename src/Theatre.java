import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {


        Actor actor1 = new Actor("Иван", "Нуртас", "М", 180);
        Actor actor2 = new Actor("Кайрат", "Трамп", "М", 165);
        Actor actor3 = new Actor("Аружан", "Тереза", "Ж", 175);


        Director director1 = new Director("Белла", "Хадид", "Ж", 12);
        Director director2 = new Director("Кенан", "Димарко", "М", 20);


        String musicAuthorForBallet = "Людвиг Чайковский";
        String choreographer = "Максим Лист";
        String musicAuthorForOpera = "Рахим Моцарт";


        Ballet ballet = new Ballet(
                "Дон Кихот", 120, director1,
                musicAuthorForBallet,
                "история рыцаря, который отправляется в приключение во имя своей дамы.",
                choreographer
        );

        Opera opera = new Opera(
                "Дон Жуан", 150, director2,
                musicAuthorForOpera,
                "История про любовь, обман и возмездие",
                25
        );

        Show drama = new Show("Ревизор", 100, director2);


        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        opera.addActor(actor1);
        opera.addActor(actor2);

        drama.addActor(actor2);
        drama.addActor(actor3);

        ArrayList<Show> allShows = new ArrayList<>();
        allShows.add(ballet);
        allShows.add(opera);
        allShows.add(drama);

        Show.printAllActors(allShows);

        ballet.printActors();
        System.out.println("Хореограф: " + ballet.getChoreographer());
        System.out.println("Автор музыки: " + ballet.getMusicAuthor());
        System.out.println();

        opera.printActors();
        System.out.println("Хор (кол-во): " + opera.getChoirSize());
        System.out.println("Автор музыки: " + opera.getMusicAuthor());
        System.out.println();

        drama.printActors();
        System.out.println();


        ballet.replaceActor("Нуртас", actor3);
        ballet.printActors();
        System.out.println();


        drama.replaceActor("Трамп", actor1);
        drama.printActors();
        System.out.println();

        opera.replaceActor("Том", actor1);
        System.out.println();

        ballet.printLibretto();
        System.out.println();
        opera.printLibretto();
        System.out.println();


        ballet.printDirectorInfo();
        opera.printDirectorInfo();
        drama.printDirectorInfo();
    }
}
