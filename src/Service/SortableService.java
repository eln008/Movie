package Service;

import Inteface.Sortable;
import Model.DataBase;
import Model.Director;
import Model.Movie;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Comparator;
import java.util.List;

public class SortableService implements Sortable {
    private final DataBase database;

    public SortableService(DataBase database) {
        this.database = database;
    }

    @Override
    public void sortByMovieName() {
        Scanner scan = new Scanner(System.in);
        try{
        System.out.println("Выберите порядок: \n1) от A до Z \n2) от Z до A ");
        int choice = scan.nextInt();
        List<Movie> movies = database.getMovies();
        if (choice == 1) {
            movies.sort(Comparator.comparing(Movie::getTitle));
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        } else if (choice == 2) {
            movies.sort(Comparator.comparing(Movie::getTitle).reversed());
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
        else {
                System.err.println("Некорректный выбор выерите 1 или 2");
            }
        }catch (InputMismatchException e) {
            System.err.println("Ошибка: Некорректный ввод. Введите число.");
            scan.nextLine();
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    @Override
    public void sortByYear() {
        Scanner scan = new Scanner(System.in);
        try{
        System.out.println("Выберите порядок: \n1) 1,2,3,4 \n2) 4,3,2,1 ");
        int choice = scan.nextInt();
        List<Movie> movies = database.getMovies();
        if (choice == 1) {
            movies.sort(Comparator.comparing(Movie::getReleaseYear));
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        } else if (choice == 2) {
            movies.sort(Comparator.comparing(Movie::getReleaseYear).reversed());
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
        else {
            System.err.println("Некорректный выбор выерите 1 или 2");
        }
    }catch (InputMismatchException e) {
        System.err.println("Ошибка: Некорректный ввод. Введите число.");
        scan.nextLine();
    } catch (IllegalArgumentException e) {
        System.err.println("Ошибка: " + e.getMessage());
    }
    }

    @Override
    public void sortByDirector() {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Выберите порядок: \n1) от A до Z \n2) от Z до A ");
            int choice = scan.nextInt();
            List<Director> directors = database.getDirectors();
            if (choice == 1) {
                directors.sort(Comparator.comparing(Director::getDirName));
                for (Director d : directors) {
                    System.out.println(d);
                }
            } else if (choice == 2) {
                directors.sort(Comparator.comparing(Director::getDirName).reversed());
                for (Director d : directors) {
                    System.out.println(d);
                }
            }
            else {
                System.err.println("Некорректный выбор выерите 1 или 2");
            }


         }catch (InputMismatchException e) {
            System.err.println("Ошибка: Некорректный ввод. Введите число.");
            scan.nextLine();
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
