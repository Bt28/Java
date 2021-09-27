import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CuaSoTong extends Frame {
	
		//Ham tao
	public CuaSoTong( ) {
		FlowLayout fL = new FlowLayout();
		setLayout(fL);		//qui dinh layout
		setBounds(0, 0, 400, 200); //kich thuoc
		setTitle("Chuong trinh tinh tong 2 so"); //tieu de cua so
		//dua cac dieu khien vao frame
		lblA = new Label("A=");
		lblB = new Label("B=");
		lblKQ = new Label("KQ=");
		txtA = new TextField();
		txtB = new TextField();
		txtKQ = new TextField();
		btnCong = new Button("TinhTong");
		add(lblA);		add(txtA);
		add(lblB);		add(txtB);
		add(btnCong);		
		add(lblKQ);		add(txtKQ);
		//them bo lang nghe va xu li su kien cho nut tinh tong
		btnCong.addActionListener(new BoLangNghe_XL_Cong());
		//them bo lang nghe xu li su kien cho cua so Frame
		addWindowListner(new BoLangNghe_XL_cuaso());
	}
}
//
	//Viet lop lang nghe va xu li cong o ngoai ham tao (cho gon ma)
	//Viet lop lang nghe va xu li cong o ngoai ham tao (cho gon ma)
	class BoLangNghe_XL_Cong implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//code xu li o day
			//1, Lay A, B
			String strA = txtA.getText();
			String StrB = txtB.getText();
			//doi sang con so de tinh toan
			int a = Integer.parseInt(strA);
			int b = Integer.parseInt(StrB);
			//tinh tong
			int c = a+b;
			
			//xuat ket qua 
			txtKQ.setText(String.valueOf(c) );
		}
	};
	class BoLangNghe_XL_cuaso	implements WindowListener	{
		public void windowOpened(WindowEvent e) {
				}
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		public void windowIconified(WindowEvent e) {
		}
		public void windowDeiconified(WindowEvent e) {
	}
		public void windowActivated(WindowEvent e) {
}
		public void windowDeactivated(WindowEvent e) {
			}
		//thuoc tinh
		TextField txtA, txtB, txtKQ;
		Label lblA, lblB, lblKQ;
		Button btnCong;
	}

