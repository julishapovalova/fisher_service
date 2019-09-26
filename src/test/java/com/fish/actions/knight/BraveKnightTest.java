package com.fish.actions.knight;

import com.fish.actions.exception.QuestException;
import com.fish.actions.minstrel.Minstrel;
import com.fish.actions.quest.Quest;
import com.fish.actions.quest.SlayDragonQuest;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() throws QuestException {
        Quest mockQuest = mock(SlayDragonQuest.class);
        Minstrel minstrel = mock(Minstrel.class);

        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();

        verify(mockQuest, times(1)).embark();
    }
}
