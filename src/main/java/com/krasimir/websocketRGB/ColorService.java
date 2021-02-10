package com.krasimir.websocketRGB;

public interface ColorService {
    void createColor(Color color);
    void saveColor(Color color);
    Color loadColor(Long id);
}
