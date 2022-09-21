package src.Lesson3;

import java.util.Scanner;

/*
1. Создайте класс User, у которого будет несколько полей(имя, фамилия, почта, пароль, пол, страна).
Соблюдая принципы инкапсуляции реализуйте в нем все необходимые методы/конструкторы для дальнейшей работы
(не забываем и про методы для сравнения классов и для печати переопределить).


2. Так же у данного класса должно быть 2 метода:


а). Читать. Принимает текст, ничего не возвращает, выводит сообщение принятое в консоль.


б). Писать. Ничего не принимает, просто считывает текст с клавиатуры (Для это вспомните про Scanner) и выводит его в консоль как результат.
*/

public class User {

    private String name;
    private String surname;
    private String email;
    private String password;
    private String gender;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    void readText(String textForRead) {

        System.out.println(textForRead);

    }

    String writeText() {

        System.out.println("Enter the String");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        return str;

    }

}
