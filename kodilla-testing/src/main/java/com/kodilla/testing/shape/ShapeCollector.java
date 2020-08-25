package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector<S> {

   private Shape shape;



    ArrayList<Shape> geometric = new ArrayList<Shape>();

    public ShapeCollector(ArrayList<Shape> geometric) {
      this.geometric = geometric;
    }
    public ShapeCollector() {

    }

    public void addFigure(Shape shape){


        geometric.add(shape);

    }

    public void removeFigure(Shape shape){
        geometric.remove(shape);
    }

    public void getFigure(int n) {
        geometric.get(n);
    }

   // @Override
     public int size(){
         return geometric.size();
    }




}
