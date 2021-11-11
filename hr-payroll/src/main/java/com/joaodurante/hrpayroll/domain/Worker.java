package com.joaodurante.hrpayroll.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker implements Serializable {
    private Long id;
    private String name;
    private Double dailySalary;
}
