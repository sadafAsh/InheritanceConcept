# InheritanceConcept

Inheritance in Java:`
       `It is the mechanism where a child class has all the properties and behaviour of a parent class.
Inheritance represent the IS-A relationship.The syntax of inheritance is "extend" keyword The use of the 
inheritance is to prevent from overriding the methods.We can also reuse the field and methods from 
the parent class.


Terms in Java:
       SubClass/Child class:Subclass is a class which inherits the parent class.It is also derived 
class,child class or extended class.
        Parent class/Super class:Super class is a class where subclass is inherits its features.It 
is also called parent class,base class or super class.


Types of Inheritance:
         There are three types of inheritance in java single inheritance,multilevel inheritance and 
hierarchical inheritance.In this project I have made three different packages for three different 
types of inheritance and also its tests cases .

 1.SINGLE INHERITANCE:
          When a class inherits the another class.It is called Single inheritance.In 'single 
inheritance' package, 'Parrot', the child class  inherits the 'Bird' the parent class. Dog class 
has all the features ,fields or methods of the Animal class.

2. MULTILEVEL INHERITANCE:
          There is a chain of inheritance,so it is called multilevel inheritance.In 'multilevel 
inheritance' package, 'Dog' class inherits the 'Animal' class and have all the properties of parent
class.'BabyDog' class inherits a 'Dog' class which again inherits the 'Animal' class.'BabyDog' class
has all the properties from 'Dog'class as well as 'Animal' class so it is a multilevel inheritance.

3.HIERARCHICAL INHERITANCE:
        When two or more class inherits a single class,so it is called hierarchiacal inheritance.
In 'hierarchical inheritance' package 'PermanentEmployee' class and 'TemporaryEmployee' class 
both inherits the 'Employee'class.Both the class has the properties of 'Animal' class.

JunitTest:
      There is JUnit Test also present for all three type of inheritance and test coverage are 100%
successful by jacoco reports.
     
SONARQUBE 

gradle command to publish code to sonarqube
./gradlew sonarqube 
  -Dsonar.projectKey=Inheritance 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=987167a3301a689e964b849913d6221d3ff34dbb
  
  ./gradlew sonarqube 
    -Dsonar.projectKey=Test 
    -Dsonar.host.url=http://localhost:9000 
    -Dsonar.login=e59e29f83551e6d9c837d827f6d0565764759d3c