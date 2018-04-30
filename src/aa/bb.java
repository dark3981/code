package aa;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class bb extends JFrame implements ActionListener {
	
	JPanel jp;
	JLabel jl;
	JButton jb;
	JButton jbe;
	JTextField jte;
	JComboBox<String> jcb;
	JCheckBox jc;
	String[] it = {"A", "B", "C"};
	JLabel jlb;
	
	public bb() {
		// TODO Auto-generated constructor stub
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jp = (JPanel)getContentPane();
		jp.setLayout(new FlowLayout());
		jl = new JLabel("Label");
		jb = new JButton("Button");
		jte = new JTextField(20);
		jcb = new JComboBox<String>(it);
		jc = new JCheckBox("CheckBox");
		jlb = new JLabel();
		jbe = new JButton("exit");
		
		jp.add(jl);
		jp.add(jb);
		jp.add(jte);
		jp.add(jcb);
		jp.add(jc);
		jp.add(jlb);
		jp.add(jbe);
		
		jl.setPreferredSize(new Dimension(50, 50));
		jb.setPreferredSize(new Dimension(100, 50));
		jte.setPreferredSize(new Dimension(300, 50));
		jcb.setPreferredSize(new Dimension(50, 50));
		jc.setPreferredSize(new Dimension(100, 50));
		jlb.setPreferredSize(new Dimension(200, 50));
		jbe.setPreferredSize(new Dimension(100, 50));
		
		jb.addActionListener(this);
		jbe.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == jb) {
			jlb.setText(jte.getText());
		} else if(e.getSource() == jbe) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
	}
}

