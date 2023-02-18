package com.rest.custom;

import lombok.Data;

public @Data class Loc {
    private Float latitude;
    private Float longitude;

    Loc(Float latitude, Float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
