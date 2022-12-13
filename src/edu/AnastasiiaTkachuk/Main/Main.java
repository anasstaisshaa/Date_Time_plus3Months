package edu.AnastasiiaTkachuk.Main;

import edu.AnastasiiaTkachuk.Service.Service;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(Service.getDateTime(dateTime));
    }
}
