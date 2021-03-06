
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AddCourse extends javax.swing.JFrame {

    int i = 100;

    /**
     * Creates new form AddCourse
     */
    public AddCourse() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcoursettl = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareacoursedesc = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        combodept = new javax.swing.JComboBox<>();
        txtcoursedur = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AddCourse = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        MenuStureg3 = new javax.swing.JMenu();
        menuregstu3 = new javax.swing.JMenuItem();
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

        txtcoursettl.setText("(ex. CS990)");
        txtcoursettl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcoursettlActionPerformed(evt);
            }
        });

        txtareacoursedesc.setColumns(20);
        txtareacoursedesc.setRows(1);
        txtareacoursedesc.setText("(ex. Ashok Patil)");
        jScrollPane1.setViewportView(txtareacoursedesc);

        jLabel7.setText("Course Duration (in Hours)");

        combodept.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Engineering", "Applied Mathematics", "Physics", "Music" }));

        txtcoursedur.setText("(must be > 1)");
        txtcoursedur.setToolTipText("");

        jLabel1.setText("Create a Course");

        jLabel2.setText("Course Title");

        jLabel3.setText("Professor");

        AddCourse.setText("Create");
        AddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCourseActionPerformed(evt);
            }
        });

        jLabel4.setText("Department");

        MenuStureg3.setText("Student");

        menuregstu3.setText("Add Student");
        menuregstu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuregstu3ActionPerformed(evt);
            }
        });
        MenuStureg3.add(menuregstu3);

        menustuview.setText("View/Edit Student");
        menustuview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menustuviewActionPerformed(evt);
            }
        });
        MenuStureg3.add(menustuview);

        menusearchstu.setText("Search Student");
        menusearchstu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusearchstuActionPerformed(evt);
            }
        });
        MenuStureg3.add(menusearchstu);

        jMenuBar4.add(MenuStureg3);

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

        jMenuBar4.add(menuregcourse);

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

        jMenuBar4.add(menuassigncourse);

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

        jMenuBar4.add(jMenu14);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtcoursettl)
                    .addComponent(txtcoursedur)
                    .addComponent(combodept, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(AddCourse)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcoursettl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combodept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcoursedur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddCourse)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcoursettlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcoursettlActionPerformed
        
    }//GEN-LAST:event_txtcoursettlActionPerformed

    private void AddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCourseActionPerformed

        int checkdur = 0;
        try {
            int d = Integer.parseInt(txtcoursedur.getText().toString());
        } 
        
        catch (NumberFormatException nfe) {
            checkdur = 1;
        }

        if (txtcoursettl.getText().equals("") || txtareacoursedesc.getText().equals("") || txtcoursedur.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No field should be left empty", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (checkdur == 1) {
            JOptionPane.showMessageDialog(null, "Invalid Course Duration", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            String[] line = null;
            File file = new File("course.dat");
            Scanner scnr = null;
            try {
                scnr = new Scanner(file);
            } 
            
            catch (FileNotFoundException ex) {
                System.out.println("File Not Found");
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
                System.out.println("File Not Found");
            }

            pw.write(i + ", " + txtcoursettl.getText().toString() + ", " + txtareacoursedesc.getText().toString() + ", " + combodept.getSelectedItem().toString() + ", " + txtcoursedur.getText().toString() + "\n");
            pw.close();
            JOptionPane.showMessageDialog(null, "Course " + txtcoursettl.getText().toString() + " added into the System", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_AddCourseActionPerformed

    private void menuregstu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuregstu3ActionPerformed
        AddCourse addcrs = new AddCourse();
        AddStudent adds = new AddStudent();
        adds.setVisible(true);
        addcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuregstu3ActionPerformed

    private void menustuviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustuviewActionPerformed
        AddCourse addcrs = new AddCourse();
        ViewStudent vstu = new ViewStudent();
        vstu.setVisible(true);
        addcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menustuviewActionPerformed

    private void menusearchstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusearchstuActionPerformed
        AddCourse addcrs = new AddCourse();
        SearchStudent sstu = new SearchStudent();
        sstu.setVisible(true);
        addcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menusearchstuActionPerformed

    private void menuaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddcourseActionPerformed
        AddCourse addcrs = new AddCourse();
        AddCourse acourse = new AddCourse();
        acourse.setVisible(true);
        addcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddcourseActionPerformed

    private void menuviewcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewcourseActionPerformed
        AddCourse addcrs = new AddCourse();
        ViewCourse vcourse = new ViewCourse();
        vcourse.setVisible(true);
        addcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewcourseActionPerformed

    private void menuassigncourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassigncourseActionPerformed

    }//GEN-LAST:event_menuassigncourseActionPerformed

    private void menuaddgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddgradesActionPerformed
        AddCourse addcrs = new AddCourse();
        AddGrade agrd = new AddGrade();
        agrd.setVisible(true);
        addcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddgradesActionPerformed

    private void menuviewgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewgradesActionPerformed
        AddCourse addcrs = new AddCourse();
        ViewGrades vgrd = new ViewGrades();
        vgrd.setVisible(true);
        addcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewgradesActionPerformed

    private void menuassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassignActionPerformed
        AddCourse addcrs = new AddCourse();
        EnrollStudents enrstu = new EnrollStudents();
        enrstu.setVisible(true);
        addcrs.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuassignActionPerformed

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
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCourse;
    private javax.swing.JMenu MenuStureg3;
    private javax.swing.JComboBox<String> combodept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuaddcourse;
    private javax.swing.JMenuItem menuaddgrades;
    private javax.swing.JMenuItem menuassign;
    private javax.swing.JMenu menuassigncourse;
    private javax.swing.JMenu menuregcourse;
    private javax.swing.JMenuItem menuregstu3;
    private javax.swing.JMenuItem menusearchstu;
    private javax.swing.JMenuItem menustuview;
    private javax.swing.JMenuItem menuviewcourse;
    private javax.swing.JMenuItem menuviewgrades;
    private javax.swing.JTextArea txtareacoursedesc;
    private javax.swing.JTextField txtcoursedur;
    private javax.swing.JTextField txtcoursettl;
    // End of variables declaration//GEN-END:variables
}
