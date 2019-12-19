package com.company.lab4;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Main {

    private static List<String> readFileInList(String fileName)
    {
        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void main(String[] args) {
        System.out.println("One expression:");
        ExpressionValidator expressionValidator = new ExpressionValidator(readFileInList("/Users/mymac/Desktop/laboratories/src/com/company/lab4/one_expression.txt").get(0));
        System.out.println(expressionValidator.isValid());
        System.out.println("Three expressions:");
        for (String s: readFileInList("/Users/mymac/Desktop/laboratories/src/com/company/lab4/three_expressions.txt")) {
            ExpressionValidator local = new ExpressionValidator(s);
            System.out.println(local.isValid());
        }
    }
}
