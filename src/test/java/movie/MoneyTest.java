package movie;

import java.time.*;
import movie.discount.condition.*;
import movie.discount.policy.*;
import movie.numbers.*;
import org.junit.jupiter.api.*;

class MoneyTest {

    @Test
    public void test() {
        Movie avatar = new Movie("Avatar",
                Duration.ofMinutes(120),
                Money.wons(12000),
                new AmountDiscountPolicy(Money.wons(800),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10,0), LocalTime.of(11,59)),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10,0), LocalTime.of(20,59))
                )
        );

        Movie titanic = new Movie("Titaic",
                Duration.ofMinutes(180),
                Money.wons(12000),
                new PercentDiscountPolicy(Percent.of(10),
                        new SequenceCondition(1),
                        new SequenceCondition(10),
                        new PeriodCondition(DayOfWeek.MONDAY, LocalTime.of(10,0), LocalTime.of(11,59)),
                        new PeriodCondition(DayOfWeek.THURSDAY, LocalTime.of(10,0), LocalTime.of(20,59))
                )
        );

        Movie starwars = new Movie("Starwars",
                Duration.ofMinutes(180),
                Money.wons(12000),
                new NoneDiscountPolicy()
        );

        Screening screenAvatar1 = new Screening(avatar, 1, LocalDateTime.now());
        Screening screenAvatar2 = new Screening(avatar, 2, LocalDateTime.now());
        Screening screenTitanic = new Screening(titanic, 5, LocalDateTime.now());
        Screening screenStarwars = new Screening(starwars, 7, LocalDateTime.now());

        System.out.println(screenAvatar1.toString());
        System.out.println(screenAvatar2.toString());
        System.out.println(screenTitanic.toString());
        System.out.println(screenStarwars.toString());

        starwars.changeDiscountPolicy(new PercentDiscountPolicy(Percent.of(5)));
        System.out.println(screenStarwars.toString());
    }
}
