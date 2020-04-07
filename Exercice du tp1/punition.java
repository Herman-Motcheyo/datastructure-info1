import java.awt.*;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.text.*;

 class Exo3{

    public static void main(String[]args){
          punition();
    }

    public static void punition(){

      String [] style={"Arial","Verdana","FreeSans","kacstFarsi","Bookman Old Style","Courier New","AngsanaUPC"};
      String mot =new String("Je ne dirai plus jamais 'hour' au cours d'inf1042");
   

      AttributedString attribut =new AttributedString(mot);
    
         for(int i=1;i<=100;i++){
              String theme =style[(int)(Math.random()*style.length)];// genere les polices aleatopires
               Font police =new Font(theme,Font.BOLD,100);// attribut a font la police generée
            attribut.addAttribute(TextAttribute.FONT,police);//.setFont(new java.awt.Font(Font.SERIF,Font.BOLD,15));
           System.out.println(i+"--"+mot);
          
         }
    }

}
