package com.example.pizzaorder.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NumberValidationResponse {

    private String carrier;

    @JsonProperty(value = "country_code")
    private String countryCode;

    @JsonProperty(value = "country_name")
    private String countryName;

    @JsonProperty(value = "country_prefix")
    private String countryPrefix;

    @JsonProperty(value = "international_format")
    private String internationalFormat;

    @JsonProperty(value = "line_type")
    private String lineType;
    @JsonProperty(value = "local_format")
    private String localFormat;

    private String location;

    private String number;

    private Boolean valid;

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryPrefix() {
        return countryPrefix;
    }

    public void setCountryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
    }

    public String getInternationalFormat() {
        return internationalFormat;
    }

    public void setInternationalFormat(String internationalFormat) {
        this.internationalFormat = internationalFormat;
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public String getLocalFormat() {
        return localFormat;
    }

    public void setLocalFormat(String localFormat) {
        this.localFormat = localFormat;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
