package com.aurora.util;


import com.google.gson.GsonBuilder;


public class Json2StringUtil<T> {

    private static String gson;

    static {
        gson = new String();
    }


    public Json2StringUtil() {}

    public String toJson (T source) {
        return  gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create().toJson(source);
    }



}
