package br.com.rd.ecommerce.models.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_provider")
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_provider")
    private Long id;
    @Column(name = "ds_name", nullable = false, length = 100)
    private String name;
    @Column(name = "nr_cpnj", nullable = false, length = 20)
    private String CNPJ;
    @OneToMany(mappedBy = "provider")
    private List<Address> addresses;
}