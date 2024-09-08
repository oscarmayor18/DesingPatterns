package com.curso.patronesEstructurales.proxy;

import java.io.*;
import java.util.Date;

public class GameImpl implements Game{

    private Stats stats;

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    @Override
    public void save(String name) {
        try {
            writeObject(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Stats load(String name) {
        Stats stats1= null;
        try {
            stats1 = (Stats) readObject(name);
            setStats(stats1);
            return stats1;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void newGame(String name){
        File file = new File(name);
        Stats stats1 = new Stats(name,1,0,0);
        stats1.setCreatedAt(new Date());
        stats1.setLastSave(new Date());
        setStats(stats1);
        try {
            file.createNewFile();
            writeObject(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void writeObject(String name) throws IOException {
        FileOutputStream fos= new FileOutputStream(name);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(getStats());
        oos.flush();
        oos.close();
        fos.flush();
        fos.close();
    }

    private Object readObject(String name) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(name);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object stats = ois.readObject();
        ois.close();
        fis.close();
        return stats;
    }
}
