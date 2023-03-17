package org.example.services.manager;

import org.example.entities.Games;
import org.example.entities.Promotions;
import org.example.services.PromotionService;

public class PromotionManager implements PromotionService {

    public void add(Games games,Promotions promotions){
        System.out.println(promotions.getPromotionDescription() + " promotion was defined for the " +  games.getName() + " game");
    }

    public void delete(Games games, Promotions promotions){
        System.out.println(promotions.getPromotionDescription() + " promotion was deleted for the " +  games.getName() + " game");
    }

    @Override
    public void update(Games games, Promotions promotions) {
        System.out.println(promotions.getPromotionDescription() + " promotion was updated for the " +  games.getName() + "game");
    }
}
