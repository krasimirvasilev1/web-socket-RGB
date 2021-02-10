package com.krasimir.websocketRGB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class RGBcolorController {

    @Autowired
    public RgbBackground rgbBackground;
    @Autowired
    private ColorService colorService;

    @MessageMapping("/rgb")
    @SendTo("/topic/color")
    public RgbBackground getColor(Color rgBcolor){
        colorService.saveColor(rgBcolor);
        System.out.println("red:" + rgBcolor.getRed() + " green:" + rgBcolor.getGreen() + " blue:" + rgBcolor.getBlue());
        return new RgbBackground("rgb(" + rgBcolor.getRed() + ", " + rgBcolor.getGreen() + ", " + rgBcolor.getBlue() + ")");
    }

}
