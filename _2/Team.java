package pack._1.exerciseTutor._2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Team {
    private static int newId = 0 ;
    private int id;
    private String name;
    private HashSet <FootballPlayer> listPlayersTeam = new HashSet<>();

    public Team(int id, String name) {
        this.id = ++newId;
        this.name = name;
    }
    public Team(String name, Set<FootballPlayer> listPlayersTeam) {
        this.id = ++newId;
        this.name = name;
        this.listPlayersTeam = new HashSet<>(listPlayersTeam);
    }
    // Getters
    public int getNewId() {return newId;}
    public int getId() {return id;}
    public String getName() {return name;}
    public HashSet<FootballPlayer> getListPlayersTeam() {return listPlayersTeam;}
// Setters --> al momento non ci interessano

    // ToString



    // Method
    public void printTeam(){
        for (FootballPlayer listPlayerTeam:listPlayersTeam) {
            System.out.println(listPlayerTeam.getName() + " " + listPlayerTeam.getSurName());
        }
    }

    public void addPlayer(FootballPlayer p){
        listPlayersTeam.add(p);
        }

//    @Override
//    public String toString() {
//        return "Team{" +
//                "newId=" + newId +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                ", listPlayersTeam=" + listPlayersTeam +
//                '}';
//    }
}

