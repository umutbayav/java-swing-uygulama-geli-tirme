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
