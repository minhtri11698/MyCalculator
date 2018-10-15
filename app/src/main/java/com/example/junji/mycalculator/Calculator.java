package com.example.junji.mycalculator;

public class Calculator {
    String input = "0";
    String temp = "";
    String math = "";
    double result;

    public void numBtnOnClick(String s) {
        resetInput();
        if (input.equals("0")) {
            input = "";
        }
        if (input.length() < 11) {
            input += s;
        }
    }

    public void deleteBtn(){
        if (input.length() == 2 && input.substring(0,1).equals("-") || input.length() == 1){
            input = "0";
        } else {
            input = input.substring(0, input.length() - 1);
        }
    }

    public void revBtnOnClick(){
        if (!input.equals("0")) {
            if (input.substring(0, 1).equals("-")) {
                input = input.substring(1);
            } else {
                input = new StringBuilder().append("-").append(input).toString();
            }
        }
    }

    public void doMathBtn(String m){
        if (temp.equals("")){
            temp = input;
            input = "0";
            math = m;
        } else if (math.equals("+")){
            result = Double.parseDouble(temp) + Double.parseDouble(input);
            setInput(m);
        } else if (math.equals("*")){
            result = Double.parseDouble(temp) * Double.parseDouble(input);
            setInput(m);
        } else if (math.equals("-")){
            result = Double.parseDouble(temp) - Double.parseDouble(input);
            setInput(m);
        } else if (math.equals("/")){
            if (!input.equals("0")) {
                result = Double.parseDouble(temp) / Double.parseDouble(input);
                setInput(m);
            }
        }
    }

    public void clearBtnOnClick(){
        input = "0";
    }

    public void clrAllBtnOnClick(){
        input = "0";
        temp = "";
        math = "";
    }

    public void equalBtn(){
        if (math.equals("/") && input.equals("0")){
            input = "Cannot divide by zero";
        }
        else {
            doMathBtn(math);
            input = temp;
        }
        result = 0;
        temp = "";
        math = "=";
    }

    public void dotBtnOnClick(){
        if (!input.contains(".")){
            input += ".";
        }
    }

    public void resetInput(){
        if (math.equals("=")){
            input = "0";
            math = "";
        }
    }

    public void setInput(String s){
        temp = Double.toString(result);
        input = "0";
        math = s;
    }
}
