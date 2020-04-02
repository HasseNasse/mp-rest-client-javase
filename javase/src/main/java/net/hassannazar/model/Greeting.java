package net.hassannazar.model;

public class Greeting {
    public String message;
    public String greeter;

    public Greeting() {
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "message='" + message + '\'' +
                ", greeter='" + greeter + '\'' +
                '}';
    }
}
