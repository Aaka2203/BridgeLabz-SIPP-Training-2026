interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription: Premium");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription: Gold");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie() {
        System.out.println("Streaming Movie...");
    }

    @Override
    public void playGame() {
        System.out.println("Launching Game...");
    }

    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public static void main(String[] args) {

        String[] movies = {
                "Avengers",
                "Interstellar",
                "Inception"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "GTA V"
        };

        SmartTV tv = new SmartTV();

        tv.streamMovie();
        tv.playGame();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies Available:");
        for (String movie : movies)
            System.out.println(movie);

        System.out.println("\nGames Available:");
        for (String game : games)
            System.out.println(game);
    }
}
