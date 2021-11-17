package ru.netology.sender;

import org.junit.jupiter.api.Test;
import org.mockito.internal.stubbing.answers.ThrowsExceptionForClassType;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoServiceImpl;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeoServiceImplTest {

    GeoServiceImpl sut = new GeoServiceImpl();

    @Test
    public void byIp() {
        //arrange
        String ip = "96.12.183.146";
        Location expected = new Location("New York", Country.USA, null, 0);
        //act
        Location result = sut.byIp(ip);
        //assert
        Objects.equals(expected, result);
    }

    @Test
    public void byCoordinates() {
        //arrange
        final double latitude = 213.2;
        final double longitude = 123.2;

        //assert
        assertThrows(
                RuntimeException.class,
                //act
                () -> sut.byCoordinates(latitude, longitude));
    }
}

