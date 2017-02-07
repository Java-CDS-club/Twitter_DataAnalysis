package org.tamu.edu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringWriter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.Desktop;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.apache.commons.io.IOUtils;

public class TweetMetric extends JFrame {
	
	private static JPanel contentPane;
	
	private static JRadioButton rdbtnTweetsAccording;
	private static JRadioButton rdbtnTweetsAccording_1;
	
	private static ButtonGroup group;
	private static JButton btnDownloadFile;
	private static JButton btnDownloadFile2;
	private static JButton btnDownloadFile3;
	private static JFileChooser chooser;
	static boolean selection = true ;  
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TweetMetric frame = new TweetMetric();
					createAndShowGUI();
					frame.setVisible(true);
					
					frame.setTitle("Tweet Metrics");
					
					frame.setExtendedState (java.awt.Frame.MAXIMIZED_BOTH);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static void createAndShowGUI() throws IOException 
	{
		
		btnDownloadFile.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {
	            	 String filename=null,filename1 = null, filename2 = null,filename3  = null,filename4  = null,filename5  = null,filename6  = null;
	            		try {
	            		JTextArea TextInput = new JTextArea(20, 60);
	            		
	            		// Radio Button input is captured and output window is populated
	            		
	            		if(selection == true)
	            		{
	            		filename1 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet1/count/000000_0";
	            		filename2 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet1/favourites/000000_0";
	            		filename3 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet1/MaxFollowedUser/000000_0";
	            		filename4 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet1/MaxRetweet/000000_0";
	            		filename5 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet1/source/000000_0"; 
	            		filename6 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet1/Verified/000000_0";
	         	
	            		
	            		StringWriter writer1 = new StringWriter();
	                    IOUtils.copy(new FileInputStream(new File(filename1)), writer1, "UTF-8");
	                    String theString = "\n Number of Tweets :: " +writer1.toString().replace("","");
	                    
	                    StringWriter writer2 = new StringWriter();
	                    IOUtils.copy(new FileInputStream(new File(filename2)), writer2, "UTF-8");
	                    theString = theString+"\n Favourites :: "+writer2.toString().replace("","");
	                    
	                    StringWriter writer3 = new StringWriter();
	                    IOUtils.copy(new FileInputStream(new File(filename3)), writer3, "UTF-8");
	                    theString = theString+"\n Max Followed User :: " + writer3.toString().replace("","");
	                    
	                    StringWriter writer4 = new StringWriter();
	                    IOUtils.copy(new FileInputStream(new File(filename4)), writer4, "UTF-8");
	                    theString = theString+"\n Max Retweet :: "+ writer4.toString().replace("","");;
	                    
	                    StringWriter writer5 = new StringWriter();
	                    IOUtils.copy(new FileInputStream(new File(filename5)), writer5, "UTF-8");
	                    theString = theString+"\n Source :: "+writer5.toString().replace("","");
	      	                    
	                    StringWriter writer6 = new StringWriter();
	                    IOUtils.copy(new FileInputStream(new File(filename6)), writer6, "UTF-8");
	                    theString = theString+"\n Verified :: " + writer6.toString().replace("","");
	                	                    
	                    TextInput.append(theString);
	            		}
	            		
	            		// If radio button for TimeZone metric is chosen
	            		
	            		if(selection == false)
	            		{
	            		filename = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet2/timezone/000000_0";
	            		            		
	            		StringWriter writer8 = new StringWriter();
	                    IOUtils.copy(new FileInputStream(new File(filename)), writer8, "UTF-8");
	                    String Complete = "Timezone :: "+writer8.toString().replace("","");
	                    
	                    TextInput.append(Complete);
	            		
	            		}
	            		
	            		TextInput.setEditable(false);
	            		JOptionPane.showMessageDialog(btnDownloadFile, new JScrollPane(TextInput));
	            		}
	            		catch (IOException ioe) {
	            		ioe.printStackTrace();
	            		}
	            }
	            }
		
				);    
			
		// Similar actions being carried on for second keyword list
		btnDownloadFile2.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
            	
            	 String filename=null,filename1 = null, filename2 = null,filename3  = null,filename4  = null,filename5  = null,filename6  = null;
            		try {
            		JTextArea TextInput = new JTextArea(20, 60);
            		System.out.println(selection);
            		    		       		
            		if(selection == true)
            		{
            		filename1 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet2/count/000000_0";
            		filename2 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet2/favourites/000000_0";
            		filename3 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet2/MaxFollowedUser/000000_0";
            		filename4 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet2/MaxRetweet/000000_0";
            		filename5 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet2/source/000000_0"; 
            		filename6 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet2/Verified/000000_0";
            		 		
            		StringWriter writer1 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename1)), writer1, "UTF-8");
                    String theString = "\n Number of Tweets :: "+writer1.toString().replace("","");
       
                    
                    StringWriter writer2 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename2)), writer2, "UTF-8");
                    theString = theString+"\n Favourites :: "+writer2.toString().replace("","");
                          
                    StringWriter writer3 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename3)), writer3, "UTF-8");
                    theString = theString+"\n Max Followed User :: " + writer3.toString().replace("","");
                    
                    StringWriter writer4 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename4)), writer4, "UTF-8");
                    theString = theString+"\n Max Retweet :: "+writer4.toString().replace("","");;
                    
                    
                    StringWriter writer5 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename5)), writer5, "UTF-8");
                    theString = theString+"\n Source :: "+writer5.toString().replace("","");
                    
                    StringWriter writer6 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename6)), writer6, "UTF-8");
                    theString = theString+"\n Verified :: "+writer6.toString().replace("","");
                  
                    
                    TextInput.append(theString);
            		}
            		
            		if(selection == false)
            		{
            		filename = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet2/timezone/000000_0";
            		
            		StringWriter writer8 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename)), writer8, "UTF-8");
                    String Complete = "Timezone :: "+writer8.toString().replace("","");
                    TextInput.append(Complete);
            		
            		}
               		TextInput.setEditable(false);
            		JOptionPane.showMessageDialog(btnDownloadFile2, new JScrollPane(TextInput));
            		}
            		catch (IOException ioe) {
            		ioe.printStackTrace();
            		}
            		 
            }
            }
	
			); 
		
		// Similar actions being carried on for third keyword list
		btnDownloadFile3.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
            	
            	 String filename=null,filename1 = null, filename2 = null,filename3  = null,filename4  = null,filename5  = null,filename6  = null;
            		try {
            		JTextArea TextInput = new JTextArea(20, 60);
            		System.out.println(selection);
            		
            		       		
            		if(selection == true)
            		{
            		filename1 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet3/count/000000_0";
            		filename2 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet3/favourites/000000_0";
            		filename3 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet3/MaxFollowedUser/000000_0";
            		filename4 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet3/MaxRetweet/000000_0";
            		filename5 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet3/source/000000_0"; 
            		filename6 = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet3/Verified//000000_0";
            			
            		StringWriter writer1 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename1)), writer1, "UTF-8");
                    String theString = "\n Number of Tweets :: "+writer1.toString().replace("","");
                    
                    
                    StringWriter writer2 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename2)), writer2, "UTF-8");
                    theString = theString+"\n Favourites :: "+writer2.toString().replace("","");
                    
                    StringWriter writer3 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename3)), writer3, "UTF-8");
                    theString = theString+"\n Max Followed User :: "+writer3.toString().replace("","");
                    
                    StringWriter writer4 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename4)), writer4, "UTF-8");
                    theString = theString+"\n Max Retweet :: "+writer4.toString().replace("","");
                    
                    
                    
                    StringWriter writer5 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename5)), writer5, "UTF-8");
                    theString = theString+"\n Source :: "+writer5.toString().replace("","");
                    
                    
                    StringWriter writer6 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename6)), writer6, "UTF-8");
                    theString = theString+"\n Verified :: "+writer6.toString().replace("","");
                  
                    TextInput.append(theString);
            		}
            		
            		if(selection == false)
            		{
            		filename = "/home/hduser/eclipse/jee-mars/eclipse/Outputs/Tweet3/timezone/000000_0";
            		
            		
            		StringWriter writer8 = new StringWriter();
                    IOUtils.copy(new FileInputStream(new File(filename)), writer8, "UTF-8");
                    String Complete = "Timezone :: "+writer8.toString().replace("","");
                    
                    
                    TextInput.append(Complete);
            		
            		}
            		
            		TextInput.setEditable(false);
            		JOptionPane.showMessageDialog(btnDownloadFile3, new JScrollPane(TextInput));
            		}
            		catch (IOException ioe) {
            		ioe.printStackTrace();
            		}
            		 
            }
            }
	
			); 
	}

	/**
	 * Create the frame.
	 */
	public TweetMetric() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 136, 124);
		contentPane = new JPanel();
				
		
		contentPane.setBorder(new EmptyBorder(500, 500, 300,23 ));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		rdbtnTweetsAccording = new JRadioButton("General Tweet Metrics");
		rdbtnTweetsAccording.setBounds(18, 30, 250, 23);
		contentPane.add(rdbtnTweetsAccording);
		rdbtnTweetsAccording.setActionCommand("General Tweet Metrics");
	
		rdbtnTweetsAccording.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
            	
            		if(rdbtnTweetsAccording.isSelected() == true)
            		{
  //          			System.out.println("TRUE 1");
            		}
            		
            	selection = true;
            }
            }
	
			); 
		
		
		rdbtnTweetsAccording_1 = new JRadioButton("Timezone concentration");
		rdbtnTweetsAccording_1.setBounds(18, 50, 250, 23);
		contentPane.add(rdbtnTweetsAccording_1);
		rdbtnTweetsAccording_1.setActionCommand("Timezone concentration");
		
		rdbtnTweetsAccording_1.addActionListener(new ActionListener() {
			 
            public void actionPerformed(ActionEvent e)
            {
            	
            		if(rdbtnTweetsAccording_1.isSelected() == true)
            		{
//            			System.out.println("TRUE 2");
            			selection = false;
            		}
            		        	
            }
            }
	
			); 
	
		group = new ButtonGroup();
        group.add(rdbtnTweetsAccording);
        group.add(rdbtnTweetsAccording_1);
        
        rdbtnTweetsAccording.setSelected(true);
           
        getContentPane().add(rdbtnTweetsAccording);
        getContentPane().add(rdbtnTweetsAccording_1);
       
        pack();
        
        // Creating buttons and content panes
        
        btnDownloadFile = new JButton("Christmas");
		btnDownloadFile.setBounds(250, 250, 125, 40);
		btnDownloadFile2 = new JButton("GivingTuesday");
		btnDownloadFile2.setBounds(450, 250, 175, 40);
		
        btnDownloadFile3 = new JButton("BlackFriday");
		btnDownloadFile3.setBounds(700, 250, 125, 40);
		
		contentPane.add(btnDownloadFile);
		contentPane.add(btnDownloadFile2);
		contentPane.add(btnDownloadFile3);
		
	}
}

