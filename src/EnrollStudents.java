
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class EnrollStudents extends javax.swing.JFrame {

    DefaultComboBoxModel teamBox;
    Scanner scnr = null;
    String[] line;
    String coursename;
    String studentname;
    int flg;
    int noofitem = 0;

    /**
     * Creates new form EnrollStudents
     */
    public EnrollStudents() {
        initComponents();
        File file = new File("course.dat");
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
        jComboBoxCourseID.setModel(teamBox);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCourseID = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxStudentID = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtstunm = new javax.swing.JTextField();
        txtcoursenm = new javax.swing.JTextField();
        btnenroll = new javax.swing.JButton();
        jComboBoxcourseyr = new javax.swing.JComboBox<>();
        jComboBoxcoursesem = new javax.swing.JComboBox<>();
        jComboBoxdept = new javax.swing.JComboBox<>();
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

        jLabel1.setText("Enroll Student To Course");

        jLabel2.setText("Select CourseID");

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

        jLabel5.setText("Course Name");

        jLabel6.setText("Department");

        jLabel7.setText("Course Year");

        jLabel8.setText("Course Semester");

        txtstunm.setEditable(false);
        txtstunm.setEnabled(false);

        txtcoursenm.setEditable(false);
        txtcoursenm.setEnabled(false);

        btnenroll.setText("Enroll");
        btnenroll.setEnabled(false);
        btnenroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenrollActionPerformed(evt);
            }
        });

        jComboBoxcourseyr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "2010", "2011", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        jComboBoxcourseyr.setEnabled(false);

        jComboBoxcoursesem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Spring", "Summer", "Fall", "Winter" }));
        jComboBoxcoursesem.setEnabled(false);

        jComboBoxdept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Mechanical", "Applied Mathematics", "Physics", "Music" }));
        jComboBoxdept.setEnabled(false);

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
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
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
                            .addComponent(jComboBoxcoursesem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxdept, 0, 200, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnenroll)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxdept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxcourseyr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBoxcoursesem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnenroll)
                .addGap(29, 29, 29))
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        while (scnr.hasNextLine()) {
            line = new String[i];
            line[i - 1] = scnr.nextLine();
            String[] split = line[i - 1].split(("\\,"));
            id[i - 1] = split[0];
//            studentname = split[1];
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
        } 
        else {
            try {
                scnr = new Scanner(file1);
            } 
            catch (FileNotFoundException ex) {
                Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            while (scnr.hasNextLine()) {
                line = scnr.nextLine().split("\\,");
                noofitem++;
                if (Integer.parseInt(line[0]) == flg+99) {
                    txtcoursenm.setText(line[1]);
                }
            }
        }

        flg = jComboBoxStudentID.getSelectedIndex();
        noofitem=0;
        if (flg == 0) {
            set();
            JOptionPane.showMessageDialog(null, " Select a Student ID", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                scnr = new Scanner(file2);
            } 
            catch (FileNotFoundException ex) {
                Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
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
        String[] line = null;
        int i = 1;
        File file = new File("enrolled.dat");
        Scanner scnr = null;
        try {
            scnr = new Scanner(file);
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while (scnr.hasNextLine()) {
            line = new String[i];
            line[i - 1] = scnr.nextLine();
            String split = line[i - 1].split(("\\,"))[0];
            int id = Integer.parseInt(split);
            i++;
        }

        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new FileOutputStream(file, true));
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }

        pw.write(i + "," + jComboBoxCourseID.getSelectedItem().toString() + "," + jComboBoxStudentID.getSelectedItem().toString() + "," + jComboBoxdept.getSelectedItem().toString() + "," + jComboBoxcourseyr.getSelectedItem().toString() + "," + jComboBoxcoursesem.getSelectedItem().toString() + "\n");
        pw.close();
        JOptionPane.showMessageDialog(null, "Student ID "+jComboBoxStudentID.getSelectedItem().toString()+" is Enrolled in Course "+jComboBoxCourseID.getSelectedItem().toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnenrollActionPerformed

    private void menuregstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuregstuActionPerformed
        EnrollStudents enrstu=new EnrollStudents();
        AddStudent adds=new AddStudent();
        adds.setVisible(true);
        enrstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuregstuActionPerformed

    private void menustuviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustuviewActionPerformed
        EnrollStudents enrstu=new EnrollStudents();
        ViewStudent vstu=new ViewStudent();
        vstu.setVisible(true);
        enrstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menustuviewActionPerformed

    private void menusearchstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusearchstuActionPerformed
        EnrollStudents enrstu=new EnrollStudents();
        SearchStudent sstu=new SearchStudent();
        sstu.setVisible(true);
        enrstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menusearchstuActionPerformed

    private void menuaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddcourseActionPerformed
        EnrollStudents enrstu=new EnrollStudents();
        AddCourse acourse=new AddCourse();
        acourse.setVisible(true);
        enrstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddcourseActionPerformed

    private void menuviewcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewcourseActionPerformed
        EnrollStudents enrstu=new EnrollStudents();
        ViewCourse vcourse=new ViewCourse();
        vcourse.setVisible(true);
        enrstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewcourseActionPerformed

    private void menuassigncourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassigncourseActionPerformed
        
    }//GEN-LAST:event_menuassigncourseActionPerformed

    private void menuaddgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddgradesActionPerformed
        EnrollStudents enrstu=new EnrollStudents();
        AddGrade agrd=new AddGrade();
        agrd.setVisible(true);
        enrstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddgradesActionPerformed

    private void menuviewgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewgradesActionPerformed
        EnrollStudents enrstu=new EnrollStudents();
        ViewGrades vgrd=new ViewGrades();
        vgrd.setVisible(true);
        enrstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewgradesActionPerformed

    private void menuassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassignActionPerformed
        EnrollStudents enrostu=new EnrollStudents();
        EnrollStudents enrstu=new EnrollStudents();
        enrstu.setVisible(true);
        enrostu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuassignActionPerformed

    public void reset() {
        txtstunm.setEnabled(true);
        txtcoursenm.setEnabled(true);
        jComboBoxdept.setEnabled(true);
        jComboBoxcourseyr.setEnabled(true);
        jComboBoxcoursesem.setEnabled(true);
        btnenroll.setEnabled(true);
    }

    public void set() {
        txtstunm.setText("");
        txtcoursenm.setText("");
        jComboBoxdept.setSelectedIndex(0);
        jComboBoxcourseyr.setSelectedIndex(0);
        jComboBoxcoursesem.setSelectedIndex(0);

        txtstunm.setEnabled(false);
        txtcoursenm.setEnabled(false);
        jComboBoxdept.setEnabled(false);
        jComboBoxcourseyr.setEnabled(false);
        jComboBoxcoursesem.setEnabled(false);
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
            java.util.logging.Logger.getLogger(EnrollStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnrollStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnrollStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnrollStudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnrollStudents().setVisible(true);
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
    private javax.swing.JComboBox<String> jComboBoxdept;
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
