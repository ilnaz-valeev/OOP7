import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = CalculatorLogger.getLogger();
        
        ComplexNumber a = new ComplexNumber(2, 3);
        ComplexNumber b = new ComplexNumber(1, 4);
        
        ComplexCalculator calculator = new ComplexCalculator();
        
        ComplexNumber resultAdd = calculator.calculate(a, b, new AddOperation());
        ComplexNumber resultMul = calculator.calculate(a, b, new MultiplyOperation());
        ComplexNumber resultDiv = calculator.calculate(a, b, new DivideOperation());
        
        logger.info(a + " + " + b + " = " + resultAdd);
        logger.info(a + " * " + b + " = " + resultMul);
        logger.info(a + " / " + b + " = " + resultDiv);
    }
}
//Принципы SOLID:

// Single Responsibility Principle (SRP): Каждый класс имеет одну ответственность. Класс ComplexNumber отвечает только за представление комплексного числа, а классы операций за выполнение своих специфических операций.

// Open/Closed Principle (OCP): Новые операции могут быть добавлены через реализацию интерфейса Operation, не изменяя существующий код.

// Liskov Substitution Principle (LSP): Все реализации интерфейса Operation могут быть заменены друг другом.

// Interface Segregation Principle (ISP): Интерфейс Operation определяет только один метод execute, который нужен для выполнения операции.

// Dependency Inversion Principle (DIP): ComplexCalculator зависит от абстракции Operation, а не от конкретных реализаций.

// Архитектурные паттерны:

// Используется паттерн Strategy, где конкретные операции (сложение, умножение, деление) инкапсулируются в отдельные классы, реализующие интерфейс Operation.

// Логирование: Модуль CalculatorLogger отвечает за настройку и использование логирования для калькулятора.