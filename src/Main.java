public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome To WorldCup Football ScoreBoard" + "\r\n");
        System.out.println(" Enter 0 to Show all matches " + "\r\n");
        try{
            Team tm = new Team();
            Matches mt = new Matches();
            tm.start_match();
            mt.selectTeam();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
