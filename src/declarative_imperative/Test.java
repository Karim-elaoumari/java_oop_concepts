package declarative_imperative;

import enums.Gender;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test {
    public class person{
        public String name;
        public Gender gender;
        public person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }
    }
    public   List<person> getListPersons(){
        List<person>  persons = new ArrayList<person>();
        persons.add(new person("John", Gender.MALE));
        persons.add(new person("Mary", Gender.FEMALE));
        persons.add(new person("Mike", Gender.MALE));
        persons.add(new person("hanane",Gender.FEMALE));
        return persons;
    }
//    declarative programming is a programming paradigm that expresses the logic of a computation without describing its control flow.

//    Imperative programming focuses on describing how a program operates not what the process of the computer.

//    Functional programming is a paradigm where the basic unit of computation is a function.
//    Here functions are not the methods we write in programming. Methods are procedures where we write
//    a sequence of instructions to tell the computer what to do. In functional programming,
//    functions are treated like mathematical functions where we map inputs to outputs to produce a result. f(x)  = 3x

//    Anonymous Class
//    An anonymous class is an inner class without a name, which means that we can declare and instantiate a class at the same time.
//    An anonymous class is used primarily when we want to use the class declaration once. Anonymous classes usually extend a subclass
//    or implement an interface.


//    Anonymous Function in a function that does not have a name  it's executed directly when it's defined example Lambda expression

//     java.util.function:
//    The Function interface is a functional interface that represents a function (method) that takes a single parameter and returns a single value.

//    The Predicate in Java 8 is one of the types of Functional Interfaces. Functional Interfaces were introduced in Java 8
//    to support functional programming in the object-oriented world of Java. The Predicate is one of them, which allows programmers
//    to test a specific condition imposed on values or objects.
//    The Predicate interface has an abstract method called test(), which returns a boolean value. The test() method accepts a single argument
//     Predicate is used as a function that receives an argument and returns a boolean value.

//    Consumer is a functional interface; it takes an argument and returns nothing. The Consumer interface represents an operation that accepts a single input argument and returns no result.

//    Supplier is a functional interface; it takes no argument and returns a result. The Supplier interface represents an operation that takes no argument and returns a result.

//    Stream Api is a sequence of elements supporting sequential and parallel aggregate operations. The following are the characteristics of a Stream
//    Stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
//    Stream doesn't change the original data structure, they only provide the result as per the pipelined methods.
//    Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined.


//  Method Reference is a feature related to Lambda Expressions. It allows us to reference the constructor or method without executing them.
//  Lambda expression it's just an instance of a functional interface and a method reference is just a shorthand syntax for a lambda expression.
//  lambda expression is a function that can be created without belonging to any class. A lambda expression can be passed around as if it was an object and executed on demand.
//  also it's implement the abstract method of the functional interface.
//  An interface with single abstract method is called functional interface. An example is java.lang.Runnable

    public  void testImperative(List<person> persons){
        List<person> females = new ArrayList<>();
        for(person per : persons) {
            if(Gender.FEMALE.equals(per.gender)){
                females.add(per);
            }
       }
//        pass anonymous function to another function


        System.out.println(females.get(0).gender);
    }
    public void testDeclarative(List<person> persons){

        Predicate<person> predicate = person -> Gender.FEMALE.equals(person.gender);
        List<person> females =  persons.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(females.get(0).gender);




        persons.stream().forEach(person -> System.out.println(person.name));
    }
     static Function<Integer,Integer>  incrementByOne = number -> number +1;

    public static void testOptionals(){
        String name = null;
        Optional.ofNullable(name).ifPresentOrElse(System.out::println,()-> System.out.println("the variable is null"));

        Optional.of(name).ifPresentOrElse(System.out::println,()-> System.out.println("the variable is null"));


        if("hello"!=null){System.out.println("hello");}else{System.out.println("world");}
    }

}

