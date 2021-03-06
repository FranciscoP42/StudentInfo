
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ViewCourse extends javax.swing.JFrame {

    DefaultComboBoxModel teamBox;
    File file = new File("course.dat");
    Scanner scnr = null;
    String[] line;
    int flg;
    int noofitem = 0;

    /**
     * Creates new form ViewCourse
     */
    public ViewCourse() {
        initComponents();
        String[] line = null;
        int i = 100;
        String[] id = new String[100];

        try {
            scnr = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (scnr.hasNextLine()) {
            line = new String[i - 99];
            line[i - 100] = scnr.nextLine();
            String[] split = line[i - 100].split(("\\,"));
            id[i - 100] = split[0];
            i++;
        }
        String[] chkid = new String[i];
        chkid[0] = "Select";
        for (int j = 1; j < i - 99; j++) {
            chkid[j] = id[j - 1];
        }
        teamBox = new DefaultComboBoxModel(chkid);
        comboIdcourse.setModel(teamBox);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcousedur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcoursettl = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboIdcourse = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareacousedesc = new javax.swing.JTextArea();
        btnViewCourse = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnupdateCourse = new javax.swing.JButton();
        combodept = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuStureg = new javax.swing.JMenu();
        menuregstu = new javax.swing.JMenuItem();
        menustuview = new javax.swing.JMenuItem();
        menusearchstu = new javax.swing.JMenuItem();
        menuregcourse = new javax.swing.JMenu();
        menuaddcourse = new javax.swing.JMenuItem();
        menuviewcourse = new javax.swing.JMenuItem();
        menuassigncourse = new javax.swing.JMenu();
        menuassign = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        menuaddgrades = new javax.swing.JMenuItem();
        menuviewgrades = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtcousedur.setEnabled(false);

        jLabel3.setText("Course Title");

        jLabel4.setText("Professor");

        jLabel2.setText("Select Course ID");

        txtcoursettl.setCaretColor(new java.awt.Color(255, 0, 0));
        txtcoursettl.setEnabled(false);
        txtcoursettl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoursettlActionPerformed(evt);
            }
        });

        jLabel6.setText("Course Duration (in Hours)");

        comboIdcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        comboIdcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboIdcourseActionPerformed(evt);
            }
        });

        txtareacousedesc.setColumns(20);
        txtareacousedesc.setRows(1);
        txtareacousedesc.setEnabled(false);
        jScrollPane1.setViewportView(txtareacousedesc);

        btnViewCourse.setText("View");
        btnViewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCourseActionPerformed(evt);
            }
        });

        jLabel7.setText("Department");

        btnupdateCourse.setText("Update");
        btnupdateCourse.setEnabled(false);
        btnupdateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateCourseActionPerformed(evt);
            }
        });

        combodept.setEditable(true);
        combodept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Computer Science", "Mechanical", "Applied Mathematics", "Physics", "Music" }));
        combodept.setEnabled(false);

        jLabel1.setText("View/Edit Course");

        MenuStureg.setText("Student");

        menuregstu.setText("Add Student");
        menuregstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuregstuActionPerformed(evt);
            }
        });
        MenuStureg.add(menuregstu);

        menustuview.setText("View/Edit Student");
        menustuview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menustuviewActionPerformed(evt);
            }
        });
        MenuStureg.add(menustuview);

        menusearchstu.setText("Search Student");
        menusearchstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusearchstuActionPerformed(evt);
            }
        });
        MenuStureg.add(menusearchstu);

        jMenuBar1.add(MenuStureg);

        menuregcourse.setText("Courses");

        menuaddcourse.setText("Add Course");
        menuaddcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuaddcourseActionPerformed(evt);
            }
        });
        menuregcourse.add(menuaddcourse);

        menuviewcourse.setText("View/Edit Course");
        menuviewcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuviewcourseActionPerformed(evt);
            }
        });
        menuregcourse.add(menuviewcourse);

        jMenuBar1.add(menuregcourse);

        menuassigncourse.setText("Enrollment");
        menuassigncourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuassigncourseActionPerformed(evt);
            }
        });

        menuassign.setText("Enroll Student");
        menuassign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuassignActionPerformed(evt);
            }
        });
        menuassigncourse.add(menuassign);

        jMenuBar1.add(menuassigncourse);

        jMenu14.setText("Grades");

        menuaddgrades.setText("Assign Grades");
        menuaddgrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuaddgradesActionPerformed(evt);
            }
        });
        jMenu14.add(menuaddgrades);

        menuviewgrades.setText("View Grades");
        menuviewgrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuviewgradesActionPerformed(evt);
            }
        });
        jMenu14.add(menuviewgrades);

        jMenuBar1.add(jMenu14);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel2)))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(combodept, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcoursettl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(comboIdcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewCourse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdateCourse))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                            .addComponent(txtcousedur))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboIdcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewCourse)
                    .addComponent(jLabel2)
                    .addComponent(btnupdateCourse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcoursettl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combodept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcousedur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcoursettlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoursettlActionPerformed
       
    }//GEN-LAST:event_txtcoursettlActionPerformed

    private void comboIdcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboIdcourseActionPerformed
        set();
    }//GEN-LAST:event_comboIdcourseActionPerformed

    private void btnViewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCourseActionPerformed
        noofitem = 0;
        flg = comboIdcourse.getSelectedIndex();
        if (flg == 0) {
            set();
            JOptionPane.showMessageDialog(null, " Select a Course ID", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            
            try {
                scnr = new Scanner(file);
            } 
            catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
            
            while (scnr.hasNextLine()) {
                line = scnr.nextLine().split("\\,");
                noofitem++;
                int idd = flg + 99;
                if (Integer.parseInt(line[0]) == idd) {
                    txtcoursettl.setText(line[1]);
                    txtareacousedesc.setText(line[2]);
                    combodept.setSelectedItem(line[3]);
                    txtcousedur.setText(line[4]);
                    reset();
                }
            }
        }
    }//GEN-LAST:event_btnViewCourseActionPerformed

    private void btnupdateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateCourseActionPerformed

        int checkdur = 0;
        try {
            int d = Integer.parseInt(txtcousedur.getText().toString());
        } 
        catch (NumberFormatException nfe) {
            checkdur = 1;
        }

        if (txtcoursettl.getText().equals("") || txtareacousedesc.getText().equals("") || txtcousedur.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No field should be left empty", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (checkdur == 1) {
            JOptionPane.showMessageDialog(null, "Invalid Course Duration", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            String[] getCourse = new String[noofitem];
            flg = comboIdcourse.getSelectedIndex();
            int idd = flg + 99;

            try {
                scnr = new Scanner(file);
            }
            catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
            
            while (scnr.hasNextLine()) {
                line = scnr.nextLine().split("\\,");
                if (Integer.parseInt(line[0]) == idd) {
                    System.out.println("items: " + line[0] + "  " + idd + "  " + flg);
                    getCourse[flg - 1] = line[0] + "," + txtcoursettl.getText().toString() + "," + txtareacousedesc.getText().toString() + "," + combodept.getSelectedItem().toString() + "," + txtcousedur.getText().toString() + "\n";
                    //reset();
                } else {
                    getCourse[Integer.parseInt(line[0]) - 100] = line[0] + "," + line[1] + "," + line[2] + "," + line[3] + "," + line[4] + "\n";
                }
            }

            try {
                PrintWriter printWriter = new PrintWriter(new FileWriter("course.dat"));
                for (int l = 0; l < noofitem; l++) {
                    printWriter.print(getCourse[l]);
                }
                printWriter.close();
            } 
            catch (IOException ex) {
                Logger.getLogger(ViewStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnupdateCourseActionPerformed

    private void menuregstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuregstuActionPerformed
        ViewCourse vcrs = new ViewCourse();
        AddStudent adds = new AddStudent();
        adds.setVisible(true);
        vcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuregstuActionPerformed

    private void menustuviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustuviewActionPerformed
        ViewCourse vcrs = new ViewCourse();
        ViewStudent vstu = new ViewStudent();
        vstu.setVisible(true);
        vcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menustuviewActionPerformed

    private void menusearchstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusearchstuActionPerformed
        ViewCourse vcrs = new ViewCourse();
        SearchStudent sstu = new SearchStudent();
        sstu.setVisible(true);
        vcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menusearchstuActionPerformed

    private void menuaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddcourseActionPerformed
        ViewCourse vcrs = new ViewCourse();
        AddCourse acourse = new AddCourse();
        acourse.setVisible(true);
        vcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddcourseActionPerformed

    private void menuviewcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewcourseActionPerformed
        ViewCourse vcrs = new ViewCourse();
        ViewCourse vcourse = new ViewCourse();
        vcourse.setVisible(true);
        vcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewcourseActionPerformed

    private void menuassigncourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassigncourseActionPerformed

    }//GEN-LAST:event_menuassigncourseActionPerformed

    private void menuaddgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddgradesActionPerformed
        ViewCourse vcrs = new ViewCourse();
        AddGrade agrd = new AddGrade();
        agrd.setVisible(true);
        vcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddgradesActionPerformed

    private void menuviewgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewgradesActionPerformed
        ViewCourse vcrs = new ViewCourse();
        ViewGrades vgrd = new ViewGrades();
        vgrd.setVisible(true);
        vcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewgradesActionPerformed

    private void menuassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassignActionPerformed
        ViewCourse vcrs = new ViewCourse();
        EnrollStudents enrstu = new EnrollStudents();
        enrstu.setVisible(true);
        vcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuassignActionPerformed

    public void reset() {
        txtcoursettl.setEnabled(true);
        txtareacousedesc.setEnabled(true);
        combodept.setEnabled(true);
        txtcousedur.setEnabled(true);
        btnupdateCourse.setEnabled(true);
    }

    public void set() {
        txtcoursettl.setText("");
        txtareacousedesc.setText("");
        combodept.setSelectedIndex(0);
        txtcousedur.setText("");

        txtcoursettl.setEnabled(false);
        txtareacousedesc.setEnabled(false);
        combodept.setEnabled(false);
        txtcousedur.setEnabled(false);
        btnupdateCourse.setEnabled(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuStureg;
    private javax.swing.JButton btnViewCourse;
    private javax.swing.JButton btnupdateCourse;
    private javax.swing.JComboBox<String> comboIdcourse;
    private javax.swing.JComboBox<String> combodept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuaddcourse;
    private javax.swing.JMenuItem menuaddgrades;
    private javax.swing.JMenuItem menuassign;
    private javax.swing.JMenu menuassigncourse;
    private javax.swing.JMenu menuregcourse;
    private javax.swing.JMenuItem menuregstu;
    private javax.swing.JMenuItem menusearchstu;
    private javax.swing.JMenuItem menustuview;
    private javax.swing.JMenuItem menuviewcourse;
    private javax.swing.JMenuItem menuviewgrades;
    private javax.swing.JTextArea txtareacousedesc;
    private javax.swing.JTextField txtcoursettl;
    private javax.swing.JTextField txtcousedur;
    // End of variables declaration//GEN-END:variables
}
