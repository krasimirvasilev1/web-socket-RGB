package com.krasimir.websocketRGB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ColorService")
public class ColorServiceImpl implements ColorService{

    ColorRepository colorRepository;

    @Autowired
    public void setColorRepository(ColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }

    @Override
    public void createColor(Color color) {
        this.colorRepository.save(color);
    }

    @Override
    public void saveColor(Color color) {
        this.colorRepository.save(color);
    }

    @Override
    public Color loadColor(Long id) {
        return this.colorRepository.getOne(id);
    }
}
