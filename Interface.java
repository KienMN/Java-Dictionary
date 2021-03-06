package dictionary;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

/**
 *
 * @author KienM
 */
public class Interface extends javax.swing.JFrame {

    final static String TITLE = "DICTIONARY";
    final int WIDTH = 500;
    final int HEIGHT = 300;
    final static String EVDICT = "English - Vietnamese Dictionary";     //name of dictionary
    final static String VEDICT = "Vietnamese - English Dictionary";     //name of dictionary
    final static String ICON_URL = "src/images/dictionary.png";          //url of icon image
    final static String INSTRUCTION_URL = "src/images/basic_instruction.png";   //url of instruction image
    final static String EXISTEDWORD = "Word has existed already";       //announce that word has existed already
    final static String NONEXISTEDWORD = "Word has not existed yet";    //announce that word has not existed yet
    final static String SUCCESSFULNOTI = "Successfully";                //announce that an action has been executed successfully
    final static String FAILURENOTI = "Unsuccessfully";             //announce that an action has been executed unsuccessfully
    final static String NOCONTENT = "No word or content has been typed";//announce that either word or content is empty
    public static boolean eVSelected = true;                        //whether the dictionary is E-V or not
    private Database database = new Database();                     //create a new database

    //constructor
    public Interface() {
        initComponents();
        setIcon();
        setTitle(TITLE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    //determine type of dictionary
    public static boolean eVDictionary() {
        return (eVSelected);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instructionFrame = new javax.swing.JFrame();
        instructionImage = new javax.swing.JPanel() {
            ImageIcon icon = new ImageIcon(INSTRUCTION_URL);
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        aboutDialog = new javax.swing.JDialog();
        nameOfApp = new javax.swing.JLabel();
        studentID = new javax.swing.JLabel();
        version = new javax.swing.JLabel();
        preferences = new javax.swing.JLabel();
        writer = new javax.swing.JLabel();
        wordTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JEditorPane();
        searchButton = new javax.swing.JButton();
        checkWordButton = new javax.swing.JButton();
        nameOfDictionary = new javax.swing.JLabel();
        addNewButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        statusText = new javax.swing.JTextField();
        statusLabel = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        searchMenuItem = new javax.swing.JMenuItem();
        editMenuItem = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();
        dictionariesMenu = new javax.swing.JMenu();
        EVDictionary = new javax.swing.JMenuItem();
        VEDictionary = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        instructionMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        javax.swing.GroupLayout instructionImageLayout = new javax.swing.GroupLayout(instructionImage);
        instructionImage.setLayout(instructionImageLayout);
        instructionImageLayout.setHorizontalGroup(
            instructionImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 819, Short.MAX_VALUE)
        );
        instructionImageLayout.setVerticalGroup(
            instructionImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout instructionFrameLayout = new javax.swing.GroupLayout(instructionFrame.getContentPane());
        instructionFrame.getContentPane().setLayout(instructionFrameLayout);
        instructionFrameLayout.setHorizontalGroup(
            instructionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(instructionImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        instructionFrameLayout.setVerticalGroup(
            instructionFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(instructionImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        aboutDialog.setTitle("About");

        nameOfApp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameOfApp.setText("Dual Dictionary - English and Vietnamese");

        studentID.setText("Student ID: 15021471");

        version.setText("ver 1.0");

        preferences.setText("Dictionary used the database and libraries from Internet");

        writer.setText("Writter: Mai Ngoc Kien");

        javax.swing.GroupLayout aboutDialogLayout = new javax.swing.GroupLayout(aboutDialog.getContentPane());
        aboutDialog.getContentPane().setLayout(aboutDialogLayout);
        aboutDialogLayout.setHorizontalGroup(
            aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(version)
                    .addGroup(aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(preferences, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(studentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(writer, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutDialogLayout.createSequentialGroup()
                            .addComponent(nameOfApp)
                            .addGap(14, 14, 14))))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        aboutDialogLayout.setVerticalGroup(
            aboutDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutDialogLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(nameOfApp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(version)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(writer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preferences, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        wordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordTextFieldActionPerformed(evt);
            }
        });
        wordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wordTextFieldKeyTyped(evt);
            }
        });

        text.setEditable(false);
        jScrollPane1.setViewportView(text);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        checkWordButton.setText("Check word");
        checkWordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWordButtonActionPerformed(evt);
            }
        });
        checkWordButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                checkWordButtonKeyTyped(evt);
            }
        });

        nameOfDictionary.setText("English - Vietnamese Dictionary");

        addNewButton.setText("Add new");
        addNewButton.setVisible(false);
        addNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewButtonActionPerformed(evt);
            }
        });
        addNewButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addNewButtonKeyTyped(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.setVisible(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        updateButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                updateButtonKeyTyped(evt);
            }
        });

        statusText.setEditable(false);
        statusText.setText("Status");
        statusText.setVisible(false);

        statusLabel.setText("Status");
        statusLabel.setVisible(false);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        deleteButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                deleteButtonKeyTyped(evt);
            }
        });
        deleteButton.setVisible(false);

        fileMenu.setText("File");

        searchMenuItem.setText("Search");
        searchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(searchMenuItem);

        editMenuItem.setText("Edit");
        editMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(editMenuItem);

        quitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(quitMenuItem);

        menuBar.add(fileMenu);

        dictionariesMenu.setText("Dictionaries");

        EVDictionary.setText("English - Vietnamese");
        EVDictionary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVDictionaryActionPerformed(evt);
            }
        });
        dictionariesMenu.add(EVDictionary);

        VEDictionary.setText("Vietnamese - English");
        VEDictionary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VEDictionaryActionPerformed(evt);
            }
        });
        dictionariesMenu.add(VEDictionary);

        menuBar.add(dictionariesMenu);

        helpMenu.setText("Help");

        instructionMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        instructionMenuItem.setText("Instruction");
        instructionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(instructionMenuItem);

        aboutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameOfDictionary, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(addNewButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wordTextField)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkWordButton, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(statusText))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameOfDictionary, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNewButton)
                    .addComponent(updateButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statusText)
                            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkWordButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteButton)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //The action of menu and button
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String word = wordTextField.getText();
        String meaning = null;
        word = word.toLowerCase();
        meaning = database.selectMeaning(word);
        if (meaning != null) {
            text.setContentType("text/html");
            text.setText(meaning);
        } else {
            text.setText("Not found");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void checkWordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWordButtonActionPerformed
        String word = wordTextField.getText();
        word = word.toLowerCase();
        String list = "";
        list = database.listWords(word);
        if (list != "") {
            text.setContentType("text");
            text.setText(list);
        } else {
            text.setText("Not found");
        }
    }//GEN-LAST:event_checkWordButtonActionPerformed

    private void wordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordTextFieldActionPerformed

    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_quitMenuItemActionPerformed

    private void EVDictionaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVDictionaryActionPerformed
        eVSelected = true;
        nameOfDictionary.setText(EVDICT);
    }//GEN-LAST:event_EVDictionaryActionPerformed

    private void VEDictionaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VEDictionaryActionPerformed
        eVSelected = false;
        nameOfDictionary.setText(VEDICT);
    }//GEN-LAST:event_VEDictionaryActionPerformed

    private void editMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuItemActionPerformed
        text.setEditable(true);
        addNewButton.setVisible(true);
        updateButton.setVisible(true);
        statusLabel.setVisible(true);
        statusText.setVisible(true);
        deleteButton.setVisible(true);
    }//GEN-LAST:event_editMenuItemActionPerformed

    private void searchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenuItemActionPerformed
        text.setEditable(false);
        addNewButton.setVisible(false);
        updateButton.setVisible(false);
        statusLabel.setVisible(false);
        statusText.setVisible(false);
        deleteButton.setVisible(false);
    }//GEN-LAST:event_searchMenuItemActionPerformed

    private void addNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewButtonActionPerformed
        String word = wordTextField.getText();
        String meaning = text.getText();
        String checkMeaning = null;
        if (word.length() == 0 || meaning.length() == 0) {
            statusText.setText(NOCONTENT);
        } else {
            word.toLowerCase();
            checkMeaning = database.selectMeaning(word);
            if (checkMeaning != null) {
                statusText.setText(EXISTEDWORD);
            } else {
                database.insertContent(word, meaning);
                if (meaning.equalsIgnoreCase(database.selectMeaning(word))) {
                    statusText.setText(SUCCESSFULNOTI);
                } else {
                    statusText.setText(FAILURENOTI);
                }
            }
        }
    }//GEN-LAST:event_addNewButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String word = wordTextField.getText();
        String meaning = text.getText();
        String checkMeaning = null;
        if (word.length() == 0 || meaning.length() == 0) {
            statusText.setText(NOCONTENT);
        } else {
            word.toLowerCase();
            checkMeaning = database.selectMeaning(word);
            if (checkMeaning == null) {
                statusText.setText(NONEXISTEDWORD);
            } else {
                database.updateContent(word, meaning);
                if (meaning.equalsIgnoreCase(database.selectMeaning(word))) {
                    statusText.setText(SUCCESSFULNOTI);
                } else {
                    statusText.setText(FAILURENOTI);
                }
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void instructionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructionMenuItemActionPerformed
        instructionFrame.pack();
        instructionFrame.setSize((int) (1.5 * WIDTH), (int) (1.5 * HEIGHT));
        instructionFrame.setResizable(false);
        instructionFrame.setLocationRelativeTo(null);
        instructionFrame.setVisible(true);
    }//GEN-LAST:event_instructionMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        aboutDialog.pack();
        aboutDialog.setSize(WIDTH - 150, HEIGHT - 50);
        aboutDialog.setResizable(false);
        aboutDialog.setLocationRelativeTo(null);
        aboutDialog.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String word = wordTextField.getText();
        if (word.length() != 0) {
            word.toLowerCase();
            if (database.selectMeaning(word) != null) {
                database.deleteContent(word);
                statusText.setText(SUCCESSFULNOTI);
            } else {
                statusText.setText(NONEXISTEDWORD);
            }
        } else {
            statusText.setText(NOCONTENT);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    //Catch key event ENTER
    private void wordTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wordTextFieldKeyTyped
        if ((int) evt.getKeyChar() == KeyEvent.VK_ENTER) {
            searchButtonActionPerformed();
        }
        if (wordTextField.getText().length() == 0) {
            text.setText("Ready");
        }
    }//GEN-LAST:event_wordTextFieldKeyTyped

    //Catch key event ENTER
    private void checkWordButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_checkWordButtonKeyTyped
        if ((int) evt.getKeyChar() == KeyEvent.VK_ENTER) {
            checkWordButtonActionPerformed();
        }
    }//GEN-LAST:event_checkWordButtonKeyTyped

    //Catch key event ENTER
    private void addNewButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addNewButtonKeyTyped
        if ((int) evt.getKeyChar() == KeyEvent.VK_ENTER) {
            addNewButtonActionPerformed();
        }
    }//GEN-LAST:event_addNewButtonKeyTyped

    //Catch key event ENTER
    private void updateButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateButtonKeyTyped
        if ((int) evt.getKeyChar() == KeyEvent.VK_ENTER) {
            updateButtonActionPerformed();
        }
    }//GEN-LAST:event_updateButtonKeyTyped

    //Catch key event ENTER
    private void deleteButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deleteButtonKeyTyped
        if ((int) evt.getKeyChar() == KeyEvent.VK_ENTER) {
            deleteButtonActionPerformed();
        }
    }//GEN-LAST:event_deleteButtonKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem EVDictionary;
    private javax.swing.JMenuItem VEDictionary;
    private javax.swing.JDialog aboutDialog;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton addNewButton;
    private javax.swing.JButton checkWordButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenu dictionariesMenu;
    private javax.swing.JMenuItem editMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JFrame instructionFrame;
    private javax.swing.JPanel instructionImage;
    private javax.swing.JMenuItem instructionMenuItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JLabel nameOfApp;
    private javax.swing.JLabel nameOfDictionary;
    private javax.swing.JLabel preferences;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JButton searchButton;
    private javax.swing.JMenuItem searchMenuItem;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField statusText;
    private javax.swing.JLabel studentID;
    private javax.swing.JEditorPane text;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel version;
    private javax.swing.JTextField wordTextField;
    private javax.swing.JLabel writer;
    // End of variables declaration//GEN-END:variables

    //set icon image to window
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(ICON_URL));
    }

    //action of search button
    private void searchButtonActionPerformed() {
        String word = wordTextField.getText();
        String meaning = null;
        word = word.toLowerCase();
        meaning = database.selectMeaning(word);
        if (meaning != null) {
            text.setContentType("text/html");
            text.setText(meaning);
        } else {
            text.setText("Not found");
        }
    }

    //action of check word button
    private void checkWordButtonActionPerformed() {
        String word = wordTextField.getText();
        word = word.toLowerCase();
        String list = "";
        list = database.listWords(word);
        if (list != "") {
            text.setContentType("text");
            text.setText(list);
        } else {
            text.setText("Not found");
        }
    }

    //action of add new button
    private void addNewButtonActionPerformed() {
        String word = wordTextField.getText();
        String meaning = text.getText();
        String checkMeaning = null;
        if (word.length() == 0 || meaning.length() == 0) {
            statusText.setText(NOCONTENT);
        } else {
            word.toLowerCase();
            checkMeaning = database.selectMeaning(word);
            if (checkMeaning != null) {
                statusText.setText(EXISTEDWORD);
            } else {
                database.insertContent(word, meaning);
                if (meaning.equalsIgnoreCase(database.selectMeaning(word))) {
                    statusText.setText(SUCCESSFULNOTI);
                } else {
                    statusText.setText(FAILURENOTI);
                }
            }
        }
    }

    //action of update button
    private void updateButtonActionPerformed() {
        String word = wordTextField.getText();
        String meaning = text.getText();
        String checkMeaning = null;
        if (word.length() == 0 || meaning.length() == 0) {
            statusText.setText(NOCONTENT);
        } else {
            word.toLowerCase();
            checkMeaning = database.selectMeaning(word);
            if (checkMeaning == null) {
                statusText.setText(NONEXISTEDWORD);
            } else {
                database.updateContent(word, meaning);
                if (meaning.equalsIgnoreCase(database.selectMeaning(word))) {
                    statusText.setText(SUCCESSFULNOTI);
                } else {
                    statusText.setText(FAILURENOTI);
                }
            }
        }
    }

    //action of delete button
    private void deleteButtonActionPerformed() {
        String word = wordTextField.getText();
        if (word.length() != 0) {
            word.toLowerCase();
            if (database.selectMeaning(word) != null) {
                database.deleteContent(word);
                statusText.setText(SUCCESSFULNOTI);
            } else {
                statusText.setText(NONEXISTEDWORD);
            }
        } else {
            statusText.setText(NOCONTENT);
        }
    }
    
}
