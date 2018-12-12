
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class SearchStudent extends javax.swing.JFrame {

    DefaultComboBoxModel teamBox;
    Scanner scnr = null;
    String[] line;
    String coursename;
    String studentname;
    int flg;
    int noofitem = 0;
    String[] sid;
    String cid;

    /**
     * Creates new form SearchStudent
     */
    public SearchStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxyear = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxcourse = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInfo = new javax.swing.JTextArea();
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

        jLabel1.setText("Report");

        jLabel2.setText("Select Year");

        jComboBoxyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "2010", "2011", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020" }));
        jComboBoxyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxyearActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Course");

        jComboBoxcourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Computer Science", "Mechanical", "Applied Mathematics", "Physics", "Music" }));
        jComboBoxcourse.setEnabled(false);
        jComboBoxcourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxcourseActionPerformed(evt);
            }
        });

        jTextAreaInfo.setEditable(false);
        jTextAreaInfo.setColumns(20);
        jTextAreaInfo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInfo);

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
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxyearActionPerformed
        jComboBoxcourse.setEnabled(true);
        
        File file = new File("course.dat");
        String[] line = null;
        int i = 100;
        String[] crsnm = new String[100];
        sid = new String[i];

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
            sid[i-100]=split[0];
            crsnm[i - 100] = split[1];
            i++;
        }
        String[] coursename = new String[i];
        
        coursename[0] = "Select";
        for (int j = 1; j < i - 99; j++) {
            coursename[j] = crsnm[j - 1];
        }
        teamBox = new DefaultComboBoxModel(coursename);
        jComboBoxcourse.setModel(teamBox);
    }//GEN-LAST:event_jComboBoxyearActionPerformed

    private void jComboBoxcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxcourseActionPerformed
        getCourseID();
        File file = new File("grading.dat");
        String[] line = null;
        int i = 1;
        int k=0;
        String[] sid = new String[100];
        String[] crsyr = new String[100];
        String[] crssem = new String[100];
        String[] ccrsid = new String[100];
        String[] grd = new String[100];
        String det = "Student ID       CourseYear        CourseSem      CourseID     Grade\n";

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
            
            if(split[3].equals(cid) && split[1].equals(jComboBoxyear.getSelectedItem().toString())) {
                sid[k] = split[0];
                crsyr[k] = split[1];
                crssem[k] = split[2];
                ccrsid[k] = split[3];
                grd[k] = split[4];
                k++;
            }
            i++;
        }
        for (int j = 0; j < k; j++) {
            det += sid[j] + "\t     " + crsyr[j] + "\t      " +  crssem[j]+"\t     "+ccrsid[j]+"\t"+grd[j]+"\n"; 
        }

        jTextAreaInfo.setText(det);
    }//GEN-LAST:event_jComboBoxcourseActionPerformed

    private void menuregstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuregstuActionPerformed
        SearchStudent srcstu=new SearchStudent();
        AddStudent adds=new AddStudent();
        adds.setVisible(true);
        srcstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuregstuActionPerformed

    private void menustuviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustuviewActionPerformed
        SearchStudent srcstu=new SearchStudent();
        ViewStudent vstu=new ViewStudent();
        vstu.setVisible(true);
        srcstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menustuviewActionPerformed

    private void menusearchstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusearchstuActionPerformed
        SearchStudent srcstu=new SearchStudent();
        SearchStudent sstu=new SearchStudent();
        sstu.setVisible(true);
        srcstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menusearchstuActionPerformed

    private void menuaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddcourseActionPerformed
        SearchStudent srcstu=new SearchStudent();
        AddCourse acourse=new AddCourse();
        acourse.setVisible(true);
        srcstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddcourseActionPerformed

    private void menuviewcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewcourseActionPerformed
        SearchStudent srcstu=new SearchStudent();
        ViewCourse vcourse=new ViewCourse();
        vcourse.setVisible(true);
        srcstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewcourseActionPerformed

    private void menuassigncourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassigncourseActionPerformed
        
    }//GEN-LAST:event_menuassigncourseActionPerformed

    private void menuaddgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddgradesActionPerformed
        SearchStudent srcstu=new SearchStudent();
        AddGrade agrd=new AddGrade();
        agrd.setVisible(true);
        srcstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddgradesActionPerformed

    private void menuviewgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewgradesActionPerformed
        SearchStudent srcstu=new SearchStudent();
        ViewGrades vgrd=new ViewGrades();
        vgrd.setVisible(true);
        srcstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewgradesActionPerformed

    private void menuassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassignActionPerformed
        SearchStudent srcstu=new SearchStudent();
        EnrollStudents enrstu=new EnrollStudents();
        enrstu.setVisible(true);
        srcstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuassignActionPerformed

    void getCourseID() {
        File f1 = new File("course.dat");
        noofitem = 0;
        String cnm = jComboBoxcourse.getSelectedItem().toString();
        try {
            scnr = new Scanner(f1);
        } 
        catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        
        while (scnr.hasNextLine()) {
            line = scnr.nextLine().split("\\,");
            noofitem++;
            int idd = flg + 99;
            
            if (line[1].equals(cnm)) {
                cid = line[0];
            }
        }
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
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuStureg;
    private javax.swing.JComboBox<String> jComboBoxcourse;
    private javax.swing.JComboBox<String> jComboBoxyear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInfo;
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
    // End of variables declaration//GEN-END:variables
}