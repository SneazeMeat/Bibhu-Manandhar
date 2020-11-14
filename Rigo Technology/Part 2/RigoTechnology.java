import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;


public class RigoTechnology implements ActionListener {
    private JFrame f;
    private JPanel p1;
    
    //Attributes inside Panel 1
    private JLabel JPlatform,JWorkinghour,JInterviewer,JSalary,JAppointedby,JTerminationDate,JContractPeriod;
    private JTextField tfPlatform,tfWorkinghour,tfInterviewer,tfSalary,tfAppointedby,tfTerminationDate,tfContractPeriod;
    private JButton btnJunior,btnSenior;
    
    //Attributes inside Panel 2
    private JLabel JNameSenior,JjoiningDate,JSeniorDeveloperNo,JRoomNo,JAdvanceSalary;
    private JTextField tfNameSenior,tfjoiningDate,tfSeniorDeveloperNo,tfRoomNo,tfAdvanceSalary;
    private JButton btnAppointSnrDev,btnTerminateSnrDev;
    
    //Attributes inside Panel 3
    private JLabel JNameJunior,JSpecialization,JSeniorDevNo,JAppointDate,JTermiDate;
    private JTextField tfNameJunior,tfSpecialization,tfSeniorDevNo,tfAppointDate,tfTermiDate;
    private JButton btnAppointJuniorDev;
    
    private JButton btnDispalyAll,btnClear;
    
    //Array list
    private ArrayList<Developer> list = new ArrayList<Developer>();
   
    
        public void myGui() {
       JFrame f = new JFrame("Rigo Technology");
    
       //For Panel 1
       JPanel p1 = new JPanel();
       p1.setBorder(BorderFactory.createTitledBorder("Add platform for senior/junior developer"));
       p1.setLayout(null); 
       p1.setBounds(20,20,580,220);
       p1.setBackground(Color.LIGHT_GRAY);
    
       //Platform
       JPlatform = new JLabel("Platform(J/S):");
       JPlatform.setBounds(20,20,105,30);
       p1.add(JPlatform);
       tfPlatform = new JTextField();
       tfPlatform.setBounds(100,20,250,30);
       p1.add(tfPlatform);
       
       //Working Hour
       JWorkinghour = new JLabel("Working Hour(J/S):");
       JWorkinghour.setBounds(350,20,120,30);
       p1.add(JWorkinghour);
       tfWorkinghour = new JTextField();
       tfWorkinghour.setBounds(460,20,105,30);
       p1.add(tfWorkinghour);
       
       //Interviewer
       JInterviewer = new JLabel("Interviewer(J/S):");
       JInterviewer.setBounds(20,60,130,30);
       p1.add(JInterviewer);
       tfInterviewer = new JTextField();
       tfInterviewer.setBounds(115,60,450,30);
       p1.add(tfInterviewer);
       
       //Salary
       JSalary = new JLabel("Salary(J/S):");
       JSalary.setBounds(20,100,90,30);
       p1.add(JSalary);
       tfSalary = new JTextField();
       tfSalary.setBounds(90,100,120,30);
       p1.add(tfSalary);
       
       //Appointed By
       JAppointedby = new JLabel("Appointed By(J):");
       JAppointedby.setBounds(220,100,110,30);
       p1.add(JAppointedby);
       tfAppointedby = new JTextField();
       tfAppointedby.setBounds(315,100,250,30);
       p1.add(tfAppointedby);
       
       //Termination Date
       JTerminationDate = new JLabel("Termination Date(J):");
       JTerminationDate.setBounds(20,140,120,30);
       p1.add(JTerminationDate);
       tfTerminationDate = new JTextField();
       tfTerminationDate.setBounds(135,140,130,30);
       p1.add(tfTerminationDate);
       
       //Contract Period for Senior
       JContractPeriod = new JLabel("Contract Period for Senior(S):");
       JContractPeriod.setBounds(270,140,180,30);
       p1.add(JContractPeriod);
       tfContractPeriod = new JTextField();
       tfContractPeriod.setBounds(440,140,125,30);
       p1.add(tfContractPeriod);
    
       //Button for Add for Junior
       btnJunior = new JButton("Add for Junior");
       btnJunior.setBackground(Color.green);
       btnJunior.setBounds(290,175,120,40);
       p1.add(btnJunior);
       //Button for Add for Senior
       btnSenior = new JButton("Add for Senior");
       btnSenior.setBackground(Color.green);
       btnSenior.setBounds(430,175,120,40);
       p1.add(btnSenior);
       
       
       //For Panel 2
       JPanel p2 = new JPanel();
       p2.setBorder(BorderFactory.createTitledBorder("Appoint/Terminate senior developer"));
       p2.setLayout(null); 
       p2.setBounds(20,250,580,160);
       p2.setBackground(Color.LIGHT_GRAY);
    
       //Name
       JNameSenior = new JLabel("Name:");
       JNameSenior.setBounds(20,20,60,30);
       p2.add(JNameSenior);
       tfNameSenior = new JTextField();
       tfNameSenior.setBounds(90,20,240,30);
       p2.add(tfNameSenior);
       
       //Joining Date
       JjoiningDate = new JLabel("Joining Date:");
       JjoiningDate.setBounds(350,20,90,30);
       p2.add(JjoiningDate);
       tfjoiningDate = new JTextField();
       tfjoiningDate.setBounds(440,20,120,30);
       p2.add(tfjoiningDate);
       
       //Developer Number
       JSeniorDeveloperNo = new JLabel("Dev No:");
       JSeniorDeveloperNo.setBounds(20,60,90,30);
       p2.add(JSeniorDeveloperNo);
       tfSeniorDeveloperNo = new JTextField();
       tfSeniorDeveloperNo.setBounds(90,60,90,30);
       p2.add(tfSeniorDeveloperNo);
       
       //Staff Room Number
       JRoomNo = new JLabel("Room No:");
       JRoomNo.setBounds(200,60,60,30);
       p2.add(JRoomNo);
       tfRoomNo = new JTextField();
       tfRoomNo.setBounds(280,60,90,30);
       p2.add(tfRoomNo);
       
       //Advance Salary
       JAdvanceSalary = new JLabel("Adv Salary:");
       JAdvanceSalary.setBounds(390,60,70,30);
       p2.add(JAdvanceSalary);
       tfAdvanceSalary = new JTextField();
       tfAdvanceSalary.setBounds(460,60,100,30);
       p2.add(tfAdvanceSalary);
       
       //Button for Appointing Senior Developer
       btnAppointSnrDev = new JButton("Appoint");
       btnAppointSnrDev.setBackground(Color.green);
       btnAppointSnrDev.setBounds(290,110,130,40);
       p2.add(btnAppointSnrDev);
       //Button for Terminating Senior Developer
       btnTerminateSnrDev = new JButton("Terminate");
       btnTerminateSnrDev.setBackground(Color.green);
       btnTerminateSnrDev.setBounds(430,110,130,40);
       p2.add(btnTerminateSnrDev);
       
       
       //for panel 3
       JPanel p3 = new JPanel();
       p3.setBorder(BorderFactory.createTitledBorder("Appoint junior developer"));
       p3.setLayout(null); 
       p3.setBounds(20,450,580,160);
       p3.setBackground(Color.LIGHT_GRAY);
        
       //Name for Junior
       JNameJunior = new JLabel("Name:");
       JNameJunior.setBounds(20,20,60,30);
       p3.add(JNameJunior);
       tfNameJunior = new JTextField();
       tfNameJunior.setBounds(90,20,240,30);
       p3.add(tfNameJunior);
       
       //Specialization
       JSpecialization = new JLabel("Specialization:");
       JSpecialization.setBounds(350,20,90,30);
       p3.add(JSpecialization);
       tfSpecialization = new JTextField();
       tfSpecialization.setBounds(440,20,120,30);
       p3.add(tfSpecialization);
       
       //Developer Number for Junior
       JSeniorDevNo = new JLabel("Dev No:");
       JSeniorDevNo.setBounds(20,60,90,30);
       p3.add(JSeniorDevNo);
       tfSeniorDevNo = new JTextField();
       tfSeniorDevNo.setBounds(90,60,90,30);
       p3.add(tfSeniorDevNo);
       
       //Appoint Date
       JAppointDate = new JLabel("Appoint Date:");
       JAppointDate.setBounds(200,60,90,30);
       p3.add(JAppointDate);
       tfAppointDate = new JTextField();
       tfAppointDate.setBounds(280,60,90,30);
       p3.add(tfAppointDate);
       
       //Termination Date
       JTermiDate = new JLabel("Termi Date:");
       JTermiDate.setBounds(390,60,70,30);
       p3.add(JTermiDate);
       tfTermiDate = new JTextField();
       tfTermiDate.setBounds(460,60,100,30);
       p3.add(tfTermiDate);
    
       //Button for Appoint Junior Developer
       btnAppointJuniorDev = new JButton("Appoint Junior Dev");
       btnAppointJuniorDev.setBackground(Color.green);
       btnAppointJuniorDev.setBounds(430,110,140,40);
       p3.add(btnAppointJuniorDev);
       
    
       //Button for Display All
       btnDispalyAll = new JButton("Display All");
       btnDispalyAll.setBackground(Color.orange);
       btnDispalyAll.setBounds(300,630,120,40);
       f.add(btnDispalyAll);
       //Button for Clear
       btnClear = new JButton("Clear");
       btnClear.setBackground(Color.orange);
       btnClear.setBounds(450,630,145,40);
       f.add(btnClear);
       
       f.add(p1);
       f.add(p2);
       f.add(p3);
       
       f.setLayout(null);
       f.setVisible(true);
       f.setSize(650,800);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       //Adding to action listener
       btnJunior.addActionListener(this);
       btnSenior.addActionListener(this);
       btnAppointSnrDev.addActionListener(this);
       btnTerminateSnrDev.addActionListener(this);
       btnAppointJuniorDev.addActionListener(this);
       btnDispalyAll.addActionListener(this);
       btnClear.addActionListener(this);
    
 }
 public void actionPerformed(ActionEvent e){
     if(e.getSource() == btnJunior){
        
       try{
             String Platform = tfPlatform.getText();
             String InterviewerName = tfInterviewer.getText();
             int WorkingHour = Integer.parseInt(tfWorkinghour.getText());
             double Salary = Integer.parseInt(tfSalary.getText());
             String AppointedBy = tfAppointedby.getText();
             String TerminationDate = tfTerminationDate.getText();
             if(Platform.isEmpty()){
                 JOptionPane.showMessageDialog(f,"Text field empty");
                }
             else if(WorkingHour>=24 || WorkingHour<=0){
                 JOptionPane.showMessageDialog(f,"Invalid hours");
                }
             else if(InterviewerName.isEmpty()){
                 JOptionPane.showMessageDialog(f,"Text field empty");
                }
             else if(Salary<=0){
                 JOptionPane.showMessageDialog(f,"Salary cannot be zero");
                }
             else if(AppointedBy.isEmpty()){
                 JOptionPane.showMessageDialog(f,"Text field empty");
                }
             else if(TerminationDate.isEmpty()){
                 JOptionPane.showMessageDialog(f,"Text field empty");
                }
             else{
                 list.add(new JuniorDeveloper(Platform, InterviewerName,WorkingHour,Salary,AppointedBy,TerminationDate));
                 JOptionPane.showMessageDialog(f,"Platform for Junior Developer has been added");
                }
            }
        catch(NumberFormatException ae){
             JOptionPane.showMessageDialog(f,"The format is incorrect","Inane error",JOptionPane.ERROR_MESSAGE);
            }
        catch(Exception ae){
             System.out.println("Error");
            }
         }
         
         
     else if(e.getSource() == btnSenior) {
       try{
             String Platform = tfPlatform.getText();
             String InterviewerName = tfInterviewer.getText();
             int WorkingHour = Integer.parseInt(tfWorkinghour.getText());
             double Salary = Integer.parseInt(tfSalary.getText());
             int ContractPeriod = Integer.parseInt(tfContractPeriod.getText());
             if(Platform.isEmpty()){
                 JOptionPane.showMessageDialog(f,"Text field empty");
                }
             else if(WorkingHour>=24 || WorkingHour<=0){
                 JOptionPane.showMessageDialog(f,"Invalid hours");
                }
             else if(InterviewerName.isEmpty()){
                 JOptionPane.showMessageDialog(f,"Text field empty");
                }
             else if(Salary<=0){
                 JOptionPane.showMessageDialog(f,"Salary cannot be zero");
                }
             else if(ContractPeriod<=0){
                 JOptionPane.showMessageDialog(f,"Contract Period cannot be less than a month");
                }
             else{
                 list.add(new SeniorDeveloper(Platform, InterviewerName, WorkingHour,Salary, ContractPeriod));
                 JOptionPane.showMessageDialog(f,"Platform for Senior Developer has been added");
                }
            }
       catch(NumberFormatException ae){
             JOptionPane.showMessageDialog(f,"The format is incorrect","Inane error",JOptionPane.ERROR_MESSAGE);
            }
       catch(Exception ae){
             System.out.println("Error");
            
              }
     } 
     else if(e.getSource()==btnAppointSnrDev)
     {
            
       try{
               int DeveloperNo = Integer.parseInt(tfSeniorDeveloperNo.getText());
             if(DeveloperNo > list.size()){
                  JOptionPane.showMessageDialog(f,"There is no Senioror Developer number."); 
             }else{
                  Developer d = list.get(DeveloperNo);
                  if (d instanceof SeniorDeveloper){
                      String SName = tfNameSenior.getText();
                      String JDate = tfjoiningDate.getText();
                      double AdSalary = Integer.parseInt(tfAdvanceSalary.getText());
                      String SRN = tfRoomNo.getText(); 
                      if(SName.isEmpty()){
                            JOptionPane.showMessageDialog(f,"Text field empty");
                      }
                      else if(JDate.isEmpty()){
                            JOptionPane.showMessageDialog(f,"Text field empty");
                      }
                      else if(AdSalary<=0){
                            JOptionPane.showMessageDialog(f,"Advance salary cannot be less than zero");
                      }
                      else if(SRN.isEmpty()){
                            JOptionPane.showMessageDialog(f,"Text field empty");
                      }
                    
                      SeniorDeveloper obj1 = (SeniorDeveloper)d;
                      obj1.hireDeveloper(SName,JDate,AdSalary,SRN);
                    
                      JOptionPane.showMessageDialog(f,"Appointed Senior Developer");
                    }
                    
                }
               
       }catch(IndexOutOfBoundsException g){
            JOptionPane.showMessageDialog(f,"Appoinment not available");                
       }catch(NumberFormatException g){
            JOptionPane.showMessageDialog(f,"Invalid Value");
       }catch(Exception g){
            JOptionPane.showMessageDialog(f,"Error");
       }
        }
        
     else if(e.getSource()==btnAppointJuniorDev)
     {
            
       try{
           int JDevNo = Integer.parseInt(tfSeniorDevNo.getText());
           if(JDevNo > list.size()){
                JOptionPane.showMessageDialog(f,"There is no Junior Developer number.");
                
             }else{
                 Developer d = list.get(JDevNo);
                 if (d instanceof JuniorDeveloper){
                 String JName = tfNameJunior.getText();
                 String ADate = tfAppointDate.getText();
                 String TDate = tfTermiDate.getText();
                 String Specia = tfSpecialization.getText(); 
                    
                 if(JName.isEmpty()){
                       JOptionPane.showMessageDialog(f,"Text field empty");
                 }
                 else if(ADate.isEmpty()){
                       JOptionPane.showMessageDialog(f,"Text field empty");
                 }
                 else if(TDate.isEmpty()){
                       JOptionPane.showMessageDialog(f,"Text field empty");
                 }
                 else if(Specia.isEmpty()){
                       JOptionPane.showMessageDialog(f,"Text field empty");
                 }
                    
                 ((JuniorDeveloper)d).appointDeveloper(JName,ADate,TDate,Specia);
                    
                 JOptionPane.showMessageDialog(f,"appointed Junior Developer");
                 }
                    
              }
               
       }catch(IndexOutOfBoundsException g){
            JOptionPane.showMessageDialog(f,"There is no developer available");                
       }catch(NumberFormatException g){
            JOptionPane.showMessageDialog(f,"Invalid Value");
       }catch(Exception g){
            JOptionPane.showMessageDialog(f,"Error");
       }
     }
     else if(e.getSource() == btnTerminateSnrDev)
     {
       try{
         int SDevNo = Integer.parseInt(tfSeniorDeveloperNo.getText());
         if(SDevNo < list.size()){
               Developer d = list.get(SDevNo);
                if (d instanceof SeniorDeveloper){
                    ((SeniorDeveloper)d).contactTermination();
                    
                    JOptionPane.showMessageDialog(f,"Terminated");
                }
             
            }else{
              JOptionPane.showMessageDialog(f,"Index invalid.");
            } 
        }catch(IndexOutOfBoundsException g){
            JOptionPane.showMessageDialog(f,"There is no developer available");
        }catch(NumberFormatException g){
            JOptionPane.showMessageDialog(f,"Invalid value");
        }catch(Exception g){
            JOptionPane.showMessageDialog(f,"Error");
        }
    }
     else if(e.getSource() == btnDispalyAll)
       {
          for (Developer d:list)
          {
               if(d instanceof SeniorDeveloper)
               {
                  SeniorDeveloper obj2=(SeniorDeveloper) d;
                  obj2.display();
                  System.out.println("________________________________________________________");
               }
               else if(d instanceof JuniorDeveloper)
               {
                  JuniorDeveloper obj3=(JuniorDeveloper) d;
                  obj3.display();  
                  System.out.println("________________________________________________________");
               }
          }
        }
     else if(e.getSource()==btnClear)
     {
        clearAllPanel();
     } 
      
 }
 public void clearAllPanel(){
        /*method to clear all textfields in certification panel*/
        tfPlatform.setText("");
        tfWorkinghour.setText("");
        tfInterviewer.setText("");
        tfSalary.setText("");
        tfAppointedby.setText("");
        tfTerminationDate.setText("");
        tfContractPeriod.setText("");
        tfNameSenior.setText("");
        tfjoiningDate.setText("");
        tfSeniorDeveloperNo.setText("");
        tfRoomNo.setText("");
        tfAdvanceSalary.setText("");
        tfNameJunior.setText("");
        tfSpecialization.setText("");
        tfSeniorDevNo.setText("");
        tfAppointDate.setText("");
        tfTermiDate.setText("");
    }
        
 public static void main(String []args){
            new RigoTechnology().myGui();
    }
}

   
