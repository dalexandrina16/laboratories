package com.company.lab3;

public class TextEdit {
    String text;
    String[] vowels = {"a", "e", "i", "o", "u"};
    private int consCount = 0;
    private int vowCount = 0;

    public TextEdit(String text) {
        this.text = text;
        countConsVow();
    }

    public String[] sentences() {
        return text.split("\\.");
    }

    public String[] words() {
        return text.split("\\s+|,\\s*|\\.\\s*");
    }

    public String[] letters() {
        return text.split("");
    }

    public void showWords() {
        for (int i = 0; i < words().length; i++) {
            System.out.println(words()[i]);
        }
    }

    public void showSentences() {
        for (int i = 0; i < sentences().length; i++) {
            System.out.println(sentences()[i]);
        }
    }

    public void showLetters() {
        for (int i = 0; i < letters().length; i++) {
            System.out.println(letters()[i]);
        }
    }

    public int nrofsentences(){
        return sentences().length;
    }

    public int nrofwords(){
        return words().length;
    }

    public int getConsCount() {
        return consCount;
    }

    public int getVowCount() {
        return vowCount;
    }

    public void countConsVow() {
        for (int i = 0; i < letters().length; i++) {
            if(letters()[i].equals("a") || letters()[i].equals("e") || letters()[i].equals("i") || letters()[i].equals("o") || letters()[i].equals("u")){
                vowCount++;
            } else if(!(letters()[i].equals("\\.") && letters()[i].equals(",") && letters()[i].equals(" "))){
                consCount++;
            }
        }
    }

    public String getLongest() {
        String local = new String("");
        for (int i = 0; i < words().length; i++) {
            if (words()[i].length()>local.length()){
                local = words()[i];
            }
        }
        return local;
    }
}
