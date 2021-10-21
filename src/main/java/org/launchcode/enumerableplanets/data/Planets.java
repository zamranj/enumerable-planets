package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury",88),
    VENUS("Venus",225),
    EARTH("Earth",365),
    MARS("Mars",687),
    JUPITER("Jupiter",4333),
    SATURN("Saturn",10759),
    URANUS("Uranus",30687),
    NEPTUNE("Neptune",60200);

    private String name;
    private int yearLength;

    Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }
    public String getName(){
        return this.name;
    }
    public int getYearLength(){
        return this.yearLength;
    }


}
