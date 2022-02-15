/**
 *calculator GUI with Swing for HW7 
 * @author Jingwen Tan
 * @verison 1.0
 * @since 2021-11-5
 */
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Calculator extends JFrame{
    private JTextField displayResult;
    private JLabel output;
    private String currentOperation;
    private double firstOperand;
    private ArrayList<JButton> digits;
    private JButton btnButtonPlus;
    private JButton btnButtonMinus;
    private JButton btnButtonMultiply;
    private JButton btnButtonDivide;
    private JMenuItem menuPlus;
    private JMenuItem menuMinus;
    private JMenuItem menuDivide;
    private JMenuItem menuMultiply;
    private JMenuItem menuClear;
    
    public Calculator(){
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent event){
                System.exit(0);
            }
    });
       
       JPanel content = new JPanel();
       content.setLayout(new FlowLayout());
       displayResult = new JTextField("0",30);
       output=new JLabel("OUTPUT:");
       
       JMenuBar menuBar = new JMenuBar();
       JMenu menu1 = new JMenu("Function Menu         "
               + "                                         "
               + "                                      "
               + "                                      ");
       menuBar.add(menu1);
       
       menuPlus = new JMenuItem("Add");
       menuMinus = new JMenuItem("Subtract");
       menuDivide = new JMenuItem("Divide");
       menuMultiply = new JMenuItem("Multiply");
       menuClear = new JMenuItem("Clear");
       
       menu1.add(menuPlus);
       menu1.add(menuMinus);
       menu1.add(menuDivide);
       menu1.add(menuMultiply);
       menu1.add(menuClear);
       
       ImageIcon btn0Icon = new ImageIcon("src/0.png");
       Image img = btn0Icon.getImage();
       Image newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btn0Icon = new ImageIcon(newimg);
       
       ImageIcon btn1Icon = new ImageIcon("src/1.png");
       img = btn1Icon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btn1Icon = new ImageIcon(newimg);
       
       ImageIcon btn2Icon = new ImageIcon("src/2.png");
       img = btn2Icon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btn2Icon = new ImageIcon(newimg);
       
       ImageIcon btnPlusIcon = new ImageIcon("src/plus.png");
       img = btnPlusIcon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btnPlusIcon = new ImageIcon(newimg);
       
       ImageIcon btn3Icon = new ImageIcon("src/3.png");
       img = btn3Icon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btn3Icon = new ImageIcon(newimg);
       
       ImageIcon btn4Icon = new ImageIcon("src/4.png");
       img = btn4Icon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btn4Icon = new ImageIcon(newimg);
       
       ImageIcon btn5Icon = new ImageIcon("src/5.png");
       img = btn5Icon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btn5Icon = new ImageIcon(newimg);
       
       ImageIcon btnMinusIcon = new ImageIcon("src/minus.png");
       img = btnMinusIcon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btnMinusIcon = new ImageIcon(newimg);
       
       ImageIcon btn6Icon = new ImageIcon("src/6.png");
       img = btn6Icon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btn6Icon = new ImageIcon(newimg);
       
       ImageIcon btn7Icon = new ImageIcon("src/7.png");
       img = btn7Icon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btn7Icon = new ImageIcon(newimg);
       
       ImageIcon btn8Icon = new ImageIcon("src/8.png");
       img = btn8Icon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btn8Icon = new ImageIcon(newimg);
       
       ImageIcon btnMultiplyIcon = new ImageIcon("src/multiply.png");
       img = btnMultiplyIcon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btnMultiplyIcon = new ImageIcon(newimg);
       
       ImageIcon btnDivideIcon = new ImageIcon("src/divide.png");
       img = btnDivideIcon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btnDivideIcon = new ImageIcon(newimg);
       
       ImageIcon btn9Icon = new ImageIcon("src/9.png");
       img = btn9Icon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btn9Icon = new ImageIcon(newimg);
       
       ImageIcon btnDotIcon = new ImageIcon("src/DOT.png");
       img = btnDotIcon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btnDotIcon = new ImageIcon(newimg);
       
       ImageIcon btnACIcon = new ImageIcon("src/AC.png");
       img = btnACIcon.getImage();
       newimg=img.getScaledInstance(200,80,java.awt.Image.SCALE_SMOOTH);
       btnACIcon = new ImageIcon(newimg);
       
       ImageIcon btnEqualIcon = new ImageIcon("src/equal.png");
       img = btnEqualIcon.getImage();
       newimg=img.getScaledInstance(80,80,java.awt.Image.SCALE_SMOOTH);
       btnEqualIcon = new ImageIcon(newimg);
       
       JButton btnButton0 = new JButton(btn0Icon);
       JButton btnButton1 = new JButton(btn1Icon);
       JButton btnButton2 = new JButton(btn2Icon);
       JButton btnButton3 = new JButton(btn3Icon);
       JButton btnButton4 = new JButton(btn4Icon);
       JButton btnButton5 = new JButton(btn5Icon);
       JButton btnButton6 = new JButton(btn6Icon);
       JButton btnButton7 = new JButton(btn7Icon);
       JButton btnButton8 = new JButton(btn8Icon);
       JButton btnButton9 = new JButton(btn9Icon);
       btnButtonMinus = new JButton(btnMinusIcon);
       btnButtonPlus = new JButton(btnPlusIcon);
       btnButtonMultiply = new JButton(btnMultiplyIcon);
       JButton btnButtonDot = new JButton(btnDotIcon);
       JButton btnButtonAC = new JButton(btnACIcon);
       JButton btnButtonEqual = new JButton(btnEqualIcon);
       btnButtonDivide = new JButton(btnDivideIcon);
       
       digits = new ArrayList<JButton>();
       digits.add(btnButton0);
       digits.add(btnButton1);
       digits.add(btnButton2);
       digits.add(btnButton3);
       digits.add(btnButton4);
       digits.add(btnButton5);
       digits.add(btnButton6);
       digits.add(btnButton7);
       digits.add(btnButton8);
       digits.add(btnButton9);
       
       content.add(menuBar);
       content.add(output);
       content.add(displayResult);
       content.add(btnButton0);
       content.add(btnButton1);
       content.add(btnButton2);
       content.add(btnButtonPlus);
       content.add(btnButton3);
       content.add(btnButton4);
       content.add(btnButton5);
       content.add(btnButtonMinus);
       content.add(btnButton6);
       content.add(btnButton7);
       content.add(btnButton8);
       content.add(btnButtonMultiply);
       content.add(btnButton9);
       content.add(btnButtonDot);
       content.add(btnButtonEqual);
       content.add(btnButtonDivide);
       content.add(btnButtonAC);
       add(content); 
       
       btnButtonAC.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent event){
           resetValues();
         }
        });
       
       btnButtonDot.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent event){
            String currentText = displayResult.getText();
            if(currentText.indexOf(".")<0){
                displayResult.setText(currentText+".");
            }
        }
       });
       
       OperatorListener opListener = new OperatorListener();
       btnButtonMinus.addActionListener(opListener);
       btnButtonPlus.addActionListener(opListener);
       btnButtonDivide.addActionListener(opListener);
       btnButtonMultiply.addActionListener(opListener);
       
       menuListener menuL = new menuListener();
       menuPlus.addActionListener(menuL);
       menuMinus.addActionListener(menuL);
       menuDivide.addActionListener(menuL);
       menuMultiply.addActionListener(menuL);
       menuClear.addActionListener(menuL);
       
       for(int i=0;i<=9;i++){
           digits.get(i).addActionListener(new ActionListener(){
               @Override
               public void actionPerformed(ActionEvent event){
                   String currentText=displayResult.getText();
                   JButton source = (JButton)event.getSource();
                   String newDigit="";
                   if(source == digits.get(0)){
                       newDigit = "0";
                   }else if(source == digits.get(1)){
                       newDigit = "1";
                   }else if(source == digits.get(2)){
                       newDigit = "2";
                   }else if(source == digits.get(3)){
                       newDigit = "3";
                   }else if(source == digits.get(4)){
                       newDigit = "4";
                   }else if(source == digits.get(5)){
                       newDigit ="5";
                   }else if(source == digits.get(6)){
                       newDigit ="6";
                   }else if(source == digits.get(7)){
                       newDigit ="7";
                   }else if(source == digits.get(8)){
                       newDigit ="8";
                   }else if(source == digits.get(9)){
                       newDigit ="9";
                   }
                   
                   currentText = currentText+newDigit;
                   currentText = currentText.replaceFirst("^0+(?!$)", "");
                   displayResult.setText(currentText);
               }
           });
       }
       
       btnButtonEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                Double result = 0.0;
                String currentText = displayResult.getText();
                try{
                    Double secondOperand = new Double(currentText);

                    if(currentOperation == "+"){
                        result = firstOperand + secondOperand;
                    } else if(currentOperation == "-"){
                        result = firstOperand - secondOperand;
                    } else if(currentOperation == "*"){
                        result = firstOperand * secondOperand;
                    } else if(currentOperation == "/"){
                        if(secondOperand != 0.0){
                            result = firstOperand / secondOperand;
                        } else {
                            resetValues();
                            displayResult.setBackground(Color.PINK);
                        }
                    }

                    displayResult.setText(result.toString());
                    firstOperand = result;
                } catch(NumberFormatException e){
                    resetValues();
                }
            }
        });
       
       
       
       
       setTitle("Swing Calculator");
       setSize(500,570);
       setLocation(10,200);
       setVisible(true);
    }
    
    private void resetValues(){
        currentOperation="";
        firstOperand=0.0;
        displayResult.setText("0");
        displayResult.setBackground(Color.WHITE);
    } 
    
    private class OperatorListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            JButton source =(JButton)event.getSource();
            if(source ==btnButtonPlus){
                currentOperation="+";
            }else if(source == btnButtonMinus){
                currentOperation="-";
            }else if(source == btnButtonMultiply){
                currentOperation="*";
            }else if(source == btnButtonDivide){
                currentOperation="/";
            }
            
            String currentText = displayResult.getText();
            try{
                Double currentTextDouble = new Double(currentText);
                firstOperand = currentTextDouble;
                displayResult.setText("0");
            }catch(NumberFormatException e){
                resetValues();
            }
        }
    }
    
    private class menuListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent event){
            JMenuItem source = (JMenuItem)event.getSource();
            if(source == menuPlus){
                currentOperation="+";
            }else if(source == menuMinus){
                currentOperation="-";
            }else if(source == menuMultiply){
                currentOperation="*";
            }else if(source == menuDivide){
                currentOperation="/";
            }else if(source == menuClear){
                resetValues();
            }
            
            String currentText = displayResult.getText();
            try{
                Double currentTextDouble = new Double(currentText);
                firstOperand = currentTextDouble;
                displayResult.setText("0");
            }catch(NumberFormatException e){
                resetValues();
            }
        }
    }
    public static void main(String[]args){
        new Calculator();
    }
}
