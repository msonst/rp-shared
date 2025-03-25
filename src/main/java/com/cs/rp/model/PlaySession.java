package com.cs.rp.model;

public class PlaySession {
    private int id;
    private World world;
    private Character character;

    public PlaySession() {}

    public PlaySession(int id, World world, Character character) {
        this.id = id;
        this.world = world;
        this.character = character;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public World getWorld() { return world; }
    public void setWorld(World world) { this.world = world; }

    public Character getCharacter() { return character; }
    public void setCharacter(Character character) { this.character = character; }
}
