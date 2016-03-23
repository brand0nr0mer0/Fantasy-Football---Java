package br.fantasyfootball;

import br.fantasy.webscripts.AthleteFactory;

public class Main {

    public static void main(String[] args) {

        AthleteFactory athletes = new AthleteFactory();

        String athleteUrl = athletes.properties.getProperty("base") + athletes.properties.getProperty("playerExtension");

        athletes.assembleListOfAllAthletes(athleteUrl);


    }
}
