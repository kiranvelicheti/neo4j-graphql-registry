package com.poc.feignclient.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manufacturer {
    public Long id;
    public Integer manufacturerID;
    private String mfgCode;
    private String mfgName;
    public String spanishMfgName;
    public String mfgLogo;
    public String mfgThumbnail;
}
