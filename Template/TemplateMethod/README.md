#Template Method Pattern

The Template Method Pattern defines the skeleton of an algorithm in a method, defering some steps to subclasses. Template Method lets subclasses redefine certain steps of an algrithm without changing the algorithm's structure.

Design Principles:

- The Hollywood Principle - Don't call use, we'll call you. It allows low-level components (e.g. Tea or Coffee) to hook themselves into a system, but the high-level components (CaffeineBaverage) determin when they are needed, and how. The low-level component can participate in the computation, but never calls a high-level component directly.
