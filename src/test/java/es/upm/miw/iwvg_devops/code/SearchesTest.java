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

        List<String> userInitials = searches.findUserIdBySomeProperFraction().toList();

        List<String> expectedInitials = List.of("1", "2", "3", "5");

        assertEquals(expectedInitials, userInitials);
    }


}