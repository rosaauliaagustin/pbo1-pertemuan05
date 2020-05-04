public class Main {
    public static void main(String[] args) {
        //instance
        PUBGM player1 = new PUBGM();
        PUBGM player2 = new PUBGM();

        player1.userName = "RosaAuliaaa";
        player1.score = 1/100;
        player2.length= 4.5;

        player1.userName = "Lokotolo";
        player1.score = 2/100;
        player2.length= 4.0;

        player1.Winnerwinnerchickendinner();

        System.out.println(player1.score);
        player1.BattleGrounds(player2);
        System.out.println(player1.score);
    }
}
