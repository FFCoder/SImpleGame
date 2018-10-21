package com.jonathonchambers.Models;



import org.w3c.dom.Attr;

import java.util.ArrayList;

public class PersonEntity {
    private String name;
   private ArrayList<Attribute> attributes;

    public PersonEntity(String name) {
        this.name = name;
        this.attributes = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Attribute getAttribute(String name){
        for (Attribute a : this.getAttributes()){
            if (a.name == name) {
                return a;
            }
        }
        return null;
    }
//TODO: FIX THIS DARN METHOD!!
    public void addAttribute(Attribute attribute){
        if (this.attributes.contains(attribute.name)){
            this.attributes.set(this.attributes.indexOf(attribute.name), attribute);
        }
        else {
            this.attributes.add(attribute);
        }
    }
    public void setAttribute(String name, int value){
        for (Attribute a : this.getAttributes()){
            if(name == a.name){
                a.value = value;
            }
        }
    }

}
