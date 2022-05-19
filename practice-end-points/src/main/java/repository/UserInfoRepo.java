package repository;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class UserInfoRepo {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 100)
    private String usersName;

    @Column(length = 200)
    private String usersSummary;

    private int usersAge;



}
