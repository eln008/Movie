import Model.Cast;
import Model.DataBase;
import Model.Director;
import Model.Movie;
import Service.FindableService;
import Service.SortableService;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cast cast1 = new Cast(Arrays.asList("Tom Hanks", "Meg Ryan", "Bill Pullman"), "Sam Baldwin");
        Cast cast2 = new Cast(Arrays.asList("Leonardo DiCaprio", "Kate Winslet", "Billy Zane"), "Jack Dawson");
        Cast cast3 = new Cast(Arrays.asList("Jim Carrey", "Kate Winslet", "Elijah Wood"), "Joel Barish");
        Cast cast4 = new Cast(Arrays.asList("Harrison Ford", "Sean Connery", "Denholm Elliott"), "Indiana Jones");
        Cast cast5 = new Cast(Arrays.asList("Keanu Reeves", "Laurence Fishburne", "Carrie-Anne Moss"), "Neo");
        Cast cast6 = new Cast(Arrays.asList("Johnny Depp", "Geoffrey Rush", "Orlando Bloom"), "Captain Jack Sparrow");
        Cast cast7 = new Cast(Arrays.asList("Heath Ledger", "Christian Bale", "Aaron Eckhart"), "The Joker");
        Cast cast8 = new Cast(Arrays.asList("Tom Hanks", "Michael Clarke Duncan", "David Morse"), "John Coffey");
        Cast cast9 = new Cast(Arrays.asList("Morgan Freeman", "Brad Pitt", "Kevin Spacey"), "Detective David Mills");
        Cast cast10 = new Cast(Arrays.asList("Harrison Ford", "Karen Allen", "John Rhys-Davies"), "Indiana Jones");
        Cast cast11 = new Cast(Arrays.asList("Brad Pitt", "Edward Norton", "Helena Bonham Carter"), "Tyler Durden");
        Cast cast12 = new Cast(Arrays.asList("Russell Crowe", "Joaquin Phoenix", "Connie Nielsen"), "Maximus");
        Cast cast13 = new Cast(Arrays.asList("Jim Carrey", "Laura Linney", "Noah Emmerich"), "Truman Burbank");
        Cast cast14 = new Cast(Arrays.asList("Harrison Ford", "Rutger Hauer", "Sean Young"), "Rick Deckard");
        Cast cast15 = new Cast(Arrays.asList("Tim Robbins", "Morgan Freeman", "Bob Gunton"), "Andy Dufresne");

        List<Cast> casts = Arrays.asList(cast1, cast2, cast3, cast4, cast5, cast6, cast7, cast8, cast9, cast10, cast11, cast12, cast13, cast14, cast15);


        Movie movie1 = new Movie("Sleepless in Seattle", 1993, "Romantic Comedy", cast1);
        Movie movie2 = new Movie("Titanic", 1997, "Drama", cast2);
        Movie movie3 = new Movie("Eternal Sunshine of the Spotless Mind", 2004, "Science Fiction", cast3);
        Movie movie4 = new Movie("Indiana Jones and the Last Crusade", 1989, "Adventure", cast4);
        Movie movie5 = new Movie("The Matrix", 1999, "Science Fiction", cast5);
        Movie movie6 = new Movie("Pirates of the Caribbean: The Curse of the Black Pearl", 2003, "Adventure", cast6);
        Movie movie7 = new Movie("The Dark Knight", 2008, "Action", cast7);
        Movie movie8 = new Movie("The Green Mile", 1999, "Drama", cast8);
        Movie movie9 = new Movie("Se7en", 1995, "Crime Thriller", cast9);
        Movie movie10 = new Movie("Raiders of the Lost Ark", 1981, "Adventure", cast10);
        Movie movie11 = new Movie("Fight Club", 1999, "Drama", cast11);
        Movie movie12 = new Movie("Gladiator", 2000, "Action", cast12);
        Movie movie13 = new Movie("The Truman Show", 1998, "Comedy-Drama", cast13);
        Movie movie14 = new Movie("Blade Runner", 1982, "Sci-Fi", cast14);
        Movie movie15 = new Movie("The Shawshank Redemption", 1994, "Drama", cast15);
        List<Movie> movies = Arrays.asList(movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11, movie12, movie13, movie14, movie15);

        Director director1 = new Director("Nora Ephron", List.of(movie1, movie12));
        Director director2 = new Director("James Cameron", List.of(movie2, movie15));
        Director director3 = new Director("Michel Gondry", List.of(movie3));
        Director director4 = new Director("Steven Spielberg", List.of(movie4, movie11));
        Director director5 = new Director("Lana Wachowski", List.of(movie5));
        Director director6 = new Director("Gore Verbinski", List.of(movie6, movie13));
        Director director7 = new Director("Christopher Nolan", List.of(movie7, movie14));
        Director director8 = new Director("Frank Darabont", List.of(movie8));
        Director director9 = new Director("David Fincher", List.of(movie9));
        Director director10 = new Director("Steven Spielberg", List.of(movie10));
        List<Director> directors = Arrays.asList(director1, director2, director3, director4, director5, director6, director7, director8, director9, director10);

        DataBase dataBase = new DataBase(movies, casts, directors);
        dataBase.setCasts(casts);
        dataBase.setMovies(movies);
        dataBase.setDirectors(directors);
        FindableService findableService = new FindableService(dataBase);
        SortableService sortableService = new SortableService(dataBase);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Выберите действие:");
                System.out.println("1) Получить все фильмы");
                System.out.println("2) Найти фильм по имени актера");
                System.out.println("3) Найти фильм по названию или части названия");
                System.out.println("4) Найти фильм по году выпуска");
                System.out.println("5) Найти фильм по режиссеру");
                System.out.println("6) Найти фильм по жанру");
                System.out.println("7) Сортировать фильмы по названию");
                System.out.println("8) Сортировать фильмы по году");
                System.out.println("9) Сортировать фильмы по режиссеру");
                System.out.println("0) Выйти");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println(findableService.getAllMovies());
                        break;
                    case 2:
                        System.out.println(findableService.findMovieByActorName("Brad"));
                        break;
                    case 3:
                        System.out.println(findableService.findMovieByFullNameOrPartName("Matrix"));
                        break;
                    case 4:
                        System.out.println(findableService.findMovieByYear(2000));
                        break;
                    case 5:
                        System.out.println(findableService.findMovieByDirector("Steven"));
                        break;
                    case 6:
                        System.out.println(findableService.findMovieByGenre("Comedy"));
                        break;
                    case 7:
                        sortableService.sortByMovieName();
                        break;
                    case 8:
                        sortableService.sortByYear();
                        break;
                    case 9:
                        sortableService.sortByDirector();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        throw new IllegalArgumentException("Некорректный выбор действия.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Ошибка: Некорректный ввод. Введите число.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.err.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
