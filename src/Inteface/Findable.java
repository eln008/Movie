package Inteface;

import Model.Movie;

import javax.swing.plaf.multi.MultiViewportUI;
import java.util.List;

public interface Findable {
    List<Movie> getAllMovies();

    Movie findMovieByFullNameOrPartName(String name);

    Movie findMovieByActorName( String name);

    Movie findMovieByYear(long num);

    List<Model.Movie> findMovieByDirector(String name);

    Movie findMovieByGenre(String name);

    Movie findMovieByRole(String role);
}
