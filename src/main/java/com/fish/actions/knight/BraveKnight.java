package com.fish.actions.knight;

import com.fish.actions.exception.QuestException;
import com.fish.actions.minstrel.Minstrel;
import com.fish.actions.quest.Quest;

public class BraveKnight implements Knight {

    private Quest quest;
//    private Minstrel minstrel;

//    public BraveKnight(Quest quest, Minstrel minstrel) {
////        this.quest = quest;
////        this.minstrel = minstrel;
////    }


    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
