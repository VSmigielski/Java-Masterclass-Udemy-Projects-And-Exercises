// Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber
// and secondNumber both of type double.
// Write the following methods (instance methods).
// Method named getFirstNumber, it needs to return the value of firstNumber field.
// Method named getSecondNumber, it needs to return the value of secondNumber field.
// Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
// Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
// Method named getAdditionResult without parameters, it needs to return the result of adding firstNumber and secondNumber.
// Method named getSubtractionResult without parameters, it needs to return the result of subtracting firstNumber and secondNumber.
// Method named getMultiplicationResult without parameters, it needs to return the result of multiplying firstNumber and
// secondNumber.
// Method named getDivisionResult without parameters, it needs to return the result of dividing firstNumber and secondNumber. In
// case the value of second number is 0, then return 0.
public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        return (firstNumber + secondNumber);
    }

    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResult() {
        return (firstNumber * secondNumber);
    }

    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        } else {
            return (firstNumber / secondNumber);
        }
    }
}
