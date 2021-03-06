/*
 *      Copyright (c) 2004-2012 YAMJ Members
 *      http://code.google.com/p/moviejukebox/people/list
 *
 *      Web: http://code.google.com/p/moviejukebox/
 *
 *      This software is licensed under a Creative Commons License
 *      See this page: http://code.google.com/p/moviejukebox/wiki/License
 *
 *      For any reuse or distribution, you must make clear to others the
 *      license terms of this work.
 */
package com.moviejukebox.themoviedb.wrapper;

import com.moviejukebox.themoviedb.model.AlternativeTitle;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Stuart
 */
public class WrapperAlternativeTitles {
    /*
     * Logger
     */

    private static final Logger LOGGER = LoggerFactory.getLogger(WrapperAlternativeTitles.class);
    /*
     * Properties
     */
    @JsonProperty("id")
    private int id;
    @JsonProperty("titles")
    private List<AlternativeTitle> titles;

    public int getId() {
        return id;
    }

    public List<AlternativeTitle> getTitles() {
        return titles;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitles(List<AlternativeTitle> titles) {
        this.titles = titles;
    }

    /**
     * Handle unknown properties and print a message
     * @param key
     * @param value
     */
    @JsonAnySetter
    public void handleUnknown(String key, Object value) {
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown property: '").append(key);
        sb.append("' value: '").append(value).append("'");
        LOGGER.warn(sb.toString());
    }
}
