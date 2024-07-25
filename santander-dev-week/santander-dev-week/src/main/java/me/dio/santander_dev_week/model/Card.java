package me.dio.santander_dev_week.model;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.math.BigDecimal;

@Entity(name = "tb-card")
public class card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", precision = 13, scale = 2)
    private BigDecimal Limit;

    public Long getId() { return id; }

    public void setId(Long id) {this.id = id;}

    public String getNumber() { return number; }

    public void setNumber(String number){ this.number = number; }

    public BigDecimal getLimit() { return limit; }

    public void setLimit(BigDecimal limit) { this.limit = limit; }

}
