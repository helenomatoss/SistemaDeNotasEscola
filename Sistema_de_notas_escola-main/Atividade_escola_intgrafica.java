import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;

public class Atividade_escola_intgrafica extends JPanel {
	

	JLabel lbnome, lbnumero ,lbturma, lbnota1, lbnota2, lbnota3 ,lbcalcular, lbimg, lbimg2, lbimg3;// texto ou imagem n�o edit�vel
	JTextField tfnome, tfnumero, tfturma, tfnota1, tfnota2, tfnota3 ; //campo de texto 
	JButton btcalcular; //bot�o
	ImageIcon img1, img2, img3;
	
	public Atividade_escola_intgrafica() {
		inicializarComponentes();
		definirEventos();
		
	}
	
	public void inicializarComponentes() {
		//tirando o layout
		setLayout(null);
		//instanciando os objetos gr�ficos
		lbnome = new JLabel("Nome:");
		tfnome = new JTextField(8);
		lbnumero = new JLabel("N�mero:");
		tfnumero = new JTextField(2);
		lbturma = new JLabel("Turma:");
		tfturma = new JTextField(5);
		lbnota1 = new JLabel("Nota 1:");
		tfnota1= new JTextField(2);
		lbnota2= new JLabel("Nota 2:");
		tfnota2 = new JTextField(2);
		lbnota3 = new JLabel("Nota 3:");
		tfnota3 = new JTextField(2);
		btcalcular = new JButton("Calcular");
		lbcalcular = new JLabel("");
		
		img1 = new ImageIcon("C:logo.png");
		lbimg = new JLabel(img1);
		img2 = new ImageIcon("C:happy.png");
		lbimg2 = new JLabel(img2);
		img3 = new ImageIcon("C:sad.png");
		lbimg3 = new JLabel(img3);
		

		
		//definir posi��o e tamanho dos componentes
		
		lbnome.setBounds(90,10,40,40); //setBounds define posi��o dos componentes (x,y) e o tamanho (largura, altura)
		tfnome.setBounds(140,20,200,20);
		lbturma.setBounds(230,40,40,40); 
		tfturma.setBounds(280,50,60,20);
		lbnumero.setBounds(90,40,70,40); 
		tfnumero.setBounds(150,50,70,20);
		lbnota1.setBounds(90,70,40,40); 
		tfnota1.setBounds(140,80,40,20);
		lbnota2.setBounds(190,70,40,40); 
		tfnota2.setBounds(240,80,40,20);
		lbnota3.setBounds(300,70,40,40); 
		tfnota3.setBounds(350,80,40,20);
		btcalcular.setBounds(210,120,100,30);
		lbcalcular.setBounds(10,105,600,120);
		
		lbimg.setBounds(290,0,200,100);
		lbimg2.setBounds(230,170,64,64);
		lbimg3.setBounds(230,170,64,64);
		
		lbnome.setForeground(new Color(0,0,0)); //troca a cor do texto da label
		lbnome.setFont(new Font("Arial", Font.BOLD, 12));
		lbnumero.setForeground(new Color(0,0,0)); //troca a cor do texto da label
		lbnumero.setFont(new Font("Arial", Font.BOLD, 12));
		lbturma.setForeground(new Color(0,0,0)); //troca a cor do texto da label
		lbturma.setFont(new Font("Arial", Font.BOLD, 12));
		lbnota1.setForeground(new Color(255,0,0)); //troca a cor do texto da label
		lbnota1.setFont(new Font("Arial", Font.BOLD, 12));
		lbnota2.setForeground(new Color(255,0,0)); //troca a cor do texto da label
		lbnota2.setFont(new Font("Arial", Font.BOLD, 12));
		lbnota3.setForeground(new Color(255,0,0)); //troca a cor do texto da label
		lbnota3.setFont(new Font("Arial", Font.BOLD, 12));
		lbcalcular.setForeground(new Color(0,0,0)); //troca a cor do texto da label
		lbcalcular.setFont(new Font("Arial", Font.BOLD, 12));
	
		//adicionar os componentes na tela
		add(lbnome);
		add(tfnome);
		add(lbturma);
		add(tfturma);
		add(lbnumero);
		add(tfnumero);
		add(lbnota1);
		add(tfnota1);
		add(lbnota2);
		add(tfnota2);
		add(lbnota3);
		add(tfnota3);
		add(btcalcular);
		add(lbcalcular);
		add(lbimg);
		add(lbimg2);
		add(lbimg3);
		
		lbcalcular.setVisible(false);
		lbimg2.setVisible(false);
		lbimg3.setVisible(false);
		
	}
	
	public void definirEventos() {
		
		btcalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lbcalcular.setVisible(true);
				double nota1 = Double.parseDouble(tfnota1.getText());
				double nota2 = Double.parseDouble(tfnota2.getText());
				double nota3 = Double.parseDouble(tfnota3.getText());
				
				double media = nota1 + nota2 + nota3;
				double resu = 0;
				resu = media / 3;
				DecimalFormat formatador = new DecimalFormat("0.00");
				if (resu > 6) {
					lbimg2.setVisible(true);
					lbimg3.setVisible(false);
					lbcalcular.setText("O aluno " + tfnome.getText() + " (" + tfnumero.getText() + ")" + ", da turma " + tfturma.getText() + ", com a m�dia de: " + formatador.format(resu) + " est� aprovado.");
				}
				if (resu > 4 && resu < 6) {
					lbimg3.setVisible(true);
					lbimg2.setVisible(false);
					lbcalcular.setText("O aluno " + tfnome.getText() + " (" + tfnumero.getText() + ")" + ", da turma " + tfturma.getText() + ", com a m�dia de: " + formatador.format(resu) + " est� de recupera��o.");
					}
				if (resu < 4) {
					lbimg3.setVisible(true);
					lbimg2.setVisible(false);
					lbcalcular.setText("O aluno " + tfnome.getText() + " (" + tfnumero.getText() + ")" + ", da turma " + tfturma.getText() + ", com a m�dia de: " + formatador.format(resu) + " est� reprovado.");
					}
				}		
	});
		
		
	}
	
	public static void main(String args[]){
 		JFrame frame = new JFrame("M�dia Escolar");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().add(new Atividade_escola_intgrafica());
		 frame.setBounds(300,300,520,300);
		 frame.setVisible(true);
		 	 
	 }
}