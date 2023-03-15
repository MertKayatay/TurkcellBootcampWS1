package org.example;

public class GamesManager implements GamesService {


    @Override
    public void add(Games games) {
        System.out.println("Game added");
    }

    @Override
    public void delete(Games games) {
        System.out.println("Game deleted");
    }

    @Override
    public void update(Games games) {
        System.out.println("Game updated");
    }

    @Override
    public void sell(Games games, User user, Promotions promotions) {
        System.out.println(games.getName() + " selled to " + user.getFirstName() + " with " + promotions.getDiscountRate() + " discount rate");

    }
}
