package com.diegojimenez.helloworld.utils;

public class Constants {

    public static String HELLO = "Hello";
    public static String BLANK_SPACE = " ";
    public static String AGE = "age";

    public enum ResponseConstant{
        SUCCESS("Execution Success"),
        FAILURE("Execution Unsuccess");

        private String description;

        ResponseConstant(final String description){
            this.description = description;
        }

        public String getDescription(){
            return description;
        }

    }
}
