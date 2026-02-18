Point and Circle Classes
Java

📋 Overview
Java implementation of Point and Circle classes demonstrating OOP principles including encapsulation, constructors, and object relationships.

🔧 Key Requirements
Circle Class
Instance Variables

Private myRadius (double)
Private center (Point object)
Constructors

Zero-argument: Uses Point's default constructor
Parameterized: Must deep copy the Point parameter to avoid mutation issues
Methods

getRadius() → double
setRadius(double) → void
setCenter(double x, double y) → void
isInside(Point p) → boolean (uses distance formula: (x₂-x₁)² + (y₂-y₁)² < r²)
toString() → String
💡 Best Practices
✅ Always deep copy Point objects to prevent shared references
✅ Use getRadius() instead of direct myRadius access
✅ Keep math formulas clear and readable

🚀 Usage
CopyPoint center = new Point(0, 0);
Circle circle = new Circle(center, 5.0);
boolean inside = circle.isInside(new Point(3, 4)); // true