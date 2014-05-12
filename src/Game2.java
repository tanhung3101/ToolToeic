import info.clearthought.layout.TableLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Game2  extends JFrame{
	public static void main (String[] args){
		//first change
		 JFrame frame = new Game2();
	        frame.setVisible(true);
	        frame.setSize(300, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public Game2(){
		this.add(createPanel());
	}
	
	
	public JPanel createPanel(){
		JPanel mainPanel=new JPanel();
		JLabel lblQuestion=new JLabel("AAAAAAAA");
		lblQuestion.setText("adsasdasds");
		double[][] size={{0.5},{0.5}};
		
		mainPanel.setLayout(new TableLayout(size));
		
		mainPanel.add(lblQuestion,"0,0,0,0");
		
		return mainPanel;
	}
}
