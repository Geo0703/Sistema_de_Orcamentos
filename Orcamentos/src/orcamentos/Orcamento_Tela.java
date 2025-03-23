/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package orcamentos;

import Classes.Counter;
import javax.swing.JOptionPane;
import com.itextpdf.text.pdf.*;
import com.itextpdf.text.*;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.io.IOException;
import com.itextpdf.text.Element;
import org.w3c.dom.Text;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.parser.ImageRenderInfo;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author geova_16fe4ev
 */
public class Orcamento_Tela extends javax.swing.JFrame {

    /**
     * Creates new form Ocamento_Tela
     */
    public Orcamento_Tela() {
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

        PDF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Cod = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Produto = new javax.swing.JTextField();
        Qtd = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ValorUN = new javax.swing.JTextField();
        Voltar = new javax.swing.JButton();
        NVItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        PDF.setText("Gera PDF");
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });
        getContentPane().add(PDF);
        PDF.setBounds(300, 350, 100, 27);

        jLabel1.setText("Codigo Do Produto");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(305, 30, 120, 20);

        Cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodActionPerformed(evt);
            }
        });
        getContentPane().add(Cod);
        Cod.setBounds(320, 50, 68, 26);

        jLabel2.setText("Produto");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 90, 50, 16);

        Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(Produto);
        Produto.setBounds(250, 110, 220, 26);
        getContentPane().add(Qtd);
        Qtd.setBounds(320, 170, 68, 26);

        jLabel3.setText("Quantidade");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 150, 70, 16);

        jLabel4.setText("Valor Unitario");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 220, 80, 16);

        ValorUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorUNActionPerformed(evt);
            }
        });
        getContentPane().add(ValorUN);
        ValorUN.setBounds(310, 240, 75, 26);

        Voltar.setText("< Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(30, 20, 77, 27);

        NVItem.setText("Inserir Novo Item");
        NVItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NVItemActionPerformed(evt);
            }
        });
        getContentPane().add(NVItem);
        NVItem.setBounds(280, 300, 140, 27);

        setSize(new java.awt.Dimension(704, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProdutoActionPerformed

    private void CodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodActionPerformed

    private void ValorUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorUNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorUNActionPerformed

    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
        // TODO add your handling code here:
        GerarPDF();
    }//GEN-LAST:event_PDFActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        TELA_DE_ESCOLHA Volta = new TELA_DE_ESCOLHA();
        Volta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void NVItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NVItemActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Orcamento_Tela Item = new Orcamento_Tela();
        Item.setVisible(true);
    }//GEN-LAST:event_NVItemActionPerformed

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
            java.util.logging.Logger.getLogger(Orcamento_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Orcamento_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Orcamento_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Orcamento_Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Orcamento_Tela().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cod;
    private javax.swing.JButton NVItem;
    private javax.swing.JButton PDF;
    private javax.swing.JTextField Produto;
    private javax.swing.JSpinner Qtd;
    private javax.swing.JTextField ValorUN;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private void GerarPDF() {
        String Logo = "IMG/logo.jpg";
        String Razao = "BETO BOLSAS ARACAJU LTDA";
        String Fantasia = "BETO BOLSAS ARACAJ�";
        String Tel = "(75) 3024-4804";
        String End = "PC JO�O XXIII, 425 Centro, CEP 49010-580 - Aracaju-SE";
        String CNPJ = "34.073.865/0001-08";
        String InstEst = "271.654.511";
        //Pega os dados da Tela
        String Codigo = (Cod.getText());
        String produto = (Produto.getText());
        int Quantidade = (int) (Qtd.getValue());
        String texto = ValorUN.getText();
        float valorFloat = Float.parseFloat(texto);
        //Faz a Soma da quantidade com o valor
        float TOTAL = Quantidade * valorFloat;
        Document document = new Document();
        Counter Contador = new Counter();
        Contador.increment();
        JOptionPane.showMessageDialog(null, Codigo + "|" + produto + "|" + Quantidade + "|" + valorFloat + "|" + TOTAL + "|");
        //Gerar Pdf
        try {
            //PdfWriter.getInstance(document, new FileOutputStream("Orcamento_"+Contador.getCount()+".pdf"));
            PdfWriter.getInstance(document, new FileOutputStream("Orcamento.pdf"));
            //Inicia A edi��o ao PDF
            document.open();
            //Estilos de Fonte
            Font boldFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD);
            Font normalFont = new Font(Font.FontFamily.HELVETICA, 10, Font.ITALIC, BaseColor.DARK_GRAY);
            Font fontVermelha = new Font(Font.FontFamily.HELVETICA, 14, Font.NORMAL, BaseColor.RED);
            PdfPTable T1 = new PdfPTable(1); // 2 colunas
            Paragraph l1 = new Paragraph();
            l1.add(new Chunk("Informa��es sobre o Cliente:", normalFont));
            PdfPCell l11 = new PdfPCell(l1);
            l11.setBorderWidthBottom(0);
            T1.addCell(l11);
            T1.setWidthPercentage(100);
            document.add(T1);

            // Criando Segunda tabela da Primeira Parte
            PdfPTable Cliente = new PdfPTable(2);
            Paragraph RazaoE = new Paragraph();
            RazaoE.add(new Chunk("Raz�o Social: ", normalFont));
            RazaoE.add(new Chunk(Razao, boldFont));
            PdfPCell RazaoE1 = new PdfPCell(RazaoE);
            RazaoE1.setBorderWidthTop(0);
            RazaoE1.setBorderWidthBottom(0);
            RazaoE1.setBorderWidthRight(0);
            Cliente.addCell(RazaoE1);
            Paragraph CNPJD = new Paragraph();
            CNPJD.add(new Chunk("CNPJ: ", normalFont));
            CNPJD.add(new Chunk(CNPJ, boldFont));
            PdfPCell CNPJD1 = new PdfPCell(CNPJD);
            CNPJD1.setBorderWidthTop(0);
            CNPJD1.setBorderWidthBottom(0);
            CNPJD1.setBorderWidthLeft(0);
            Cliente.addCell(CNPJD1);

            //Segunda Linha
            Paragraph FantE = new Paragraph();
            FantE.add(new Chunk("Nome Fantasia: ", normalFont));
            FantE.add(new Chunk(Fantasia, boldFont));
            PdfPCell FantE1 = new PdfPCell(FantE);
            FantE1.setBorderWidthTop(0);
            FantE1.setBorderWidthBottom(0);
            FantE1.setBorderWidthRight(0);
            Cliente.addCell(FantE1);
            Paragraph InscD = new Paragraph();
            InscD.add(new Chunk("Inscr. Estadual: ", normalFont));
            InscD.add(new Chunk(InstEst, boldFont));
            PdfPCell InscD1 = new PdfPCell(InscD);
            InscD1.setBorderWidthTop(0);
            InscD1.setBorderWidthBottom(0);
            InscD1.setBorderWidthLeft(0);
            Cliente.addCell(InscD1);

            //Terceira Linha
            Paragraph TelE = new Paragraph();
            TelE.add(new Chunk("Telefone: ", normalFont));
            TelE.add(new Chunk(Tel, boldFont));
            PdfPCell TelE1 = new PdfPCell(TelE);
            TelE1.setBorderWidthTop(0);
            TelE1.setBorderWidthBottom(0);
            TelE1.setBorderWidthRight(0);
            Cliente.addCell(TelE1);
            Paragraph EmailD = new Paragraph();
            EmailD.add(new Chunk("Email", normalFont));
            EmailD.add(new Chunk(" ", boldFont));
            PdfPCell EmailD1 = new PdfPCell(EmailD);
            EmailD1.setBorderWidthTop(0);
            EmailD1.setBorderWidthBottom(0);
            EmailD1.setBorderWidthLeft(0);
            Cliente.addCell(EmailD1);

            //Quarta Linha
            Paragraph EndE = new Paragraph();
            EndE.add(new Chunk("Endere�o: \n", normalFont));
            EndE.add(new Chunk(End+"\n ", boldFont));
            PdfPCell EndE1 = new PdfPCell(EndE);
            EndE1.setBorderWidthTop(0);
            EndE1.setBorderWidthRight(0);
            Cliente.addCell(EndE1);
            Paragraph FaxD = new Paragraph();
            FaxD.add(new Chunk("FAx", normalFont));
            FaxD.add(new Chunk(" ", boldFont));
            PdfPCell FaxD1 = new PdfPCell(FaxD);
            FaxD1.setBorderWidthTop(0);
            FaxD1.setBorderWidthLeft(0);
            EmailD1.setPaddingBottom(200);
            Cliente.addCell(FaxD1);

            Cliente.setWidthPercentage(100);

            document.add(Cliente);
            //Criando tabela 2 parte
            PdfPTable TabelaOrc = new PdfPTable(1);
            
            //Primeira Linha Segunda parte
            Paragraph Nume = new Paragraph();
            Nume.add(new Chunk("Informa��es sobre OR�AMENTO:", normalFont));
            Nume.add(new Chunk("N� " + Contador.getCount(), fontVermelha));
            PdfPCell Nume1 = new PdfPCell(Nume);
            Nume1.setBorderWidthBottom(0);   
            TabelaOrc.setWidthPercentage(100);
            TabelaOrc.addCell(Nume1);
            
            //Segunda Linha Segunda Parte
            Paragraph Data = new Paragraph();
            Date DataA = new Date();
            DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
            Data.add(new Chunk("Data do Or�amento: ", normalFont));
            Data.add(new Chunk(formatador.format(DataA), boldFont));
            PdfPCell Data1 = new PdfPCell(Data);
            Data1.setBorderWidthTop(0);
            Data1.setBorderWidthBottom(0);
            TabelaOrc.addCell(Data1);
            //Terceira Linha Segunda Parte 
            Paragraph Cond = new Paragraph();
            Cond.add(new Chunk("Condi��o de Pagto: ", normalFont));
            Cond.add(new Chunk("A Vista", boldFont));
            PdfPCell Cond1 = new PdfPCell(Cond);
            Cond1.setBorderWidthTop(0);
            TabelaOrc.addCell(Cond1);
            TabelaOrc.setWidthPercentage(100);
            
            document.add(TabelaOrc);
            
            //Cria uma Tabela de 5 Colunas
            PdfPTable Tabela = new PdfPTable(5);
            PdfPCell coluna1 = new PdfPCell(new Paragraph("C�digo"));
            PdfPCell coluna2 = new PdfPCell(new Paragraph("Produto"));
            PdfPCell coluna3 = new PdfPCell(new Paragraph("Quantidade"));
            PdfPCell coluna4 = new PdfPCell(new Paragraph("Valor Unit�rio"));
            PdfPCell coluna5 = new PdfPCell(new Paragraph("Total"));
            //Cor da C�lula 
            coluna1.setBackgroundColor(BaseColor.GRAY);
            coluna2.setBackgroundColor(BaseColor.GRAY);
            coluna3.setBackgroundColor(BaseColor.GRAY);
            coluna4.setBackgroundColor(BaseColor.GRAY);
            coluna5.setBackgroundColor(BaseColor.GRAY);
            //ADD O Texto nas colunas;
            Tabela.addCell(coluna1);
            Tabela.addCell(coluna2);
            Tabela.addCell(coluna3);
            Tabela.addCell(coluna4);
            Tabela.addCell(coluna5);
            // Lihas da Tabela
            PdfPCell codigo = new PdfPCell(new Paragraph(Codigo));
            PdfPCell produto2 = new PdfPCell(new Paragraph(produto));
            PdfPCell quantidade = new PdfPCell(new Paragraph(String.valueOf(Quantidade)));
            PdfPCell valorUnitario = new PdfPCell(new Paragraph(String.valueOf(valorFloat) + " R$"));
            PdfPCell total = new PdfPCell(new Paragraph(String.valueOf(TOTAL) + " R$"));

            Tabela.addCell(codigo);
            Tabela.addCell(produto2);
            Tabela.addCell(quantidade);
            Tabela.addCell(valorUnitario);
            Tabela.addCell(total);

            document.add(Tabela);

        } catch (DocumentException | FileNotFoundException e) {
            System.out.println(e);
        } finally {
            document.close();
        }
        //Abrir Documento
        try {
            //Linha para teste Final
            //Desktop.getDesktop().open(new File("Orcamento_"+Contador.getCount()+".pdf"));
            Desktop.getDesktop().open(new File("Orcamento.pdf"));
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
