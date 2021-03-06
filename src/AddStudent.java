
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class AddStudent extends javax.swing.JFrame {

    int i = 1;
    int[] id = null;

    public AddStudent() {
        initComponents();
    }

    
    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtstunm = new javax.swing.JTextField();
        txtphno = new javax.swing.JTextField();
        txtparentphno = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        AddStudent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareastuadd = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        combogender = new javax.swing.JComboBox<>();
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

        jLabel1.setText("Add Student");

        jLabel2.setText("Student Name");

        jLabel3.setText("Student Address");

        jLabel4.setText("Phone Number ");

        jLabel5.setText("Parents Number");

        jLabel6.setText("D.O.B (dd/mm/yyyy)");

        txtstunm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstunmActionPerformed(evt);
            }
        });

        txtphno.setText("(ex 1112223333)");

        txtparentphno.setText("(ex 1112223333)");

        AddStudent.setText("Add");
        AddStudent.setActionCommand("Register");
        AddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentActionPerformed(evt);
            }
        });

        txtareastuadd.setColumns(20);
        txtareastuadd.setRows(1);
        txtareastuadd.setText("(full address no commas)");
        jScrollPane1.setViewportView(txtareastuadd);

        jLabel7.setText("Gender");

        combogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

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
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(AddStudent)
                    .addComponent(jLabel7))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txtstunm)
                    .addComponent(txtphno)
                    .addComponent(txtparentphno)
                    .addComponent(txtdob)
                    .addComponent(combogender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1)
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
                    .addComponent(txtstunm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtphno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combogender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtparentphno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(AddStudent)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtstunmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstunmActionPerformed
        
    }//GEN-LAST:event_txtstunmActionPerformed

    private void AddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentActionPerformed
        Pattern pattern = Pattern.compile("\\d{10}");
        Matcher matcher = pattern.matcher(txtphno.getText().toString());
        Matcher matcher1 = pattern.matcher(txtparentphno.getText().toString());
        if (txtstunm.getText().equals("") || txtareastuadd.getText().equals("") || txtphno.getText().equals("") || txtparentphno.getText().equals("") || txtdob.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "No field should be left empty", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (!matcher.matches() || !matcher1.matches()) {
            JOptionPane.showMessageDialog(null, "Phone Number is not valid.", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (!isValidFormat("dd/MM/yyyy", txtdob.getText().toString(), Locale.ENGLISH)) {
            JOptionPane.showMessageDialog(null, "Invalid Date.Please Enter date in format dd/MM/yyyy", "Message", JOptionPane.INFORMATION_MESSAGE);
        } 
        else {
            String[] line = null;
            File file = new File("student.dat");
            Scanner scnr = null;
            try {
                scnr = new Scanner(file);
            } catch (FileNotFoundException ex) {
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

            pw.write(i + "," + txtstunm.getText().toString() + "," + txtareastuadd.getText().toString() + "," + txtphno.getText().toString() + "," + combogender.getSelectedItem().toString() + "," + txtparentphno.getText().toString() + "," + txtdob.getText().toString() + "\n");
            pw.close();
            JOptionPane.showMessageDialog(null, "Student " + txtstunm.getText().toString() + " is added into the system.", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_AddStudentActionPerformed

    private void menuregstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuregstuActionPerformed
        AddStudent addstu = new AddStudent();
        AddStudent adds = new AddStudent();
        adds.setVisible(true);
        addstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuregstuActionPerformed

    private void menustuviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustuviewActionPerformed
        AddStudent addstu = new AddStudent();
        ViewStudent vstu = new ViewStudent();
        vstu.setVisible(true);
        addstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menustuviewActionPerformed

    private void menusearchstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusearchstuActionPerformed
        AddStudent addstu = new AddStudent();
        SearchStudent sstu = new SearchStudent();
        sstu.setVisible(true);
        addstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menusearchstuActionPerformed

    private void menuaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddcourseActionPerformed
        AddStudent addstu = new AddStudent();
        AddCourse acourse = new AddCourse();
        acourse.setVisible(true);
        addstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddcourseActionPerformed

    private void menuviewcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewcourseActionPerformed
        AddStudent addstu = new AddStudent();
        ViewCourse vcourse = new ViewCourse();
        vcourse.setVisible(true);
        addstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewcourseActionPerformed

    private void menuassigncourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassigncourseActionPerformed

    }//GEN-LAST:event_menuassigncourseActionPerformed

    private void menuaddgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddgradesActionPerformed
        AddStudent addstu = new AddStudent();
        AddGrade agrd = new AddGrade();
        agrd.setVisible(true);
        addstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddgradesActionPerformed

    private void menuviewgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewgradesActionPerformed
        AddStudent addstu = new AddStudent();
        ViewGrades vgrd = new ViewGrades();
        vgrd.setVisible(true);
        addstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewgradesActionPerformed

    private void menuassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassignActionPerformed
        AddStudent addstu = new AddStudent();
        EnrollStudents enrstu = new EnrollStudents();
        enrstu.setVisible(true);
        addstu.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuassignActionPerformed

    public static boolean isValidFormat(String format, String value, Locale locale) {
        LocalDateTime ldt = null;
        DateTimeFormatter fomatter = DateTimeFormatter.ofPattern(format, locale);

        try {
            ldt = LocalDateTime.parse(value, fomatter);
            String result = ldt.format(fomatter);
            return result.equals(value);
        } 
        catch (DateTimeParseException e) {
            try {
                LocalDate ld = LocalDate.parse(value, fomatter);
                String result = ld.format(fomatter);
                return result.equals(value);
            } 
            catch (DateTimeParseException exp) {
                try {
                    LocalTime lt = LocalTime.parse(value, fomatter);
                    String result = lt.format(fomatter);
                    return result.equals(value);
                } catch (DateTimeParseException e2) {
                    
                }
            }
        }

        return false;
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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudent;
    private javax.swing.JMenu MenuStureg;
    private javax.swing.JComboBox<String> combogender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTextArea txtareastuadd;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtparentphno;
    private javax.swing.JTextField txtphno;
    private javax.swing.JTextField txtstunm;
    // End of variables declaration//GEN-END:variables
}
