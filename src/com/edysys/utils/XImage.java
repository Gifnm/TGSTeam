/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edysys.utils;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author ASUS
 */
public class XImage {
    public static Image getAPpIcon(){
    URL url = XImage.class.getResource("\\com\\eduSys\\icon\\tinder.png");
    return new ImageIcon(url).getImage();
    }
}
