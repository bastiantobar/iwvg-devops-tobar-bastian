package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchesTest {
    private Searches searches;

    @BeforeEach
    void setUp() {
        searches = new Searches();
    }

    @Test
    void findUserIdBySomeProperFraction() {

        List<String> familyNameInitials = searches.findUserIdBySomeProperFraction().toList();

        List<String> expectedInitials = List.of("1", "2", "3", "5");

        assertEquals(expectedInitials, familyNameInitials);
    }

    @Test
    void findUserFamilyNameInitialBySomeProperFraction() {
        List<String> familyNameInitials = searches.findUserFamilyNameInitialBySomeProperFraction().toList();

        List<String> expectedInitials = List.of("M.", "M.", "T.", "T.");


        assertEquals(expectedInitials, familyNameInitials);
    }

    @Test
    void findDecimalFractionByNegativeSignFraction() {
        List<Double> fractionByNegativeInitials = searches.findDecimalFractionByNegativeSignFraction().toList();

        List<Double> expectedInitials = List.of(-0.2, -0.5);


        assertEquals(expectedInitials, fractionByNegativeInitials);
    }
}