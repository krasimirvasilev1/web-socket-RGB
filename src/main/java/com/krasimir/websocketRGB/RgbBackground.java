package com.krasimir.websocketRGB;

import org.springframework.stereotype.Component;

@Component
public class RgbBackground {
        private String rgBcolor;

    public RgbBackground() {

    }

    public RgbBackground(String rgBcolor) {
       this.rgBcolor = rgBcolor;
    }
    public String getRGBcolor(){
        return rgBcolor;
    }

}
