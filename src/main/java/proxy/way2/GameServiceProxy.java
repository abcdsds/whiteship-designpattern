package proxy.way2;

public class GameServiceProxy implements GameService {
    private GameService gameService;

    public GameServiceProxy(GameService gameService) {
        this.gameService = gameService;
    }

    @Override
    public void startGame() {
        System.out.println("Before");
        gameService.startGame();
        System.out.println("End");
    }
}
