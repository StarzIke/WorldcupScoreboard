import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Matches {
    int initialScore = 0;
    Scanner scan = new Scanner(System.in);
    ArrayList<String> playedGames = new ArrayList<String>(10);

    ArrayList<Integer> scores = new ArrayList<Integer>(10);
    Random random = new Random();
    int max = 10;
    Team team = new Team();


    public void selectTeam() {
        ArrayList<String> availableGames = new ArrayList<String>();
        availableGames.add("1");
        availableGames.add("Mexico");
        availableGames.add("Canada");
        availableGames.add("2");
        availableGames.add("Spain");
        availableGames.add("Brazil");
        availableGames.add("3");
        availableGames.add("Germany");
        availableGames.add("France");
        int new_score1 = random.nextInt(max);
        int new_score2 = random.nextInt(max);
        System.out.println("\r\nEnter s/n of match to Select match ");

        int i;
        i = scan.nextInt();
        switch(i){
            case 1:
                System.out.println( availableGames.get(1) + "\t\t\t" + initialScore + "\t\t\t" + availableGames.get(2) + "\t\t\t" + initialScore + "\r\n");
                System.out.println("To Update This Match, Enter 1 : To End, Enter 2 ");
                i = scan.nextInt();
                if ( i == 1){

                    System.out.println("\r\nGame Updated");
                    System.out.println(availableGames.get(1) + "\t\t\t" + new_score1 + "\t\t\t" + availableGames.get(2) + "\t\t\t" + new_score2 );
                    createScoreBoard(availableGames.get(0), availableGames.get(1), availableGames.get(2), new_score1, new_score2);
                }
                else if(i==2){
                    System.out.println("Game Ended");
                    System.out.println( availableGames.get(1) + "\t\t\t" + initialScore + "\t\t\t" + availableGames.get(2) + "\t\t\t" + initialScore);
                    createScoreBoard(availableGames.get(0), availableGames.get(1), availableGames.get(2), initialScore, initialScore);
                }else{
                    System.out.println("Please Enter a valid input");
                    selectTeam();
                }
                break;
            case 2:
                System.out.println(availableGames.get(4) + "\t\t\t" + initialScore + "\t\t\t" + availableGames.get(5) + "\t\t\t" + initialScore + "\r\n");
                System.out.println("To Update This Match, Enter 1 : To End, Enter 2 ");
                i = scan.nextInt();
                if (i == 1){
                    System.out.println("\r\nGame Updated");
                    System.out.println(availableGames.get(4) + "\t\t\t" + new_score1 + "\t\t\t" + availableGames.get(5) + "\t\t\t" + new_score2 );
                    createScoreBoard(availableGames.get(3), availableGames.get(4), availableGames.get(5), new_score1, new_score2);
                }
                else if(i==2){
                    System.out.println("Game Ended");
                    System.out.println( availableGames.get(4) + "\t\t\t" + initialScore + "\t\t\t" + availableGames.get(5) + "\t\t\t" + initialScore);
                    createScoreBoard(availableGames.get(3), availableGames.get(4), availableGames.get(5), initialScore, initialScore);
                }
                else{
                    System.out.println("Please Enter a valid input");
                    selectTeam();
                }
                break;
            case 3:
                System.out.println( availableGames.get(7) + "\t\t\t" + initialScore + "\t\t\t" + availableGames.get(8) + "\t\t\t" + initialScore + "\r\n");
                System.out.println("To Update This Match, Enter 1 : To End, Enter 2 ");
                i = scan.nextInt();
                if ( i == 1){

                    System.out.println("\r\nGame Updated");
                    System.out.println(availableGames.get(7) + "\t\t\t" + new_score1 + "\t\t\t" + availableGames.get(8) + "\t\t\t" + new_score2 );
                    createScoreBoard(availableGames.get(6), availableGames.get(7), availableGames.get(8), new_score1, new_score2);
                }
                else if(i==2){
                    System.out.println("Game Ended");
                    System.out.println(availableGames.get(7) + "\t\t\t" + initialScore + "\t\t\t" + availableGames.get(8) + "\t\t\t" + initialScore);
                    createScoreBoard(availableGames.get(6), availableGames.get(7), availableGames.get(8), initialScore, initialScore);
                }
                else{
                    System.out.println("Please Enter a valid input");
                    selectTeam();
                }
                break;
            default:
                System.out.println("Wrong Input");
                selectTeam();
        }
    }

    public void createScoreBoard(String serialNum, String homeTeam, String awayTeam, Integer score1, Integer score2){

        playedGames.add(homeTeam);
        playedGames.add(awayTeam);
        scores.add(score1);
        scores.add(score2);

        team.availableGames.remove(serialNum);
        team.availableGames.remove(homeTeam);
        team.availableGames.remove(awayTeam);

        System.out.println("\r\nThis Match Has Ended !!!");
        System.out.println("Enter 1 to View ScoreBoard OR 2 To Continue");

        int m;
        m = scan.nextInt();
        if(m == 1){
            System.out.println("\r\nFootball Scoreboard");
            System.out.println("\nHome Team(HT) HT Score \t Away Team(AT) \t AT Score");
            getPlayedMatches();
            System.out.println("\r\nEND OF WORLDCUP FOOTBALL GAMES ");
        }else{
            System.out.println("\r\nAvailable Matches");
            System.out.println("\r\ns/n Home Team(HT) HT Score \t Away Team(AT) \t AT Score");
            getAvailableMatches();
            selectTeam();
        }
    }

    public void getAvailableMatches(){
        for(int k = 0; k < team.availableGames.size(); k = k+3){
            System.out.print(team.availableGames.get(k));
            if(k + 1 < team.availableGames.size())
            {
                System.out.print("\t" + team.availableGames.get(k+1) + "\t\t\t" + initialScore);
            }
            if(k + 2 < team.availableGames.size())
            {
                System.out.print("\t\t\t" + team.availableGames.get(k+2) + "\t\t\t" + initialScore);
            }
            System.out.println();
        }
    }

    public void getPlayedMatches(){
        for(int k = 0; k < playedGames.size(); k = k+2){
            System.out.print(playedGames.get(k) + "\t\t\t" + scores.get(k));
            if(k + 1 < playedGames.size())
            {
                System.out.print("\t" + playedGames.get(k+1) + "\t\t\t" + scores.get(k+1));
            }

            System.out.println();
        }

    }
}

