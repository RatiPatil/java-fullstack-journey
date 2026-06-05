package com.ratikant.contactbook;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    private int id;
    private String name;
    private String phoneNumber;
    private String email;

}