package bmi;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//==============================

public class BMI {	
	public static void main(String[] args) {
		
		Frame fr = new Frame("Chi So BMI");
		fr.setSize(400, 200);
		fr.setLocationRelativeTo(null);
		fr.setLayout(null);
		//
		Label lblHeight = new Label("A: ");
		Label lblWeight = new Label("B: ");
		Label lblBMI = new Label("Ket Qua: ");
		
		TextField txtHeight = new TextField();
		TextField txtWeight = new TextField();
		TextField txtBMI = new TextField();
		
		Button btnCong = new Button("Tinh BMI: ");
		
		fr.add(lblHeight); 			fr.add(txtHeight);
		fr.add(lblWeight);			fr.add(txtWeight);
		fr.add(lblBMI); 			fr.add(txtBMI);
		fr.add(btnCong);
		
		

		//them bo lang nghe		
		ActionListener bolangnghe = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Lay A, B
				String strA = txtHeight.getText();
				String strB = txtWeight.getText();
				//Doi sang con so de tinh toan
                int CanNang=Integer.parseInt(strA);
                int ChieuCao=Integer.parseInt(strB);
                
                //Tinh chi so BMI
                double bmi = CanNang / (ChieuCao*ChieuCao);
                //Xuat ket qua
                txtBMI.setText(String.valueOf(bmi));
                
                 if (bmi < 18.5) {
                	 txtBMI.setText("Thieu can - BMI : "+bmi);
                 } else if (bmi < 24.9) {
                	 txtBMI.setText("Can doi - BMI : "+bmi);
                 } else if (bmi < 29.9) {
                	 txtBMI.setText("Thua can - BMI : "+bmi);
                 } else if (bmi < 34.9) {
                	 txtBMI.setText("Beo phi - BMI : "+bmi);
                 } else {
                	 txtBMI.setText("Beo phi nguy hiem - BMI : "+bmi);
                 }
            }
        };
		
        btnCong.addActionListener(bolangnghe);
		fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		fr.setVisible(true);
	}
}