package com.investree.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_detail")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_detail_id;

    @OneToOne
    @JoinColumn(name = "user_id",
                referencedColumnName = "userId "
    )
    private Users users;

    private String name;
    private String alamat;

}
