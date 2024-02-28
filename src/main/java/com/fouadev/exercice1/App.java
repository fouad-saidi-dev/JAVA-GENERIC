package com.fouadev.exercice1;

public class App {
    public static void main(String[] args) {

        System.out.println("-----------Integer Generic---------");

        //Integer
        StorageGenerique<Integer> integerStorage = new StorageGenerique<>();

        integerStorage.addElement(1);
        integerStorage.addElement(2);
        integerStorage.addElement(3);
        System.out.println("List: "+integerStorage.list);

        System.out.println(integerStorage.getElement(0));

        integerStorage.removeElement(0);

        System.out.println(integerStorage.getSize());

        System.out.println("-----------Double Generic---------");

        //Double
        StorageGenerique<Double> doubleStorage = new StorageGenerique<>();

        doubleStorage.addElement(1.5);
        doubleStorage.addElement(2.0);
        doubleStorage.addElement(3.6);
        doubleStorage.addElement(4.5);
        System.out.println("List: "+doubleStorage.list);

        System.out.println(doubleStorage.getElement(0));

        doubleStorage.removeElement(0);

        System.out.println(doubleStorage.getSize());

        System.out.println("-----------String Generic---------");

        //String
        StorageGenerique<String> stringStorage = new StorageGenerique<>();

        stringStorage.addElement("abc");
        stringStorage.addElement("dedf");
        stringStorage.addElement("udiu");
        stringStorage.addElement("abk");
        System.out.println("List: "+stringStorage.list);

        System.out.println(stringStorage.getElement(0));

        stringStorage.removeElement(0);

        System.out.println(stringStorage.getSize());

    }
}
