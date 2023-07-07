// This application displays a hello message on
// the console by creating an instance of the
// Greeter class and then calling the Greeter
// object's sayHello method

// I am updating the method call to the new Greeter2 class.
// This shows that the HelloApp2 class does not need to know what is in the Greeter
// class so i could have just updated the Greeter.java class instead of making the Greeter2.java class
// I have done it this way so that I can keep both classes to look back on
public class HelloApp2 {
    public static void main(String[] args) {
        Greeter2 myGreeterObject = new Greeter2();
        myGreeterObject.sayHello();
    }
}
