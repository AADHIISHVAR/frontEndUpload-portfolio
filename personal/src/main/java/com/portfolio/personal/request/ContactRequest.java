package com.portfolio.personal.request;

import lombok.Data;

@Data
public class ContactRequest
{
    private String name;
    private String mailId;
    private String message;
}
