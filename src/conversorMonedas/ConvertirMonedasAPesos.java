package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 4096.45;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Converted Amount: $ " +monedaDolar+ " Colombian pesos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 4466.36;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Converted Amount: $ " +monedaEuro+ " Colombian pesos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 5200.48;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Converted Amount: $ " +monedaLibra+ " Colombian pesos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 28.14;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Converted Amount: $ " +monedaYen+ " Colombian pesos");
	}
	
	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 3.06;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Converted Amount: $ " +monedaWon+ " Colombian pesos");
	}
}













