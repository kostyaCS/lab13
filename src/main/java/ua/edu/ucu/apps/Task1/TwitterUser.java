package ua.edu.ucu.apps.Task1;


import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
class TwitterUser{
    private String UserMail;
    private String Country;
    private LocalDate LastActiveTime;
}