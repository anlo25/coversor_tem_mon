package conversorMonedas;
import javax.swing.JOptionPane;
public class ConvertirMonedas {
	//dividimos los pesos entre 4096.45, el resultado se multiplica por 100 y despues se divide entre 100 
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor / 4096.45;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Converted Amount: $ " +monedaDolar+ " Dollars");
	}
	//dividimos los pesos entre 4466.36, el resultado se multiplica por 100 y despues se divide entre 100
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor / 4466.36;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Converted Amount: € " +monedaEuro+ " Euros");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor / 5200.48;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Converted Amount: $ " +monedaLibra+ " British pounds");
	}
	
	public void ConvertirPesosAYen(double valor) {
		double monedaYen = valor / 28.14;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Converted Amount: ¥ " +monedaYen+ " Japanese yen");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double monedaWon = valor / 3.06;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Converted Amount: ₩ " +monedaWon+ " Korean won");
	}
}
