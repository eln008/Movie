package Model;

import java.util.List;

public class Cast {
    private List<String> actors;
    private String role;

    public Cast(List<String> actors, String role) {
        this.actors = actors;
        this.role = role;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "\nCast{" +
                "\n    actors=" + actors +
                "\n    role='" + role + '\'' +
                "}";
    }
}

