import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	JFrame jf;
	JLabel labelObject;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton,fourButton,fiveButton,sixButton,oneButton,twoButton,threeButton;
	JButton pointButton,zeroButton,equalButton,plusButton,minusButton,multiplyButton,divideButton;
	JButton clearButton;
	float number1,number2,result,displayNumber=0;
	String displayText="",operand;
	Calculator()
	{
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(500,600);
		jf.setLocation(500, 50);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		labelObject=new JLabel();
		labelObject.setBounds(30, 50, 420, 50);
		//labelObject.setVisible(true);
		labelObject.setBackground(Color.lightGray);
		labelObject.setOpaque(true);
		labelObject.setHorizontalAlignment(SwingConstants.RIGHT);
		labelObject.setForeground(Color.WHITE);
		jf.add(labelObject);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 120, 50, 50);
		sevenButton.setBackground(Color.WHITE);
		//sevenButton.setFont(new Font("Arial",Font.PLAIN, 20));
		jf.add(sevenButton);
		sevenButton.addActionListener(this);
		
		eightButton=new JButton("8");
		eightButton.setBounds(90, 120, 50, 50);
		eightButton.setBackground(Color.WHITE);
		jf.add(eightButton);
		eightButton.addActionListener(this);
		
		nineButton=new JButton("9");
		nineButton.setBounds(150, 120, 50, 50);
		nineButton.setBackground(Color.WHITE);
		jf.add(nineButton);
		nineButton.addActionListener(this);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 180, 50, 50);
		fourButton.setBackground(Color.WHITE);
		jf.add(fourButton);
		fourButton.addActionListener(this);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(90, 180, 50, 50);
		fiveButton.setBackground(Color.WHITE);
		jf.add(fiveButton);
		fiveButton.addActionListener(this);
		
		sixButton=new JButton("6");
		sixButton.setBounds(150, 180, 50, 50);
		sixButton.setBackground(Color.WHITE);
		jf.add(sixButton);
		sixButton.addActionListener(this);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 240, 50, 50);
		oneButton.setBackground(Color.WHITE);
		jf.add(oneButton);
		oneButton.addActionListener(this);
		
		twoButton=new JButton("2");
		twoButton.setBounds(90, 240, 50, 50);
		twoButton.setBackground(Color.WHITE);
		jf.add(twoButton);
		twoButton.addActionListener(this);
		
		threeButton=new JButton("3");
		threeButton.setBounds(150, 240, 50, 50);
		threeButton.setBackground(Color.WHITE);
		jf.add(threeButton);
		threeButton.addActionListener(this);
		
		pointButton=new JButton(".");
		pointButton.setBounds(30, 300, 50, 50);
		pointButton.setBackground(Color.WHITE);
		jf.add(pointButton);
		pointButton.addActionListener(this);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(90, 300, 50, 50);
		zeroButton.setBackground(Color.WHITE);
		jf.add(zeroButton);
		zeroButton.addActionListener(this);
		
		equalButton=new JButton("=");
		equalButton.setBounds(150, 300, 50, 50);
		equalButton.setBackground(Color.WHITE);
		jf.add(equalButton);
		equalButton.addActionListener(this);
		
		plusButton=new JButton("+");
		plusButton.setBounds(250, 120, 50, 50);
		plusButton.setBackground(Color.WHITE);
		jf.add(plusButton);
		plusButton.addActionListener(this);
		
		minusButton=new JButton("-");
		minusButton.setBounds(250, 180, 50, 50);
		minusButton.setBackground(Color.WHITE);
		jf.add(minusButton);
		minusButton.addActionListener(this);
		
		multiplyButton=new JButton("X");
		multiplyButton.setBounds(250, 240, 50, 50);
		multiplyButton.setBackground(Color.WHITE);
		jf.add(multiplyButton);
		multiplyButton.addActionListener(this);
		
		divideButton=new JButton("/");
		divideButton.setBounds(250, 300, 50, 50);
		divideButton.setBackground(Color.WHITE);
		jf.add(divideButton);
		divideButton.addActionListener(this);
		
		clearButton=new JButton("CLR");
		clearButton.setBounds(350, 300, 100, 50);
		clearButton.setBackground(Color.WHITE);
		jf.add(clearButton);
		clearButton.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//
		//jf.getContentPane().setBackground(Color.PINK);
		if(e.getSource()==sevenButton)
		{
			//displayNumber=displayNumber*10+7;
			labelObject.setText(labelObject.getText()+"7");
		}
		else if(e.getSource()==eightButton)
		{
			labelObject.setText(labelObject.getText()+"8");
		}
		else if(e.getSource()==nineButton)
			labelObject.setText(labelObject.getText()+"9");
		else if(e.getSource()==fourButton)
			labelObject.setText(labelObject.getText()+"4");
		else if(e.getSource()==fiveButton)
			labelObject.setText(labelObject.getText()+"5");
		else if(e.getSource()==sixButton)
			labelObject.setText(labelObject.getText()+"6");
		else if(e.getSource()==oneButton)
			labelObject.setText(labelObject.getText()+"1");
		else if(e.getSource()==twoButton)
			labelObject.setText(labelObject.getText()+"2");
		else if(e.getSource()==threeButton)
			labelObject.setText(labelObject.getText()+"3");
		else if(e.getSource()==pointButton)
			labelObject.setText(labelObject.getText()+".");
		else if(e.getSource()==zeroButton)
			labelObject.setText(labelObject.getText()+"0");
		else if(e.getSource()==equalButton)
		{
			number2=Float.parseFloat(labelObject.getText());
			switch(operand)
			{
				case "+": result=number1+number2;
							break;
				case "-": result=number1-number2;
							break;
				case "X": result=number1*number2;
							break;
				case "/": result=number1/number2;
							break;
			}
			labelObject.setText(result+"");
			number1=result;
		}
		else if(e.getSource()==plusButton)
		{
			number1=Float.parseFloat(labelObject.getText());
			labelObject.setText("");
			operand="+";
		}
		else if(e.getSource()==minusButton)
		{
			number1=Float.parseFloat(labelObject.getText());
			labelObject.setText("");
			operand="-";
		}
		else if(e.getSource()==multiplyButton)
		{
			number1=Float.parseFloat(labelObject.getText());
			labelObject.setText("");
			operand="X";
		}
		else if(e.getSource()==divideButton)
		{
			number1=Float.parseFloat(labelObject.getText());
			labelObject.setText("");
			operand="/";
		}
		else
			labelObject.setText("");
	}
}

