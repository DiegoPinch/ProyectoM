package pmanejo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validaciones {
    
     public boolean ValidarEmail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
    public boolean validar(String cedula) {
        boolean validar = false;
        //0504686411 = 054686411
        int aux, dece_superior, acum = 0, primeros_dos, tercer_numero;
        try {
            primeros_dos = Integer.parseInt(cedula.substring(0, 2));
            tercer_numero = Integer.parseInt(cedula.substring(2, 3));
            if (primeros_dos > 0 && primeros_dos <= 24 && cedula.length() == 10) {
                if (tercer_numero < 6 && tercer_numero >= 0) {
                    for (int i = 0; i < cedula.length() - 1; i++) {
                        aux = Integer.parseInt(cedula.charAt(i) + "");
                        // que sea par
                        if (i % 2 == 0) {
                            aux *= 2;
                        }
                        if (aux >= 10) {
                            aux -= 9;
                        }
                        acum += aux;
                    }
                    dece_superior = ((acum / 10) + 1) * 10;
                    acum = dece_superior - acum;
                    if (acum == Integer.parseInt(cedula.charAt(9) + "")) {
                        validar = true;
                    }
                }
            }
        } catch (NumberFormatException e) {
        }
        return validar;
    }
}
