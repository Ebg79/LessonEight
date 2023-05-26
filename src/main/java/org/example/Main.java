package org.example;

public class Main {

    public static void main(String[] args) {

        Post post = new Post();

        post.birthday = new FormDate();
        post.birthday.day = 28;
        post.birthday.month = 8;
        post.birthday.year = 1979;

        post.name = "Евгений";
        post.patronymic = "Владимирович";
        post.surname = "Кузьмин";
        post.passport = "1122 № 22114455";
        post.phone = "+7 (915) 0568292";
        post.subscription = true;
    }
}