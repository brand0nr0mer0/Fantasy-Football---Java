package br.fantasy.models;

/**
 * Created by br9y2e2 on 3/23/16.
 */
public class Athlete {


    private String firstName;
    private String lastName;
    private String mainLink;
    private String position;


    public Athlete(String firstName, String lastName, String mainLink, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mainLink = mainLink;
        this.position = position;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMainLink() {
        return mainLink;
    }

    public void setMainLink(String mainLink) {
        this.mainLink = mainLink;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
