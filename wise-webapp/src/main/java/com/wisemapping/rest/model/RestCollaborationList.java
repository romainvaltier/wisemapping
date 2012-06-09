package com.wisemapping.rest.model;


import com.wisemapping.model.Collaborator;
import com.wisemapping.model.MindMap;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.jetbrains.annotations.NotNull;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "collaboration")
@XmlAccessorType(XmlAccessType.PROPERTY)
@JsonAutoDetect(
        fieldVisibility = JsonAutoDetect.Visibility.NONE,
        getterVisibility = JsonAutoDetect.Visibility.PUBLIC_ONLY,
        isGetterVisibility = JsonAutoDetect.Visibility.PUBLIC_ONLY)
public class RestCollaborationList {

    private List<RestCollaboration> collaborations;

    public RestCollaborationList() {

    }

    public int getCount() {
        return this.collaborations.size();
    }

    public void setCount(int count) {

    }

    @XmlElement(name = "collaborate")
    public List<RestCollaboration> getCollaborations() {
        return collaborations;
    }

    public void setCollaborations(@NotNull List<RestCollaboration> collaborations) {
        this.collaborations = collaborations;
    }
}