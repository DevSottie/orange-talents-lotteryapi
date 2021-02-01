package zup.orangetalents.lotteryapi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor //deixa essa classe publica para o mapper poder acessar
@Entity //diz ao spring que essa classe é uma entidade do banco de dados
@Data //gera os getters, setters e constructors automaticamente
@Table(name = "person") //diz ao spring que nome dar para essa tabela na hora da criação
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String email;

<<<<<<< HEAD
    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
=======
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
>>>>>>> 5350bbfcca6550ee0f35a37c8e4c5f42b6003b09
    private List<Raffle> raffles;
}
