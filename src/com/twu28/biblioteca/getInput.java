package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 7/26/12
 * Time: 12:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class getInput {
    public String selectYourChoice(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        }   catch (IOException e){
            System.out.println("IOException: " + e);;
        }
        return inputLine;
}
}
