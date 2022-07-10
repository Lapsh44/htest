package com.example.htest;

import lombok.Data;

import java.util.Date;

@Data
public class Ch {
    public int character_id;
    public int location_id;
    public Date logoff_date;
    public Date logon_date;
    public int ship_type_id;
    public Date start_date;
}
