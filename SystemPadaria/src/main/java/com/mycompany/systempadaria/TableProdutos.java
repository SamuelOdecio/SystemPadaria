package com.mycompany.systempadaria;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class TableProdutos extends AbstractTableModel {

    ArrayList<Produtos> produtos = new ArrayList();

    String[] colunas = {"Nome", "Codigo", "Quantidade", "Valor"};

    // PEGA O NUMERO DE LINHAS;
    @Override
    public int getRowCount() {
        return produtos.size();
    }

    // PEGA O NUMERO DE COLUNAS;
    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    // PEGA O VALOR;
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return produtos.get(rowIndex).getNome();
        } else if (columnIndex == 1) {
            return produtos.get(rowIndex).getCodigo();
        } else if (columnIndex == 2) {
            return produtos.get(rowIndex).getQuantidade();
        } else {
            return produtos.get(rowIndex).getValor();
        }
    }

}
