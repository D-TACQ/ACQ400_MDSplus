/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manduchi
 */
public class MARTE2_PYTHON_PIDSetup extends DeviceSetup {

    /**
     * Creates new form MARTE2_PYTHON_PIDSetup
     */
    public MARTE2_PYTHON_PIDSetup() {
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
        deviceField1 = new DeviceField();
        deviceField2 = new DeviceField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        deviceField3 = new DeviceField();
        deviceField4 = new DeviceField();
        deviceField5 = new DeviceField();
        deviceField8 = new DeviceField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        deviceField6 = new DeviceField();
        deviceChoice1 = new DeviceChoice();
        jPanel6 = new javax.swing.JPanel();
        deviceField7 = new DeviceField();
        deviceField9 = new DeviceField();
        deviceButtons1 = new DeviceButtons();

        setDeviceProvider("scdevail.rfx.local:8200");
        setDeviceTitle("Python PID");
        setDeviceType("MARTE2_PYTHON_PID");
        setHeight(250);
        setWidth(800);

        deviceField1.setIdentifier("");
        deviceField1.setLabelString("Timebase");
        deviceField1.setNumCols(20);
        deviceField1.setOffsetNid(3);
        jPanel2.add(deviceField1);

        deviceField2.setIdentifier("");
        deviceField2.setLabelString("Timebase Div:");
        deviceField2.setNumCols(4);
        deviceField2.setOffsetNid(40);
        jPanel2.add(deviceField2);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        deviceField3.setIdentifier("");
        deviceField3.setLabelString("Kp:");
        deviceField3.setNumCols(6);
        deviceField3.setOffsetNid(10);
        jPanel3.add(deviceField3);

        deviceField4.setIdentifier("");
        deviceField4.setLabelString("Ki:");
        deviceField4.setNumCols(6);
        deviceField4.setOffsetNid(13);
        jPanel3.add(deviceField4);

        deviceField5.setIdentifier("");
        deviceField5.setLabelString("Kd:");
        deviceField5.setNumCols(6);
        deviceField5.setOffsetNid(16);
        jPanel3.add(deviceField5);

        deviceField8.setIdentifier("");
        deviceField8.setLabelString("Period:");
        deviceField8.setNumCols(4);
        deviceField8.setOffsetNid(19);
        jPanel3.add(deviceField8);

        jPanel1.add(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        deviceField6.setIdentifier("");
        deviceField6.setLabelString("Input");
        deviceField6.setNumCols(35);
        deviceField6.setOffsetNid(25);
        jPanel5.add(deviceField6);

        deviceChoice1.setChoiceItems(new String[] {"int16", "int32", "float32", "float64"});
        deviceChoice1.setIdentifier("");
        deviceChoice1.setLabelString("Output type: ");
        deviceChoice1.setOffsetNid(37);
        deviceChoice1.setUpdateIdentifier("");
        jPanel5.add(deviceChoice1);

        jPanel4.add(jPanel5);

        deviceField7.setIdentifier("");
        deviceField7.setLabelString("Seg. len (0 to disable writing)");
        deviceField7.setNumCols(4);
        deviceField7.setOffsetNid(40);
        jPanel6.add(deviceField7);

        deviceField9.setIdentifier("");
        deviceField9.setLabelString("Out CPUs:");
        deviceField9.setNumCols(4);
        deviceField9.setOffsetNid(34);
        jPanel6.add(deviceField9);

        jPanel4.add(jPanel6);

        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);
        getContentPane().add(deviceButtons1, java.awt.BorderLayout.PAGE_END);

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private DeviceButtons deviceButtons1;
    private DeviceChoice deviceChoice1;
    private DeviceField deviceField1;
    private DeviceField deviceField2;
    private DeviceField deviceField3;
    private DeviceField deviceField4;
    private DeviceField deviceField5;
    private DeviceField deviceField6;
    private DeviceField deviceField7;
    private DeviceField deviceField8;
    private DeviceField deviceField9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
