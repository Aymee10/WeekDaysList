package dev.aymee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.hamcrest.MatcherAssert.assertThat;
// import static org.hamcrest.Matchers.equalTo;
// import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeekListTest {
    private WeekList week;

    @BeforeEach
    public void setUp(){
        week=new WeekList();
        week.createWeekDays();
    }

    @Test
    void testCreateWeekDaysList() {
       assertEquals(7, week.weekDays.size());
    }

    @Test
    public void getWeekDaysTest(){       
       assertEquals("Lunes", week.getWeekDays().get(0));
       assertEquals("Martes", week.getWeekDays().get(1));
       assertEquals("Miércoles", week.getWeekDays().get(2));
       assertEquals("Jueves", week.getWeekDays().get(3));
       assertEquals("Viernes", week.getWeekDays().get(4));
       assertEquals("Sábado", week.getWeekDays().get(5));
       assertEquals("Domingo", week.getWeekDays().get(6));
    }

    @Test
    public void getWeekDaysSizeTest(){
        assertEquals(7, week.getWeekDaysSize());
    }


}
