package pack._1.exerciseTutor._2;

import java.util.*;

public class Main {

public static void main(String[] args) {

    FootballPlayer maradona = new FootballPlayer("Diego Armando", "Maradona");
    FootballPlayer messi = new FootballPlayer("Lionel", "Messi");
    FootballPlayer ronaldo = new FootballPlayer("Cristian", "Ronaldo");
    FootballPlayer oshimen = new FootballPlayer("Victor", "Oshimen");
    FootballPlayer cannavaro = new FootballPlayer("Fabio", "Cannavaro");

    // Team A
    HashSet<FootballPlayer> threePlayers = new HashSet<>(Set.of(maradona, messi, oshimen));
//    threePlayers.addAll(Set.of(maradona,messi,oshimen)); // più rapido il modo di sopra

    Team teamA = new Team("Team A", threePlayers);

    // Team b
    Team teamB = new Team(0, "teamB");
    teamB.addPlayer(ronaldo);
    teamB.addPlayer(cannavaro);

//    teamA.printTeam();
//    teamB.printTeam();

    // Ho prima ciclato il mio team per avere accesso ai singolo item, e poi quando ho il singolo item posso accedere ai metodi di quella classe e popolarli.
    for (FootballPlayer t : teamA.getListPlayersTeam()) {
        t.setNumAssist((int) (Math.random() * 11));
        t.setNumGol((int) (Math.random() * 11));
        t.setNumeroPresenze((int) (Math.random() * 31));
        if (t.getNumGol() >= 5 || t.getNumAssist() >= 7 && t.getNumeroPresenze() >= 20) {
            System.out.println(t.getName() + " " + t.getSurName() + " Gol: " + t.getNumGol() + "Assist: " + t.getNumAssist() + "Presenze: " + t.getNumeroPresenze());
        } else {
            System.out.println(t.getName() + " " + t.getSurName() + " Gol: " + t.getNumGol() + "Assist: " + t.getNumAssist() + "Presenze: " + t.getNumeroPresenze());
        }
    }

    System.out.println("-------------------------------");
// Creazione Team C con i giocatori del team A + team B
    HashSet fPlayerTeamC = new HashSet();
    fPlayerTeamC.addAll(teamA.getListPlayersTeam());
    fPlayerTeamC.addAll(teamB.getListPlayersTeam());
    Team teamC = new Team("Team C", fPlayerTeamC);

    System.out.println("Team C");

    for (FootballPlayer t : teamC.getListPlayersTeam()) {
        t.setNumAssist((int) (Math.random() * 11));
        t.setNumGol((int) (Math.random() * 11));
        t.setNumeroPresenze((int) (Math.random() * 31));
        if (t.getNumGol() >= 5 || t.getNumAssist() >= 7 && t.getNumeroPresenze() >= 20) {
            System.out.println(t.getName() + " " + t.getSurName() + " Gol: " + t.getNumGol() + "Assist: " + t.getNumAssist() + "Presenze: " + t.getNumeroPresenze());
        } else {
            System.out.println(t.getName() + " " + t.getSurName() + " Gol: " + t.getNumGol() + "Assist: " + t.getNumAssist() + "Presenze: " + t.getNumeroPresenze());
        }
    }

    HashMap<FootballPlayer, Double> newMap = new HashMap<>();

    for (FootballPlayer p : teamC.getListPlayersTeam()) {
        newMap.put(p, p.score());
    }

    for (Map.Entry<FootballPlayer, Double> entry : newMap.entrySet()) {
        if(entry.getValue() > 0.6){
            System.out.println(entry.getKey().getName() + " " + entry.getKey().getSurName() + " " + entry.getValue());
        }
    }

    }
}
