package edu.AnastasiiaTkachuk.Service;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Service {
    public static LocalDateTime getDateTime(LocalDateTime dateTime){
        return dateTime.plusMonths(3L);
    }
}
