package sistema.ciu;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.util.regex.Pattern;

public class Reg extends PlainDocument {
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        int t = getText(0, getLength()).length() + str.length();
        if(Pattern.matches("^[a-zA-Z ]+$", str) && t <= 40){
            super.insertString(offs,str,a);
        }
    }
}
class Reg2 extends PlainDocument{
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        int t = getText(0, getLength()).length() + str.length();
        if (Pattern.matches("[0-9]+$", str) && t<=5) {
            super.insertString(offs, str, a);
        }
    }
}