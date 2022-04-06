import java.util.*;
public class Team {
    Integer initialScore = 0;
    ArrayList<String> availableGames = new ArrayList<String>(10);
    public Team(){
        availableGames.add("1");
        availableGames.add("Mexico");
        availableGames.add("Canada");
        availableGames.add("2");
        availableGames.add("Spain");
        availableGames.add("Brazil");
        availableGames.add("3");
        availableGames.add("Germany");
        availableGames.add("France");

    }
    public void availableTeams(){
        System.out.println("s/n Home Team(HT) HT Score \t Away Team(AT) \t AT Score");
        for(int k = 0; k < availableGames.size(); k = k+3){
            System.out.print(availableGames.get(k));
            if(k + 1 < availableGames.size())
            {
                System.out.print("\t" + availableGames.get(k+1) + "\t\t\t" + initialScore);
            }
            if(k + 1 < availableGames.size())
            {
                System.out.print("\t\t\t" + availableGames.get(k+2) + "\t\t\t" + initialScore);
            }
            System.out.println();
        }
    }

    public void start_match(){
        Scanner scan = new Scanner(System.in);
        int i;
        i = scan.nextInt();

        if ( i == 0){
            availableTeams();
        }
        else {
            System.out.println("Invalid Request"+ "\r\n");
            System.out.println(" Enter 0 to Show all matches " + "\r\n");
            start_match();
        }

    }
}
