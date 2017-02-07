package org.tamu.edu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import org.apache.commons.io.IOUtils;

public class ConfigFileEditor extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	private static JButton btnSubmit;
	static String input1 = null;
	String input2 = null;
	String input3 =null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigFileEditor frame = new ConfigFileEditor();
					frame.setVisible(true);
					editConfigFile();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConfigFileEditor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(103, 27, 184, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblCriteria = new JLabel("Criteria 1");
		lblCriteria.setBounds(10, 30, 83, 14);
		contentPane.add(lblCriteria);


		btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(146, 185, 89, 23);

		contentPane.add(btnSubmit);
	}

	private static void editConfigFile() throws IOException 
	{

    	btnSubmit.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {
	            	System.out.println("Tracking");
	            	// New code
	            	
	            	
	            	
	            	input1 = textField.getText();
	            	// Read the config file
	            	
	            	StringWriter writer = new StringWriter();
	                try {
						IOUtils.copy(new FileInputStream(new File("C:\\Users\\Yeshwanth\\Desktop\\Outputs\\twitter.conf")), writer, "UTF-8");
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                String theString = writer.toString();
	            	
	                System.out.println("\n\n\n\n\n"+theString);
	            	// Write the config file
	            	
	                boolean result = true;
	                try {
						result = updateConfig();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	                if(result==true)
	                {
	            	 JOptionPane.showMessageDialog(null, "Config File Updated!");
	                }
	                else if(result==false)
	                {
	                	JOptionPane.showMessageDialog(null, "Error Encountered!");
	                }
	            }
		} );
	}
	
	
	private static boolean updateConfig() throws IOException
	{

		
		BufferedReader in = new BufferedReader (new FileReader("/home.hduser/apache-flume-1.4.0-bin/conf/twitter.conf"));
		
		     
		
		    String info = "";
		
		    int startLine = 11;
		
		    int endLine = 11;
		
		    // read prior junk
		
		    for (int i = 0; i < startLine; i++) { info = in.readLine(); }
		
		    for (int i = startLine; i < endLine + 1; i++) {
		
		        info = in.readLine();
				        
		        StringWriter writer = new StringWriter();
		        IOUtils.copy(new FileInputStream(new File("C:\\Users\\Yeshwanth\\Desktop\\Outputs\\twitter.conf")), writer, "UTF-8");
		        String theString = writer.toString();
		        input1= "TwitterAgent.sources.Twitter.keywords = "+input1;
		        theString=theString.replace(info, input1);
		        String filename =  "C:\\Users\\Yeshwanth\\Desktop\\Outputs\\twitter.conf";
		    	
		    	PrintWriter writer2 = new PrintWriter(filename, "UTF-8");
		    	writer2.println(theString);
		    	writer2.close();

		    }
		return true;
	}

}