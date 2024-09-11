package prjCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Calculadora extends JFrame {

private JLabel lbNumero;
private JButton btSoma;
private JButton btSubtrair;
private JButton btMultiplicar;
private JButton btDividir;

private JTextField txNumero1;
private JTextField txNumero2;

public Calculadora()	{
	
	setTitle("Calculadora Negra");
	setSize(1000,800);
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	lbNumero = new JLabel();
	lbNumero.setText("Insira 1º número");
	lbNumero.setBounds(5,2,200,100);
	add (lbNumero);
	lbNumero = new JLabel();
	lbNumero.setText("Insira 2º número");
	lbNumero.setBounds(5,2,200,200);
	add (lbNumero);
	
	txNumero1 = new JTextField();
	txNumero1.setBounds(120,40,200,30);
	add (txNumero1);
	
	txNumero2 = new JTextField();
	txNumero2.setBounds(120,90,200,30);
	add (txNumero2);
	
	btSoma = new JButton();
	btSoma.setBounds(120,150,120,50);
	btSoma.setText("adição");
	add (btSoma);
	
	btSubtrair = new JButton();
	btSubtrair.setBounds(250,150,120,50);
	btSubtrair.setText("Subtração");
	add (btSubtrair);

	btMultiplicar = new JButton();
	btMultiplicar.setBounds(380,150,120,50);
	btMultiplicar.setText("Multiplicação");
	add (btMultiplicar);
	
	btDividir = new JButton();
	btDividir.setBounds(510,150,120,50);
	btDividir.setText("Divisão");
	add (btDividir);
	 setVisible(true);
	 
	 btSoma.addActionListener(new ActionListener () {
		 @Override
		public void actionPerformed(ActionEvent e) {
			double r = Double.parseDouble(txNumero1.getText()) + Double.parseDouble(txNumero2.getText());
			JOptionPane.showMessageDialog(null, "Resultado: "+r);
		 } 
	 });
	 btSubtrair.addActionListener(new ActionListener () {
		 @Override
		public void actionPerformed(ActionEvent e) {
			double r = Double.parseDouble(txNumero1.getText()) - Double.parseDouble(txNumero2.getText());
			JOptionPane.showMessageDialog(null, "Resultado: "+r);
		 } 
	 });
	 btMultiplicar.addActionListener(new ActionListener () {
		 @Override
		public void actionPerformed(ActionEvent e) {
			double r = Double.parseDouble(txNumero1.getText()) * Double.parseDouble(txNumero2.getText());
			JOptionPane.showMessageDialog(null, "Resultado: "+r);
		 } 
	 });
	 btDividir.addActionListener(new ActionListener () {
		 @Override
		public void actionPerformed(ActionEvent e) {
			double r = Double.parseDouble(txNumero1.getText()) / Double.parseDouble(txNumero2.getText());
			JOptionPane.showMessageDialog(null, "Resultado: "+r);
		 } 
	 });
}
	
}