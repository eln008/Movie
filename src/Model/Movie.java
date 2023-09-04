package Model;

public class Movie {
    private String title;
    private int releaseYear;
    private String genre;
    private Cast cast;

    public Movie(String title, int releaseYear, String genre, Cast cast) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Cast getCast() {
        return cast;
    }

    public void setCast(Cast cast) {
        this.cast = cast;
    }

//    @Override
//    public String toString() {
//        return "\nMovie{" +
//                "\n    title='" + title + '\'' +
//                "\n    releaseYear=" + releaseYear +
//                "\n    genre='" + genre + '\'' +
//                "\n    cast=Model.Cast@" + Integer.toHexString(System.identityHashCode(cast)) +
//                "}";
//    }

//    @Override
//    public String toString() {
//        return "\nMovie{" +
//                "\ntitle='" + title + '\'' +
//                ", \nreleaseYear=" + releaseYear +
//                ", \ngenre='" + genre + '\'' +
//                ", \ncast=" + (cast != null ? cast.toString() : "null") + // Явный вызов toString()
//                '}';
//    }


    @Override
    public String toString() {
        return
                "\n======================================" +
                "\nMovie" +
                " \ntitle: '" + title + '\'' +
                ",\nreleaseYear: " + releaseYear +
                ",\ngenre: '" + genre + '\'' +
                "," + cast +
                "\n";
    }
}
