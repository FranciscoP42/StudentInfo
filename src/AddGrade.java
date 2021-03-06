
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AddGrade extends javax.swing.JFrame {

    DefaultComboBoxModel teamBox;
    Scanner scnr = null;
    String[] line;
    String coursename;
    String studentname;
    int flg;
    int noofitem = 0;

    /**
     * Creates new form AddGrade
     */
    public AddGrade() {
        initComponents();
        File file = new File("course.dat");
        String[] line = null;
        int i = 100;
        String[] id = new String[100];

        try {
            scnr = new Scanner(file);
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (scnr.hasNextLine()) {
            line = new String[i - 99];
            line[i - 100] = scnr.nextLine();
            String[] split = line[i - 100].split(("\\,"));
            id[i - 100] = split[0];
                //coursename = split[1];
            i++;
        }
        String[] chkid = new String[i];
        chkid[0] = "Select";
        for (int j = 1; j < i - 99; j++) {
            chkid[j] = id[j - 1];
        }
        teamBox = new DefaultComboBoxModel(chkid);
        jComboBoxCourseID.setModel(teamBox);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtstunm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcoursenm = new javax.swing.JTextField();
        jComboBoxCourseID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxStudentID = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnenroll = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxcourseyr = new javax.swing.JComboBox<>();
        jComboBoxcoursesem = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboGrade = new javax.swing.JComboBox<>();
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

        jLabel1.setText("Assigning Grades");

        txtstunm.setEditable(false);
        txtstunm.setEnabled(false);

        jLabel2.setText("Select CourseID");

        txtcoursenm.setEditable(false);
        txtcoursenm.setEnabled(false);

        jComboBoxCourseID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jComboBoxCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCourseIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Select StudentID");

        jComboBoxStudentID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", " " }));
        jComboBoxStudentID.setEnabled(false);
        jComboBoxStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxStudentIDActionPerformed(evt);
            }
        });

        jLabel4.setText("Student Name");

        btnenroll.setText("Assign Grade");
        btnenroll.setEnabled(false);
        btnenroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenrollActionPerformed(evt);
            }
        });

        jLabel5.setText("Course Name");

        jComboBoxcourseyr.setMaximumRowCount(10);
        jComboBoxcourseyr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "2010", "2011", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        jComboBoxcourseyr.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBoxcourseyr.setEnabled(false);
        jComboBoxcourseyr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxcourseyrActionPerformed(evt);
            }
        });

        jComboBoxcoursesem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Spring", "Summer", "Fall", "Winter" }));
        jComboBoxcoursesem.setEnabled(false);

        jLabel7.setText("Course Year");

        jLabel8.setText("Course Semester");

        jLabel6.setText("Grade");

        jComboGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A", "B", "C", "D", "F" }));
        jComboGrade.setEnabled(false);

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
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcoursenm)
                                    .addComponent(txtstunm)
                                    .addComponent(jComboBoxcourseyr, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxcoursesem, 0, 200, Short.MAX_VALUE)
                                    .addComponent(jComboGrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnenroll)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtstunm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcoursenm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxcourseyr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8))
                    .addComponent(jComboBoxcoursesem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(btnenroll)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCourseIDActionPerformed
        set();
        jComboBoxStudentID.setEnabled(true);

        File file = new File("student.dat");
        String[] line = null;
        int i = 1;
        String[] id = new String[100];

        try {
            scnr = new Scanner(file);
        } 
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        while (scnr.hasNextLine()) {
            line = new String[i];
            line[i - 1] = scnr.nextLine();
            String[] split = line[i - 1].split(("\\,"));
            id[i - 1] = split[0];
            //studentname = split[1];
            i++;
        }
        String[] chkid = new String[i];
        chkid[0] = "Select";
        for (int j = 1; j < i; j++) {
            chkid[j] = id[j - 1];
        }
        teamBox = new DefaultComboBoxModel(chkid);
        jComboBoxStudentID.setModel(teamBox);
    }//GEN-LAST:event_jComboBoxCourseIDActionPerformed

    private void jComboBoxStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxStudentIDActionPerformed
        reset();
        noofitem = 0;
        File file1 = new File("course.dat");
        File file2 = new File("student.dat");
        flg = jComboBoxCourseID.getSelectedIndex();
        if (flg == 0) {
            set();
            JOptionPane.showMessageDialog(null, " Select a Course ID", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                scnr = new Scanner(file1);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
            while (scnr.hasNextLine()) {
                line = scnr.nextLine().split("\\,");
                noofitem++;
                if (Integer.parseInt(line[0]) == flg + 99) {
                    txtcoursenm.setText(line[1]);
                }
            }
        }

        flg = jComboBoxStudentID.getSelectedIndex();
        noofitem = 0;
        if (flg == 0) {
            set();
            JOptionPane.showMessageDialog(null, " Select a Student ID", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                scnr = new Scanner(file2);
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }
            while (scnr.hasNextLine()) {
                line = scnr.nextLine().split("\\,");
                noofitem++;
                if (Integer.parseInt(line[0]) == flg) {
                    txtstunm.setText(line[1]);
                }
            }
        }

    }//GEN-LAST:event_jComboBoxStudentIDActionPerformed

    private void btnenrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenrollActionPerformed
        int checkgrade = checkredun();
        if (checkgrade == 1) {
            JOptionPane.showMessageDialog(null, "Grade Already marked", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String[] line = null;
            int i = 1;
            File file = new File("grading.dat");

            PrintWriter pw = null;
            try {
                pw = new PrintWriter(new FileOutputStream(file, true));
            } catch (FileNotFoundException ex) {
                System.out.println("File not found");
            }

            pw.write(jComboBoxStudentID.getSelectedItem().toString() + "," + jComboBoxcourseyr.getSelectedItem().toString() + "," + jComboBoxcoursesem.getSelectedItem().toString() + "," + jComboBoxCourseID.getSelectedItem().toString() + "," + jComboGrade.getSelectedItem().toString() + "\n");
            pw.close();
            JOptionPane.showMessageDialog(null, "Grade Assigned to Student ID " + jComboBoxStudentID.getSelectedItem().toString() + " for Course " + jComboBoxCourseID.getSelectedItem().toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnenrollActionPerformed

    private void menuregstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuregstuActionPerformed
        AddGrade addgrd = new AddGrade();
        AddStudent adds = new AddStudent();
        adds.setVisible(true);
        addgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuregstuActionPerformed

    private void menustuviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustuviewActionPerformed
        AddGrade addgrd = new AddGrade();
        ViewStudent vstu = new ViewStudent();
        vstu.setVisible(true);
        addgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menustuviewActionPerformed

    private void menusearchstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusearchstuActionPerformed
        AddGrade addgrd=new AddGrade();
        SearchStudent sstu=new SearchStudent();
        sstu.setVisible(true);
        addgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menusearchstuActionPerformed

    private void menuaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddcourseActionPerformed
        AddGrade addgrd=new AddGrade();
        AddCourse acourse=new AddCourse();
        acourse.setVisible(true);
        addgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddcourseActionPerformed

    private void menuviewcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewcourseActionPerformed
        AddGrade addgrd=new AddGrade();
        ViewCourse vcourse=new ViewCourse();
        vcourse.setVisible(true);
        addgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewcourseActionPerformed

    private void menuassigncourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassigncourseActionPerformed
        
    }//GEN-LAST:event_menuassigncourseActionPerformed

    private void menuaddgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddgradesActionPerformed
        AddGrade addgrd=new AddGrade();
        AddGrade agrd=new AddGrade();
        agrd.setVisible(true);
        addgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddgradesActionPerformed

    private void menuviewgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewgradesActionPerformed
        AddGrade addgrd=new AddGrade();
        ViewGrades vgrd=new ViewGrades();
        vgrd.setVisible(true);
        addgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewgradesActionPerformed

    private void menuassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassignActionPerformed
        AddGrade addgrd=new AddGrade();
        EnrollStudents enrstu=new EnrollStudents();
        enrstu.setVisible(true);
        addgrd.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuassignActionPerformed

    private void jComboBoxcourseyrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxcourseyrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxcourseyrActionPerformed

    public int checkredun() {
        String[] line = null;
        File file = new File("grading.dat");
        int i = 1;
        int flag = 0;
        int k = 0;
        String sidd = jComboBoxStudentID.getSelectedItem().toString();
        String crsyr = jComboBoxcourseyr.getSelectedItem().toString();
        String crssem = jComboBoxcoursesem.getSelectedItem().toString();
        String crsid = jComboBoxCourseID.getSelectedItem().toString();
        String grd = jComboGrade.getSelectedItem().toString();
        try {
            scnr = new Scanner(file);
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (scnr.hasNextLine()) {
            line = new String[i];
            line[i - 1] = scnr.nextLine();
            String[] split = line[i - 1].split(("\\,"));
            if (split[0].equals(sidd) && split[1].equals(crsyr) && split[2].equals(crssem) && split[3].equals(crsid)) {
                flag = 1;
            }
            i++;
        }
        return flag;
    }

    public void reset() {
        txtstunm.setEnabled(true);
        txtcoursenm.setEnabled(true);
        jComboBoxcourseyr.setEnabled(true);
        jComboBoxcoursesem.setEnabled(true);
        jComboGrade.setEnabled(true);
        btnenroll.setEnabled(true);
    }

    public void set() {
        txtstunm.setText("");
        txtcoursenm.setText("");
        jComboBoxcourseyr.setSelectedIndex(0);
        jComboBoxcoursesem.setSelectedIndex(0);
        jComboGrade.setSelectedIndex(0);

        txtstunm.setEnabled(false);
        txtcoursenm.setEnabled(false);
        jComboBoxcourseyr.setEnabled(false);
        jComboBoxcoursesem.setEnabled(false);
        jComboGrade.setEnabled(true);
        btnenroll.setEnabled(false);
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddGrade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddGrade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuStureg;
    private javax.swing.JButton btnenroll;
    private javax.swing.JComboBox<String> jComboBoxCourseID;
    private javax.swing.JComboBox<String> jComboBoxStudentID;
    private javax.swing.JComboBox<String> jComboBoxcoursesem;
    private javax.swing.JComboBox<String> jComboBoxcourseyr;
    private javax.swing.JComboBox<String> jComboGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenuBar jMenuBar1;
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
    private javax.swing.JTextField txtcoursenm;
    private javax.swing.JTextField txtstunm;
    // End of variables declaration//GEN-END:variables
}
