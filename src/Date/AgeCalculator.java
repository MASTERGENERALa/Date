package Date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDateTime birthDate = LocalDateTime.of(1990, Month.DECEMBER, 10, 0, 0, 0); // Ваша дата народження

        LocalDateTime currentDate = LocalDateTime.now(); // Поточна дата та час

        // Визначення різниці між двома датами
        Duration duration = Duration.between(birthDate, currentDate);

        // Отримання компонентів різниці часу
        long years = duration.toDays() / 365;
        long months = duration.toDays() % 365 / 30;
        long days = duration.toDays() % 365 % 30;
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        // Виведення результату у зручному для сприйняття вигляді
        System.out.println("Вам виповнилося " + years + " років, " + months + " місяців, " + days + " днів, " +
                hours + " годин, " + minutes + " хвилин та " + seconds + " секунд.");
    }
}
