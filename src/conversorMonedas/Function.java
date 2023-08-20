package conversorMonedas;

import javax.swing.JOptionPane;

public class Function {

    private ConvertirMonedas monedas = new ConvertirMonedas();
    private ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();

    public void ConvertirMonedas(double Minput) {
        String[] options = {
            "COP to USD", "COP to EUR", "COP to GBP",
            "COP to JPY", "COP to KRW", "USD to COP",
            "EUR to COP", "GBP to COP", "JPY to COP", "KRW to COP"
        };

        String selectedOption = (String) JOptionPane.showInputDialog(
            null, "Choose the currency to which you want to convert your money.", "Currencies",
            JOptionPane.PLAIN_MESSAGE, null, options, options[0]
        );

        if (selectedOption != null) {
            switch (selectedOption) {
                case "COP to USD":
                    monedas.ConvertirPesosADolares(Minput);
                    break;
                case "COP to EUR":
                    monedas.ConvertirPesosAEuros(Minput);
                    break;
                case "COP to GBP":
                    monedas.ConvertirPesosALibras(Minput);
                    break;
                case "COP to JPY":
                    monedas.ConvertirPesosAYen(Minput);
                    break;
                case "COP to KRW":
                    monedas.ConvertirPesosAWon(Minput);
                    break;
                case "USD to COP":
                    pesos.ConvertirDolaresAPesos(Minput);
                    break;
                case "EUR to COP":
                    pesos.ConvertirEurosAPesos(Minput);
                    break;
                case "GBP to COP":
                    pesos.ConvertirLibrasAPesos(Minput);
                    break;
                case "JPY to COP":
                    pesos.ConvertirYenAPesos(Minput);
                    break;
                case "KRW to COP":
                    pesos.ConvertirWonAPesos(Minput);
                    break;
            }
        }
    }
}

