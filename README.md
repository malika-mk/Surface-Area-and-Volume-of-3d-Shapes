Project Description

This project demonstrates the use of Polymorphism in Java by creating an interface for 3D shapes. Classes like Sphere, Cylinder, and Cube implement the Shape3DInterface, providing specific behavior for methods like surfaceArea() and volume().

Polymorphism Usage

The Shape3DInterface defines a contract for all 3D shape classes.
A single reference type (Shape3DInterface) can point to different objects (Sphere, Cylinder, Cube).
The behavior of methods like surfaceArea() and volume() is determined at runtime based on the actual object type.

c. Sample Outputs

Include the sample outputs of multiple runs as seen above.


Project Structure

1.Interface: Shape3DInterface
	Defines the contract for all 3D shapes with two methods:
		surfaceArea(): Calculates the surface area of the shape.
	volume(): Calculates the volume of the shape.
2.Classes:
	Sphere:
	Implements the formulas:
	Surface Area =  4\pi r^2 
	Volume =  \frac{4}{3}\pi r^3 
	Cylinder:
	Implements the formulas:
	Surface Area =  2\pi r(r + h) 
	Volume =  \pi r^2 h 
	Cube:
	Implements the formulas:
	Surface Area =  6a^2 
	Volume =  a^3 
3.Main Class:
	Randomly generates instances of Sphere, Cylinder, and Cube.
	Calculates and outputs the surface area and volume for each shape.


How Polymorphism Is Used

Definition: Polymorphism allows one interface to represent multiple forms. In this project:
 The Shape3DInterface is implemented by three classes: Sphere, Cylinder, and Cube.
 A single reference type (Shape3DInterface) can point to any of these objects.
 Dynamic Method Invocation:
 The surfaceArea() and volume() methods are called on Shape3DInterface references. At runtime, the appropriate implementation (based on the actual object) is invoked dynamically.
 The Main class works with the Shape3DInterface rather than specific classes, enabling the addition of new shapes without modifying existing code.


![image](https://github.com/user-attachments/assets/e8d4c3aa-2add-4554-a2e3-f6b790f1bfa8)
![image](https://github.com/user-attachments/assets/fde7caf7-2f01-47de-bf81-160527ce1286)
![image](https://github.com/user-attachments/assets/700ffd52-29f3-4cfe-8b90-ddce240bd346)
![image](https://github.com/user-attachments/assets/061bac8c-7985-490d-9e7d-c8078839d647)





 
