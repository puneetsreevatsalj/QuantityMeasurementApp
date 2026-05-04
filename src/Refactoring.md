# Refactoring Explanation

## Before Refactoring (UC1 - UC7)

- Each class (Feet, Inch, Cm, Yard) had its own comparison logic
- Multiple `equals()` methods with repeated code
- Conversion logic was scattered across classes
- Difficult to maintain and extend

## After Refactoring (UC8)

- Introduced an abstract class `Quantity`
- All units extend the base class
- Centralized conversion logic using `toInches()`
- Single `equals()` method in base class

## Improvements

### 1. Code Reusability
Common logic is reused through inheritance.

### 2. Reduced Duplication
Removed repeated comparison logic.

### 3. Maintainability
Changes can be made in one place.

### 4. Scalability
New units can be added easily by extending `Quantity`.

### 5. Clean Design
Follows Object-Oriented principles:
- Abstraction
- Inheritance
- Polymorphism

## Conclusion

Refactoring significantly improved the structure, readability, and flexibility of the application without changing its functionality.