/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.collabpaint.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 2110111
 */
public class Polygon {
    private List<Point> points;
    public Polygon() {
        this(new ArrayList<>());
    }
    
    public Polygon(List<Point> points) {
        this.points = points;
    }
     public int getAmountOfPoints() {
        return points.size();
    }
    
    public List<Point> getPoints() {
        return new ArrayList<>(points);
    }
    
    public void setPoints(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

}
