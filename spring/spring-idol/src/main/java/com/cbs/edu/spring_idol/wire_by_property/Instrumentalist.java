package com.cbs.edu.spring_idol.wire_by_property;

import com.cbs.edu.spring_idol.PerformanceException;
import com.cbs.edu.spring_idol.Performer;

public class Instrumentalist implements Performer {

    private Instrument instrument;
    private String song;

    public Instrumentalist() {
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String screamSong() {
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }
}