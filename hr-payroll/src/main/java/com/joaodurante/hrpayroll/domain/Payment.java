package com.joaodurante.hrpayroll.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private String name;
    private Double dailySalary;
    private Integer days;

    public Double getTotal() {
        return dailySalary * days;
    }
}
