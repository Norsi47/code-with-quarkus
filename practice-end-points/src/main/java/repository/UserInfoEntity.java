package repository;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UserInfoEntity extends PanacheEntity {

    @Column(length = 100)
    public String usersName;

    @Column(length = 100)
    public String usersAge;

    public String usersSummary;




}
