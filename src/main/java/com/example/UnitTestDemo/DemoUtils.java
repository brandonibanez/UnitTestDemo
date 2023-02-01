package com.example.UnitTestDemo;

import java.util.List;

public class DemoUtils {

    private String name = "My name is Bob";
    private String nameDuplicate = name;
    private String[] firstThreeLettersOfAlphabet = {"A", "B", "C"};
    private List<String> nameInList = List.of("My", "name", "is", "Bob");

    public String getName() {
        return name;
    }

    public String getNameDuplicate() {
        return nameDuplicate;
    }

    public String[] getFirstThreeLettersOfAlphabet() {
        return firstThreeLettersOfAlphabet;
    }

    public List<String> getNameInList() {
        return nameInList;
    }

    public boolean checkIfN1GreaterThanN2(int n1, int n2) {
        return n1 > n2;
    }

    public int add(int i, int j) {
        return i + j;
    }

    public Object checkNullOrNotNull(Object obj) {
        if(obj != null)
            return obj;
        return null;
    }

}
