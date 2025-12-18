package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ValidationEntity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY);
    private Long id;
    @NotNull
    @Size(min=2, max=10, message="must be 2 to 10 character")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Size(min=0,max=10)
    @NotNull(message="Password is mandatory")
    private String password;
    @Max(30)
    @Positive(message="Age must be positive")
    private Integer age;
}

public ValidationEntity(Long Id,@NotNull @Size(min=2, max=10, message="must be 2 to 10 character") String username,
                        @Email(message="Email is not valid") String email,
                        @Size(min=0,max=10) @NotNull(message="Password is mandatory") String password,
                        @Max(30)@Positive(message="Age must be positive") Integer age
                        ){
                            this.id=id;
                            this.name=name;
                            this.email=email;
                            this.password=password;
                            this.age=age;
                        }