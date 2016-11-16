package ir.hri;

import ir.hri.business.City;
import ir.hri.business.State;
import ir.hri.entity.CityEntity;
import ir.hri.entity.StateEntity;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class AppTest {

    @Test
    public void stateSize() {
        State state = new State();
        List<StateEntity> stateEntities = state.getStates();
        Assert.assertEquals(30, stateEntities.size());
    }

    @Test
    //@Ignore
    public void stateNotNull() {
        City city = new City();
        List<CityEntity> cityEntities = city.getCity();
        Assert.assertNotNull(cityEntities);
    }
}
