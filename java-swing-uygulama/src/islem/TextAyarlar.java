/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package islem;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author umut_
 */
public class TextAyarlar {
   private static String originalText; //orjinal verileri tutmak için
   private static Color originalFgColor; //font rengi
   public static void checkTheTextFocusGained(JTextField textField,String org){
       originalText=org; //orjinalText kullanicidan gelen text attık icine
       if(textField.getText().trim().equals(org)){
           originalFgColor=textField.getForeground(); //orjinal font rengi attıyor
           textField.setText("");
       }
       textField.setForeground(Color.BLUE); //Tıklandiğinda yazı mavi
   }
   
   public static void checkTheTextFocusLost(JTextField textField)
   {
      if(textField.getText().trim().equals("")){
           textField.setText(originalText);
           textField.setForeground(originalFgColor); //orjinal font rengi verir
       }
      else{
          textField.setForeground(Color.BLACK);  //tıklama kalktığında rengi siyah
      }
   }
   
   
   
   public static void setOnlyNumber(JTextField textField){
       textField.addKeyListener(new KeyAdapter(){
           @Override //alt+insert tus alt method dahil
           public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if(!Character.isDigit(c)) //sayı mı
                  e.consume();  //harf engelleme
           }
           
       });
   }
   

   public static void setOnlyAlphabetic(JTextField textField){
       textField.addKeyListener(new KeyAdapter(){
           @Override //alt+insert tus alt method dahil
           public void keyTyped(KeyEvent e) {
              char c = e.getKeyChar();
              if(!Character.isAlphabetic(c)) //harf mı
                  e.consume();  //sayı engelleme
           }
           
       });
   }
   //girilen karakter sayısı sınırlama işlemi
   private static int limit;
   public static void setMaxLimit(JTextField textField,int lim){
       limit=lim;
       textField.setDocument(new PlainDocument() {
           @Override
           public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
              if(str==null){
                  return;
              }
              if((getLength() + str.length()) <=limit){
                  super.insertString(offs, str, a);
              }
           }
          
       });
   }
   
   
   
   
   
}
