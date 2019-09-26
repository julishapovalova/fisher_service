package com.fish.springidol;


import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public Instrumentalist() {
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    @Autowired
    public void heresYourInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public String screamSong() {
        return song;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("Playing " + song + ":");
        instrument.play();
    }
}
