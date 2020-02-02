package movie.numbers;

import lombok.*;

@AllArgsConstructor
public class Percent {

    private final double percent;

    public static Percent of(double percent) {
       return new Percent(percent);
    }

    public double toPoint() {
        return this.percent * 0.01;
    }
}
