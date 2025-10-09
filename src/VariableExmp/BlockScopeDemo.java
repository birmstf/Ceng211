package VariableExmp;

public class BlockScopeDemo {

    static int globalCounter = 50;

    public static void main(String[] args) {

        System.out.println("initially globalCounter: " + globalCounter);
        // local variable:Variable defined within the method
        int outerX = 5;
        System.out.println("inside local integer variable: " + outerX);

        // Variable defined inside the if block
        if (outerX > 2) {
            int innerY = 15;
            System.out.println("local variable outerX: " + outerX);
            System.out.println("Variable defined inside the if block blockVar: " + innerY);
            System.out.println("inside the if block globalCounter: " + globalCounter);// Global variable
        }

        // only valid within this if block
        //System.out.println("Variable defined inside the if block blockVar: " + innerY);

        //Extras
        //  inside for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("inside for loop i: " + i);
            //The variable i is only valid within this for block
        }


        int globalCounter = 100;
        System.out.println("inside main  globalCounter: " + globalCounter);

        // To access the actual field, we use the class name:
        System.out.println("Class level globalCounter: " + BlockScopeDemo.globalCounter);



    }
}