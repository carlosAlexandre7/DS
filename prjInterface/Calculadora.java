package prjInterface;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculadora extends JFrame {

private JLabel lbNumero;
private JButton btEnviar;
private JTextField txNumero;

public Calculadora()	{
	
	setTitle("Calculadora Negra");
	setSize(1000,800);
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	lbNumero = new JLabel();
	lbNumero.setText("Insira 1� n�mero");
	lbNumero.setBounds(5,2,200,100);
	add (lbNumero);
	lbNumero = new JLabel();
	lbNumero.setText("Insira 2� n�mero");
	lbNumero.setBounds(5,2,200,200);
	add (lbNumero);
	
	txNumero = new JTextField();
	txNumero.setBounds(120,40,200,30);
	add (txNumero);
	
	txNumero = new JTextField();
	txNumero.setBounds(120,90,200,30);
	add (txNumero);
	
	btEnviar = new JButton();
	btEnviar.setBounds(120,150,120,50);
	btEnviar.setText("adi��o");
	add (btEnviar);
	
	btEnviar = new JButton();
	btEnviar.setBounds(250,150,120,50);
	btEnviar.setText("Subtra��o");
	add (btEnviar);

	btEnviar = new JButton();
	btEnviar.setBounds(380,150,120,50);
	btEnviar.setText("Multiplica��o");
	add (btEnviar);
	
	btEnviar = new JButton();
	btEnviar.setBounds(510,150,120,50);
	btEnviar.setText("Divis�o");
	add (btEnviar);
	 setVisible(true);
}
	
}
