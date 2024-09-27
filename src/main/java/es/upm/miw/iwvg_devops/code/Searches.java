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

    public Stream<Double> findDecimalFractionByNegativeSignFraction() {

        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.decimal() < 0))
                .flatMap(user -> user.getFractions().stream())
                .filter(fraction->fraction.decimal()<0)
                .map(Fraction::decimal);
    }


    public Stream<Double> findDecimalImproperFractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream()
                        .filter(Fraction::isProper)
                )
                .map(Fraction::decimal);
    }
}
