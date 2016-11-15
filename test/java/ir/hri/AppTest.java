package ir.hri;

import ir.hri.business.State;
import ir.hri.entity.StateEntity;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AppTest {

    @Test
    public void stateNotNull() {
        State state = new State();
        List<StateEntity> stateEntities = state.getStates();
        Assert.assertEquals(30, stateEntities);
    }

    @Test
    public void stateSize() {
        State state = new State();
        List<StateEntity> stateEntities = state.getStates();
        Assert.assertNotNull(stateEntities);
    }
}
