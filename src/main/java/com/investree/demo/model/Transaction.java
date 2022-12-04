package com.investree.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "peminjam_id_user_id")
    private Users peminjam_id;

    @OneToOne
    @JoinColumn(name = "meminjam_id_user_id")
    private Users meminjam_id;

    private Integer tenor;
    
    private Double total_pinjaman;

    private Double bunga_persen;

    private String status;
}
