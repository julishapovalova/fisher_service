package com.fish.spitter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
 public class Spitter {
    private long id;
    private String username;
    private String password;
    private String fullName;
}
