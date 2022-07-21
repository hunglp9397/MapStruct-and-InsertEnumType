package com.hunglp.mapdto.entity;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id 
    @GeneratedValue(strategy = GeneratedType.IDENTITY)
    private Long id;

    private LocalDate date;

    @ManyToOne(fetch=FetchType.LAZY)
    private User user;


}