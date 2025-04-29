/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raven.cell;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author LuongTran
 */
public class TableActionCellRender extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent (JTable jtable,Object o,boolean bln,boolean bln1,int row,int column){
    Component com=super.getTableCellRendererComponent(jtable, o, bln, bln1,row, column);
    PanelAction action = new PanelAction();
    if(bln==false&&row%2==0){
    action.setBackground(Color.WHITE);
    }else 
    action.setBackground(com.getBackground());
    return action;
    }
    
}
