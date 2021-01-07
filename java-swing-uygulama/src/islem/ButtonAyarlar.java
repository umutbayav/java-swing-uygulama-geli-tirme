
package islem;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonAyarlar {

   private static Color originalBgColor,originalFgColor; //buton orjinal arkaplan rengi ve yazı rengi aldık.
  
  public static void setBgFg(JButton button,Color bgColor,Color fgColor){ //methodta buton,arkaplan rengi,yazı rengi alacak
    originalBgColor=button.getBackground(); //ilk önce orjinal arkaplanrengini saklayak bir altaki methodta kullanılacakdir.
    originalFgColor=button.getForeground();  //ilk önce orjinal yazı rengi saklayak bir altaki methodta kullanılacakdir.
    button.setBackground(bgColor); //yeni arkaplan rengi verek
    button.setForeground(fgColor);  //yeni yazı rengi verek
  } 
  
  public static void setOriginalBgFg(JButton button){ //orijinal buton arkaplan rengi  ve yazı rengini verme
      button.setBackground(originalBgColor); //orjinal arkaplanrengi verildi.
      button.setForeground(originalFgColor);  //orjinal yazı rengi verildi.
  } 
  public static void setVisible(JFrame oldFrame,JFrame newFrame){ //uygulama arasıda geçiş yapma
        oldFrame.setVisible(false); //uygulamayaı kapatma
        newFrame.setVisible(true);  //yeni uygulamayı açma
    }  
}
