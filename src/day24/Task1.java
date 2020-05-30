package day24;

import java.util.HashSet;

public class Task1 {
    // create two set of student names, with duplicates
    //ex: team A: Dauke, Adilkhan, Shingis, Kuanish, Max
    //    team B: Ice, Max, Aydin, Damir, Shingis, Kuanish
    public static void main(String[] args) {
        HashSet<String> teamA = new HashSet<>();
        fillSet(teamA, new String[]{"Dauke", "Adilkhan", "Shingis", "Kuanish", "Max"});

        HashSet<String> teamB = new HashSet<>();
        fillSet(teamB, new String[]{"Ice", "Max", "Aydin", "Damir", "Shingis", "Kuanish"});

        int totalMembers =  totalmembers(teamA,teamB);
        System.out.println(totalMembers);
        HashSet<String> hardworkingteams=hardworkingteams(teamA,teamB);
        System.out.println(hardworkingteams);
        HashSet<String> onlyoneteam=onlyoneteam(teamA,teamB);
        System.out.println(onlyoneteam);

    }

    public static void fillSet(HashSet<String> team, String[] names) {
        for(String name : names) {
            team.add(name);
        }
    }

    // create method to find how many students we have in total
    public static int totalmembers(HashSet<String> teamA, HashSet<String> teamB){
    HashSet<String> allmember= new HashSet<>();
    allmember.addAll(teamA);
     allmember.addAll(teamB);
       return allmember.size();
    }
    // create method to find who is working in two teams
    public static HashSet<String> hardworkingteams(HashSet<String> teamA, HashSet<String> teamB){
      HashSet<String> result= new HashSet<>();
        result.addAll(teamA);
        result.retainAll(teamB); // kesisimini tut

        return result;


    }
    // create method to find who are assigned to only one team
    public static HashSet<String> onlyoneteam(HashSet<String> teamA, HashSet<String> teamB) {
        HashSet<String> result = new HashSet<>();
        result.addAll(teamA);
        result.addAll(teamB);
        result.removeAll(hardworkingteams(teamA,teamB));
       return result;
    }

}
