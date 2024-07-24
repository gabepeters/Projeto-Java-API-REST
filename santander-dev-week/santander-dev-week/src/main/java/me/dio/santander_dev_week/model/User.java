package me.dio.santander_dev_week.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity(name = "tb_user")
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade - CascadeType.ALL)
    private Account account

    @OneToOne(cascade - CascadeType.ALL)
    private Card card;

    @OneToMany(cascade - CascadeType.ALL, fetch = Fetch = FetchType.EAGER)
    private List<Feature> features;

    @OneToMany(cascade - CascadeType.ALL, fetch = Fetch = FetchType.EAGER)
    private List<News> news;

    public Long getId() { return id; }

    public void setId(Long id) { return name; }

    public String getName() { return name; }

    public void setName(String name){ this.name = name; }

    public Account getAccount() { return account; }

    public void setAccount(Account account) { this.account = account; }

    public Card getCard() { return card; }
}
