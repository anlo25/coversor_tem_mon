package conversorTemperatura;

import javax.swing.JOptionPane;

public class functionTemperatura {
	
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, "Choose an option to convert", "Temperature", JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    				{		"Degrees Celsius to Degrees Fahrenheit", 
    						"Degrees Celsius to Degrees Kelvin", 
    						"Degrees Farenheit to Degrees Celsius",
    						"Degrees Kelvin to Degrees Celsius",
    						"Degrees Kelvin to Degrees Farenheit"}, 
    				"Selection")).toString();
        switch(opcion) {
        case "Degrees Celsius to Degrees Fahrenheit":
        	temperatura.ConvertirCelciusAFarenheit(Minput);
        	break;
        case "Degrees Celsius to Degrees Kelvin":
            temperatura.ConvertirCelciusAKelvin(Minput);
            break;
        case "Degrees Farenheit to Degrees Celsius":
           temperatura.ConvertirFarenheitACelcius(Minput);
           break;
        case "Degrees Kelvin to Degrees Celsius":
           temperatura.ConvertirKelvinACelcius(Minput);
           break;
        case "Degrees Kelvin to Degrees Farenheit":
        	temperatura.ConvertirKelvinAFarenheit(Minput);
        	break;
        }
	}
}






