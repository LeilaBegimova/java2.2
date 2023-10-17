package exception;

import exception.IlegalAgeException;

public class User {
    private  String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalAccessException {
        if (name.length() > 20){
            throw  new IllegalAccessException(" Имя не должно быть больше 20 символов");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 100) {
            throw  new IlegalAgeException("Возраст не должен быть  меньше 1 и больше 100") ;
        }

        this.age = age;
    }
}
