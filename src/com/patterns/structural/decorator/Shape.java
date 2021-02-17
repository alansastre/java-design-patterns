package com.patterns.structural.decorator;

/**
 * Interfaz componente
 */
public interface Shape {

    void draw();

    void resize();

    String description();

    boolean isHide();
}
