package repository;

import javax.persistence.*;

@Entity
public class Firstname {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;
    @Basic
    @Column(name = "lastname")
    private String lastname;
    @Basic
    @Column(name = "country")
    private String country;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Firstname firstname = (Firstname) o;

        if (id != firstname.id) return false;
        if (lastname != null ? !lastname.equals(firstname.lastname) : firstname.lastname != null) return false;
        if (country != null ? !country.equals(firstname.country) : firstname.country != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}
