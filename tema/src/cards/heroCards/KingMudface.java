package cards.heroCards;

import cards.minionCards.MinionCard;
import fileio.ActionsInput;
import fileio.CardInput;
import main.GameInfo;

import java.util.ArrayList;

public class KingMudface extends HeroCard {
    public KingMudface() {
    }

    public KingMudface(final CardInput card) {
        super(card);
    }

    public KingMudface(final HeroCard card) {
        super(card);
    }

    /**
     *
     * @param game
     * @param action
     * @return
     */
    @Override
    public int cardEffect(final GameInfo game, final ActionsInput action) {
        // +1 viata pt toate cartile de pe rand

        ArrayList<MinionCard> row = game.getGameTable().getRows().get(action.getAffectedRow());

        for (int i = 0; i < row.size(); i++) {
            row.get(i).setHealth(row.get(i).getHealth() + 1);
        }

        return 0;
    }
}
