package implementacaoJTextFieldEJlist;

import java.awt.Color;
import java.awt.Event;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;import javax.swing.border.Border;

public class App extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Rectangle tamanhoJanela = new Rectangle(5,5,285,450);
	
	public static void main(String[] args) {
		new App();
	}
	
	public App() {
		

		this.setBounds(tamanhoJanela);
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
		this.setTitle("Aplicação");
		this.setLayout(null);

		

		JPanel display1 = new JPanel();
		display1.setBounds(5, 5, 250, 20);
		//display1.setBackground(Color.blue);
		this.add(display1);
		this.setVisible(true);
		
		JLabel labelTF = new JLabel();
		labelTF.setText("Definitivamente um campo de texto");
		labelTF.setBackground(Color.black);
		labelTF.setBounds(5,5,250,20);
		display1.add(labelTF);
		

		JPanel display2 = new JPanel();
		display2.setBounds(5,35, 250, 50);
		//display2.setBackground(Color.red);
		this.add(display2);

		//this.setBounds(int x, int y, int width, int height);
		JTextField tf = new JTextField();
		tf.setBounds(40,40, 275, 20);
		tf.setColumns(20);
		tf.setSize(275,20);
		tf.setBackground(Color.white);
		display2.add(tf);
		

		
		JPanel display3 = new JPanel();
		display3.setBounds(5,100, 250, 50);
		//display3.setBackground(Color.green);
		this.add(display3);
		
		JButton ba = new JButton();
		ba.setText("Adicionar");
		ba.setBounds(25, 65, 250, 30);
		display3.add(ba);
		
		JButton bl = new JButton();
		bl.setText("Limpar");
		bl.setBounds(50, 65, 250, 30);
		display3.add(bl);
		
		
		JPanel display4 = new JPanel();
		display4.setBounds(5,160, 250, 100);
		//display4.setBackground(Color.yellow);
		this.add(display4);
		

		DefaultListModel<String> lista = new DefaultListModel<String>();
		JList<String> jl = new JList<>(lista);
		jl.setBounds(25,105,250,30);
		display4.add(jl);
		
		
		
		
		
		
		ba.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().isEmpty()) {
					return;
				}

				lista.add(lista.getSize(), tf.getText());
		
			}
		});
		
		
		bl.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lista.removeAllElements();
				
			}
		});
	}
	

}
