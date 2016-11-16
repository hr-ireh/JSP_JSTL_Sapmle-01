package ir.hri.controller;

import ir.hri.business.City;
import ir.hri.business.State;
import ir.hri.entity.CityEntity;
import ir.hri.entity.StateEntity;

import java.util.ArrayList;
import java.util.List;

public class BaseInfo {
    public List<StateEntity> getState() {
        State state = new State();
        return state.getStates();
    }

    public List<CityEntity> getCity(int i) {
        City city = new City();
        return city.getCityByStateId(i);
    }
}
