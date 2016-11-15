package ir.hri.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "STATE")
public class StateEntity {
    @Id
    @Column(name = "ID")
    int id;

    @Column(name = "NAME", length = 50, nullable = false)
    String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "STATE_ID")
    List<CityEntity> cities = new ArrayList<CityEntity>();

    public StateEntity() {
    }

    public StateEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CityEntity> getCities() {
        return cities;
    }

    public void setCities(List<CityEntity> cities) {
        this.cities = cities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StateEntity state = (StateEntity) o;

        if (id != state.id) return false;
        if (name != null ? !name.equals(state.name) : state.name != null) return false;
        return !(cities != null ? !cities.equals(state.cities) : state.cities != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (cities != null ? cities.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StateEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cities=" + cities +
                '}';
    }
}
