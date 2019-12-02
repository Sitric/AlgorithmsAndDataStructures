package com.sitric.patterns.creational.singleton;

/**
 * Singleton — порождающий паттерн,
 * который гарантирует существование только одного объекта определённого класса,
 * а также позволяет достучаться до этого объекта из любого места программы.
 */
public class SingletonTest {
    public static void main(String[] args) {
        Thread foo = new Thread(() -> {
            Singleton singleton = Singleton.getInstance("foo");
            System.out.println(singleton.value);
        });

        Thread bar = new Thread(() -> {
            Singleton singleton = Singleton.getInstance("bar");
            System.out.println(singleton.value);
        });

        foo.start();
        bar.start();
    }
}
