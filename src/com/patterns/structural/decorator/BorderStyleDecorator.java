package com.patterns.structural.decorator;

public class BorderStyleDecorator extends ShapeDecorator{

    private String style;

    public BorderStyleDecorator(Shape decoratedShape, String style) {
        super(decoratedShape);
        this.style = style;
    }

    @Override
    public void draw() {
        // decoro antes
        this.decoratedShape.draw(); // funcionalidad original
        // decoro despues
        System.out.println("Border style is:  " + this.style);
    }

    @Override
    public void resize() {
        this.decoratedShape.resize();
        // TODO decorar
    }

    @Override
    public String description() {
        return this.decoratedShape.description() + " decorated with border style: " + style;
    }

    @Override
    public boolean isHide() {
        return this.decoratedShape.isHide();
    }
}
