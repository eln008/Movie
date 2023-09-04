package Model;

import java.util.List;

public class Director {
    private String dirName;
    private List<Movie> moviesDirected;

    public Director(String dirName, List<Movie> moviesDirected) {
        this.dirName = dirName;
        this.moviesDirected = moviesDirected;
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public List<Movie> getMoviesDirected() {
        return moviesDirected;
    }

    public void setMoviesDirected(List<Movie> moviesDirected) {
        this.moviesDirected = moviesDirected;
    }

    @Override
    public String toString() {
        return "\n======================================" +
                "\nDirector" +
                "\n    dirName: '" + dirName + '\'' +
                "\n    moviesDirected: " + moviesDirected +
                "\n";
    }

}
