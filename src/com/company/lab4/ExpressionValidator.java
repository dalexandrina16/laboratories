package com.company.lab4;

class ExpressionValidator {
    private boolean isValid;

    ExpressionValidator(String expression) {
        this.isValid = validateExpression(expression);
    }

    private boolean validateExpression(String expression) {
        int pcounter = 0;
        int rcounter = 0;
        int scounter = 0;
        for (String s: expression.split("")) {
            switch (s) {
                case "(":
                    pcounter++;
                    break;
                case ")":
                    pcounter--;
                    break;

                case "{":
                    rcounter++;
                    break;
                case "}":
                    rcounter--;
                    break;
                case "[" :
                    scounter++;
                    break;
                case "]":
                    scounter--;
            }
        }

        return scounter==0 && rcounter==0 && pcounter==0;
    }

    boolean isValid() {
        return isValid;
    }
}
