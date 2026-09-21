package uff.ic.lleme.tcc00328.trabalhos.esther.ex6.Mercado.data;

// Importações exigidas pelo molde do professor
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NotaFiscal {
    private final PedidoCliente pedido;
    private final int nCompra;
    private final Funcionario emissor;
    
    public NotaFiscal(PedidoCliente pedido, int nCompra, Funcionario emissor){
        this.pedido = pedido;
        this.nCompra = nCompra;
        this.emissor = emissor;
    }

    public PedidoCliente getPedido() { return pedido; }
    public int getnCompra() { return nCompra; }
    public Funcionario getEmissor() { return emissor; }
    
    // ESCRITA DO ARQUIVO (Usando FileOutputStream e BufferedWriter)
    public void gerarArquivoNota() {
        String nomeArquivo = "Nota_" + nCompra + ".txt";
        
        try (OutputStream out = new FileOutputStream(nomeArquivo, false);
             OutputStreamWriter writer = new OutputStreamWriter(out);
             BufferedWriter bw = new BufferedWriter(writer);) {
            
            bw.write("=== NOTA FISCAL N: " + nCompra + " ===\n");
            bw.write("Emissor: " + emissor.getNome() + "\n");
            bw.write("Cliente: " + pedido.getDonoDoPedido().getNome() + "\n");
            bw.write("---------------------------------\n");
            bw.write("ITENS DA COMPRA:\n");
            
            double valorTotal = 0;
            Item[] itens = pedido.getItensPedido();
            
            for (int i = 0; i < itens.length; i++) {
                if (itens[i] != null) {
                    String nomeProd = itens[i].getProduto().getNome();
                    double preco = itens[i].getProduto().getPrecoUnitario();
                    int qtd = itens[i].getQuantidade();
                    double subtotal = preco * qtd;
                    
                    valorTotal += subtotal;
                    
                    // Formatando a string antes de escrever
                    String linhaItem = String.format("- %dx %s: R$ %.2f\n", qtd, nomeProd, subtotal);
                    bw.write(linhaItem);
                }
            }
            
            bw.write("---------------------------------\n");
            bw.write(String.format("TOTAL A PAGAR: R$ %.2f\n", valorTotal));
            bw.write("=================================\n");
            
            System.out.println("✅ Arquivo gerado com sucesso: " + nomeArquivo);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NotaFiscal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NotaFiscal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // LEITURA DO ARQUIVO (Usando FileInputStream e Scanner)
    public void lerArquivoNota() {
        String nomeArquivo = "Nota_" + nCompra + ".txt";
        System.out.println("\nLendo os dados da nota salva...");
        
        try (InputStream input = new FileInputStream(nomeArquivo);) {
            Scanner in = new Scanner(input);
            
            // Lê cada linha do arquivo texto até o final
            while (in.hasNextLine()) {
                System.out.println(in.nextLine());
            }
            
            input.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NotaFiscal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NotaFiscal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}