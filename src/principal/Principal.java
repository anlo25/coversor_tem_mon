package principal;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import conversorMonedas.Function;
import conversorTemperatura.functionTemperatura;

public class Principal {
    public static void main(String[] args) {
        setEnglishLanguage();

        Function monedas = new Function();
        functionTemperatura temperatura = new functionTemperatura();

        while (true) {
            String[] options = {"Currency Converter", "Temperature Converter"};
            String selectedOption = (String) JOptionPane.showInputDialog(
                null, "Select a conversion option", "Menu",
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]
            );

            switch (selectedOption) {
                case "Currency Converter":
                    convertCurrency(monedas);
                    break;

                case "Temperature Converter":
                    convertTemperature(temperatura);
                    break;
            }
        }
    }

    public static void convertCurrency(Function monedas) {
        double amount = getInput("Enter the amount of money you want to convert: ");
        if (amount >= 0) {
            monedas.ConvertirMonedas(amount);
            performAnotherConversion();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid value");
        }
    }

    public static void convertTemperature(functionTemperatura temperatura) {
        double temperature = getInput("Enter the temperature value you want to convert: ");
        if (temperature >= 0) {
            temperatura.ConvertirTemperatura(temperature);
            performAnotherConversion();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid value");
        }
    }

    public static double getInput(String message) {
        String input = JOptionPane.showInputDialog(message);
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            return -1; // Indicate invalid input
        }
    }

    public static void performAnotherConversion() {
        int response = JOptionPane.showConfirmDialog(null, "Do you wish to perform another conversion?");
        if (response != JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Program finished");
            System.exit(0);
        }
    }

    public static void setEnglishLanguage() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            UIManager.put("OptionPane.yesButtonText", "Yes");
            UIManager.put("OptionPane.noButtonText", "No");
            UIManager.put("OptionPane.okButtonText", "OK");
            UIManager.put("OptionPane.cancelButtonText", "Cancel");
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}


        	
