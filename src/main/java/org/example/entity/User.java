package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.example.base.PersistentObject;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "users")
public class User extends PersistentObject {
    @Column(name = "username")
    String username;
    @Column(name = "password")
    String password;
    @Column(name = "email")
    String email;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "role")
    UserRoleType role;
}
