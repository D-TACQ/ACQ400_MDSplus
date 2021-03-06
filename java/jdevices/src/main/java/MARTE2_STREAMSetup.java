/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manduchi
 */
public class MARTE2_STREAMSetup extends DeviceSetup {

    /**
     * Creates new form MARTE2_STREAMSetup
     */
    public MARTE2_STREAMSetup() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        deviceField1 = new DeviceField();
        deviceField14 = new DeviceField();
        deviceChoice9 = new DeviceChoice();
        jPanel12 = new javax.swing.JPanel();
        deviceField11 = new DeviceField();
        deviceField12 = new DeviceField();
        deviceField13 = new DeviceField();
        deviceField10 = new DeviceField();
        deviceButtons1 = new DeviceButtons();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        deviceField2 = new DeviceField();
        deviceChoice1 = new DeviceChoice();
        jPanel4 = new javax.swing.JPanel();
        deviceField3 = new DeviceField();
        deviceChoice2 = new DeviceChoice();
        jPanel5 = new javax.swing.JPanel();
        deviceField4 = new DeviceField();
        deviceChoice3 = new DeviceChoice();
        jPanel6 = new javax.swing.JPanel();
        deviceField5 = new DeviceField();
        deviceChoice4 = new DeviceChoice();
        jPanel7 = new javax.swing.JPanel();
        deviceField6 = new DeviceField();
        deviceChoice5 = new DeviceChoice();
        jPanel8 = new javax.swing.JPanel();
        deviceField7 = new DeviceField();
        deviceChoice6 = new DeviceChoice();
        jPanel9 = new javax.swing.JPanel();
        deviceField8 = new DeviceField();
        deviceChoice7 = new DeviceChoice();
        jPanel10 = new javax.swing.JPanel();
        deviceField9 = new DeviceField();
        deviceChoice8 = new DeviceChoice();

        setDeviceProvider("scdevail.rfx.local:8200");
        setDeviceTitle("MARTe2 Stream");
        setDeviceType("MARTE2_STREAM");
        setHeight(500);
        setWidth(700);

        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Timebase");
        deviceField1.setNumCols(25);
        deviceField1.setOffsetNid(3);
        jPanel11.add(deviceField1);

        deviceField14.setIdentifier("");
        deviceField14.setLabelString("Timebase div.:");
        deviceField14.setNumCols(4);
        deviceField14.setOffsetNid(83);
        jPanel11.add(deviceField14);

        deviceChoice9.setChoiceIntValues(new int[] {1, 0});
        deviceChoice9.setChoiceItems(new String[] {"Time Streaming", "Oscilloscope"});
        deviceChoice9.setConvert(true);
        deviceChoice9.setIdentifier("");
        deviceChoice9.setLabelString("Mode: ");
        deviceChoice9.setOffsetNid(16);
        deviceChoice9.setUpdateIdentifier("");
        jPanel11.add(deviceChoice9);

        jPanel2.add(jPanel11);

        deviceField11.setIdentifier("");
        deviceField11.setLabelString("CPU Mask: ");
        deviceField11.setNumCols(4);
        deviceField11.setOffsetNid(19);
        jPanel12.add(deviceField11);

        deviceField12.setIdentifier("");
        deviceField12.setLabelString("Stack size: ");
        deviceField12.setOffsetNid(22);
        jPanel12.add(deviceField12);

        deviceField13.setIdentifier("");
        deviceField13.setLabelString("Num. buffers: ");
        deviceField13.setNumCols(4);
        deviceField13.setOffsetNid(25);
        jPanel12.add(deviceField13);

        deviceField10.setIdentifier("");
        deviceField10.setLabelString("Event Division: ");
        deviceField10.setNumCols(4);
        deviceField10.setOffsetNid(7);
        jPanel12.add(deviceField10);

        jPanel2.add(jPanel12);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);
        jPanel2.getAccessibleContext().setAccessibleName("");

        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(8, 1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 1(Time)"));

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Value: ");
        deviceField2.setNumCols(35);
        deviceField2.setOffsetNid(31);
        jPanel3.add(deviceField2);

        deviceChoice1.setChoiceItems(new String[] {"float32", "float63", "int16", "int32", "uint16", "uint32"});
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("Type: ");
        deviceChoice1.setOffsetNid(28);
        deviceChoice1.setUpdateIdentifier("");
        jPanel3.add(deviceChoice1);

        jPanel1.add(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 2"));

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Value: ");
        deviceField3.setNumCols(35);
        deviceField3.setOffsetNid(38);
        jPanel4.add(deviceField3);

        deviceChoice2.setChoiceItems(new String[] {"float32", "float63", "int16", "int32", "uint16", "uint32"});
        deviceChoice2.setIdentifier("");
        deviceChoice2.setLabelString("Type: ");
        deviceChoice2.setOffsetNid(35);
        deviceChoice2.setUpdateIdentifier("");
        jPanel4.add(deviceChoice2);

        jPanel1.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 3"));

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Value: ");
        deviceField4.setNumCols(35);
        deviceField4.setOffsetNid(45);
        jPanel5.add(deviceField4);

        deviceChoice3.setChoiceItems(new String[] {"float32", "float63", "int16", "int32", "uint16", "uint32"});
        deviceChoice3.setIdentifier("");
        deviceChoice3.setLabelString("Type: ");
        deviceChoice3.setOffsetNid(42);
        deviceChoice3.setUpdateIdentifier("");
        jPanel5.add(deviceChoice3);

        jPanel1.add(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 4"));

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("Value: ");
        deviceField5.setNumCols(35);
        deviceField5.setOffsetNid(52);
        jPanel6.add(deviceField5);

        deviceChoice4.setChoiceItems(new String[] {"float32", "float63", "int16", "int32", "uint16", "uint32"});
        deviceChoice4.setIdentifier("");
        deviceChoice4.setLabelString("Type: ");
        deviceChoice4.setOffsetNid(49);
        deviceChoice4.setUpdateIdentifier("");
        jPanel6.add(deviceChoice4);

        jPanel1.add(jPanel6);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 5"));

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Value: ");
        deviceField6.setNumCols(35);
        deviceField6.setOffsetNid(59);
        jPanel7.add(deviceField6);

        deviceChoice5.setChoiceItems(new String[] {"float32", "float63", "int16", "int32", "uint16", "uint32"});
        deviceChoice5.setIdentifier("");
        deviceChoice5.setLabelString("Type: ");
        deviceChoice5.setOffsetNid(56);
        deviceChoice5.setUpdateIdentifier("");
        jPanel7.add(deviceChoice5);

        jPanel1.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 6"));

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("Value: ");
        deviceField7.setNumCols(35);
        deviceField7.setOffsetNid(66);
        jPanel8.add(deviceField7);

        deviceChoice6.setChoiceItems(new String[] {"float32", "float63", "int16", "int32", "uint16", "uint32"});
        deviceChoice6.setIdentifier("");
        deviceChoice6.setLabelString("Type: ");
        deviceChoice6.setOffsetNid(63);
        deviceChoice6.setUpdateIdentifier("");
        jPanel8.add(deviceChoice6);

        jPanel1.add(jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 7"));

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("Value: ");
        deviceField8.setNumCols(35);
        deviceField8.setOffsetNid(73);
        jPanel9.add(deviceField8);

        deviceChoice7.setChoiceItems(new String[] {"float32", "float63", "int16", "int32", "uint16", "uint32"});
        deviceChoice7.setIdentifier("");
        deviceChoice7.setLabelString("Type: ");
        deviceChoice7.setOffsetNid(70);
        deviceChoice7.setUpdateIdentifier("");
        jPanel9.add(deviceChoice7);

        jPanel1.add(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Signal 8"));

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("Value: ");
        deviceField9.setNumCols(35);
        deviceField9.setOffsetNid(80);
        jPanel10.add(deviceField9);

        deviceChoice8.setChoiceItems(new String[] {"float32", "float63", "int16", "int32", "uint16", "uint32"});
        deviceChoice8.setIdentifier("");
        deviceChoice8.setLabelString("Type: ");
        deviceChoice8.setOffsetNid(77);
        deviceChoice8.setUpdateIdentifier("");
        jPanel10.add(deviceChoice8);

        jPanel1.add(jPanel10);

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
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
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
