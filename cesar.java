package cesar_privado;

import static cesar_privado.Cifrador.cifrar;
import static cesar_privado.Cifrador.descifrar;

public class cesar {

    public static void main(String[] args){
                Cifrador c=new Cifrador();
                String text = cifrar("HOLA QUE TAL");
                System.out.println(text);
                String text2 = descifrar(text);
                System.out.println(text2);
        }
}
