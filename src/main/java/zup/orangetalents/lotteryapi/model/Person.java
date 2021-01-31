package zup.orangetalents.lotteryapi.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Entity //diz ao spring que essa classe é uma entidade do banco de dados
@Data //gera os getters, setters e constructors automaticamente
@Table(name = "person") //diz ao spring que nome dar para essa tabela na hora da criação
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @NotEmpty
    @Column(nullable = false)
    private String email;

    //@NotEmpty
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Raffle> raffles;
}
