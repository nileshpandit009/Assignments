package com.company.cdac.cop6;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Seasons {
    private static final LocalDate WINTER_START = LocalDate.of(2020, 12, 16);
    private static final LocalDate WINTER_END = LocalDate.of(2020, 3, 15);
    private static final LocalDate SPRING_START = LocalDate.of(2020, 3, 16);
    private static final LocalDate SPRING_END = LocalDate.of(2020, 6, 15);
    private static final LocalDate SUMMER_START = LocalDate.of(2020, 6, 16);
    private static final LocalDate SUMMER_END = LocalDate.of(2020, 9, 15);
    private static final LocalDate FALL_START = LocalDate.of(2020, 9, 16);
    private static final LocalDate FALL_END = LocalDate.of(2020, 12, 15);

    private LocalDate date;

    public Seasons() {
    }

    public String season(int month, int day) throws DateTimeException {
        if ((month < 1)
                || (month > 12)
                || (day < 1)
                || (day > 31)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.date = LocalDate.of(2020, month, day);

        if (this.isAfterOrEqual(WINTER_START)
                && this.isBeforeOrEqual(WINTER_END)) {
            return "Winter";
        } else if (this.isAfterOrEqual(SPRING_START)
                && this.isBeforeOrEqual(SPRING_END)) {
            return "Spring";
        } else if (this.isAfterOrEqual(SUMMER_START)
                && this.isBeforeOrEqual(SUMMER_END)) {
            return "Summer";
        } else if (this.isAfterOrEqual(FALL_START)
                && this.isBeforeOrEqual(FALL_END)) {
            return "Fall";
        }
        return "Can't find a season you like :)";
    }

    private boolean isAfterOrEqual(ChronoLocalDate localDate) {
        return (this.date.isEqual(localDate) || this.date.isAfter(localDate));
    }

    private boolean isBeforeOrEqual(ChronoLocalDate localDate) {
        return (this.date.isEqual(localDate) || this.date.isBefore(localDate));
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
