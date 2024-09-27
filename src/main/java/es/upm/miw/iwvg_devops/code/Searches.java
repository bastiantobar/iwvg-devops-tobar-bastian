package es.upm.miw.iwvg_devops.code;

import java.util.Objects;
import java.util.stream.Stream;
public class Searches {
    public Stream<String> findUserIdBySomeProperFraction(){
       return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                                    .anyMatch(Fraction::isProper))
                .map(User::getId);
    }
    public Stream<String> findUserFamilyNameInitialBySomeProperFraction(){
        return  new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(Fraction::isProper))
                .map(user-> user.getFamilyName().charAt(0) + "." );
    }


}
