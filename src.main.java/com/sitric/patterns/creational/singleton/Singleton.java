package com.sitric.patterns.creational.singleton;

final class Singleton {
    // Поле обязательно должно быть объявлено volatile, чтобы двойная проверка
    // блокировки отработала корректно.
    private static volatile Singleton instance;
    String value;

    private Singleton(String value) {
        this.value = value;
    }

    static Singleton getInstance(String value) {
        //double-checked locking
        //Применяется для того, чтобы предотвратить создание нескольких объектов-одиночек
        //если метод будет вызван из нескольких потоков одновременно
        //переменная result помогает избежать подводных камней реализации DCL в Java
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
