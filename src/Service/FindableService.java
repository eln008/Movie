package Service;

import Inteface.Findable;
import Model.Cast;
import Model.DataBase;
import Model.Director;
import Model.Movie;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FindableService implements Findable {
    private final DataBase database;

    public FindableService(DataBase database) {
        this.database = database;
    }


    @Override
    public List<Movie> getAllMovies() {
        return database.getMovies();
    }


    @Override
    public List<Movie> findMovieByFullNameOrPartName(List<Movie> movies) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите имя актера (например Brad): ");
        String name = scan.next();
        List<Movie> mmm = new ArrayList<>();
        for (Movie m : database.getMovies()) {
            if (m.getTitle().contains(name)) {
                mmm.add(m);
            }
        }
        return mmm;
    }

    @Override
    public List<Movie> findMovieByActorName(List<Movie> movies) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите имя актера (например Brad): ");
        String name = scan.next();
        List<Movie> mmm = new ArrayList<>();
        for (Movie m : database.getMovies()) {
            Cast cast = m.getCast();
            List<String> actors = cast.getActors();
            for (String actor : actors) {
                if (actor.trim().contains(name.trim())) {
                    mmm.add(m);

                }
            }
        }
        return mmm;
    }

    @Override
    public List<Movie> findMovieByYear(List<Movie>movies) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите год: ");
        int num = scan.nextInt();
        List<Movie> matchingMovies = new ArrayList<>();
        for (Movie m : database.getMovies()) {
            if (m.getReleaseYear() == num) {
                matchingMovies.add(m);
            }
        }
        return matchingMovies;
    }

    @Override
    public List<Movie> findMovieByDirector(List<Movie>movies) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите имя режиссера: ");
        String name = scan.next();
        for (Director d : database.getDirectors()) {
            if(d.getDirName().contains(name)){
                return d.getMoviesDirected();
            }
        }
        return null;    }

    @Override
    public List<Movie> findMovieByGenre(List<Movie> movies) {
            Scanner scan = new Scanner (System.in);
            System.out.println("Введите жанр например (Comedy): ");
            String name = scan.next();
        List<Movie> matchingMovies = new ArrayList<>();
        for (Movie m : database.getMovies()) {
                if(m.getGenre().contains(name)){
                    matchingMovies.add(m);
                }
            }
            return matchingMovies;
    }




    @Override
    public List<Movie> findMovieByRole(List<Movie> movies) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите роль (например Indiana): ");
        String role = scan.next();
        List<Movie> mmm = new ArrayList<>();
        for (Movie m: database.getMovies()) {
            if(m.getCast().getRole().contains(role))
           mmm.add(m);
        }
        return mmm;
    }
}
