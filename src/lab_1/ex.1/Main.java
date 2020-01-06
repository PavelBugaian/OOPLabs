// Java program to demonstrate working of Scanner in Java
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
       Monitor firstMonitor = new Monitor();
       Monitor secondMonitor = new Monitor();

       firstMonitor.color = "white";
       firstMonitor.dimensions = 15.3f;
       firstMonitor.resolution = 720;

       secondMonitor.color = "blue";
       secondMonitor.dimensions = 14.3f;
       secondMonitor.resolution = 1080;

       if (firstMonitor.color.equals(secondMonitor.color)) {
           System.out.println("Monitors colors are the same");
       } else {
           System.out.println("Monitors colors are the different");
       }

       if (firstMonitor.dimensions > secondMonitor.dimensions) {
           System.out.println("First monitor's dimensions are bigger");
       } else if (firstMonitor.dimensions < secondMonitor.dimensions) {
           System.out.println("First monitor's dimensions are smaller");
       } else {
           System.out.println("Monitors' dimensions are the same");
       }

        if (firstMonitor.resolution > secondMonitor.resolution) {
            System.out.println("First monitor's resolution are bigger");
        } else if (firstMonitor.resolution < secondMonitor.resolution) {
            System.out.println("First monitor's resolution are smaller");
        } else {
            System.out.println("Monitors' resolution are the same");
        }
    }
}

class Monitor {
    String color;
    float dimensions;
    int resolution;
}