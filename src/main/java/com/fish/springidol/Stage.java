package com.fish.springidol;

public class Stage {
    private Stage() {
    }

    public static Stage getInstance() {
        return StageSingeltnHolder.instance;
    }

    private static class StageSingeltnHolder {
        static Stage instance = new Stage();
    }
}
