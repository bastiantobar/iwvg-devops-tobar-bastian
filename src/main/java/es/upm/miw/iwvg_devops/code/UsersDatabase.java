package es.upm.miw.iwvg_devops.code;

import java.util.List;
import java.util.stream.Stream;
public class UsersDatabase {
    List<Fraction> fractions1 = List.of(
            new Fraction(0, 1),
            new Fraction(1, 1),
            new Fraction(2, 1)
    );
    List<Fraction> fractions2 = List.of(
            new Fraction(2, 1),
            new Fraction(-1, 5),
            new Fraction(2, 4),
            new Fraction(4, 3)
    );
    List<Fraction> fractions3 = List.of(
            new Fraction(1, 5),
            new Fraction(3, -6),
            new Fraction(1, 2),
            new Fraction(4, 4)
    );
    List<Fraction> fractions4 = List.of(
            new Fraction(2, 2),
            new Fraction(4, 4)
    );
    List<Fraction> fractions5 = List.of(
            new Fraction(0, 1),
            new Fraction(0, -2),
            new Fraction(0, 3)
    );
    List<Fraction> fractions6 = List.of(
            new Fraction(0, 0),
            new Fraction(1, 0),
            new Fraction(1, 1)
    );
    public Stream<User> findAll() {
        return Stream.of(
                new User("1", "Oscar", "Mori", fractions1),
                new User("2", "Paula", "Mori", fractions2),
                new User("3", "William", "Tobar", fractions3),
                new User("4", "Antonia", "Tobar", fractions4),
                new User("5", "Sofia", "Tobar", fractions5),
                new User("6", "Yocelin", "Aballay", fractions6)
        );
    }
}