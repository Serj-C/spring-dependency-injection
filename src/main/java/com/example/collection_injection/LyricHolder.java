package com.example.collection_injection;

import org.springframework.stereotype.Service;

@Service("lyricHolder") // or "lyricHolder" bean defined in the app-context-xml.xml
public class LyricHolder implements ContentHolder {
    private String value = "'You be the DJ, I'll be the driver'";

    @Override
    public String toString() {
        return "LyricHolder: { " + value + " }";
    }
}
