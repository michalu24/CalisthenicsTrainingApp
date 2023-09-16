package com.example.calisthenicstrainingapp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "exercise")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;

    @Enumerated(EnumType.STRING)
    @Column(name = "exercise_category", length = 150)
    private ExerciseCategory exerciseCategory;

}