package ru.netology.sender;

import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocalizationServiceImplTest {

    LocalizationServiceImpl sut = new LocalizationServiceImpl();

    @Test
    public void locale() {
        //arrange
        Country country = Country.BRAZIL;
        String expected = "Welcome";
        //acc
        String result = sut.locale(country);
        //assert
        assertEquals(expected, result);
    }
}
