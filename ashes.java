import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Button;
class Calculator {

	double flag=0;
	public static JFrame frame;
	public JTextField textField;
	public Button btn0, btndot, btneq, btnadd;
	public Button btn1, btn2, btn3, btnsub, btn4, btn5, btn6, btnm, btndiv;
	public Button btn7, btn8, btn9, btnmod, btnans;
	public Button btnpow, btnsq, btninv, btndel, btnac, btnmore;
	public Button btnsin, btncos, btntan, btnlog, btnsqrt, btnfact;
	public Button btnpi, btnex, btnback;
	public JRadioButton rbtn1, rbtn2;
	public ButtonGroup btngrp=new ButtonGroup();
	double n1, n2, res;
	String op, answer;
	String store="";
	public Calculator()
	{
		run();
	}

    public static void main(String args[])
    {
    	frame=new JFrame("Calculator");
    	Calculator window=new Calculator();
		frame.setResizable(false);
		frame.setBounds(500, 100, 275, 385);
		frame.getContentPane().setBackground(new Color(153, 102, 153));
		frame.setLayout(null);
		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	public void run()
	{
		textField=new JTextField("");
		textField.setBounds(10, 15, 238, 50);
		textField.setBackground(new Color(0, 0, 0));
		textField.setForeground(new Color(255, 255, 255));
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		frame.add(textField);

		JLabel label=new JLabel();
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setForeground(Color.WHITE);
		label.setBounds(178, 2, 70, 15);
		frame.add(label);

		JLabel name=new JLabel("CALCULATOR");
		name.setFont(new Font("Tahoma", Font.BOLD, 12));
		name.setForeground(Color.BLACK);
		name.setBounds(10, 2, 90, 15);
		frame.add(name);

		btn0 =new Button("0");
		btn0.setBounds(10, 278, 40, 40);
		btn0.setForeground(Color.WHITE);
		btn0.setBackground(new Color(102, 0, 102));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+"0");
			}
		});
		frame.add(btn0);

		btndot =new Button(".");
		btndot.setBounds(55, 278, 40, 40);
		btndot.setForeground(Color.WHITE);
		btndot.setBackground(new Color(102, 0, 102));
		btndot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndot.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+".");
			}
		});
		frame.add(btndot);

		btneq =new Button("=");
		btneq.setBounds(100, 278, 85, 40);
		btneq.setForeground(Color.WHITE);
		btneq.setBackground(new Color(102, 0, 102));
		btneq.setFont(new Font("Tahoma", Font.BOLD, 16));
		btneq.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					answer=Double.toString(n1+n2);
					textField.setText(answer);
					store=answer;
					op="";
				}
				else if(op=="-")
				{
					answer=Double.toString(n1-n2);
					textField.setText(answer);
					store=answer;
					op="";
				}
				else if(op=="*")
				{
					answer=Double.toString(n1*n2);
					textField.setText(answer);
					store=answer;
					op="";
				}
				else if(op=="/")
				{
					answer=Double.toString(n1/n2);
					textField.setText(answer);
					store=answer;
					op="";
				}
				else if(op=="^")
				{
					res=1;
					while(n2>0)
					{
						res=res*n1;
						n2--;
					}
					answer=Double.toString(res);
					textField.setText(answer);
					store=answer;
					op="";
				}
				else if(op=="%")
				{
					answer=Double.toString(n1%n2);
					textField.setText(answer);
					store=answer;
					op="";
				}
				else
				{
					textField.setText(Double.toString(n2));
				}
				label.setText(null);
			}
		});
		frame.add(btneq);

		btnadd =new Button("+");
		btnadd.setBounds(190, 236, 40, 82);
		btnadd.setForeground(Color.WHITE);
		btnadd.setBackground(new Color(102, 0, 102));
		btnadd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnadd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				op="+";
				textField.setText(null);
				label.setText(n1+"+");
			}
		});
		frame.add(btnadd);

		btn1 =new Button("1");
		btn1.setBounds(10, 236, 40, 40);
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(new Color(102, 0, 102));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+"1");
			}
		});
		frame.add(btn1);

		btn2 =new Button("2");
		btn2.setBounds(55, 236, 40, 40);
		btn2.setForeground(Color.WHITE);
		btn2.setBackground(new Color(102, 0, 102));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+"2");
			}
		});
		frame.add(btn2);

		btn3 =new Button("3");
		btn3.setBounds(100, 236, 40, 40);
		btn3.setForeground(Color.WHITE);
		btn3.setBackground(new Color(102, 0, 102));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+"3");
			}
		});
		frame.add(btn3);

		btnsub =new Button("\u2212");
		btnsub.setBounds(145, 236, 40, 40);
		btnsub.setForeground(Color.WHITE);
		btnsub.setBackground(new Color(102, 0, 102));
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnsub.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					n1=Double.parseDouble(textField.getText());
					op="-";
					textField.setText(null);
					label.setText(n1+"-");
				}
				catch(Exception ex)
				{
					textField.setText("-");
				}

			}
		});
		frame.add(btnsub);

		btn4 =new Button("4");
		btn4.setBounds(10, 194, 40, 40);
		btn4.setForeground(Color.WHITE);
		btn4.setBackground(new Color(102, 0, 102));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+"4");
			}
		});
		frame.add(btn4);

		btn5 =new Button("5");
		btn5.setBounds(55, 194, 40, 40);
		btn5.setForeground(Color.WHITE);
		btn5.setBackground(new Color(102, 0, 102));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+"5");
			}
		});
		frame.add(btn5);

		btn6 =new Button("6");
		btn6.setBounds(100, 194, 40, 40);
		btn6.setForeground(Color.WHITE);
		btn6.setBackground(new Color(102, 0, 102));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+"6");
			}
		});
		frame.add(btn6);

		btnm =new Button("\u00D7");
		btnm.setBounds(145, 194, 40, 40);
		btnm.setForeground(Color.WHITE);
		btnm.setBackground(new Color(102, 0, 102));
		btnm.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnm.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				op="*";
				textField.setText(null);
				label.setText(n1+"\u00D7");

			}
		});
		frame.add(btnm);

		btndiv =new Button("\u00F7");
		btndiv.setBounds(190, 194, 40, 40);
		btndiv.setForeground(Color.WHITE);
		btndiv.setBackground(new Color(102, 0, 102));
		btndiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndiv.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				op="/";
				textField.setText(null);
				label.setText(n1+"\u00F7");
			}
		});
		frame.add(btndiv);

		btn7 =new Button("7");
		btn7.setBounds(10, 152, 40, 40);
		btn7.setForeground(Color.WHITE);
		btn7.setBackground(new Color(102, 0, 102));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+"7");
			}
		});
		frame.add(btn7);

		btn8 =new Button("8");
		btn8.setBounds(55, 152, 40, 40);
		btn8.setForeground(Color.WHITE);
		btn8.setBackground(new Color(102, 0, 102));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+"8");
			}
		});
		frame.add(btn8);

		btn9 =new Button("9");
		btn9.setBounds(100, 152, 40, 40);
		btn9.setForeground(Color.WHITE);
		btn9.setBackground(new Color(102, 0, 102));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+"9");
			}
		});
		frame.add(btn9);

		btnmod =new Button("%");
		btnmod.setBounds(145, 152, 40, 40);
		btnmod.setForeground(Color.WHITE);
		btnmod.setBackground(new Color(102, 0, 102));
		btnmod.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmod.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				op="%";
				textField.setText(null);
				label.setText(n1+"%");

			}
		});
		frame.add(btnmod);

		btnans =new Button("Ans");
		btnans.setBounds(190, 152, 40, 40);
		btnans.setForeground(Color.WHITE);
		btnans.setBackground(new Color(102, 0, 102));
		btnans.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnans.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				double y;
				int x;
				y=Double.parseDouble(store);
				x=(int)y;
				textField.setText(textField.getText()+Integer.toString(x));
			}
		});
		frame.add(btnans);


		btnsq =new Button("X^2");
		btnsq.setBounds(10, 110, 40, 40);
		btnsq.setForeground(Color.WHITE);
		btnsq.setBackground(new Color(102, 0, 102));
		btnsq.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnsq.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				store=Double.toString(n1*n1);
				textField.setText(store);

			}
		});
		frame.add(btnsq);

		btnpow =new Button("X^Y");
		btnpow.setBounds(55, 110, 40, 40);
		btnpow.setForeground(Color.WHITE);
		btnpow.setBackground(new Color(102, 0, 102));
		btnpow.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnpow.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				op="^";
				textField.setText(null);
				label.setText(n1+"^");

			}
		});
		frame.add(btnpow);

		btninv =new Button("1/X");
		btninv.setBounds(100, 110, 40, 40);
		btninv.setForeground(Color.WHITE);
		btninv.setBackground(new Color(102, 0, 102));
		btninv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btninv.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				store=Double.toString(1/n1);
				textField.setText(store);
			}
		});
		frame.add(btninv);

		btndel =new Button("Del");
		btndel.setBounds(145, 110, 40, 40);
		btndel.setForeground(Color.WHITE);
		btndel.setBackground(new Color(102, 0, 102));
		btndel.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndel.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int len=textField.getText().length();
				String str;

				if(len>0)
				{
					StringBuilder s=new StringBuilder(textField.getText());
					s.deleteCharAt(len-1);
					str=s.toString();
					textField.setText(str);
				}

			}
		});
		frame.add(btndel);

	    btnac =new Button("AC");
		btnac.setBounds(190, 110, 40, 40);
		btnac.setForeground(Color.WHITE);
		btnac.setBackground(new Color(102, 0, 102));
		btnac.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnac.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(null);
				label.setText(null);

			}
		});
		frame.add(btnac);

		btnmore =new Button("<");
		btnmore.setBounds(235, 110, 20, 208);
		btnmore.setForeground(Color.WHITE);
		btnmore.setBackground(new Color(102, 0, 102));
		btnmore.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnmore.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				first_part(false);
				second_part(true);
			}
		});
		frame.add(btnmore);

		btnsin =new Button("sin");
		btnsin.setBounds(10, 110, 40, 40);
		btnsin.setForeground(Color.WHITE);
		btnsin.setBackground(new Color(102, 0, 102));
		btnsin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnsin.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(Math.sin(n1)));
				store=textField.getText();
			}
		});
		frame.add(btnsin);

		btncos =new Button("cos");
		btncos.setBounds(55, 110, 40, 40);
		btncos.setForeground(Color.WHITE);
		btncos.setBackground(new Color(102, 0, 102));
		btncos.setFont(new Font("Tahoma", Font.BOLD, 16));
		btncos.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(Math.cos(n1)));
				store=textField.getText();
			}
		});
		frame.add(btncos);

		btntan =new Button("tan");
		btntan.setBounds(100, 110, 40, 40);
		btntan.setForeground(Color.WHITE);
		btntan.setBackground(new Color(102, 0, 102));
		btntan.setFont(new Font("Tahoma", Font.BOLD, 16));
		btntan.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(Math.tan(n1)));
				store=textField.getText();
			}
		});
		frame.add(btntan);

		btnlog =new Button("log");
		btnlog.setBounds(10, 152, 40, 40);
		btnlog.setForeground(Color.WHITE);
		btnlog.setBackground(new Color(102, 0, 102));
		btnlog.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnlog.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(Math.log10(n1)));
				store=textField.getText();
			}
		});
		frame.add(btnlog);

		btnsqrt =new Button("\u221A");
		btnsqrt.setBounds(55, 152, 40, 40);
		btnsqrt.setForeground(Color.WHITE);
		btnsqrt.setBackground(new Color(102, 0, 102));
		btnsqrt.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnsqrt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				textField.setText(Double.toString(Math.sqrt(n1)));
				store=textField.getText();
			}
		});
		frame.add(btnsqrt);

		btnfact =new Button("n!");
		btnfact.setBounds(100, 152, 40, 40);
		btnfact.setForeground(Color.WHITE);
		btnfact.setBackground(new Color(102, 0, 102));
		btnfact.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnfact.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				double fact=1;
				if(n1!=(int)n1)
				{
					textField.setText("ERROR");
					store="";
				}
				else
				{
					while(n1>0)
					{
						fact=fact*n1;
						n1--;
					}
					store=Double.toString(fact);
					textField.setText(store);
				}
			}
		});
		frame.add(btnfact);

		btnpi =new Button("\u03C0");
		btnpi.setBounds(10, 194, 40, 40);
		btnpi.setForeground(Color.WHITE);
		btnpi.setBackground(new Color(102, 0, 102));
		btnpi.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnpi.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(textField.getText()+Math.PI);
			}
		});
		frame.add(btnpi);

		btnex =new Button("e^x");
		btnex.setBounds(55, 194, 40, 40);
		btnex.setForeground(Color.WHITE);
		btnex.setBackground(new Color(102, 0, 102));
		btnex.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnex.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				n1=Double.parseDouble(textField.getText());
				store=Double.toString(Math.exp(n1));
				textField.setText(store);
			}
		});
		frame.add(btnex);

		btnback =new Button(">");
		btnback.setBounds(145, 110, 20, 124);
		btnback.setForeground(Color.WHITE);
		btnback.setBackground(new Color(102, 0, 102));
		btnback.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnback.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				first_part(true);
				second_part(false);
			}
		});
		frame.add(btnback);

		second_part(false);

		rbtn1=new JRadioButton("ON");
		rbtn1.setBounds(10, 71, 47, 23);
		rbtn1.setForeground(Color.WHITE);
		rbtn1.setBackground(new Color(0, 0, 102));
		rbtn1.setFont(new Font("Tahoma", Font.BOLD, 13));
		rbtn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				first_part(true);
				second_part(false);
				enable(true);
			}
		});
		btngrp.add(rbtn1);
		frame.add(rbtn1);

		rbtn2=new JRadioButton("OFF");
		rbtn2.setBounds(201, 71, 46, 23);
		rbtn2.setForeground(Color.WHITE);
		rbtn2.setBackground(new Color(0, 0, 102));
		rbtn2.setFont(new Font("Tahoma", Font.BOLD, 13));
		rbtn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText(null);
				label.setText(null);
				store="";
				enable(false);
			}
		});
		btngrp.add(rbtn2);
		frame.add(rbtn2);



	}
	public void first_part(boolean b)
	{
		btn0.setVisible(b);
		btndot.setVisible(b);
		btneq.setVisible(b);
		btnadd.setVisible(b);
		btn1.setVisible(b);
		btn2.setVisible(b);
		btn3.setVisible(b);
		btnsub.setVisible(b);
		btn4.setVisible(b);
		btn5.setVisible(b);
		btn6.setVisible(b);
		btnm.setVisible(b);
		btndiv.setVisible(b);
		btn7.setVisible(b);
		btn8.setVisible(b);
		btn9.setVisible(b);
		btnmod.setVisible(b);
		btnans.setVisible(b);
		btnpow.setVisible(b);
		btnsq.setVisible(b);
		btninv.setVisible(b);
		btndel.setVisible(b);
		btnac.setVisible(b);
		btnmore.setVisible(b);
	}
	public void second_part(boolean b)
	{
		btnsin.setVisible(b);
		btncos.setVisible(b);
		btntan.setVisible(b);
		btnlog.setVisible(b);
		btnfact.setVisible(b);
		btnsqrt.setVisible(b);
		btnpi.setVisible(b);
		btnex.setVisible(b);
		btnback.setVisible(b);
	}
	public void enable(boolean b)
	{
		textField.setEnabled(b);
		btn0.setEnabled(b);
		btndot.setEnabled(b);
		btneq.setEnabled(b);
		btnadd.setEnabled(b);
		btn1.setEnabled(b);
		btn2.setEnabled(b);
		btn3.setEnabled(b);
		btnsub.setEnabled(b);
		btn4.setEnabled(b);
		btn5.setEnabled(b);
		btn6.setEnabled(b);
		btnm.setEnabled(b);
		btndiv.setEnabled(b);
		btn7.setEnabled(b);
		btn8.setEnabled(b);
		btn9.setEnabled(b);
		btnmod.setEnabled(b);
		btnans.setEnabled(b);
		btnpow.setEnabled(b);
		btnsq.setEnabled(b);
		btninv.setEnabled(b);
		btndel.setEnabled(b);
		btnac.setEnabled(b);
		btnmore.setEnabled(b);
		btnsin.setEnabled(b);
		btncos.setEnabled(b);
		btntan.setEnabled(b);
		btnlog.setEnabled(b);
		btnfact.setEnabled(b);
		btnsqrt.setEnabled(b);
		btnpi.setEnabled(b);
		btnex.setEnabled(b);
		btnback.setEnabled(b);
	}



}