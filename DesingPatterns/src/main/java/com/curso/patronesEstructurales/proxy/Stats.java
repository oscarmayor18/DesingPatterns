package com.curso.patronesEstructurales.proxy;

import java.io.Serializable;
import java.util.Date;

public class Stats implements Serializable {
    private static final long serialVersionUID=1L;
    private String name;
    private int level;
    private int kill;
    private int deaths;
    private Date createdAt;
    private Date lastSave;

    public Stats(String name, int level, int kill, int deaths) {
        this.name = name;
        this.level = level;
        this.kill = kill;
        this.deaths = deaths;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill = kill;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastSave() {
        return lastSave;
    }

    public void setLastSave(Date lastSave) {
        this.lastSave = lastSave;
    }

    @Override
    public String toString() {
        return "Stats{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", kill=" + kill +
                ", deaths=" + deaths +
                ", createdAt=" + createdAt +
                ", lastSave=" + lastSave +
                '}';
    }
}
