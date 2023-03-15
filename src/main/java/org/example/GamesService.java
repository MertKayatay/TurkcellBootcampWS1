package org.example;

public interface GamesService {
    public void add(Games games);
    public void delete(Games games);
    public void update(Games games);
    public void sell(Games games, User user, Promotions promotions);

}
