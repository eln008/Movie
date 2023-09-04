package Inteface;

import Model.Movie;

import javax.swing.plaf.multi.MultiViewportUI;
import java.util.List;

public interface Findable {
    List<Movie> getAllMovies();

    List<Movie> findMovieByFullNameOrPartName(List<Movie>movies);

    List<Movie> findMovieByActorName(List<Movie>movies);

    List<Movie> findMovieByYear(List<Movie>movies);

    List<Model.Movie> findMovieByDirector(List<Movie>movies);

    List<Movie> findMovieByGenre(List<Movie> movies);

    List<Movie> findMovieByRole( List<Movie> movies);

}
