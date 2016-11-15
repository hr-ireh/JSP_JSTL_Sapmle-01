package ir.hri.entity;

import javax.persistence.*;

@Entity
@Table(name = "CITY")
public class CityEntity {
    @Id
    @Column(name = "ID")
    int id;

    @Column(name = "STATE_ID")
    int stateId;

    @Column(name = "NAME", length = 50, nullable = false)
    String name;

    public CityEntity() {
    }

    public CityEntity(int id, int stateId, String name) {
        this.id = id;
        this.stateId = stateId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity city = (CityEntity) o;

        if (id != city.id) return false;
        if (stateId != city.stateId) return false;
        return !(name != null ? !name.equals(city.name) : city.name != null);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + stateId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CityEntity{" +
                "id=" + id +
                ", stateId=" + stateId +
                ", name='" + name + '\'' +
                '}';
    }
}
