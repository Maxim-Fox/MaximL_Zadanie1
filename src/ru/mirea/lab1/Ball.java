package ru.mirea.lab1;

public class Ball {
    public String collor;
    public int diameter;
    public Ball(int diametr_tmp, String colot_tmp){
        collor = colot_tmp;
        diameter = diametr_tmp;
    }
    @Override
    public String toString() {
        return "Ball{" +
                "collor='" + collor + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}
