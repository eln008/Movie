package Inteface;

import Model.Director;
import Model.Movie;

import java.util.List;

public interface Sortable {
    void sortByMovieName(List<Movie> movies1);

    void sortByYear(List<Movie> movies1);

    void sortByDirector(List<Director> directors1);
}
