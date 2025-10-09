package VariableExmp;

public class StaticVariable {
    static int variableCounter=0;

        public void incrementCounter(int objNo) {
            variableCounter++;
            System.out.println("Counter: "+objNo +" : " + variableCounter);
        }

        public static void main(String[] args) {
            // create two different instances
            StaticVariable varObj1 = new StaticVariable();
            StaticVariable varObj2= new StaticVariable();

            // call incrementCounter from both
            varObj1.incrementCounter(1);  // Counter: 1
            varObj2.incrementCounter(2);  // Counter: 2
        }
    }


