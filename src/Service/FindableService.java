package Service;

import Inteface.Findable;
import Model.Cast;
import Model.DataBase;
import Model.Director;
import Model.Movie;

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
    public Movie findMovieByFullNameOrPartName(String name) {
        for (Movie m : database.getMovies()) {
            if (m.getTitle().contains(name)) {
                return m;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByActorName(String name) {
        for (Movie m : database.getMovies()) {
            Cast cast = m.getCast();
            List<String> actors = cast.getActors();
            for (String actor : actors) {
                if (actor.trim().contains(name.trim())) {
                    System.out.println("Найден фильм с актером " + name);
                    return m;
                }
            }

        }
        return null;
    }

    @Override
    public Movie findMovieByYear(long num) {
        for (Movie m: database.getMovies()) {
            if(m.getReleaseYear() == num){
                return m;
            }
        }
        return null;
    }

    @Override
    public List<Model.Movie> findMovieByDirector(String name) {
        for (Director d : database.getDirectors()) {
            if(d.getDirName().contains(name)){
                return d.getMoviesDirected();
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByGenre(String name) {
        for (Movie m : database.getMovies()) {
            if(m.getGenre().contains(name)){
                return m;
            }
        }
        return null;
    }

    @Override
    public Movie findMovieByRole(String role) {
        for (Movie m: database.getMovies()) {
           if(m.getCast().getRole().contains(role)){
               return m;
           }
        }
        return null;
    }
}
