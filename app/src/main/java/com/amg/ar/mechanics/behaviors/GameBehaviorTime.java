package com.amg.ar.mechanics.behaviors;

import com.amg.ar.mechanics.informations.GameInformation;
import com.amg.ar.mechanics.informations.GameInformationTime;

public abstract class GameBehaviorTime extends GameBehaviorStandard {

    protected GameInformationTime mGameInformation;

    @Override
    public void setGameInformation(GameInformation gameInformation) {
        super.setGameInformation(gameInformation);
        mGameInformation = (GameInformationTime) gameInformation;
    }

    public long getCurrentTime() {
        return mGameInformation.getCurrentTime();
    }

    public void setStartingTime() {
        mGameInformation.setStartingTime();
    }

    public void setEndingTime() {
        mGameInformation.setEndingTime();
    }

    public long getPlayingTime() {
        return mGameInformation.getPlayingTime();
    }

    public abstract void tick(long tickingTime);
}
