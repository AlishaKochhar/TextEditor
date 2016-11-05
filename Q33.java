import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Q33 extends JFrame implements ActionListener
{
private JTextArea ta;
private JMenuBar menuBar;
private JMenu fileM,editM,FontStyle,FontSize,FontColor;
private JScrollPane scpane;
private JMenuItem exitI,cutI,copyI,pasteI,selectI,Aharoni,TimesNewRoman,Tahoma,Cambria,Ten,Fifteen,Twenty,Thirty,Green,Blue,Red,Black,Yellow;
private String texthere;
public Q33()
{
    super("MS Word : //ALISHA");
    setSize(500, 500);
    Container pane = getContentPane();
    pane.setLayout(new BorderLayout());

    texthere = " ";
    Aharoni=new JMenuItem("Aharoni");
    TimesNewRoman=new JMenuItem("TimesNewRoman");
    Cambria=new JMenuItem("Cambria");
    Tahoma=new JMenuItem("Tahoma");
    Ten=new JMenuItem("10");
    Fifteen=new JMenuItem("15");
    Twenty=new JMenuItem("20");
    Thirty=new JMenuItem("30");
    Green=new JMenuItem("Green");
    Blue=new JMenuItem("Blue");
    Red=new JMenuItem("Red");
    Yellow=new JMenuItem("Yellow");
    Black=new JMenuItem("Black");
    ta = new JTextArea();
    menuBar = new JMenuBar(); 
    FontColor=new JMenu("Color");
    FontSize=new JMenu("Size");
    fileM = new JMenu("File"); 
    editM = new JMenu("Edit"); 
    FontStyle = new JMenu("Font"); 
    scpane = new JScrollPane(ta); 
    exitI = new JMenuItem("Exit");
    cutI = new JMenuItem("Cut");
    copyI = new JMenuItem("Copy");
    pasteI = new JMenuItem("Paste");
    selectI = new JMenuItem("Select All"); 
    
    setJMenuBar(menuBar);
    menuBar.add(fileM);
    menuBar.add(editM);
    menuBar.add(FontStyle);
    menuBar.add(FontSize);
    menuBar.add(FontColor);

    FontStyle.add(TimesNewRoman);
    FontStyle.add(Aharoni);
    FontStyle.add(Tahoma);
    FontStyle.add(Cambria);
    fileM.add(exitI);

    editM.add(cutI);
    editM.add(copyI);
    editM.add(pasteI);        
    editM.add(selectI);
    
    FontSize.add(Ten);
    FontSize.add(Fifteen);
    FontSize.add(Twenty);
    FontSize.add(Thirty);

    FontColor.add(Red);
    FontColor.add(Black);
    FontColor.add(Green);
    FontColor.add(Blue);
    FontColor.add(Yellow);
    
    pane.add(scpane,BorderLayout.CENTER);
    
    exitI.addActionListener(this);
    cutI.addActionListener(this);
    copyI.addActionListener(this);
    pasteI.addActionListener(this);
    selectI.addActionListener(this);
    TimesNewRoman.addActionListener(this);
    Aharoni.addActionListener(this);
    Tahoma.addActionListener(this);
    Cambria.addActionListener(this);
    Ten.addActionListener(this);
    Fifteen.addActionListener(this);
    Twenty.addActionListener(this);
    Thirty.addActionListener(this);
    Green.addActionListener(this);
    Red.addActionListener(this);
    Black.addActionListener(this);
    Blue.addActionListener(this);
    Yellow.addActionListener(this);
    setVisible(true);
}
public void actionPerformed(ActionEvent e) 
{
    int size=ta.getFont().getSize();
    String name=ta.getFont().getName();
    JMenuItem choice = (JMenuItem) e.getSource();
    if (choice == Aharoni)
    {
        ta.setFont(new java.awt.Font("Aharoni",0,size));
}
    else if(choice== TimesNewRoman)
    {
        ta.setFont(new java.awt.Font("TimesNewRoman",0,size));
    }
    
    else if(choice== Cambria)
    {
        ta.setFont(new java.awt.Font("Cambria",0,size));
    }
    else if(choice== Tahoma)
    {
        ta.setFont(new java.awt.Font("Tahoma",0,size));
    }
    else if(choice== Ten)
    {
        ta.setFont(new java.awt.Font(name,0,10));
    }
    else if(choice== Fifteen)
    {
        ta.setFont(new java.awt.Font(name,0,15));
    }
    else if(choice== Twenty)
    {
        ta.setFont(new java.awt.Font(name,0,20));
    }
    else if(choice== Thirty)
    {
        ta.setFont(new java.awt.Font(name,0,30));
    }
    else if(choice == Red)
    {
        ta.setForeground(Color.red);
    }
    else if(choice == Green)
    {
        ta.setForeground(Color.green);
    }
    else if(choice == Blue)
    {
        ta.setForeground(Color.blue);
    }
    else if(choice == Yellow)
    {
        ta.setForeground(Color.yellow);
    }
    else if(choice == Black)
    {
        ta.setForeground(Color.black);
    }
    else if (choice == exitI)
        System.exit(0);
    else if (choice == cutI)
    {
        texthere = ta.getSelectedText();
        ta.replaceRange("", ta.getSelectionStart(), ta.getSelectionEnd());
    }
    else if (choice == copyI)
            texthere = ta.getSelectedText();
    else if (choice == pasteI)
        ta.insert(texthere, ta.getCaretPosition());
    else if (choice == selectI)
        ta.selectAll();
    
}
public static void main(String[] args) 
{
    new Q33();
}}