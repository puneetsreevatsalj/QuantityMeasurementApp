# Design Explanation

## Overview

The Quantity Measurement App is designed using Object-Oriented Programming principles and follows a clean and scalable architecture.

## Use of Abstract Class

An abstract class `Quantity` is used as a base class.

### Reasons:
- Avoids duplication of conversion logic
- Provides a common structure for all units
- Ensures consistency in comparison

## Units Implementation

The following classes extend the `Quantity` class:
- Feet
- Inch
- Cm
- Yard

Each class overrides the `toInches()` method to convert its value into a common unit.

## Equality Logic

The `equals()` method compares all units based on their value converted into inches.

This ensures:
- Accurate comparison across different units
- Simplicity in logic

## Addition Logic

All units are converted into inches before performing addition.

This approach:
- Simplifies calculations
- Maintains consistency
- Supports multiple units

## Benefits of Design

- Clean and maintainable code
- Easy to extend (new units can be added easily)
- Reduces redundancy
- Follows OOP principles