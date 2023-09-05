package Inteface;

import Model.Director;
import Model.Movie;

import javax.swing.plaf.multi.MultiViewportUI;
import java.util.List;

public interface Findable {
    List<Movie> getAllMovies(List<Movie> movies);

    List<Movie> findMovieByFullNameOrPartName(List<Movie>movies);

    List<Movie> findMovieByActorName(List<Movie>movies);

    List<Movie> findMovieByYear(List<Movie>movies);

    List<Model.Movie> findMovieByDirector(List<Director> directors);

    List<Movie> findMovieByGenre(List<Movie> movies);

    List<Movie> findMovieByRole( List<Movie> movies);

}
