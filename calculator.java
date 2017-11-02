package Anotherpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * @author Bhavna
 *
 */

public class calculator {

	private JFrame frame;
	
	private JTextArea textArea;
	private JButton button_4;
	private CharSequence s;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		
		
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		final Operations gv= new Operations();
		frame.setBounds(100, 100, 385, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(23, 11, 367, 45);
		frame.getContentPane().add(textArea);
		textArea.setColumns(10);
		
		JButton btnNewButton = 
				new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("1");	
			}
		});
		btnNewButton.setBounds(23, 72, 63, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBounds(110, 74, 63, 40);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("2");
			}
		});
		frame.getContentPane().add(btnNewButton_1);
		
		JButton button = new JButton("3");
		button.setBounds(190, 77, 63, 40);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("3");
			}
		});
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("4");
			}
		});
		
		JButton button_2 = new JButton("5");
		button_2.setBounds(110, 128, 63, 40);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("5");
			}
		});
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.setBounds(190, 128, 63, 40);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("6");
			}
		});
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("+");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				s="+";
				if(textArea.getText().contains(s)){
				}else{
					textArea.append("+");
					gv.setOperand1(textArea.getText(),1);
				}
			}
		});
		button_4.setBounds(287, 77, 58, 40);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("=");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int res=gv.setOperand2(textArea.getText(),textArea.getText().length());
				textArea.setText(String.valueOf(res));
			}
		});
		button_5.setBounds(287, 128, 63, 40);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("4");
		button_6.setBounds(23, 128, 63, 40);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("7");
			}
		});
		button_7.setBounds(23, 179, 63, 40);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("8");				
			}
		});
		button_8.setBounds(110, 179, 63, 40);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("9");	
			}
		});
		button_9.setBounds(190, 179, 63, 40);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String sub=textArea.getText();
				CharSequence s="-";
				if(sub.contains(s)){
				}else{
					textArea.append("-");
					String sub1=textArea.getText();
					gv.setOperand1(sub1,2);
				}


			}
		});
		button_10.setBounds(287, 179, 63, 40);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("0");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("0");
			}
		});
		button_11.setBounds(110, 230, 63, 40);
		frame.getContentPane().add(button_11);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String mul=textArea.getText();
				CharSequence s="*";
				if(mul.contains(s)){
				}else{
					textArea.append("*");
					String mul1=textArea.getText();
					gv.setOperand1(mul1,3);
				}
			}
		});
		btnX.setBounds(23, 230, 63, 40);
		frame.getContentPane().add(btnX);
		
		JButton button_12 = new JButton("/");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String div=textArea.getText();
				CharSequence s="/";
				if(div.contains(s)){
				}else{
					textArea.append("/");
					String div1=textArea.getText();
					gv.setOperand1(div1,4);
				}
			}
		});
		button_12.setBounds(190, 230, 63, 40);
		frame.getContentPane().add(button_12);
		
		
		JButton button_13 = new JButton("del");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
			}
		});
		button_13.setBounds(287, 230, 63, 40);
		frame.getContentPane().add(button_13);
	}
}


class Operations{
	
		String operand1=null;
		String operand2=null;
		String fullscreentext=null;
		int fulllength=0;
		int offsetlength=0;
		int subsetlength=0;
		int operator=0;
		int result;
		public void setOperand1(String o,int operator1){
			operand1=o;
			operator=operator1;
			System.out.println(operand1+"operator is "+operator);
			 offsetlength=operand1.length()-1;
		}
		public int setOperand2(String fulltext,int l){
			fullscreentext=fulltext;
			fulllength=l;
			 subsetlength=l-(offsetlength+1);
			 String oper1=fullscreentext.substring(0,offsetlength );
			 System.out.println("operand1 is"+"" +oper1);
			 String oper2=fullscreentext.substring(offsetlength+1,fulllength);
			 System.out.println("operand2 is"+"" +oper2);
			 int operandA=Integer.parseInt(oper1);
			 System.out.println(operandA);
			 int operandB=Integer.parseInt(oper2);
			 System.out.println(operandB);
			 
			System.out.println("operand1 is "+" "+oper1+" "+"operand2 is"+" "+oper2+" "+"operator is" +" "+ operator);
			switch(operator){
			case 1:System.out.println("addition");
			       result=operandA+operandB;
			       break;
			      // return result;
			       
			case 2:System.out.println("subtraction");
			          if(operandA< operandB){
				       result= 0;
			                  }
			          else{
		                 result=operandA-operandB;		                    
			            }
			          break;			          
			case 3:System.out.println("multiplication");
	                 result=operandA*operandB; 
	                 break;                    
			case 4:System.out.println("division");
			       if(o1< o2){
			      result=0;
		                  }
			       else{
			    	   result=o1/o2; 
	                    
			       }
			       break;                    			 
			}
			return result;
		}
		
	
}
