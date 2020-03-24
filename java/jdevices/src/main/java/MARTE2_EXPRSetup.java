/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manduchi
 */
public class MARTE2_EXPRSetup extends DeviceSetup {

    /**
     * Creates new form MARTE2_EXPRSetup
     */
    public MARTE2_EXPRSetup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deviceButtons1 = new DeviceButtons();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        deviceChoice1 = new DeviceChoice();
        jPanel4 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        deviceField3 = new DeviceField();
        deviceChoice2 = new DeviceChoice();
        jPanel7 = new javax.swing.JPanel();
        deviceField4 = new DeviceField();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        deviceField5 = new DeviceField();
        deviceChoice3 = new DeviceChoice();
        jPanel10 = new javax.swing.JPanel();
        deviceField6 = new DeviceField();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        deviceField7 = new DeviceField();
        deviceChoice4 = new DeviceChoice();
        jPanel13 = new javax.swing.JPanel();
        deviceField8 = new DeviceField();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        deviceField9 = new DeviceField();
        deviceChoice5 = new DeviceChoice();
        jPanel16 = new javax.swing.JPanel();
        deviceField10 = new DeviceField();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        deviceField11 = new DeviceField();
        deviceChoice6 = new DeviceChoice();
        jPanel19 = new javax.swing.JPanel();
        deviceField12 = new DeviceField();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        deviceField13 = new DeviceField();
        deviceChoice7 = new DeviceChoice();
        jPanel22 = new javax.swing.JPanel();
        deviceField14 = new DeviceField();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        deviceField15 = new DeviceField();
        deviceChoice8 = new DeviceChoice();
        jPanel25 = new javax.swing.JPanel();
        deviceField16 = new DeviceField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        deviceField17 = new DeviceField();
        deviceChoice9 = new DeviceChoice();
        deviceField33 = new DeviceField();
        jPanel28 = new javax.swing.JPanel();
        deviceField18 = new DeviceField();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        deviceField19 = new DeviceField();
        deviceChoice10 = new DeviceChoice();
        deviceField34 = new DeviceField();
        jPanel31 = new javax.swing.JPanel();
        deviceField20 = new DeviceField();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        deviceField21 = new DeviceField();
        deviceChoice11 = new DeviceChoice();
        deviceField35 = new DeviceField();
        jPanel34 = new javax.swing.JPanel();
        deviceField22 = new DeviceField();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        deviceField23 = new DeviceField();
        deviceChoice12 = new DeviceChoice();
        deviceField36 = new DeviceField();
        jPanel37 = new javax.swing.JPanel();
        deviceField24 = new DeviceField();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        deviceField25 = new DeviceField();
        deviceChoice13 = new DeviceChoice();
        deviceField37 = new DeviceField();
        jPanel40 = new javax.swing.JPanel();
        deviceField26 = new DeviceField();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        deviceField27 = new DeviceField();
        deviceChoice14 = new DeviceChoice();
        deviceField38 = new DeviceField();
        jPanel43 = new javax.swing.JPanel();
        deviceField28 = new DeviceField();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        deviceField29 = new DeviceField();
        deviceChoice15 = new DeviceChoice();
        deviceField39 = new DeviceField();
        jPanel46 = new javax.swing.JPanel();
        deviceField30 = new DeviceField();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        deviceField31 = new DeviceField();
        deviceChoice16 = new DeviceChoice();
        deviceField40 = new DeviceField();
        jPanel49 = new javax.swing.JPanel();
        deviceField32 = new DeviceField();
        jPanel50 = new javax.swing.JPanel();
        deviceField41 = new DeviceField();
        deviceField43 = new DeviceField();
        deviceField42 = new DeviceField();

        setDeviceProvider("scdevail.rfx.local:8200");
        setDeviceType("MARTE2_EXPR");
        setHeight(400);
        setWidth(900);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField1.setOffsetNid(32);
        jPanel3.add(deviceField1);

        deviceChoice1.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("");
        deviceChoice1.setOffsetNid(31);
        deviceChoice1.setUpdateIdentifier("");
        jPanel3.add(deviceChoice1);

        jPanel2.add(jPanel3);

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Value:");
        deviceField2.setNumCols(25);
        deviceField2.setOffsetNid(34);
        jPanel4.add(deviceField2);

        jPanel2.add(jPanel4);

        jTabbedPane1.addTab("In1", jPanel2);

        jPanel5.setLayout(new java.awt.GridLayout(2, 1));

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField3.setOffsetNid(39);
        jPanel6.add(deviceField3);

        deviceChoice2.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("");
        deviceChoice2.setOffsetNid(38);
        deviceChoice2.setUpdateIdentifier("");
        jPanel6.add(deviceChoice2);

        jPanel5.add(jPanel6);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Value:");
        deviceField4.setNumCols(25);
        deviceField4.setOffsetNid(41);
        jPanel7.add(deviceField4);

        jPanel5.add(jPanel7);

        jTabbedPane1.addTab("In2", jPanel5);

        jPanel8.setLayout(new java.awt.GridLayout(2, 1));

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField5.setOffsetNid(46);
        jPanel9.add(deviceField5);

        deviceChoice3.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice3.setIdentifier("");
        deviceChoice3.setLabelString("");
        deviceChoice3.setOffsetNid(45);
        deviceChoice3.setUpdateIdentifier("");
        jPanel9.add(deviceChoice3);

        jPanel8.add(jPanel9);

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Value:");
        deviceField6.setNumCols(25);
        deviceField6.setOffsetNid(48);
        jPanel10.add(deviceField6);

        jPanel8.add(jPanel10);

        jTabbedPane1.addTab("In3", jPanel8);

        jPanel11.setLayout(new java.awt.GridLayout(2, 1));

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField7.setOffsetNid(53);
        jPanel12.add(deviceField7);

        deviceChoice4.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice4.setIdentifier("");
        deviceChoice4.setLabelString("");
        deviceChoice4.setOffsetNid(52);
        deviceChoice4.setUpdateIdentifier("");
        jPanel12.add(deviceChoice4);

        jPanel11.add(jPanel12);

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("Value:");
        deviceField8.setNumCols(25);
        deviceField8.setOffsetNid(55);
        jPanel13.add(deviceField8);

        jPanel11.add(jPanel13);

        jTabbedPane1.addTab("In4", jPanel11);

        jPanel14.setLayout(new java.awt.GridLayout(2, 1));

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField9.setOffsetNid(60);
        jPanel15.add(deviceField9);

        deviceChoice5.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice5.setIdentifier("");
        deviceChoice5.setLabelString("");
        deviceChoice5.setOffsetNid(59);
        deviceChoice5.setUpdateIdentifier("");
        jPanel15.add(deviceChoice5);

        jPanel14.add(jPanel15);

        deviceField10.setIdentifier("");
        deviceField10.setLabelString("Value:");
        deviceField10.setNumCols(25);
        deviceField10.setOffsetNid(62);
        jPanel16.add(deviceField10);

        jPanel14.add(jPanel16);

        jTabbedPane1.addTab("In5", jPanel14);

        jPanel17.setLayout(new java.awt.GridLayout(2, 1));

        deviceField11.setIdentifier("");
        deviceField11.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField11.setOffsetNid(67);
        jPanel18.add(deviceField11);

        deviceChoice6.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice6.setIdentifier("");
        deviceChoice6.setLabelString("");
        deviceChoice6.setOffsetNid(66);
        deviceChoice6.setUpdateIdentifier("");
        jPanel18.add(deviceChoice6);

        jPanel17.add(jPanel18);

        deviceField12.setIdentifier("");
        deviceField12.setLabelString("Value:");
        deviceField12.setNumCols(25);
        deviceField12.setOffsetNid(69);
        jPanel19.add(deviceField12);

        jPanel17.add(jPanel19);

        jTabbedPane1.addTab("In6", jPanel17);

        jPanel20.setLayout(new java.awt.GridLayout(2, 1));

        deviceField13.setIdentifier("");
        deviceField13.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField13.setOffsetNid(74);
        jPanel21.add(deviceField13);

        deviceChoice7.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice7.setIdentifier("");
        deviceChoice7.setLabelString("");
        deviceChoice7.setOffsetNid(73);
        deviceChoice7.setUpdateIdentifier("");
        jPanel21.add(deviceChoice7);

        jPanel20.add(jPanel21);

        deviceField14.setIdentifier("");
        deviceField14.setLabelString("Value:");
        deviceField14.setNumCols(25);
        deviceField14.setOffsetNid(76);
        jPanel22.add(deviceField14);

        jPanel20.add(jPanel22);

        jTabbedPane1.addTab("In7", jPanel20);

        jPanel23.setLayout(new java.awt.GridLayout(2, 1));

        deviceField15.setIdentifier("");
        deviceField15.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField15.setOffsetNid(81);
        jPanel24.add(deviceField15);

        deviceChoice8.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice8.setIdentifier("");
        deviceChoice8.setLabelString("");
        deviceChoice8.setOffsetNid(80);
        deviceChoice8.setUpdateIdentifier("");
        jPanel24.add(deviceChoice8);

        jPanel23.add(jPanel24);

        deviceField16.setIdentifier("");
        deviceField16.setLabelString("Value:");
        deviceField16.setNumCols(25);
        deviceField16.setOffsetNid(83);
        jPanel25.add(deviceField16);

        jPanel23.add(jPanel25);

        jTabbedPane1.addTab("In8", jPanel23);

        jPanel1.add(jTabbedPane1);

        jPanel26.setLayout(new java.awt.GridLayout(2, 1));

        deviceField17.setIdentifier("");
        deviceField17.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField17.setOffsetNid(97);
        jPanel27.add(deviceField17);

        deviceChoice9.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice9.setIdentifier("");
        deviceChoice9.setLabelString("Type: ");
        deviceChoice9.setOffsetNid(95);
        deviceChoice9.setUpdateIdentifier("");
        jPanel27.add(deviceChoice9);

        deviceField33.setIdentifier("");
        deviceField33.setLabelString("Seg. Len (0 to disable writing):");
        deviceField33.setNumCols(4);
        deviceField33.setOffsetNid(98);
        jPanel27.add(deviceField33);

        jPanel26.add(jPanel27);

        deviceField18.setIdentifier("");
        deviceField18.setLabelString("Expression:");
        deviceField18.setNumCols(35);
        deviceField18.setOffsetNid(103);
        deviceField18.setTextOnly(true);
        jPanel28.add(deviceField18);

        jPanel26.add(jPanel28);

        jTabbedPane2.addTab("Out1", jPanel26);

        jPanel29.setLayout(new java.awt.GridLayout(2, 1));

        deviceField19.setIdentifier("");
        deviceField19.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField19.setOffsetNid(108);
        jPanel30.add(deviceField19);

        deviceChoice10.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice10.setIdentifier("");
        deviceChoice10.setLabelString("Type: ");
        deviceChoice10.setOffsetNid(106);
        deviceChoice10.setUpdateIdentifier("");
        jPanel30.add(deviceChoice10);

        deviceField34.setIdentifier("");
        deviceField34.setLabelString("Seg. Len (0 to disable writing):");
        deviceField34.setNumCols(4);
        deviceField34.setOffsetNid(109);
        jPanel30.add(deviceField34);

        jPanel29.add(jPanel30);

        deviceField20.setIdentifier("");
        deviceField20.setLabelString("Expression:");
        deviceField20.setNumCols(35);
        deviceField20.setOffsetNid(114);
        deviceField20.setTextOnly(true);
        jPanel31.add(deviceField20);

        jPanel29.add(jPanel31);

        jTabbedPane2.addTab("Out2", jPanel29);

        jPanel32.setLayout(new java.awt.GridLayout(2, 1));

        deviceField21.setIdentifier("");
        deviceField21.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField21.setOffsetNid(119);
        jPanel33.add(deviceField21);

        deviceChoice11.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice11.setIdentifier("");
        deviceChoice11.setLabelString("Type: ");
        deviceChoice11.setOffsetNid(117);
        deviceChoice11.setUpdateIdentifier("");
        jPanel33.add(deviceChoice11);

        deviceField35.setIdentifier("");
        deviceField35.setLabelString("Seg. Len (0 to disable writing):");
        deviceField35.setNumCols(4);
        deviceField35.setOffsetNid(120);
        jPanel33.add(deviceField35);

        jPanel32.add(jPanel33);

        deviceField22.setIdentifier("");
        deviceField22.setLabelString("Expression:");
        deviceField22.setNumCols(35);
        deviceField22.setOffsetNid(125);
        deviceField22.setTextOnly(true);
        jPanel34.add(deviceField22);

        jPanel32.add(jPanel34);

        jTabbedPane2.addTab("Out3", jPanel32);

        jPanel35.setLayout(new java.awt.GridLayout(2, 1));

        deviceField23.setIdentifier("");
        deviceField23.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField23.setOffsetNid(130);
        jPanel36.add(deviceField23);

        deviceChoice12.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice12.setIdentifier("");
        deviceChoice12.setLabelString("Type: ");
        deviceChoice12.setOffsetNid(128);
        deviceChoice12.setUpdateIdentifier("");
        jPanel36.add(deviceChoice12);

        deviceField36.setIdentifier("");
        deviceField36.setLabelString("Seg. Len (0 to disable writing):");
        deviceField36.setNumCols(4);
        deviceField36.setOffsetNid(131);
        jPanel36.add(deviceField36);

        jPanel35.add(jPanel36);

        deviceField24.setIdentifier("");
        deviceField24.setLabelString("Expression:");
        deviceField24.setNumCols(35);
        deviceField24.setOffsetNid(136);
        deviceField24.setTextOnly(true);
        jPanel37.add(deviceField24);

        jPanel35.add(jPanel37);

        jTabbedPane2.addTab("Out4", jPanel35);

        jPanel38.setLayout(new java.awt.GridLayout(2, 1));

        deviceField25.setIdentifier("");
        deviceField25.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField25.setOffsetNid(141);
        jPanel39.add(deviceField25);

        deviceChoice13.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice13.setIdentifier("");
        deviceChoice13.setLabelString("Type:  ");
        deviceChoice13.setOffsetNid(139);
        deviceChoice13.setUpdateIdentifier("");
        jPanel39.add(deviceChoice13);

        deviceField37.setIdentifier("");
        deviceField37.setLabelString("Seg. Len (0 to disable writing):");
        deviceField37.setNumCols(4);
        deviceField37.setOffsetNid(142);
        jPanel39.add(deviceField37);

        jPanel38.add(jPanel39);

        deviceField26.setIdentifier("");
        deviceField26.setLabelString("Expression:");
        deviceField26.setNumCols(35);
        deviceField26.setOffsetNid(147);
        deviceField26.setTextOnly(true);
        jPanel40.add(deviceField26);

        jPanel38.add(jPanel40);

        jTabbedPane2.addTab("Out5", jPanel38);

        jPanel41.setLayout(new java.awt.GridLayout(2, 1));

        deviceField27.setIdentifier("");
        deviceField27.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField27.setOffsetNid(152);
        jPanel42.add(deviceField27);

        deviceChoice14.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice14.setIdentifier("");
        deviceChoice14.setLabelString("Type: ");
        deviceChoice14.setOffsetNid(150);
        deviceChoice14.setUpdateIdentifier("");
        jPanel42.add(deviceChoice14);

        deviceField38.setIdentifier("");
        deviceField38.setLabelString("Seg. Len (0 to disable writing):");
        deviceField38.setNumCols(4);
        deviceField38.setOffsetNid(153);
        jPanel42.add(deviceField38);

        jPanel41.add(jPanel42);

        deviceField28.setIdentifier("");
        deviceField28.setLabelString("Expression:");
        deviceField28.setNumCols(35);
        deviceField28.setOffsetNid(158);
        deviceField28.setTextOnly(true);
        jPanel43.add(deviceField28);

        jPanel41.add(jPanel43);

        jTabbedPane2.addTab("Out6", jPanel41);

        jPanel44.setLayout(new java.awt.GridLayout(2, 1));

        deviceField29.setIdentifier("");
        deviceField29.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField29.setOffsetNid(163);
        jPanel45.add(deviceField29);

        deviceChoice15.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice15.setIdentifier("");
        deviceChoice15.setLabelString("Type: ");
        deviceChoice15.setOffsetNid(161);
        deviceChoice15.setUpdateIdentifier("");
        jPanel45.add(deviceChoice15);

        deviceField39.setIdentifier("");
        deviceField39.setLabelString("Seg. Len (0 to disable writing):");
        deviceField39.setNumCols(4);
        deviceField39.setOffsetNid(164);
        jPanel45.add(deviceField39);

        jPanel44.add(jPanel45);

        deviceField30.setIdentifier("");
        deviceField30.setLabelString("Expression:");
        deviceField30.setNumCols(35);
        deviceField30.setOffsetNid(169);
        deviceField30.setTextOnly(true);
        jPanel46.add(deviceField30);

        jPanel44.add(jPanel46);

        jTabbedPane2.addTab("Out7", jPanel44);

        jPanel47.setLayout(new java.awt.GridLayout(2, 1));

        deviceField31.setIdentifier("");
        deviceField31.setLabelString("Dimensions (0 for scalar, array otherwise):");
        deviceField31.setOffsetNid(174);
        jPanel48.add(deviceField31);

        deviceChoice16.setChoiceItems(new String[] {"int8", "uint8", "int16", "uint16", "int32", "uint32", "int64", "uint64", "float32", "float64"});
        deviceChoice16.setIdentifier("");
        deviceChoice16.setLabelString("Type: ");
        deviceChoice16.setOffsetNid(172);
        deviceChoice16.setUpdateIdentifier("");
        jPanel48.add(deviceChoice16);

        deviceField40.setIdentifier("");
        deviceField40.setLabelString("Seg. Len (0 to disable writing):");
        deviceField40.setNumCols(4);
        deviceField40.setOffsetNid(175);
        jPanel48.add(deviceField40);

        jPanel47.add(jPanel48);

        deviceField32.setIdentifier("");
        deviceField32.setLabelString("Expression:");
        deviceField32.setNumCols(35);
        deviceField32.setOffsetNid(180);
        deviceField32.setTextOnly(true);
        jPanel49.add(deviceField32);

        jPanel47.add(jPanel49);

        jTabbedPane2.addTab("Out8", jPanel47);

        jPanel1.add(jTabbedPane2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        deviceField41.setIdentifier("");
        deviceField41.setLabelString("Timebase:");
        deviceField41.setNumCols(25);
        deviceField41.setOffsetNid(3);
        jPanel50.add(deviceField41);

        deviceField43.setIdentifier("");
        deviceField43.setLabelString("Timebase Division (Valid if timebase on another thread):");
        deviceField43.setNumCols(4);
        deviceField43.setOffsetNid(181);
        jPanel50.add(deviceField43);

        deviceField42.setIdentifier("");
        deviceField42.setLabelString("Storage CPUs: ");
        deviceField42.setNumCols(4);
        deviceField42.setOffsetNid(92);
        jPanel50.add(deviceField42);

        getContentPane().add(jPanel50, java.awt.BorderLayout.PAGE_START);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
    private DeviceChoice deviceChoice10;
    private DeviceChoice deviceChoice11;
    private DeviceChoice deviceChoice12;
    private DeviceChoice deviceChoice13;
    private DeviceChoice deviceChoice14;
    private DeviceChoice deviceChoice15;
    private DeviceChoice deviceChoice16;
    private DeviceChoice deviceChoice2;
    private DeviceChoice deviceChoice3;
    private DeviceChoice deviceChoice4;
    private DeviceChoice deviceChoice5;
    private DeviceChoice deviceChoice6;
    private DeviceChoice deviceChoice7;
    private DeviceChoice deviceChoice8;
    private DeviceChoice deviceChoice9;
    private DeviceField deviceField1;
    private DeviceField deviceField10;
    private DeviceField deviceField11;
    private DeviceField deviceField12;
    private DeviceField deviceField13;
    private DeviceField deviceField14;
    private DeviceField deviceField15;
    private DeviceField deviceField16;
    private DeviceField deviceField17;
    private DeviceField deviceField18;
    private DeviceField deviceField19;
    private DeviceField deviceField2;
    private DeviceField deviceField20;
    private DeviceField deviceField21;
    private DeviceField deviceField22;
    private DeviceField deviceField23;
    private DeviceField deviceField24;
    private DeviceField deviceField25;
    private DeviceField deviceField26;
    private DeviceField deviceField27;
    private DeviceField deviceField28;
    private DeviceField deviceField29;
    private DeviceField deviceField3;
    private DeviceField deviceField30;
    private DeviceField deviceField31;
    private DeviceField deviceField32;
    private DeviceField deviceField33;
    private DeviceField deviceField34;
    private DeviceField deviceField35;
    private DeviceField deviceField36;
    private DeviceField deviceField37;
    private DeviceField deviceField38;
    private DeviceField deviceField39;
    private DeviceField deviceField4;
    private DeviceField deviceField40;
    private DeviceField deviceField41;
    private DeviceField deviceField42;
    private DeviceField deviceField43;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
