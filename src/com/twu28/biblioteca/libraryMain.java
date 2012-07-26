package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 7/26/12
 * Time: 6:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class libraryMain {
    public static void main(String[] args){
     libraryBangalore libraryObj = new libraryBangalore();
        libraryObj.welcomemsg();
        while (true){
        libraryObj.showMenuOptions();
        int menuChoice = libraryObj.selectChoice();
        libraryObj.takeaction(menuChoice);
    }
}
}
