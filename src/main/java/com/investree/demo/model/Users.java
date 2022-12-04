package com.investree.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "users",
        uniqueConstraints ={
                @UniqueConstraint(columnNames = "username")
        }
)

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "username",
            nullable = false
    )
    private String username;
    private String password;
    private boolean is_active;
}
