package com.cs.rp.model;

public class RpPlaySession {
    private int id;
    private RpWorld world;
    private RpCharacter character;

    public RpPlaySession() {}

    public RpPlaySession(int id, RpWorld world, RpCharacter character) {
        this.id = id;
        this.world = world;
        this.character = character;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public RpWorld getWorld() { return world; }
    public void setWorld(RpWorld world) { this.world = world; }

    public RpCharacter getCharacter() { return character; }
    public void setCharacter(RpCharacter character) { this.character = character; }
}
