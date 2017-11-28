package token;

import java.io.*;
import java.util.ArrayList;

import static java.lang.System.in;

public class MyTokenStream extends InputStream implements TokenStream{
    private Token t;
    private ArrayList<Token> tokens = new ArrayList<Token>();
    private int length;
    private int index = 0;
    public Token getToken() throws IOException{
        t = tokens.get(index);
        if(index > length + 1){
            return null;
        }
        return t;
    }

    public void consumeToken(){
        index++;
    }


    public MyTokenStream(){
        try{
            char[] buf = new char[1024];
            Reader r = new InputStreamReader(in);
            r.read(buf);
            this.length = in.available();
            for(int i = 0; i < length; i++){
                switch (buf[i]){
                    case '(':
                        Token lToken = new Token(Token.TokenType.LPAR,"(");
                        tokens.add(lToken);
                        break;
                    case ')':
                        Token rToken = new Token(Token.TokenType.RPAR,"(");
                        tokens.add(rToken);
                        break;
                    case '-':
                        Token minToken = new Token(Token.TokenType.MINUS,"-");
                        tokens.add(minToken);
                        break;
                    case '+':
                        Token plusToken = new Token(Token.TokenType.PLUS,"+");
                        tokens.add(plusToken);
                        break;
                    case '/':
                        Token dToken = new Token(Token.TokenType.DIV,"/");
                        tokens.add(dToken);
                        break;
                    case '*':
                        Token mToken = new Token(Token.TokenType.RPAR,"*");
                        tokens.add(mToken);
                        break;
                }
            }
            tokens.add(new Token(Token.TokenType.NONE, ""));
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public static void main(String[] args) throws Exception{
//        char[] cbuf = new char[122];
//        Reader r = new InputStreamReader(in);
//        r.read(cbuf);
//        InputStream is = new ByteArrayInputStream();
        TokenStream ts = new MyTokenStream();
//        System.out.println(is.toString());
        while (ts.getToken().tokenType != Token.TokenType.NONE){
            ts.consumeToken();
            System.out.println(ts.getToken().value);
        }
    }

    public int read() throws IOException {
        return 0;
    }
}
