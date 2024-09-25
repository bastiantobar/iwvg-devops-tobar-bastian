package es.upm.miw.iwvg_devops.code;

import java.util.List;
import java.util.stream.Stream;
public class UsersDatabase {
    public Stream<User> findAll() {
        return Stream.of(
                new User("1", "Oscar", "Mori"),
                new User("2", "Paula", "Mori"),
                new User("3", "William", "Tobar"),
                new User("4", "Antonia", "Tobar"),
                new User("5", "Sofia", "Tobar"),
                new User("6", "Yocelin", "Aballay")
        );
    }
}