package com.cg.entity;

import java.time.LocalDate;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private int price;
    private String name;
    private LocalDate mfd;
}