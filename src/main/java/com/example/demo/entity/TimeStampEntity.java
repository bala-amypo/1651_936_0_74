package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy="GenerationType.IDENTITY")
    private long id;
    private String name;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    public TimeStampEntity(){

    }
}