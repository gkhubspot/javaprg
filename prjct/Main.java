import javax.swing.*;
import java.util.*;
import java.awt.event.*;

class Calculator{
	public static void AND_Calculator(){

		    JFrame window=new JFrame("Operators");

		    JButton bin1_b,bin2_b,result_b,res_b,close_b;
		    JTextField bin1_field,bin2_field,result_field;
		    JLabel bin1_lab,bin2_lab,result_lab,name;

		    res_b=new JButton("Reset");
		    close_b=new JButton("Close");
            result_b=new JButton("AND ");

            result_b.setBounds(50,240,100, 40);
		    res_b.setBounds(185,240,100, 40);
		    close_b.setBounds(310,240,100, 40);

			window.add(result_b);window.add(res_b);window.add(close_b);  


			bin1_field=new JTextField();  
			bin1_field.setBounds(180,75, 170,30);  
			bin2_field=new JTextField();  
			bin2_field.setBounds(180,135, 170,30);    
			result_field=new JTextField();  
			result_field.setBounds(180,195, 170,30);  
			window.add(bin1_field);window.add(bin2_field);window.add(result_field); 
			
			bin1_lab=new JLabel("Decimal No 1:");  
		    bin1_lab.setBounds(70,75, 130,30);  
		    bin2_lab=new JLabel("Decimal No 2:");  
		    bin2_lab.setBounds(70,135, 130,30);   
		    result_lab=new JLabel("Result :");  
		    result_lab.setBounds(70,195, 130,30);  
		    name =new JLabel("Binary AND Operation");
		    name.setBounds(170,30, 150,30); 

		    window.add(bin1_lab);window.add(bin2_lab);window.add(name);window.add(result_lab);

			
			JButton AND_img;

			AND_img = new JButton(new ImageIcon("./images/AND.jpg"));
			AND_img.setBounds(110,290,240,150);
            
			window.add(AND_img);
			window.setSize(500,500);
			window.setLayout(null);
			window.setVisible(true);

			
            res_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						bin1_field.setText("");
						bin2_field.setText("");
                        result_field.setText("");
				} 
			});

		    result_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
                   // String dec = dec_field.getText();
				    String bin1 = bin1_field.getText();
				    String bin2 = bin2_field.getText();
				    try{
					   result_field.setText(Integer.toString((Integer.parseInt(bin1) & Integer.parseInt(bin2))));
				   }catch(Exception a){
					   result_field.setText("Invalid input");
				   }
            } 

			});

		    close_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						window.setVisible(false);
				} 
			});
		}

		public static void OR_Calculator(){

		    JFrame window=new JFrame("Operators");

		    JButton bin1_b,bin2_b,result_b,res_b,close_b;
		    JTextField bin1_field,bin2_field,result_field;
		    JLabel bin1_lab,bin2_lab,result_lab,name;

		    res_b=new JButton("Reset");
		    close_b=new JButton("Close");
            result_b=new JButton("OR");
			result_b.setBounds(50,240,100, 40);
		    res_b.setBounds(185,240,100, 40);
		    close_b.setBounds(310,240,100, 40);

			window.add(result_b);window.add(res_b);window.add(close_b);  
            

			bin1_field=new JTextField();  
			bin1_field.setBounds(180,75, 170,30);  
			bin2_field=new JTextField();  
			bin2_field.setBounds(180,135, 170,30);    
			result_field=new JTextField();  
			result_field.setBounds(180,195, 170,30);  
			window.add(bin1_field);window.add(bin2_field);window.add(result_field); 
			
			bin1_lab=new JLabel("Decimal No 1:");
			  
			bin1_lab.setBounds(70,65, 130,30);   
		    bin2_lab=new JLabel("Decimal No 2:");  
			bin2_lab.setBounds(70,135, 130,30);    
		    result_lab=new JLabel("Result :");  
		    result_lab.setBounds(70,195, 130,30);  
		    name =new JLabel("Binary OR Operation");
		    name.setBounds(150,30, 150,30); 

		    window.add(bin1_lab);window.add(bin2_lab);window.add(name);window.add(result_lab);
           
			window.setSize(500,500);
			window.setLayout(null);
			window.setVisible(true);

			JButton OR_img;

			OR_img = new JButton(new ImageIcon("./images/OR.jpg"));
			OR_img.setBounds(110,290,240,150);
			            
			window.add(OR_img);

            res_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						bin1_field.setText("");
						bin2_field.setText("");
                        result_field.setText("");
				} 
			});

		    result_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
                   // String dec = dec_field.getText();
				    String bin1 = bin1_field.getText();
				    String bin2 = bin2_field.getText();
				    try{
					   result_field.setText(Integer.toString((Integer.parseInt(bin1) | Integer.parseInt(bin2))));
				   }catch(Exception a){
					   result_field.setText("Invalid input");
				   }
            } 

			});

		    close_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						window.setVisible(false);
				} 
			});
		}

		public static void NOT_Calculator(){

		    JFrame window=new JFrame("Operators");

		    JButton bin1_b,result_b,res_b,close_b;
		    JTextField bin1_field,result_field;
		    JLabel bin1_lab,result_lab,name;

		    res_b=new JButton("Reset");
		    close_b=new JButton("Close");
            result_b=new JButton("INVERT ");

            result_b.setBounds(50,240,100, 40);
		    res_b.setBounds(175,240,100, 40);
		    close_b.setBounds(285,240,100, 40);

			window.add(result_b);window.add(res_b);window.add(close_b);  


			bin1_field=new JTextField();  
			bin1_field.setBounds(180,105, 170,30);  
   
			result_field=new JTextField();  
			result_field.setBounds(180,165, 170,30);  
			window.add(bin1_field);window.add(result_field); 
			
			bin1_lab=new JLabel("Decimal No 1:");  
		    bin1_lab.setBounds(70,105, 130,30);  

		    result_lab=new JLabel("Result :");  
		    result_lab.setBounds(70,165, 130,30);  
		    name =new JLabel("Binary INVERT Operation");
		    name.setBounds(150,30, 150,30); 

		    window.add(bin1_lab);window.add(name);window.add(result_lab);

			window.setSize(500,500);
			window.setLayout(null);
			window.setVisible(true);
            
			JButton NOT_img;
			NOT_img = new JButton(new ImageIcon("./images/NOT.jpg"));
			NOT_img.setBounds(110,290,240,150);
			            
			window.add(NOT_img);

            res_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						bin1_field.setText("");
                        result_field.setText("");
				} 
			});

		    result_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
                   // String dec = dec_field.getText();
				    String bin1 = bin1_field.getText();
				    try{
					   result_field.setText(Integer.toString(~(Integer.parseInt(bin1))));
				   }catch(Exception a){
					   result_field.setText("Invalid input");
				   }
            } 

			});

		    close_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						window.setVisible(false);
				} 
			});
		}

		public static void XOR_Calculator(){

		    JFrame window=new JFrame("Operators");

		    JButton bin1_b,bin2_b,result_b,res_b,close_b;
		    JTextField bin1_field,bin2_field,result_field;
		    JLabel bin1_lab,bin2_lab,result_lab,name;

		    res_b=new JButton("Reset");
		    close_b=new JButton("Close");
            result_b=new JButton("XOR");

			result_b.setBounds(50,240,100, 40);
		    res_b.setBounds(185,240,100, 40);
		    close_b.setBounds(310,240,100, 40);

			window.add(result_b);window.add(res_b);window.add(close_b);  


			bin1_field=new JTextField();  
			bin1_field.setBounds(180,75, 170,30);  
			bin2_field=new JTextField();  
			bin2_field.setBounds(180,135, 170,30);    
			result_field=new JTextField();  
			result_field.setBounds(180,195, 170,30);  
			window.add(bin1_field);window.add(bin2_field);window.add(result_field); 
			
			bin1_lab=new JLabel("Decimal No 1:");  
		    bin1_lab.setBounds(70,75, 130,30);  
		    bin2_lab=new JLabel("Decimal No 2:");  
		    bin2_lab.setBounds(70,135, 130,30);   
		    result_lab=new JLabel("Result :");  
		    result_lab.setBounds(70,195, 130,30);  
		    name =new JLabel("Binary XOR Operation");
		    name.setBounds(150,30, 150,30); 

		    window.add(bin1_lab);window.add(bin2_lab);window.add(name);window.add(result_lab);

			window.setSize(500,500);
			window.setLayout(null);
			window.setVisible(true);
			JButton XOR_img;
			XOR_img = new JButton(new ImageIcon("./images/XOR.jpg"));
			XOR_img.setBounds(110,290,240,150);
			            
			window.add(XOR_img);

            res_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						bin1_field.setText("");
						bin2_field.setText("");
                        result_field.setText("");
				} 
			});

		    result_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
                   // String dec = dec_field.getText();
				    String bin1 = bin1_field.getText();
				    String bin2 = bin2_field.getText();
				    try{
					   result_field.setText(Integer.toString((Integer.parseInt(bin1) ^ Integer.parseInt(bin2))));
				   }catch(Exception a){
					   result_field.setText("Invalid input");
				   }
            } 

			});

		    close_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						window.setVisible(false);
				} 
			});
		}

		public static void NAND_Calculator(){

		    JFrame window=new JFrame("Operators");

		    JButton bin1_b,bin2_b,result_b,res_b,close_b;
		    JTextField bin1_field,bin2_field,result_field;
		    JLabel bin1_lab,bin2_lab,result_lab,name;

		    res_b=new JButton("Reset");
		    close_b=new JButton("Close");
            result_b=new JButton("NAND ");

			result_b.setBounds(50,240,100, 40);
		    res_b.setBounds(185,240,100, 40);
		    close_b.setBounds(310,240,100, 40);

			window.add(result_b);window.add(res_b);window.add(close_b);  


			bin1_field=new JTextField();  
			bin1_field.setBounds(180,75, 170,30);  
			bin2_field=new JTextField();  
			bin2_field.setBounds(180,135, 170,30);    
			result_field=new JTextField();  
			result_field.setBounds(180,195, 170,30);  

			window.add(bin1_field);window.add(bin2_field);window.add(result_field); 
			
			bin1_lab=new JLabel("Decimal No 1:");  
		    bin1_lab.setBounds(70,65, 130,30);  
		    bin2_lab=new JLabel("Decimal No 2:");  
		    bin2_lab.setBounds(70,135, 130,30);   
		    result_lab=new JLabel("Result :");  
		    result_lab.setBounds(70,195, 130,30);  
		    name =new JLabel("Binary NAND Operation");
		    name.setBounds(150,30, 150,30); 

		    window.add(bin1_lab);window.add(bin2_lab);window.add(name);window.add(result_lab);

			window.setSize(500,500);
			window.setLayout(null);
			window.setVisible(true);
			JButton NAND_img;
			NAND_img = new JButton(new ImageIcon("./images/NAND.jpg"));
			NAND_img.setBounds(110,290,240,150);
			            
			window.add(NAND_img);

            res_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						bin1_field.setText("");
						bin2_field.setText("");
                        result_field.setText("");
				} 
			});

		    result_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
                   // String dec = dec_field.getText();
				    String bin1 = bin1_field.getText();
				    String bin2 = bin2_field.getText();
				    try{
					   result_field.setText(Integer.toString((~(Integer.parseInt(bin1) & Integer.parseInt(bin2)))));
				   }catch(Exception a){
					   result_field.setText("Invalid input");
				   }
            } 

			});

		    close_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						window.setVisible(false);
				} 
			});
		}

		public static void NOR_Calculator(){

		    JFrame window=new JFrame("Operators");


		    JButton bin1_b,bin2_b,result_b,res_b,close_b;
		    JTextField bin1_field,bin2_field,result_field;
		    JLabel bin1_lab,bin2_lab,result_lab,name;
			
			res_b=new JButton("Reset");
		    close_b=new JButton("Close");
            result_b=new JButton("NOR ");

			result_b.setBounds(50,240,100, 40);
		    res_b.setBounds(185,240,100, 40);
		    close_b.setBounds(310,240,100, 40);

			window.add(result_b);window.add(res_b);window.add(close_b);  


			bin1_field=new JTextField();  
			bin1_field.setBounds(180,75, 170,30);  
			bin2_field=new JTextField();  
			bin2_field.setBounds(180,135, 170,30);    
			result_field=new JTextField();  
			result_field.setBounds(180,195, 170,30);  
			window.add(bin1_field);window.add(bin2_field);window.add(result_field); 
			
			bin1_lab=new JLabel("Decimal No 1:");  
		    bin1_lab.setBounds(70,65, 130,30);  
		    bin2_lab=new JLabel("Decimal No 2:");  
		    bin2_lab.setBounds(70,135, 130,30);   
		    result_lab=new JLabel("Result :");  
		    result_lab.setBounds(70,195, 130,30);  
		    name =new JLabel("Binary NOR Operation");
		    name.setBounds(150,30, 150,30); 

		    window.add(bin1_lab);window.add(bin2_lab);window.add(name);window.add(result_lab);

			window.setSize(500,500);
			window.setLayout(null);
			window.setVisible(true);

			JButton NOR_img;
			NOR_img = new JButton(new ImageIcon("./images/NOR.jpg"));
			NOR_img.setBounds(110,290,240,150);
			            
			window.add(NOR_img);
			
            res_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						bin1_field.setText("");
						bin2_field.setText("");
                        result_field.setText("");
				} 
			});

		    result_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
                   // String dec = dec_field.getText();
				    String bin1 = bin1_field.getText();
				    String bin2 = bin2_field.getText();
				    try{
					   result_field.setText(Integer.toString(~(Integer.parseInt(bin1) | Integer.parseInt(bin2))));
				   }catch(Exception a){
					   result_field.setText("Invalid input");
				   }
            } 

			});

		    close_b.addActionListener(new ActionListener(){ 
				public void actionPerformed(ActionEvent e){ 
						window.setVisible(false);
				} 
			});
		}

}


public class Main{

	public static void intro(){

		JFrame window=new JFrame("Bitwise Logic operations");

		JButton AND_gate,OR_gate,NOT_gate,XOR_gate,NOR_gate,NAND_gate;
		AND_gate = new JButton("AND  operator");
		OR_gate = new JButton("OR  operator");
        NOT_gate = new JButton("INVERTING  operator");
        NOR_gate = new JButton("NOR  operator");
        XOR_gate = new JButton("XOR  operator");
        NAND_gate = new JButton("NAND  operator");
		JLabel logic_gates =new JLabel("LOGIC  OPERATIONS");
        logic_gates.setBounds(80,25,480,60);
        logic_gates.setFont( logic_gates.getFont().deriveFont(30f));
        window.add( logic_gates);

	    AND_gate.setBounds(50,140,150, 40);  
	    OR_gate.setBounds(50,220,150, 40);  
        NOT_gate.setBounds(50,300,150, 40);
        NOR_gate.setBounds(260,140,150, 40);
        NAND_gate.setBounds(260,220,150, 40);
        XOR_gate.setBounds(260,300,150, 40);
	    window.add(AND_gate);window.add(OR_gate);window.add(NOR_gate);
        window.add(NOT_gate);window.add(XOR_gate);window.add(NAND_gate);

		window.setSize(500,500);
		window.setLayout(null);
		window.setVisible(true);

	    AND_gate.addActionListener(new ActionListener(){ 
	    		public void actionPerformed(ActionEvent e){ 
						Calculator.AND_Calculator();
	    		} 
		});

		OR_gate.addActionListener(new ActionListener(){ 
	    		public void actionPerformed(ActionEvent e){ 
					Calculator.OR_Calculator();
	    		} 
		});

	    NAND_gate.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){ 
				     Calculator.NAND_Calculator();
            } 
        });

        NOT_gate.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){ 
				    Calculator.NOT_Calculator();
            } 
        });

        NOR_gate.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){ 
				    Calculator.NOR_Calculator();
            } 
        });

        XOR_gate.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent e){ 
				    Calculator.XOR_Calculator();
            } 
        });

	}

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		intro();
		scan.nextLine();
		System.exit(0);
	}
}