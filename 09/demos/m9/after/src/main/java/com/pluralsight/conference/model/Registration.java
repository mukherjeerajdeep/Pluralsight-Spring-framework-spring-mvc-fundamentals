package com.pluralsight.conference.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Registration {

    @NotEmpty
    @Size(min = 2,max = 30)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
