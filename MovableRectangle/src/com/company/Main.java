package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nRectangle:\n");
        Movable m = new MovableRectangle(0, 0, 4, 4, 3,1);
        System.out.println(m);
        m.moveRight();
        m.moveDown();
        System.out.println("Right+Down -> " + m);

        System.out.println("\nChanging speed for rectangle:");
        MovableRectangle r = (MovableRectangle)m;
        r.setSpeed(2, 2); // change speed of topLeft point only!
        try{
            r.moveDown();
        }catch (IllegalStateException e){
            System.out.println(e);
        }
    }
}
