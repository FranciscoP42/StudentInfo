public class StudentManagement extends javax.swing.JFrame {

    /**
     * Creates new form StudentManagement
     */
    public StudentManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        jMenu1 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
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

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        jMenu1.setText("jMenu1");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Welcome User");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel2.setText("STUDENT INFORMATION SYSTEM");

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
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuregstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuregstuActionPerformed
        StudentManagement stum=new StudentManagement();
        AddStudent adds=new AddStudent();
        adds.setVisible(true);
        stum.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuregstuActionPerformed

    private void menuaddgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddgradesActionPerformed
        StudentManagement stum=new StudentManagement();
        AddGrade agrd=new AddGrade();
        agrd.setVisible(true);
        stum.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddgradesActionPerformed

    private void menustuviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustuviewActionPerformed
        StudentManagement stum=new StudentManagement();
        ViewStudent vstu=new ViewStudent();
        vstu.setVisible(true);
        stum.setVisible(false);
        dispose();
    }//GEN-LAST:event_menustuviewActionPerformed

    private void menusearchstuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusearchstuActionPerformed
        StudentManagement stum=new StudentManagement();
        SearchStudent sstu=new SearchStudent();
        sstu.setVisible(true);
        stum.setVisible(false);
        dispose();
    }//GEN-LAST:event_menusearchstuActionPerformed

    private void menuaddcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuaddcourseActionPerformed
        StudentManagement stum=new StudentManagement();
        AddCourse acourse=new AddCourse();
        acourse.setVisible(true);
        stum.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuaddcourseActionPerformed

    private void menuviewcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewcourseActionPerformed
        StudentManagement stum=new StudentManagement();
        ViewCourse vcourse=new ViewCourse();
        vcourse.setVisible(true);
        stum.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewcourseActionPerformed

    private void menuassigncourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassigncourseActionPerformed
        
    }//GEN-LAST:event_menuassigncourseActionPerformed

    private void menuviewgradesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuviewgradesActionPerformed
        StudentManagement stum=new StudentManagement();
        ViewGrades vgrd=new ViewGrades();
        vgrd.setVisible(true);
        stum.setVisible(false);
        dispose();
    }//GEN-LAST:event_menuviewgradesActionPerformed

    private void menuassignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuassignActionPerformed
        StudentManagement stum=new StudentManagement();
        EnrollStudents enrstu=new EnrollStudents();
        enrstu.setVisible(true);
        stum.setVisible(false);
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
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuStureg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
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
