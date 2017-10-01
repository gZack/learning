package com.zkassa.learning.generics.typeErasure;

public class Test {
    public static void main(String[] args){
        /*MyNode mn = new MyNode(5);
        Node n = mn;            // A raw type - compiler throws an unchecked warning
        n.setData("Hello");
        Integer x = mn.data;

        System.out.println(x);// Causes a ClassCastException to be thrown.
*/
        MyNode mn = new MyNode(5);
        Node n = (MyNode)mn;         // A raw type - compiler throws an unchecked warning
        n.setData("Hello");
        //Integer x = (String)mn.data;





       /*for(Method m : MyNode.class.getDeclaredMethods()){
           System.out.println(String.format("%08X",m.getModifiers()) + " "
           + m.getReturnType().getSimpleName() + " " + m.getName());
       }*/
    }
}
