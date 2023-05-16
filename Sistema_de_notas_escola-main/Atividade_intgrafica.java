import javax.swing.*; //pacote com ferramentas gr�ficas
import java.awt.*; //pacote com ferrametnas gr�ficas
import java.awt.event.*; // pacote para tratar eventos(cliques na tela)

public class Atividade_intgrafica extends JPanel { //heran�a sobre a classe jpanel para poder programar as interfaces
	// criando os objetos gr�ficos;
	JLabel lb1, lb2, lb3, lb4, lb5, lb6; //label � uma ferramenta que permite acrescentar texto ou imagem � janela
	JButton bt1, bt2, bt3; //bot�es para janela
	ImageIcon img1, img2, img3;//imagem
	
public Atividade_intgrafica(){
	InicializarComponentes();//configura��es de cada objeto gr�fico
	//DefinirEventos();// programa��o de cada objeto (clique)
	
}

public void InicializarComponentes(){//m�todo para configurar objetos gr�ficos
	 setLayout(null);
	 setBackground(Color.black);
	 lb1 = new JLabel("CSS");
	 lb2 = new JLabel("HTML");
	 lb3 = new JLabel("JavaScript");
	 lb1.setForeground(Color.blue);//troca a cor do texto
	 lb2.setForeground(Color.red);
	 lb3.setForeground(Color.yellow); 
	 img1 = new ImageIcon("C:CSS.png");
	 img2 = new ImageIcon("C:HTML.png");
	 img3 = new ImageIcon("C:js.png");
	 lb4 = new JLabel(img1);
	 lb5 = new JLabel(img2);
	 lb6 = new JLabel(img3);
	 bt1 = new JButton("CSS");
	 bt2 = new JButton("HTML");
	 bt3 = new JButton("JS");
	 lb1.setBounds(87, 130, 200, 100);//setBounds posiciona em (posi��o x, posi��o y, comprimento, altura);
	 lb2.setBounds(217, 130, 200, 100);
	 lb3.setBounds(340, 130, 200, 100);
	 lb4.setBounds(0, 50, 200, 100);
	 lb5.setBounds(140, 50, 200, 100);
	 lb6.setBounds(270, 50, 200, 100);
	 bt1.setBounds(50, 200, 100, 30);
	 bt2.setBounds(185, 200, 100, 30);
	 bt3.setBounds(320, 200, 100, 30);
	 bt1.setBackground(Color.blue);
	 bt2.setBackground(Color.red);
	 bt3.setBackground(Color.yellow);
	 bt1.setForeground(Color.black);
	 bt2.setForeground(Color.black);
	 bt3.setForeground(Color.black);
	 add(lb1);
	 add(lb2);
	 add(lb3);
	 add(lb4);
	 add(lb5);
	 add(lb6);
	 add(bt1);
	 add(bt2);
	 add(bt3);
}
public void DefinirEventos(){//m�todo para programar objetos gr�ficos
	bt1.addActionListener(new ActionListener(){//nas linhas 35 e 36 est� sendo habilitado a op��o do bot�o receber um clique e dentro das {} est� a programa��o que deve acontecer quando o bot�o for clicado
		public void actionPerformed(ActionEvent arg0){	
			JOptionPane.showMessageDialog(null, "Janela feita com sucesso!");	
			}	
	});
	
	bt2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){	
			System.exit(0);	
			}	
	});
	
}

public static void main(String args[]){
	 JFrame frame = new JFrame("Desenvolvimento de Software"); //declara a classe para criar uma janela
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//m�todo para fechar a janela
	 frame.getContentPane().add(new Atividade_intgrafica()); //adiciona o construtor na janela
	 frame.setBounds(300,300,500,300);// define tamanho e posi��o da janela
	 frame.setVisible(true);//define se a janela ir� ser visivel ou n�o
}
}