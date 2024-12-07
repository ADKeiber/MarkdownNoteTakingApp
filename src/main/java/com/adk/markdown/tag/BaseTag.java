package com.adk.markdown.tag;

import lombok.Data;

import java.util.*;

@Data
public abstract class BaseTag {


    public Set<String> tagValues = new HashSet<>();

    /**
     * These tags represent the parts of a formatted tag area
     * 1) the beginning tag that starts the formatting
     * 2) the content contained inside of the tag
     * 3) the end tag the signifies the end of the format
     */
    public String beginningTag;
    public String content;
    public String endTag;

    /**
     * This is needed to see if the actual format of the tag is valid
     */
    public boolean validFormat;
    public List<BaseTag> supportedSubtags = new LinkedList<>();

    public List<BaseTag> subtags = new LinkedList<>();

    //use Index Of to find
    //Needs to have a collection containing all Tag types and when one is detected the substring for that needs
    protected void generateSubTags(){
        //IN this we need to go through the {@link #textWithAppliedTagFormat} and attempt to identify supported subtags and process them
        // in theory this would run after getTextWithAppliedFormat is ran and it would cascade down through all supported subtags and split them into beginning tag, end tag, and content
    }

    /**
     * Find Beginning tag, content, endtag, and subtags (generateSubTags)
     * @param entireText
     * @return index of the endtag so a
     */
    public abstract int getTextWithAppliedFormat(String entireText);
}
