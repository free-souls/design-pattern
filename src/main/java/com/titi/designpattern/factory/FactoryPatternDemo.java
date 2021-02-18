package com.titi.designpattern.factory;

import com.titi.designpattern.factory.entity.Shape;

/**
 * @author bianyulong
 * @description
 * @create 2021/02/07
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape square = shapeFactory.getShape(ShapeEnum.Square);
        square.draw();

        Shape triangle = shapeFactory.getShape(ShapeEnum.Triangle);
        triangle.draw();

        Shape circle = shapeFactory.getShape(ShapeEnum.Circle);
        circle.draw();
    }
}
