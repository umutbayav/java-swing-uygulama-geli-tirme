
package islem;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonAyarlar {
    
   private static Color originalBgColor,originalFgColor; 
  
  public static void setBgFg(JButton button,Color bgColor,Color fgColor){
    originalBgColor=button.getBackground();
    originalFgColor=button.getForeground();
    button.setBackground(bgColor);
    button.setForeground(fgColor);
  } 
  
  public static void setOriginalBgFg(JButton button){
      button.setBackground(originalBgColor);
      button.setForeground(originalFgColor);
  } 
  public static void setVisible(JFrame oldFrame,JFrame newFrame){
        oldFrame.setVisible(false);
        newFrame.setVisible(true);
    }  
}
