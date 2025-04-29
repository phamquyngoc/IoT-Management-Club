/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.cell;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.JCheckBox;

/**
 *
 * @author LuongTran
 */
public class TableActionCellEditor extends DefaultCellEditor {
    
    public TableActionCellEditor(){
    super(new JCheckBox());
    }
    
    @Override
    public Component getTableCellEditorComponent(JTable jtable,Object o, boolean bln,int i,int i1){
    PanelAction action = new PanelAction();
    action.setBackground(jtable.getSelectionBackground());
    return action;
    }
    
}
