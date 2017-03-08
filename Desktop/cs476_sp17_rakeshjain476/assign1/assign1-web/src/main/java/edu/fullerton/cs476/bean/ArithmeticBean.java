package edu.fullerton.cs476.bean;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 * Created by Rakesh J on 3/5/2017.
 */
@ApplicationScoped
@ManagedBean(name = "arithmeticBean")
public class ArithmeticBean {


    String operation;
    int firstNumber;

    int secondNumber;

    int result;

    public String getOperation() {
        return operation;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getResult() {
        return result;
    }
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setResult(int result) {
        this.result = result;
    }
    public void addition(int firstNumber, int secondNumber){
        result = firstNumber + secondNumber;

        setFirstNumber(firstNumber);
        setSecondNumber(secondNumber);
        setOperation("add");
        setResult(result);
    }

    public int subtraction(int firstNumber, int secondNumber){
        result = firstNumber - secondNumber;
        setFirstNumber(firstNumber);
        setSecondNumber(secondNumber);
        setResult(result);
        setOperation("subtract");
        return result;
    }

    public void multiplication(int firstNumber, int secondNumber){
        result = firstNumber * secondNumber;
        setFirstNumber(firstNumber);
        setSecondNumber(secondNumber);
        setOperation("multiply");
        setResult(result);

    }

    public void division(int firstNumber, int secondNumber){
        result = firstNumber / secondNumber;
        setFirstNumber(firstNumber);
        setSecondNumber(secondNumber);
        setOperation("divide");
        setResult(result);

    }
}
