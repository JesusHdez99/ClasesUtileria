import java.util.*;

public class hashtable { 
    public static void main(String[] args) { 

	Hashtable direccion  = new Hashtable();

	Integer ocho = new Integer(8000);
	direccion.put("calle","Primavera");
	direccion.put("numero", ocho);
	direccion.put("colonia"," La Silla ");
	direccion.put("ciudad"," Monterrey ");
	direccion.put("estado"," Nuevo Leon ");
	direccion.put("pais","Mexico");

        String miciudad  = (String) direccion.get("ciudad");
        String miestado  = (String) direccion.get("estado");
	String micalle = (String) direccion.get("calle");
	Integer minumero = (Integer) direccion.get("numero");

	System.out.println("Direccion : " + micalle + " " + minumero);
	System.out.println("Lugar: " + miciudad + "," + miestado);

    }
}	