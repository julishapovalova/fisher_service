package com.fish.actions.knight;

import com.fish.actions.quest.RescueDamselQuest;
import com.fish.actions.exception.QuestException;

public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        quest = new RescueDamselQuest();
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
