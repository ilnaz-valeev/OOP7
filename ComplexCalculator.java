public class ComplexCalculator {
  public ComplexNumber calculate(ComplexNumber a, ComplexNumber b, Operation operation) {
      return operation.execute(a, b);
  }
}
