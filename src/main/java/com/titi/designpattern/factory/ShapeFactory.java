package com.titi.designpattern.factory;

import com.titi.designpattern.factory.entity.Circle;
import com.titi.designpattern.factory.entity.Shape;
import com.titi.designpattern.factory.entity.Square;
import com.titi.designpattern.factory.entity.Triangle;

/**
 * @author bianyulong
 * @description
 * @create 2021/02/07
 */
public class ShapeFactory {

    public Shape getShape(ShapeEnum shapeEnum) {
        Shape shape = null;
        switch (shapeEnum) {
            case Square:
                shape = new Square();
                break;
            case Triangle:
                shape = new Triangle();
                break;
            case Circle:
                shape = new Circle();
                break;
        }
        return shape;
    }
}
