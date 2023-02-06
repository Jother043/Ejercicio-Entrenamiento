public class EsportsTournament {

    public void startTournament(IGamer[] players){
        for(IGamer game : players){
            game.playGame();
        }
    }

    public static void main(String[] args) {
        EsportsTournament tournament = new EsportsTournament();
        IGamer[] game = new IGamer[3];
        game[0] = new SportGamer();
        game[1] = new MOBAGamer();
        game[2] = new FPSGamer();
        tournament.startTournament(game);
    }
}
