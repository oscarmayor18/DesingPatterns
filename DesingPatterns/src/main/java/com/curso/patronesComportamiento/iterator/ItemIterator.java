package com.curso.patronesComportamiento.iterator;

public interface ItemIterator {
    boolean hasNext();
    Item next();
    void reset();
}